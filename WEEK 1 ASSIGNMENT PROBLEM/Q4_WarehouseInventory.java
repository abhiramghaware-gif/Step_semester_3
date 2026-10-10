public class Q4_WarehouseInventory {
    public static void main(String[] args) {
        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};
        analyzeInventory(sectionA, sectionB);
    }

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int sumA = 0, sumB = 0;
        int maxQty = -1;
        String maxLocation = "";

        for (int i = 0; i < sectionA.length; i++) {
            sumA += sectionA[i];
            if (sectionA[i] > maxQty) {
                maxQty = sectionA[i];
                maxLocation = "Section A, Item " + (i + 1);
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            sumB += sectionB[i];
            if (sectionB[i] > maxQty) {
                maxQty = sectionB[i];
                maxLocation = "Section B, Item " + (i + 1);
            }
        }

        String status = (sumA == sumB) ? "Balanced" : "Not Balanced";
        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s)\n",
                sumA, sumB, status, maxQty, maxLocation);
    }
}