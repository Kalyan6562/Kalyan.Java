/*public class day3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
            try {
               int res = a/b; 
               System.out.println(res);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Catch exception:"+e.getMessage());
            }
        
        
        
    }
}

public class day3 {

    public static void main(String[] args) {

        String name = null;  // name is not initialized

        try {
            // This line causes NullPointerException
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        System.out.println("Program finished safely!");
    }
}

public class day3 {

    public static void main(String[] args) {

        try {
            // Trying to load a class that does NOT exist
            Class.forName("com.example.NotExistingClass");
        }
        catch (TypeNotPresentException e) {
            System.out.println("Caught TypeNotPresentException: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            // Class.forName actually throws ClassNotFoundException,
            // which TypeNotPresentException wraps internally.
            throw new TypeNotPresentException("com.example.NotExistingClass", e);
        }
    }
}
*/
import java.io.*;

public class day3 {

    public static void main(String[] args) {
        try {
            // Try to open a file that does NOT exist
            FileReader fr = new FileReader("unknownfile.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            System.out.println("File content: " + line);

            br.close();
        }
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        System.out.println("Program finished safely!");
    }
}



