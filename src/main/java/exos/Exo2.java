package exos;

import models.Compte;
import threads.Bloquage;
import threads.Debit;
import threads.Gestion;

public class Exo2 {

    public Exo2(){

        Compte compte = new Compte("Maxime",10000L);

        Thread bloquage = new Thread(new Bloquage(compte));
        bloquage.setName("bloquage");
        Thread debit = new Thread(new Debit(compte));
        debit.setName("debit");
        Thread gestion = new Thread(new Gestion(bloquage,debit,compte));
        gestion.setName("gestion");

        gestion.start();
    }
}
