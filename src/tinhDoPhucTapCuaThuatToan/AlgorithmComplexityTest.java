package tinhDoPhucTapCuaThuatToan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        int[] repetitions = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii= str.charAt(i);
            repetitions[ascii] += 1;
        }
        int max = repetitions[0];

        for (int i = 1; i < repetitions.length; i++) {
            if (max < repetitions[i]){
                max = repetitions[i];

            }
        }
        char character = 0;
        for (int i = 0; i < repetitions.length; i++) {
            if (max == repetitions[i]){
                character = (char) i;
                System.out.println(character + " has the number of iterations " + max);
            }
        }



    }
}
