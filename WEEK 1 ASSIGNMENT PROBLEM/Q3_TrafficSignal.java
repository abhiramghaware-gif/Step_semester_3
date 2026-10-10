public class Q3_TrafficSignal {
    public static void main(String[] args) {
        findLongestStreak("RRGGGYRR");
        findLongestStreak("RRRRYYGG");
    }

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) return;

        char maxChar = signalLog.charAt(0);
        int maxLength = 1;
        
        char currentChar = signalLog.charAt(0);
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentLength++;
            } else {
                currentChar = signalLog.charAt(i);
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxChar = currentChar;
            }
        }
        System.out.printf("Longest Streak: '%c' repeated %d times\n", maxChar, maxLength);
    }
}