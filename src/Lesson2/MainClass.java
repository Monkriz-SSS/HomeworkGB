package Lesson2;

public class MainClass {

    public static void main(String[] args) {

        String [][] strings = new String[44][4];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j]= "12345";
            }
        }

        try {
            parseStringToInt(strings);
        } catch (MyArrayDataException e) {}

        String [][] strings1 = new String[4][4];
        strings1[0][0] = "12345";
        strings1[0][1] = "12345";
        strings1[0][2] = "12345";
        strings1[0][3] = "12345";
        strings1[1][0] = "12345";
        strings1[1][1] = "12345";
        strings1[1][2] = "12345";
        strings1[1][3] = "12345";
        strings1[2][0] = "12345";
        strings1[2][1] = "12345";
        strings1[2][2] = "12345";
        strings1[2][3] = "12345";
        strings1[3][0] = "12345";
        strings1[3][1] = "12345";
        strings1[3][2] = "12345";
        strings1[3][3] = "12345";

        try {
            parseStringToInt(strings1);
        } catch (MyArrayDataException e) {}

        String [][] strings2 = new String[4][4];
        strings2[0][0] = "12q345";
        strings2[0][1] = "12345";
        strings2[0][2] = "12345";
        strings2[0][3] = "12345";
        strings2[1][0] = "12345";
        strings2[1][1] = "12345";
        strings2[1][2] = "12345";
        strings2[1][3] = "12345";
        strings2[2][0] = "12345";
        strings2[2][1] = "12345";
        strings2[2][2] = "12345";
        strings2[2][3] = "12345";
        strings2[3][0] = "12345";
        strings2[3][1] = "12345";
        strings2[3][2] = "12345";
        strings2[3][3] = "12345";

        try {
            parseStringToInt(strings2);
        } catch (MyArrayDataException e) {}

    }



    public static void parseStringToInt(String[][] strings) throws MyArrayDataException {

        try {
            if (strings.length != 4 || strings[0].length != 4 || strings[1].length != 4 || strings[2].length != 4 || strings[3].length != 4) {
                throw new MyArraySizeException();
            }
        } catch (MyArraySizeException e) {
            System.out.println("Массив неверен");
            return;
        }

        int sum = 0;
        for (int i = 3; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                try {
                    sum += (Integer.parseInt(strings[i][j]));
                } catch (NumberFormatException e) {
                    System.out.println("Элемент массива " + strings[i][j] + " некорректен ");
                    throw new MyArrayDataException();

                }
            }
        }
        System.out.println(" Сумма элементов массива равна " + sum);
    }
}
