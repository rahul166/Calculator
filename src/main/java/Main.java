import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    public int fact(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    private static final Logger logger = LogManager.getLogger(Main.class);
    public double getsqrt(int num){
        logger.info("Calculating Square root  of number " + num);
        return Math.sqrt(num);
    }
    public double getlog(int num){
        logger.info("Calculating log of number " + num);

        return Math.log(num);
    }
    public double getpow(int num,int pow){
        logger.info("Calculating power of number " + num);

        return Math.pow(num,pow);
    }
    public static void main(String[] args){
        while(true) {
            Main obj=new Main();
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
                int ans = obj.fact(num);
                logger.info("Calculating factorial of number " + num);
                System.out.println(ans);
            } else if (choice == 2) {
                System.out.println("Enter the number");
                int num = sc.nextInt();
                System.out.println("Square root Of the Number");
                double ans=obj.getsqrt(num);
                System.out.println(ans);
            } else if (choice == 3) {
                System.out.println("Enter the number");
                int num = sc.nextInt();
                System.out.println("Log Of the Number");
                double ans = obj.getlog(num);
                System.out.println(ans);
            } else if (choice == 4) {
                System.out.println("Enter the base number");
                int num = sc.nextInt();
                System.out.println("Enter the power");
                int pow = sc.nextInt();
                System.out.println("Power(first^second)");
                double ans = obj.getpow(num, pow);
                System.out.println(ans);
            } else if(choice==5){
                break;
            }

        }
    }
}