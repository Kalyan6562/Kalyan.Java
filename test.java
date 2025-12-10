/*public class test {
    public static void main(String[] args) {
        float num1=17;
        float num2=13;
        float add = num1+num2;
        float sub = num1-num2;
        float mul = num1*num2;
        float div = num1/num2;
        float rem = num1%num2;

        System.out.println("addition:"+add);
        System.out.println("subtraction:"+sub);
        System.out.println("multiplication:"+mul);
        System.out.println("division:"+num1/num2);
        System.out.println("remainder:"+rem);
    
    }
}
*/
 /*public class test {
     public static void main(String[] args) {
        int num=5;
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
     }
 }
 
public class test {
  public static void main(String[] args) {
    int m=90;
    int so=95;
    int sc=85;
    int ja=75;
    int en=95;
    int sum =m+so+sc+ja+en;
    int avg =sum/5;

    if(avg>=90){
      System.out.println("Grade is O" );  
    }
    else if(avg>=80 && avg<90){
    System.out.println("Beta Grade is A");
    }
    else if(avg>=40 && avg<80){
    System.out.println("Pass");
    }
    else {
        System.out.println("Fail");
    }
  }
}
 
import java.util.Scanner;
public class test {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Greetings:");
    String g= sc.nextLine();
    System.out.println("Enter the Name:");
    String a= sc.nextLine();
}
}
*/
import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = Sc.nextInt();
        System.out.println("Enter b value:");
        int b = Sc.nextInt();
        System.out.println("Enter c value:");
        int c = Sc.nextInt();
        int d = a+b+c;
        int e = a-b-c;
        int f = a*b*c;
        int g = a/b/c;
        int h = a%b%c;
        System.out.println("addition:"+d);
        System.out.println("subtraction:"+e);
        System.out.println("multiplication:"+f);
        System.out.println("division:"+g);
        System.out.println("remainder:"+h);
    }
}