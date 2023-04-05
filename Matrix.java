import java.util.Scanner;

public class Matrix {
  private int[][] matrix; // 2D array to store the matrix
  private int matNumber;  //Data for the matrix size entered by user

  //Starting point for square matrix to be printed with 0s after matrix initialization
  public Matrix(int matNumber) {
    this.matNumber = matNumber;
    this.matrix = new int[matNumber][matNumber];
      for (int row = 0; row < matNumber; row++) {
        for (int column = 0; column < matNumber; column++) {
           System.out.print(matrix[row][column] + "       ");
          }
          System.out.println(); //Moves to next line after each iteration of row
      }
    }

    /*  Method to swap the values at two different positions in the matrix
        Takes in oringinal postions of matrices to be swapped
    */
  private void swap(int x1, int y1, int x2, int y2) {
    int matPos = matrix[x1][y1];
      matrix[x1][y1] = matrix[x2][y2];
       matrix[x2][y2] = matPos;
    }

    // Method to populate the matrix with numbers from 1 to the square of user entered number
  public void populateMatrix() {
    int count = 1;
      for (int row = 0; row < matNumber; row++) {
        for (int column = 0; column < matNumber; column++) {
          matrix[row][column] = count++;  //Assigning numbers in sequence to square of matNumber
          }
        }
    }

    // Method to print the matrix with the secondary diagonal highlighted
    public void printMatrix() {
      System.out.println("\nMatrix with highlighted secondary diagonal:");
      for (int row = 0; row < matNumber; row++) {
        for (int column = 0; column < matNumber; column++) {
          if (row + column == matNumber - 1) { // check if number is on secondary diagonal
             System.out.print("\033[43m" + matrix[row][column] + "\033[0m\t");  //Color code secondary diagonal number in yellow

            } else {
                System.out.print(matrix[row][column] + "\t");
              }
          }
        System.out.println();
      }
  }

  //Flips positions of matrices
  public void flipMatrix() {
    int l = matrix.length;  //Calls matrix size
    //Condition runs from first row till it can't go through the gate (last)
    for (int row = 0; row < l; row++) {
      for (int col = 0; col < l-1-row; col++) {
        swap(row, col, l-1-row, l-1-col);
      }
    }
  }
}
