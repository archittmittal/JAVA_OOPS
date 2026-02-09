import java.util.*;

public class WordExample {
    private String strdata;

    public WordExample(String sentence) {
        this.strdata = sentence.trim(); // readymade fxn : trims extra space
    } 

    private boolean isVowel(char c) {
        c = Character.toUpperCase(c);
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
 
    public void countWord() {
        if (strdata == null || strdata.isEmpty()) {
            System.out.println("Number of words beginning and ending with a vowel: 0");
            return;
        }

        String temp = strdata;
        char lastChar = temp.charAt(temp.length() - 1);
        if (lastChar == '.' || lastChar == '?' || lastChar == '!') {
            temp = temp.substring(0, temp.length() - 1);
        }

        String[] words = temp.split("\\s+");
        int count = 0;

        for (String w : words) {
            if (w.isEmpty()) continue;
            char start = w.charAt(0);
            char end = w.charAt(w.length() - 1);
            
            if (isVowel(start) && isVowel(end)) {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }
    // Method to place words beginning and ending with a vowel at the beginning
    public void placeWord() {
        if (strdata == null || strdata.isEmpty()) {
            return;
        }

        String temp = strdata;
        char terminator = '\0'; // Default null char
        char lastChar = temp.charAt(temp.length() - 1);
        
        // Check and store terminator
        if (lastChar == '.' || lastChar == '?' || lastChar == '!') {
            terminator = lastChar;
            temp = temp.substring(0, temp.length() - 1);
        }

        String[] words = temp.split("\\s+");
        StringBuilder vowelWords = new StringBuilder();
        StringBuilder otherWords = new StringBuilder();

        for (String w : words) {
            if (w.isEmpty()) continue;
            char start = w.charAt(0);
            char end = w.charAt(w.length() - 1);

            if (isVowel(start) && isVowel(end)) {
                vowelWords.append(w).append(" ");
            } else {
                otherWords.append(w).append(" ");
            }
        }

        String result = vowelWords.toString() + otherWords.toString();
        result = result.trim(); // Remove extra side space
        if (terminator != '\0') {
            result += terminator;
        }
        
        System.out.println("Rearranged Sentence: " + result);
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("Enter a sentence (UPPER CASE, terminated by . ? or !): ");
            s = sc.nextLine().trim();
            
            if (s.isEmpty()) continue;

            boolean isTerminated = s.endsWith(".") || s.endsWith("?") || s.endsWith("!");
            boolean isUpperCase = s.equals(s.toUpperCase());
            
            if (isTerminated && isUpperCase) {
                break;
            } else {
                System.out.println("Invalid input! Please ensure:");
                if (!isTerminated) System.out.println("- Sentence ends with . ? or !");
                if (!isUpperCase) System.out.println("- Sentence is in UPPER CASE");
            }
        }
        
        WordExample obj = new WordExample(s);
        obj.countWord();
        obj.placeWord();
        sc.close();
    }
}
