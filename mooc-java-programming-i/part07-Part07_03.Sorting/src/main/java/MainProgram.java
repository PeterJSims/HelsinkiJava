
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};

    }

    public static int smallest(int[] arr) {
        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] arr) {
        int smallestIndex = 0;
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] arr, int startIndex) {
        int smallestIndex = startIndex;
        int smallest = arr[startIndex];
        for (int i = startIndex + 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
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
    
    public static void sort(int[] arr){
        int idx = 0;
        System.out.println(arr);
        for(int i = 0; i < arr.length; i++){
            idx = indexOfSmallestFrom(arr, i);
            swap(arr, i, idx);
            System.out.println(arr);
        }
    }
}
