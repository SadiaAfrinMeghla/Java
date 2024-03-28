import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulation {
    public static void main(String[] args) throws IOException {
        //write();
        readFile();
    }
    public static void write() throws IOException {
        FileWriter fw=new FileWriter("./src/main/resources/test.txt",true);
        fw.write("Bye \n");
        fw.close();
    }
    public static void readFile () throws IOException {
        int character;
        FileReader fr=new FileReader("./src/main/resources/test.txt");
        while((character=fr.read())!=-1){
            System.out.print((char) character);
        }

        fr.close();

    }
}

