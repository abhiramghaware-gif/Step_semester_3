public class Q2_QAToolkit {
    public static void main(String[] args) {
        String[] tests = {"madam", "hello"};
        for (String text : tests) {
            boolean iter = isPalindromeIterative(text);
            boolean rec = isPalindromeRecursive(text);
            boolean arr = isPalindromeArrayReversal(text);
            
            System.out.printf("Input: \"%s\" | Iterative: %s | Recursive: %s | Array Reversal: %s\n",
                    text, 
                    iter ? "Palindrome" : "Not Palindrome",
                    rec ? "Palindrome" : "Not Palindrome",
                    arr ? "Palindrome" : "Not Palindrome");
        }
    }

    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] arr = text.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
        return text.equals(new String(arr));
    }
}