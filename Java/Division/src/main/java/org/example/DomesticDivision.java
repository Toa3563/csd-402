package org.example;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionname, int accountnumber, String state) {
        super(divisionname, accountnumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division:");
        System.out.println("Division Name: " + divisionname);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("State: " + state);
        System.out.println("\n");

    }
}
