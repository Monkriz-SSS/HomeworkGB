package Lesson1.EX1;

public class Cat implements Runnable, JumpAble{

    @Override
    public void jump() {
        System.out.println("Cat jump");
    }

    @Override
    public void run() {
        System.out.println("Cat run");
    }
}
