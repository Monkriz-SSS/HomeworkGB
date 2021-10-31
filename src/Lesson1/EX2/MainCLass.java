package Lesson1.EX2;

public class MainCLass {

    public static void main(String[] args) {

        Treadmil treadmil = new Treadmil(500);
        Wall wall = new Wall(2);
        Participant participant = new Participant("Paul", 3,450);

        participant.jump(participant.jumpSize,wall.height);
        participant.run(participant.longRun,treadmil.longSize);

    }

}
