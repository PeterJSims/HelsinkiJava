
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] arr) {
        int smallest = smallest(arr);
        int smallestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallestIndex = i;
                break;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int smallestIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void sort(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = indexOfSmallestFrom(arr, i);
            swap(arr, i, index);

        }
    }

}
