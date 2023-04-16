import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopy
{   public static void main(String[] args) throws IOException
   { 
     File fsrc = new File("x.txt");
     File fdes = new File("y.txt"); 
     FileReader fr=new FileReader(fsrc);
     BufferedReader br= new BufferedReader(new FileReader(fsrc));
     FileWriter fw = new FileWriter(fdes);
     String s= null;
     while((s=br.readLine()) != null)
     {
        fw.write(s);
	fw.write("\n");
	fw.flush();
     }
        fw.close();
    }
}