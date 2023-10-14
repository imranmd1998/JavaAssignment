public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input string
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean isPangram(String input) {
        
        input = input.toLowerCase();
        
        
        boolean[] alphabetPresence = new boolean[26];
        
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                alphabetPresence[index] = true;
            }
        }
        
        for (boolean present : alphabetPresence) {
            if (!present) {
                return false; 
            }
        }
        
        return true; 
    }
}
