import java.sql.SQLOutput;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        System.out.println("arup");
        // testing by using variables
        String name = "rick";
        System.out.println(name);

        int a = 23;
        float b = 45.765f;
        boolean together = true;
        System.out.println(a);
        System.out.println(together);
        System.out.println(b);

        char good = 'd';
        System.out.println(good);


//        data types in java
//        primitive datatypes examples
        byte i = 43;
        System.out.println(i);
        double h = 45.9876543245d;
        System.out.println(h);
        short s = -3456;
        System.out.println(s);

//       operators in java
        int num1 = 45,  num2 = 76;
        System.out.println("the result is");
        System.out.println(num1+num2);
        System.out.println("the result is num1 / num2");
        System.out.println(num1/num2);
        System.out.println("the result is num1 - num2");
        System.out.println(num1-num2);
        System.out.println("the result is num1 % num2");
        System.out.println(num1%num2);
        System.out.println(--num1);
        System.out.println(++num1);
        System.out.println(++num1);

//        taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter anything of yours choice");
        int input = sc.nextInt();
        System.out.println(input);



    }
}
