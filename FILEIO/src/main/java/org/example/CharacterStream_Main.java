package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream_Main {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("src/main/TXT_FILES/copyFrom.txt");
            outputStream = new FileWriter("src/main/TXT_FILES/printTo.txt");

            int c;

            while ((c = inputStream.read()) != -1){
                outputStream.write(c);
            }
        }finally {
            if(inputStream != null){
                inputStream.close();
            }

            if (outputStream != null){
                outputStream.close();
            }
        }

    }
}
