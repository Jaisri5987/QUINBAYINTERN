import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
public class RWF
{
    public static void main(String[] args)
    {
        try {
            {
                FileReader fr = new FileReader("/Users/jaisri/Downloads/employees.txt");
                FileWriter fw1 = new FileWriter("/Users/jaisri/Documents/MANAGER.rtf");
                FileWriter fw2 = new FileWriter("/Users/jaisri/Documents/QA.rtf");
                FileWriter fw3 = new FileWriter("/Users/jaisri/Documents/DEV.rtf");
                string str="";
                int i;
                while((i = fr.read()) != -1 )
                {
                    str += (char)i;
                     if(fr.DESIGNATION == "MANAGER")
                     {
                        fw1.write(str);
                     }
                     if(fr.DESIGNATION == "QA")
                     {
                        fw2.write(str);
                     }
                     if(fr.DESIGNATION == "DEV")
                     {
                        fw3.write(str);
                     }
                }
                fr.close();
                fw1.close();
                fw2.close();
                fw3.close();
                
            }
        } 
        catch (Exception e) {
            System.out.println("An error Occured");
        
        }
    }
}