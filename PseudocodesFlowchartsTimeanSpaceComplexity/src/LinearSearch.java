public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 61, 2, 3, 4, 0};

        // Best Case: Target is 8
        int target = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Best Case: Target found at index " + i);
                break;
            }
        }

        // Worst Case: Target is 0
        target = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Worst Case: Target found at index " + i);
                break;
            }
        }

        // Average Case: Target is 3
        target = 3;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Average Case: Target found at index " + i);
                break;
            }
        }
/*
Best Case:

        Target = 8
        The target value 8 is the first element of the array.
                Therefore, Linear Search finds the target after only one comparison.

        Best Case Time Complexity = O(1)

        This means the time taken is constant because the algorithm
        does not need to check the remaining elements.

 2. Worst Case:

        Target = 0

        The target value 0 is the last element of the array.
                Therefore, Linear Search has to check all the elements before
        finding the target.

                Worst Case Time Complexity = O(n)

        The same situation occurs if the target is not present in the
        array, for example, target = 5. In that case, all n elements
        are checked.


 3. Average Case:

        If the target is located at a random position in the array,
        Linear Search may need to check approximately n/2 elements
        on average.

        Average Case Time Complexity = O(n)

        Although approximately n/2 elements are checked, we ignore
        the constant 1/2 in Big-O notation. Therefore, the average
        case is written as O(n).
 */
    }
}
