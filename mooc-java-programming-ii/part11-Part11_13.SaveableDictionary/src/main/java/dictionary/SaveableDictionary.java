/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author petersims
 */
public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.fileName = "";
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, translation);
        dictionary.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }

    public void delete(String word) {
        String translation = this.translate(word);
        dictionary.remove(word);
        dictionary.remove(translation);
    }

    public boolean load() {
        try {
            try (Scanner scanner = new Scanner(new File(fileName))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(":");
                    this.add(parts[0], parts[1]);
                }
            }
            return true;
        } catch (IOException ex) {
            System.err.println("File error: " + ex.getMessage());
            return false;
        }
    }

    public boolean save() {
        ArrayList<String> writtenWords = new ArrayList<>();

        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            dictionary.keySet().forEach((word) -> {
                String translation = dictionary.get(word);
                if (!writtenWords.contains(word) && !writtenWords.contains(translation)) {
                    writtenWords.add(word);
                    writer.println(word + ":" + translation);
                }
            });
        } catch (FileNotFoundException ex) {
            System.err.println("File error: " + ex.getMessage());
            return false;
        }
        return true;
    }

}
