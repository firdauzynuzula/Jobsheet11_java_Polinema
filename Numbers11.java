import java.util.Scanner;

public class Numbers11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                int[][] myNumbers = new int[5][3];

        // Input data ke array
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print("Masukkan data baris ke-" + i + " kolom ke-" + j + ": ");
                myNumbers[i][j] = input.nextInt();
            }
        }

        // Tampilkan data dari array
        System.out.println("\nData yang tersimpan di array:");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
