

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(BinarySearch(arr, 9, 5));
    }

    //	Binary	Search	Algorithm	–	Iterative	Way
    public static int BinarySearch(int[] arr, int size, int value) {
        int mid;
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            mid = low + (high - low) / 2; // To	avoid	the	overflow
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}