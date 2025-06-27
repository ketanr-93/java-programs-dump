package FileHandlingTest;
import java.io.*;

public class FileHandlingTest {
    public static void main(String[] args) {
        String fileName = "test.txt";

        try{
            FileWriter writer=new FileWriter(fileName);
            writer.write("This should be written in the file");
            System.out.println("Written Successfully");
            writer.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        try{

            File file = new File(fileName);
            FileReader reader= new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while((line= bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            bufferedReader.close();

        }catch (IOException e){
            System.out.println("FIle Reading Error");
            e.printStackTrace();
        }


    }
}
