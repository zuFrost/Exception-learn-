package com.zufrost.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LearnIOException {
    static void main(String[] args) {
        try {
            File file = new File("file.txt");
            Scanner scan = new Scanner(file);
        }
        catch (IOException ex) {
            System.out.println("1 ex");
        }
        catch (FileNotFoundException ex) {
            System.out.println("2 ex");
        }
        finally {
            System.out.println("finally");
        }
    }
}
