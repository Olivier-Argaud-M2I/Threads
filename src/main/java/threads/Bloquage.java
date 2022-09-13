package threads;

import models.Compte;

public class Bloquage implements Runnable {

    Compte compte;


    public Bloquage(Compte compte){
        this.compte = compte;
    }

    @Override
    public void run() {

        while(true){

            synchronized (this.compte){
                int count = 20;
                while(count>0){
                    count--;

                    System.out.println("le compte est momentanément bloqué");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }



    }
}
