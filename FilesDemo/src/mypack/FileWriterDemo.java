package mypack;

import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String filePath = "C://Users//91766//OneDrive//Desktop//Collections//FilesDemo//samplethree.txt";
        String data = "Hyderabad man";

        try (FileWriter fw = new FileWriter(filePath)) {
            char[] chars = data.toCharArray();
            fw.write(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
