public class Q2_TypingAccuracy {
    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
        checkTypingAccuracy("coding", "coding");
    }

    public static void checkTypingAccuracy(String original, String typed) {
        int matches = 0;
        int mismatchIndex = -1;
        
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matches++;
            } else if (mismatchIndex == -1) {
                mismatchIndex = i;
            }
        }
        
        double accuracy = ((double) matches / original.length()) * 100;
        if (mismatchIndex == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches\n", 
                    matches, original.length(), accuracy);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')\n", 
                    matches, original.length(), accuracy, mismatchIndex + 1, 
                    original.charAt(mismatchIndex), typed.charAt(mismatchIndex));
        }
    }
}