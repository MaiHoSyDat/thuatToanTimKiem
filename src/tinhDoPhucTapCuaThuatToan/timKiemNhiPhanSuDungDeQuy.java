package tinhDoPhucTapCuaThuatToan;

import java.util.Arrays;
import java.util.Scanner;

public class timKiemNhiPhanSuDungDeQuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử cho mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + " là ");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(arr);
        int num = 2;
        int index = binarySearch(arr, 0, n -1, num);
        if (index != -1) {
            System.out.println("Tìm thấy " + num + " ở vị trí " + index);
        } else {
            System.out.println("Không tìm thấy " + num + " trong mảng!");
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (left < right) {
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
