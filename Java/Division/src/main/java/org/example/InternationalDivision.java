package org.example;

public class InternationalDivision extends Division {
    private String country;
    private String language;

    public InternationalDivision(String divisionname, int accountnumber, String country, String language) {
        super(divisionname, accountnumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division:");
        System.out.println("Division Name: " + divisionname);
        System.out.println("Account Number: " + accountnumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println("\n");
    }
}
