import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.max;
public class lab_2 {
    public static void main(String[] args) {
        int num_a_rows, num_a_columns, num_b_rows, num_b_columns;
        int C5,C7,C11, sum = 0;
        Scanner num = new Scanner(System.in);
        //залишок від ділення номера залікової книжки учня на 5
        C5 = 1124 % 5;
        System.out.println("C5 = " + C5 + "; Action with matrices : \"C= BxA\"");
        //залишок від ділення номера залікової книжки учня на 7
        C7 = 1124 % 7;
        System.out.println("C7 = " + C7 + "; Type of matrix elements - \"long\"");
        //залишок від ділення номера залікової книжки учня на 11
        C11 = 1124 % 11;
        System.out.println("C11 = " + C11 + "; Action with the matrix C : Calculate the sum of the largest elements of each column of the matrix");
        System.out.print("Enter the number of rows of the first matrix :  ");
        num_b_rows = num.nextInt();
        System.out.print("Enter the number of columns of the first matrix :  ");
        num_b_columns = num.nextInt();
        System.out.print("Enter the number of rows of the second matrix :  ");
        num_a_rows = num.nextInt();
        System.out.print("Enter the number of columns of the second matrix :  ");
        num_a_columns = num.nextInt();
        //перевіряєм чи можуть ці матриці множитись
        if (num_b_columns != num_a_rows){
            System.out.println("the number of columns of the first matrix must be equal the number of rows of the second matrix ");
            System.exit(0);
        }
        ArrayList<Integer> ooo = new ArrayList<>();
        ArrayList<Integer> oo1 = new ArrayList<>();
        ArrayList<Integer> oo2 = new ArrayList<>();
        long[][] B = new long[num_b_rows][num_b_columns];
        long[][] A = new long[num_a_rows][num_a_columns];
        //створення першої матриці
        System.out.println("Matrix B = ");
        for (int i = 0; i < num_b_rows; i++) {
            for (int j = 0; j < num_b_columns; j++) {
                long a = (long) ((Math.random() * (1 - 99)) + 99);
                B[i][j] = a;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        //створення другої матриці
        System.out.println("Matrix A = ");
        for (int i = 0; i < num_a_rows; i++) {
            for (int j = 0; j < num_a_columns; j++) {
                long a = (long) ((Math.random() * (1 - 99)) + 99);
                System.out.print(a + " ");
                A[i][j] = a;
            }
            System.out.println();
        }
        //множення матриць
        System.out.println("Matrix C  = ");
        for (int i = 0; i < num_b_rows; i++) {
            for (int j = 0; j < num_a_columns; j++) {
                int ui = 0;
                for (int kl = 0 ; kl < num_a_rows; kl++){
                    ui += B[i][kl] * A[kl][j];
                }
                System.out.print(ui + "  ");
                ooo.add(ui);
            }
            System.out.println();
        }
        //шукаю найменші числа в кожному стовпці
        for (int i = 0;i < num_a_columns;i++) {
            for (int j = 0; j < num_b_rows; j++) {
                oo1.add(ooo.get((j * num_a_columns + i)));
                if (oo1.size() == num_b_rows) {
                    oo2.add(max(oo1));
                    oo1.clear();
                }
            }
        }
        //знаходжу суму найменших чисел стовпців
        System.out.print("Sum = ");
        for(int num1: oo2){
            sum +=num1;
            System.out.print(num1);
            if (num1 != oo2.get(oo2.size()-1)) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }
}
