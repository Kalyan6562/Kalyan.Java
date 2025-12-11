
/*import java.util.Scanner;
import java.util.Random;
public class test{
    public static void main(String[] args) {
        Random rc = new Random();
        Scanner sc =new Scanner(System.in);
        int x = rc.nextInt(100)+1;
        int guess = 0;
        int attempts = 0;
        while (guess!=x) {
          System.out.println("Enter a number between 1 to 100"); 
          guess= sc.nextInt();
          attempts++;
        if(guess==x){
            System.out.println("Congratulations..! your guess is correct.");
            System.out.println("Numbers of Attempts taken:"+attempts);
            System.out.println("Thankyou for Playing, Come Again.!");
            break;
        }
        else if (guess<x) {
            System.out.println("your guess is Too Low! Try Again");
        }
        else{
            System.out.println("Your guess is Too High! Try Again");
        }
    }
    }
}

public class test {

    public static void main(String[] args) {
        for(int i =0; i<4; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}

public class day2 {

    public static void main(String[] args) {
        for(int i = 0; i<4; i++){
            for(int j =5; j>i+1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/
public class day2 {

    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
/* 
public class test {

    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j>i+1;j--){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}

public class test {

    public static void main(String[] args) {
        System.out.println(add(13,17));
        System.out.println(mul(13,17));
        System.out.println(div(2,3));
        System.out.println(sub(13,17));
        System.out.println(rem(2,3));
    
    }
    public static int add(int a,int b) {
        return a+b;
    }
    public static int mul(int a, int b) {
        return a*b;
    }
    public static double div(double a, double b) {
        return a/b;  
    }
    public static int sub(int a, int b) {
        return a-b;
    }
    public static int rem(int a, int b) {
        return a%b;
    }

}
*/