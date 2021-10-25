package Lesson1.EX1;

public class Robot implements Runnable, JumpAble{


    @Override
    public void jump() {
        System.out.println("Robot jump");
    }

    @Override
    public void run() {
        System.out.println("Robot run");
    }
}
