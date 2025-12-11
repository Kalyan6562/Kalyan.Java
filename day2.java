
import java.util.Scanner;
import java.util.Random;
public class day2{
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

public class day2 {

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
public class day2 {

    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=1;j>i+1;j--){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}

public class day2 {

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

import java.util.Scanner;
public class day2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        System.out.println("Table");
        for(int x=0;x<11;x++){
            System.out.println(num + "x"+ x + "=" + num*x);
        }

    }
}

import java.util.Scanner;
import java.util.Random;
public class day2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        int A=rc.nextInt(1000)+1;
        System.out.println("Votes of Candidate A:  " +A);
        int B=rc.nextInt(1000)+1;
        System.out.println("Votes of Candidate B:  "  +B);
        int C=rc.nextInt(1000)+1;
        System.out.println("Votes of Candidate C:  "  +C);
        int D=rc.nextInt(1000)+1;
        System.out.println("Votes of Candidate D:  "  +D);
        System.out.println("Enter your Age:");
        int Age = sc.nextInt();
        if(Age>=18){
            System.out.println("Your are eligible for Voting");
            System.out.println("Choose the Candidates:");
            int Candidates=sc.nextInt();
            if(Candidates==1){
                A++;

            }
            else if(Candidates==2){
                B++;
            }
            else if(Candidates==3){
                C++;
            }
            else{
                D++;
            }
            System.out.println("Thanks For Voting..!");
            System.out.println("Results:");
            System.out.println("Votes of Candidate A:  "+A);    
            System.out.println("Votes of Candidate B:  "+B);
            System.out.println("Votes of Candidate C:  "+C);
            System.out.println("Votes of Candidate D:  "+D);
            if(A>B && A>C && A>D){
                System.out.println("A Won With The Number of Votes of  "+A);
            }
            else if(B>A && B>C && B>D){
                System.out.println("B Won With The Number of Votes of  "+B);
            }
            else if (C>A && C>B && C>D){
                System.out.println("C Won With The Number of Votes of "+C);
            }
            else{
                System.out.println("D Won With The Number of Votes of "+D);
            }
            

        }
        if(Age<18){
            System.out.println("You Are Not Eligible For Voting");
            System.out.println("Results:");
            System.out.println("Votes of Candidate A:  "+A);    
            System.out.println("Votes of Candidate B:  "+B);
            System.out.println("Votes of Candidate C:  "+C);
            System.out.println("Votes of Candidate D:  "+D);
             if(A>B && A>C && A>D){
                System.out.println("A Won With The Number of Votes of  "+A);
            }
            else if(B>A && B>C && B>D){
                System.out.println("B Won With The Number of Votes of  "+B);
            }
            else if (C>A && C>B && C>D){
                System.out.println("C Won With The Number of Votes of "+C);
            }
            else{
                System.out.println("D Won With The Number of Votes of "+D);
            }
        }
          
           
        
      
    }
}

public class day2 {

    public static void main(String[] args) {
        int n = 6;
        System.out.println(series(n));
    }

    public static int series(int n) {
        if (n == 1) {
            return 0;   // First Fibonacci number
        } else if (n == 2) {
            return 1;   // Second Fibonacci number
        } else {
            return series(n - 1) + series(n - 2); // Recursive relation
        }
    }
}

public class day2 {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(series(n));
    }
    public static int series(int n) {
        if(n<=1){
            return 1;
        }
        else{
            return n*series(n-1);
        }
    }
}
