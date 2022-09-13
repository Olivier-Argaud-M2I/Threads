package threads;

import models.Compte;

public class Debit implements Runnable{

    Compte compte;


    public Debit(Compte compte){
        this.compte = compte;
    }

    @Override
    public void run() {

        while(true){


            synchronized (this.compte){
                int count = 1000;
                while(count>0){
                    count--;
                    compte.setCredit(compte.getCredit()-1);
                    System.out.println("il reste " +compte.getCredit() + " sur le compte de "+compte.getName());

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
