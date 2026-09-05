public class Q5_NewsroomDesk {
    public static void main(String[] args) {
        String text = "Java is an object oriented programming language";
        String[] result = findShortestAndLongestWord(text);
        System.out.printf("Input: \"%s\" | Shortest: \"%s\" (%d) | Longest: \"%s\" (%d)\n",
                text, result[0], result[0].length(), result[1], result[1].length());
    }

    public static String[] findShortestAndLongestWord(String text) {
        String[] words = text.split("\\s+");
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", ""); 
            if (cleanWord.length() < shortest.length()) shortest = cleanWord;
            if (cleanWord.length() > longest.length()) longest = cleanWord;
        }
        return new String[]{shortest, longest};
    }
}