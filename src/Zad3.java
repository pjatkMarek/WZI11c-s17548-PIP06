public class Zad3 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(reverseArr(arr)[i]);
        }
    }

    public static int[] reverseArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length-1-i];
        }
        return reversedArr;
    }
}
