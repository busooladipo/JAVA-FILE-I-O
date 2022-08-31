package org.example;

import java.io.*;

public class BufferedCharacter_Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inp = null;
        BufferedWriter out = null;

        try {
            inp = new BufferedReader(new FileReader("src/main/TXT_FILES/copyFrom.txt"));
            out = new BufferedWriter(new FileWriter("src/main/TXT_FILES/printTo.txt"));

            int c;
            while ((c = inp.read()) != -1){
                out.write(c);
            }

        }finally {
            if(inp != null){
                inp.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
