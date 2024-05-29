package ActionItem1;

import java.util.ArrayList;

public class T2_ActionItem {
    public static void main(String[] args) {
        //declare an array list variable
        ArrayList<String> regions = new ArrayList<>();
        //add values to regions array list
        regions.add("Wake"); //index 0
        regions.add("Johnson"); //index 1
        regions.add("Wayne"); //index 2
        regions.add("Apex"); //index 3
        //add array codes to array list
        ArrayList<Integer> areaCodes = new ArrayList<>();
        areaCodes.add(2750);
        areaCodes.add(2751);
        areaCodes.add(2752);
        areaCodes.add(2753);

        for (int i = 0; i <= regions.size(); i++) {
            System.out.println("My Region is " + regions.get(i) + " and my Area Code is: " + areaCodes.get(i));


        }
    }
    }