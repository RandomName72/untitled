package Day4_04112024;

import java.util.ArrayList;

public class T1_ThursdayClass {
    public static void main(String[] args) {
        //declare an Array List
        ArrayList<String> countries = new ArrayList<>();
        //Add some values to the array list
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("UK");
        countries.add("Egypt");
        //Declare and define while loop
        int i = 0; while (i < countries.size()) {
        System.out.println("My current country is " + countries.get(i));
        i=i+1;
        }
    }
}