package threads;

import models.Compte;

public class Gestion implements Runnable{

    Thread bloquage;
    Thread debit;
    Compte compte;

    public Gestion(Thread bloquage, Thread debit, Compte compte){
        this.bloquage = bloquage;
        this.debit = debit;
        this.compte = compte;
    }

    @Override
    public void run() {

        debit.start();
        bloquage.start();

        while(compte.getCredit()>0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        bloquage.stop();
        debit.stop();

        System.out.println(compte.getName()+" est ruiné");

    }


}
