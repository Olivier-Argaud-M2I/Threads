package exos;


import threads.MonThread;
import threads.MonThreadAvecInterface;

public class Exo1 {

    public Exo1(){

        System.out.println("coucou");

        MonThread monThread1 = new MonThread(200L,"Ahoy");
        MonThread monThread2 = new MonThread(500L,"Hello");

        monThread1.start();
        monThread2.start();

        new Thread(new MonThreadAvecInterface(300L,"interface")).start();


    }
}
