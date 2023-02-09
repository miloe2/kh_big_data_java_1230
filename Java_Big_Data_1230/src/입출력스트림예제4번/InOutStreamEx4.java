package 입출력스트림예제4번;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InOutStreamEx4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("text.txt");
        int readData;
        while(true){
            readData = reader.read();
            if(readData==-1) break;
            System.out.println((char)readData);

        }
        reader.close();

    }
}
