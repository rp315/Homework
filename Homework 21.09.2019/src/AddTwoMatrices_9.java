//Java program to add two matrices of the same size.
import java.util.Scanner;
public class AddTwoMatrices_9 {

    public static void main(String args[]) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.print("Input number of rows of matrix:");
        m = in.nextInt();
        System.out.print("Input number of columns of matrix:");
        n  = in.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.print("Input elements of first matrix:");

        for (  c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array1[c][d] = in.nextInt();

        System.out.print("Input the elements of second matrix:");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array2[c][d] = in.nextInt();

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                sum[c][d] = array1[c][d] + array2[c][d];

        System.out.print("Sum of the matrices:");

        for ( c = 0 ; c < m ; c++ ) {
            for ( d = 0 ; d < n ; d++ )
                System.out.print(sum[c][d]+"\t");

            System.out.println();
        }
    }
}
