import java.util.Scanner;
public class lab_1 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        int C2, C3, C5, C7;
        //залишок від ділення номера залікової книжки учня на 2
        C2 = 1124 % 2;
        System.out.println("C2 = " + C2 + " Operation 1 : \"+\"");
        //залишок від ділення номера залікової книжки учня на 3
        C3 = 1124 % 3;
        System.out.println("C3 = " + C3);
        //залишок від ділення номера залікової книжки учня на 5
        C5 = 1124 % 5;
        System.out.println("C5 = " + C5 + " Operation 2 : \"-\"");
        //залишок від ділення номера залікової книжки учня на 7
        C7 = 1124 % 7;
        System.out.println("C7 = " + C7 + "  i and j = char");

        int n, m, a, b;
        char c, v;
        System.out.print("Enter a: ");
        a = num.nextInt();
        System.out.println("a = " + a);
        //перевірю чи введене число задовільняє умову
        if ( a < 0 || a >=10) {
            System.out.println("char can't be more than 10 less than 0 ");
            System.exit(0);
        }

        System.out.print("Enter b: ");
        b = num.nextInt();
        System.out.println("b = " + b);
        //перевірю чи введене число задовільняє умову
        if ( b < 0 || b >=10 ) {
            System.out.println("char can't be more than 10 less than 0 ");
            System.exit(0);
        }
        //перевожу введені числа в char
        c = (char) a;
        v = (char) b;
        System.out.print("Enter n: ");
        n = num.nextInt();
        System.out.println("n = " + n);

        System.out.print("Enter m: ");
        m = num.nextInt();
        System.out.println("m = " + m);

        float S = 0;
        //обчислення значення функції
        for (int i = c; i <= n; i++) {
            for (int j = v; j <= m; j++) {
                S += (i - j) / (i + 2.);
            }
        }
        System.out.println("S = " + S);
    }

}
