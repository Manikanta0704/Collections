package mypack;

import java.io.*;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\91766\\OneDrive\\Desktop\\Collections\\FilesDemo\\sample.txt");
//      FileOutputStream fos1 = new FileOutputStream("C:/Users/91766/OneDrive/Desktop/Collections/FilesDemo/sample.txt");
        String data="What is your plans Today";
        byte[] bytes=data.getBytes();
        fos.write(bytes);
        fos.close();

    }
}

