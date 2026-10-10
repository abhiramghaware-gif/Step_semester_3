import java.util.LinkedHashMap;
import java.util.Map;

public class Q4_UniqueLetterHunt {
    public static void main(String[] args) {
        String[] tests = {"swiss", "aabbcc"};
        for (String text : tests) {
            char result = findFirstNonRepeatingChar(text);
            if (result == '\0') {
                System.out.println("Input: \"" + text + "\" | No Non-Repeating Character Found");
            } else {
                System.out.println("Input: \"" + text + "\" | First Non-Repeating Character: '" + result + "'");
            }
        }
    }

    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : text.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return '\0'; 
    }
}