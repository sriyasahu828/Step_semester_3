package main.java.hw1week;

public class InventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        int max = sectionA[0];
        String section = "A";
        int index = 0;

        for(int i = 0; i < sectionA.length; i++) {

            totalA += sectionA[i];
            totalB += sectionB[i];

            if(sectionA[i] > max) {
                max = sectionA[i];
                section = "A";
                index = i;
            }

            if(sectionB[i] > max) {
                max = sectionB[i];
                section = "B";
                index = i;
            }
        }

        if(totalA == totalB)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        System.out.println("Section A Total: " + totalA);
        System.out.println("Section B Total: " + totalB);

        System.out.println("Highest Quantity: " + max +
                           " (Section " + section +
                           ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        analyzeInventory(sectionA, sectionB);
    }
}