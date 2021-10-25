package Lesson1.EX1;

public class Human implements Runnable,JumpAble {

    @Override
    public void run() {
        System.out.println("Human run");
    }

    @Override
    public void jump() {
        System.out.println("Human jump");
    }
}
