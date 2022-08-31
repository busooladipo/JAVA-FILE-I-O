package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream_Main {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("src/main/TXT_FILES/copyFrom.txt");
            fileOutputStream = new FileOutputStream("src/main/TXT_FILES/printTo.txt");

            int c;

            while ((c= fileInputStream.read()) != -1){
                fileOutputStream.write(c);
            }
        }finally {
            if (fileInputStream != null){
                fileInputStream.close();
            }
            if (fileOutputStream != null){
                fileOutputStream.close();
            }
        }


    }


}