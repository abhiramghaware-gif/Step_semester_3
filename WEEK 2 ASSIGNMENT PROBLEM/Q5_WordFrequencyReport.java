import java.util.*;

public class Q5_WordFrequencyReport {
    public static void printFilteredWordFrequency(String feedback) {
        String[] stopWordsArray = {"the", "was", "and", "a", "is", "of", "in"};
        Set<String> stopWords = new HashSet<>(Arrays.asList(stopWordsArray));
        
        String cleaned = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] words = cleaned.split("\\s+");
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            if (!word.isEmpty() && !stopWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "The mentor was great, the session was great and clear.";
        printFilteredWordFrequency(input);
    }
}
