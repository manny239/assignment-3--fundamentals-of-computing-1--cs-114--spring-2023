import java.util.Scanner;

public class RunMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to print square matrix: ");
        int matNumber = input.nextInt();

        Matrix runIt = new Matrix(matNumber);
        runIt.populateMatrix();
        runIt.printMatrix();
        runIt.flipMatrix();
        runIt.printMatrix();

        /*
        int maxNumber = 0;
        int i,j,m,k = 0;
        System.out.println();

        maxNumber = matNumber*matNumber;
        for (i = maxNumber; i >= (maxNumber - matNumber + 2); i-- ) {
          System.out.print(i + "  ");
        }
        System.out.print(matNumber);
        System.out.print(i);

        for (m = 2; m <= matNumber; m++) {
          for (j=i-1; j >= 1; j--){
           if ( j == (matNumber * m) - (m - 1) ) {
            System.out.print("a" + "  ");
          }
            else {
              System.out.print(j + "  ");
            }
        }
        System.out.println();
      }
      */
    }
}
