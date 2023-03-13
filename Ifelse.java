import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Scanner sr = new Scanner(System.in);
        System.out.println("enter a number");
        int  a = sr.nextInt();
        System.out.println(a);

        //if-else statement
        if(a>10){
            System.out.println("you are not a child");
        }
        else if(a<=10){
            System.out.println("you are a child");
        }

        switch statements
        switch (a){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
            default:
                System.out.println("nothing will be matched");

        }
        for(int i=1;i<=10;i++) {
            System.out.println("5 X " + i + " = " + (i * 5));

        }
        int i=1;
        while(i<=11){
            System.out.println("10 x " +   i    + "=" +(10*i));
            i++;
        }
    }
}
