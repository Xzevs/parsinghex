import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Notepad {
    public static void main (String[]args) {
        String filename = "Notepad.txt";
        FileReader fr =null;
        try {
            fr =new FileReader(filename);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        BufferedReader infile = new BufferedReader(fr);

        String line;
        try {
            String inFile;
            while ((line = inFile = infile.readLine()) !=null) {
                System.out.println(line);
            }
            infile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
