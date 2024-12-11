public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) { // Corrected: loop condition changed to i < arr.length
            arr[i] = i * 2;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}