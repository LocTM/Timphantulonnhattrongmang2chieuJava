import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr2 = {
                {1, 5, 3},
                {8, 2, 7},
                {4, 6, 9}
        };

        double maxElement = 0;

        int rowIndex = -1;
        int colIndex = -1;


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

                if (arr2[i][j] > maxElement) {
                    maxElement = arr2[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }


        System.out.println("Phần tử lớn nhất của ma trận là " + maxElement +
                " tại vị trí (" + rowIndex + ", " + colIndex + ")");


        System.out.print("Bước 2: Nhập số hàng của ma trận: ");
        int numRows = scanner.nextInt();
        System.out.print("Bước 2: Nhập số cột của ma trận: ");
        int numCols = scanner.nextInt();

        int[][] userMatrix = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Ma trận từ nhập liệu của người dùng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
