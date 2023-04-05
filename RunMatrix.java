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
    }
}
