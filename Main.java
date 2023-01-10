import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.*;
public class Readfile
{
    public static void main(String[] args)
    {
        try {
            {
                File obj = new File("/Users/jaisri/Downloads/employees.txt");
                Scanner sc =new Scanner (obj);
                while( sc.hasNextLine())
                {
                    String data = sc.nextLine();
                    System.out.println(data);
                }
                sc.close();
            }
        } 
        catch (Exception e) {
            System.out.println("An error Occured");
        
        }
    }
}
public class createNewFile
{
    public static void main(String[] args)
    {
    
       try 
       {
        File f = createNewFile("/Users/jaisri/Documents/MANAGER.rtf");
        File f1 = createNewFile("/Users/jaisri/Documents/QA.rtf");
        File f2 = createNewFile("/Users/jaisri/Documents/DEV.rtf");
        if(obj.designation == "manager")
        {
            Path temp = Files.move(Paths.get("/Users/jaisri/Downloads/employees.txt"),Paths.get("/Users/jaisri/Documents/MANAGER.rtf"));

        }
        if(obj.designation == "QA")
        {
            Path temp = Files.move(Paths.get("/Users/jaisri/Downloads/employees.txt"),Paths.get("/Users/jaisri/Documents/QA.rtf"));  
        }
        
        if(obj.designation == "DEV")
        {
            Path temp = Files.move(Paths.get("/Users/jaisri/Downloads/employees.txt"),Paths.get("/Users/jaisri/Documents/DEV.rtf"));
        }

       } 
       catch (Exception e) {
        System.out.println("An error occured");
    
       }

    }
}


