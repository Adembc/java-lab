package exfour;

public class Util {
    public static int binary_Search(int[] intArray, int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (intArray[mid] == key) {
                return mid;
            }

            if (intArray[mid] > key) {
                return binary_Search(intArray, low, mid - 1, key);
            }

            return binary_Search(intArray, mid + 1, high, key);
        }

        return -1; // Key not found
    }
    public static int binary_Search(String[] strArray, int low, int high, String key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            int compareResult = strArray[mid].compareTo(key);
            if (compareResult == 0) {
                return mid;
            }

            if (compareResult > 0) {
                return binary_Search(strArray, low, mid - 1, key);
            }

            return binary_Search(strArray, mid + 1, high, key);
        }

        return -1; // Key not found
    }
}
