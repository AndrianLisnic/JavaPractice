package com.endava.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOStreamsEx {
    public static void IOStreamsPractice() throws IOException {
        FileReader fr = new FileReader("src/main/resources/practiceFiles/file1.txt");
        FileWriter fw = new FileWriter("src/main/resources/practiceFiles/file1FileWriter.txt");

        Scanner scanner = new Scanner(fr);

        while (scanner.hasNext()){
            String line = scanner.next();
            System.out.println(line);
            fw.write(line + "\n");
        }

        fr.close();
        fw.close();
    }
}
