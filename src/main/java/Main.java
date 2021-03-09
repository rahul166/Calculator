import java.util.Scanner;

public class Main {
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static double getsqrt(int num){
        return Math.sqrt(num);
    }
    public static double getlog(int num){
        return Math.log(num);
    }
    public static double getpow(int num,int pow){
        return Math.pow(num,pow);
    }
    public static void main(String[] args){
        while(true) {
            System.out.println("Welcome......");
            System.out.println("Enter your choice \n" +
                    "1. Factorial \n" +
                    "2. Square root \n" +
                    "3. Logarithm \n" +
                    "4. Power \n" +
                    "5. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the number");
                int num = sc.nextInt();
                System.out.println("Factorial Of the Number");
                int ans = fact(num);
                System.out.println(ans);
            } else if (choice == 2) {
                System.out.println("Enter the number");
                int num = sc.nextInt();
                System.out.println("Square root Of the Number");
                double ans=getsqrt(num);
                System.out.println(ans);
            } else if (choice == 3) {
                System.out.println("Enter the number");
                int num = sc.nextInt();
                System.out.println("Log Of the Number");
                double ans = getlog(num);
                System.out.println(ans);
            } else if (choice == 4) {
                System.out.println("Enter the base number");
                int num = sc.nextInt();
                System.out.println("Enter the power");
                int pow = sc.nextInt();
                System.out.println("Power(first^second)");
                double ans = getpow(num, pow);
                System.out.println(ans);
            } else if(choice==5){
                break;
            }

        }
    }
}