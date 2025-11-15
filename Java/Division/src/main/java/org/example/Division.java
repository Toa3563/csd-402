package org.example;

public abstract class Division {
    protected String divisionname;
    protected int accountnumber;

    public Division(String divisionname, int accountnumber) {
        this.divisionname = divisionname;
        this.accountnumber = accountnumber;
    }

    public abstract void display();
}
