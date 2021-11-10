package Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) {

        Socket socket = null;
        try (ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Сервер запущен, ожидаем подключения...");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Thread threadInput = new Thread(() -> {
                while (true) {
                    String str = null;
                    try {
                        str = in.readUTF();
                        if (str.equals("Клиент отключился")) {
                            System.exit(0);
                        }
                    } catch (IOException e) {
                        break;
                    }
                    if (str.equals("/end")) {
                        break;
                    }
                    System.out.println(str);
                }
            });
            threadInput.start();

            Thread threadOutput = new Thread(() -> {
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    if (scanner.hasNextLine()) {
                        try {
                            out.writeUTF(scanner.nextLine());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            threadOutput.start();

            try {
                threadInput.join();
                threadOutput.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }


}
