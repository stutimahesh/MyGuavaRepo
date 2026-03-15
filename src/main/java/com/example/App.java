package com.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

public class App {

    public static void main(String[] args) {

        ImmutableList<String> fruits = ImmutableList.of("Apple", "Banana", "Cherry");
        System.out.println(fruits);

        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try {
            // Copy the contents of source.txt to destination.txt
            // Using Apache Commons IO FileUtils class
            FileUtils.copyFile(sourceFile, destFile);

            // Print success message if file is copied
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            // If any error occurs during file copying,
            // this block will handle the exception

            // Print error message
            System.err.println("Error occurred while copying file: " + e.getMessage());
        }
    }
}
