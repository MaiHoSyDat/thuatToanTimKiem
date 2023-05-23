package thuatToanTimKiemKhongSuDungDeQuy;

public class BinarySearch {


    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key > list[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {2, 4, 6, 8, 9, 11, 14, 22, 37, 48, 55};
        System.out.println(binarySearch(list,10));
    }
}
