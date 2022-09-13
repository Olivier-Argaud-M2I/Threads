package models;



public class Compte {

    private String name;
    private Long credit;

    public Compte() {
    }

    public Compte(String name) {
        this.name = name;
    }

    public Compte(String name, Long credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCredit() {
        return credit;
    }

    public void setCredit(Long credit) {
        this.credit = credit;
    }
}
