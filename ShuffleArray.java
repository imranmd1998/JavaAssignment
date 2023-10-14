import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        shuffleArray(arr);
        
        System.out.println("Shuffled Array: " + Arrays.toString(arr));
    }
    
    public static void shuffleArray(int[] arr) {
        int n = arr.length;
        Random rand = new Random();
        
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            
            // Swap array
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
