import java.io.FileReader;
import java.io.IOException;

public class Throws2 {
    static void openFile() throws IOException {
        try (FileReader reader = new FileReader("data.txt")) {
            reader.read();
        }
    }

    public static void main(String[] args){
        try{
            openFile();
        }catch(IOException e ){
            System.out.println("File not found");
        }
    }
}
