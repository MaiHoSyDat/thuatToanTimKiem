package timChuoiLienTiepCoDoDaiLonNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();
        String str2 = String.valueOf(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > str2.charAt(str2.length()-1)){
                str2+= str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
