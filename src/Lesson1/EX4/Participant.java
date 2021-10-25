package Lesson1.EX4;

public class Participant implements Runnable, Jumpable {

    boolean canLet = true;
    String name;
    int jumpSize;
    int longRun;

    public Participant(String name, int jumpSize, int longRun) {
        this.name = name;
        this.jumpSize = jumpSize;
        this.longRun = longRun;
    }

    @Override
    public void jump(int jumpSize, int wallHeigt) {
        if (jumpSize>=wallHeigt){
            System.out.println("Участник " +name + " преодолел стену");
        }
        else {
            System.out.println("Участник " + name + " не преодолел стену");
            canLet=false;
        }
    }

    @Override
    public void run(int longRun, int treadmilLongSize) {
        if (longRun>=treadmilLongSize){
            System.out.println("Участник " + name + " успешно пробежал");
        }
        else {
            System.out.println("Участник " + name + " не смог пробежать");
            canLet=false;
        }
    }

}
