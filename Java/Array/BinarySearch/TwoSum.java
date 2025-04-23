package Array.BinarySearch;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 8, 11, 15 };
        int target = 9;
        twoSum(arr, target);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int mid = start + (end - start) / 2;

        if ((numbers[start] + numbers[mid]) == target) {
            return new int[] { start, mid };
        } else if (start + mid > target) {
            mid = end - 1;
        } else if (start + mid < target) {
            start = start + 1;
        }
    }
}
