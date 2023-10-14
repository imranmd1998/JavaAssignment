import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX"; 
        int result = romanToInt(roman);
        System.out.println("Roman numeral " + roman + " is equivalent to " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0; 

        
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentSymbol = s.charAt(i);
            int currentValue = romanMap.get(currentSymbol);

            
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

           
            prevValue = currentValue;
        }

        return result;
    }
}
