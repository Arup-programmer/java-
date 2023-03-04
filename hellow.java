import java.util.Scanner;
public class hellow {
    public static void main(String[] args)
    {
        // int ,char,string,double,bollen,long,byte
//       int y=20;
//       String num= String.valueOf(y);

//        String number_str = "50";
//        int number = Integer.parseInt(number_str);
//        System.out.println(number);
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the input");
        int a= obj.nextInt();
        int b=obj.nextInt();
        int sum=(a+b);
        System.out.println(sum);
    }
}
