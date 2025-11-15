//Cannon Rivera, 11/14/2025, Division
//This programs purpose is to create 2 instances of 2 different subclasses that have a parent class.
//The parent class, Division, has 2 values that the other subclasses,
// domesticdivison and internationaldivision, would inherit
//Finally display the instances as proof of creation.

package org.example;

public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision ddivision1 = new DomesticDivision
                ("East Coast Sales", 1011, "New York");
        DomesticDivision ddivision2 = new DomesticDivision
                ("West Coast Sales", 1022, "California");

        InternationalDivision idivision1 = new InternationalDivision
                ("Asia Marketing", 2011, "Japan", "Japanese");
        InternationalDivision idivision2 = new InternationalDivision
                ("Europe Logistics", 2022, "Germany", "German");

        ddivision1.display();
        ddivision2.display();
        idivision1.display();
        idivision2.display();
    }
}