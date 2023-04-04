import java.util.Scanner;

public class Matrix {
    private int[][] matrix; // 2D array to store the matrix
    private int matNumber;  //Data for the matrix size entered by user

    public Matrix(int matNumber) {
        this.matNumber = matNumber;
        this.matrix = new int[matNumber][matNumber];
        for (int row = 0; row < matNumber; row++) {
          for (int column = 0; column < matNumber; column++) {
              System.out.print(matrix[row][column] + "       ");
          }
          System.out.println();
      }
    }

    // Method to swap the values at two different positions in the matrix
    private void swap(int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }

    // Method to populate the matrix with numbers from 1 to the square of user entered number
    public void populateMatrix() {
        int count = 1;
        for (int row = 0; row < matNumber; row++) {
            for (int column = 0; column < matNumber; column++) {
                matrix[row][column] = count++;  //Assigning sequential numbers
            }
        }
    }

    // Method to print the matrix with the secondary diagonal highlighted
    public void printMatrix() {
      System.out.println("\nMatrix with highlighted secondary diagonal:");
      for (int row = 0; row < matNumber; row++) {
          for (int column = 0; column < matNumber; column++) {
              if (row + column == matNumber - 1) { // check if element is on the secondary diagonal
                  System.out.print("\033[43m" + matrix[row][column] + "\033[0m\t");
              } else {
                  System.out.print(matrix[row][column] + "\t");
              }
          }
          System.out.println();
      }
  }

  public void flipMatrix() {
        for (int row = 0; row < matNumber; row++) {
            for (int column = 0; column < matNumber / 2; column++) {
                if (column == matNumber / 2 - 1 && matNumber % 2 == 1) { // skip highlighted number in middle column
                    continue;
                }
                int temp = matrix[row][column];
                matrix[row][column] = matrix[row][matNumber - column - 1];
                matrix[row][matNumber - column - 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the matNumber of the matrix: ");
        int matNumber = scanner.nextInt();

        Matrix matrix = new Matrix(matNumber);
        matrix.populateMatrix();
        matrix.printMatrix();
        matrix.flipMatrix();
        matrix.printMatrix();
    }
}
