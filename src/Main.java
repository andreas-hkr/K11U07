import java.util.Arrays;

public class Main {
    static void rotate(int[] arr) {
        int temp = arr[arr.length-1];

        for (int i= arr.length-1; i >= 1; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        // Skriv en metod som roterar alla element i en array ett steg till höger
        // (sista elementet skall hamna på index 0)

        int[] arr = {1, 2, 3, 4};
        rotate(arr);
        System.out.println(Arrays.toString(arr));
    }
}