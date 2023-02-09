package 입출력스트림예제2번;

import java.io.*;

// InputStream : 바이트 기반의 입력 스트림으로 최상위 클래스로 추상 클래스임.
public class InOutStreamEx2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test.bin");
        byte[] buffer = new byte[100];
        while(true){
//            int data = is.read(); // 1바이트 씩 읽기
//            if (data == -1) break; // 파일의 끝에 도달하여 읽을게 없으면 -1;
//            System.out.print(data + " ");

            int readByteNum = is.read(buffer); // 매개변수로 전달한 buffer에 값을 담음.
            if(readByteNum == -1) break;
            for(int i = 0; i < readByteNum; i++)
                System.out.println(buffer[i]+ " ");
        }
        is.close(); // 읽기 위해 열어둔 스트림을 닫음.
    }
}
