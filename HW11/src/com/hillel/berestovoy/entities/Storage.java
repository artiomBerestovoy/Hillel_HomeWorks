package com.hillel.berestovoy.entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Storage {
    private File file;

    public Storage (String name) {
        file = new File(name);
    }

    public String[] readFile() {
        try (FileInputStream input = new FileInputStream(file)){
            byte[] bytes = new byte[input.available()];
            input.read(bytes);

            String s = new String(bytes);
            return s.split("(;\\W)");
        }catch (IOException ex) {
            System.out.println("An I/O error");
        }
        return null;
    }

    public void writeToFile(String stringToSave) {
        try (FileOutputStream output = new FileOutputStream(file)){
            output.write(stringToSave.getBytes());
        } catch (IOException ex) {
            System.out.println("An I/O error");
        }
    }

}
