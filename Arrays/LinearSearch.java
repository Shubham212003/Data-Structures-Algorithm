// Find the index of elelment in a given array . 
// kay = 10.
// Time & Space Complexity.O(n)
public class LinearSearch {
    public static int linearSearch(int number[], int Key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == Key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 3, 4, 6, 8, 10, 12 };
        int Key = 6;

        int index = linearSearch(numbers, Key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("key as at index = " + index);
        }

    }
}
