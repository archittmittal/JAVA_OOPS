import java.io.*;

public class Q17L {
    public static void main(String args[]) {
        int palindromeCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("myFile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty() && isPalindrome(word)) {
                        palindromeCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        System.out.println("Number of palindrome words: " + palindromeCount);
    }

    static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}