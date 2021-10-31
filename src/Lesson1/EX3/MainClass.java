package Lesson1.EX3;

import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        Participant [] participants = new Participant[15];
        for (int i = 0; i < participants.length; i++) {
            participants[i]= new Participant(Names.randomName(), (int) (Math.random()*10),(int) (Math.random()*1000));
        }

        Let [] lets = new Let[10];
        for (int i = 0; i < lets.length; i++) {
            int a = (int) (Math.random()*3);
            if (a==1){
                lets[i] = new Wall((int) (Math.random()*5));
            } else {
                lets[i] = new Treadmil((int) (Math.random()*1000));
            }
        }

    Outer:    for (int i = 0; i < participants.length-1; i++) {
    Inner:        for (int j = 0; j < lets.length-1; j++) {
                if (lets[j] instanceof Wall) {
                    participants[i].jump(participants[i].jumpSize,((Wall) lets[j]).height);
                } else if (lets[j] instanceof Treadmil) {
                    participants[i].run(participants[i].longRun,((Treadmil) lets[j]).longSize);
                } else continue Inner;
            }
        }

        }

    }

