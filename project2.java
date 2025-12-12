import java.util.Scanner;

public class project2 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter Name 1 : ");
        String str = sc.nextLine().toLowerCase().replaceAll("[aeiou]", "").replaceAll(" ",".");
        System.out.println("User Name 1 :");
        System.out.println(str);

        System.out.print("Enter Name 2 : ");
        String str1 = sc.nextLine().toLowerCase().replaceAll("[aeiou]", "").replaceAll(" ",".");
        System.out.println("User Name 2 :");
        System.out.println(str1);

        System.out.print("Enter Name 3 : ");
        String str2 = sc.nextLine().toLowerCase().replaceAll("[aeiou]", "").replaceAll(" ",".");
        System.out.println("User Name 3 :");
        System.out.println(str2);

        System.out.print("Enter Name 4 : ");
        String str3 = sc.nextLine().toLowerCase().replaceAll("[aeiou]", "").replaceAll(" ",".");
        System.out.println("User Name 4 :");
        System.out.println(str3);

        System.out.print("Enter Name 5 : ");
        String str4 = sc.nextLine().toLowerCase().replaceAll("[aeiou]", "").replaceAll(" ",".");
        System.out.println("User Name 5 :");
        System.out.println(str4);


       } 
}
