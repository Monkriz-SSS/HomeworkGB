package Lesson1.EX1;

public class MainClass {

    public static void main(String[] args) {

        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        human.run();
        human.jump();

        cat.jump();
        cat.run();

        robot.jump();
        robot.run();
    }

}
