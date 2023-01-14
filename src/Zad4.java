public class Zad4 {
    public static void main(String[] args) {
        int[] genArr = generateArray(100);
        printArray(genArr);
        int[] sortedArr = sort(genArr);
        printArray(sortedArr);
        int[] revArr = reverse(sortedArr);
        printArray(revArr);
        System.out.println(equalsReverse(sortedArr,revArr));
    }

    public static boolean equalsReverse(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[arr2.length-i-1]) {
                return false;
            }
        }

        return true;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length-1-i];
        }
        return reversedArr;
    }

    public static int[] generateArray(int arrLength) {
        int arr[] = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr[i] = (int)(Math.random()*(101));
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println("}");
    }
}
