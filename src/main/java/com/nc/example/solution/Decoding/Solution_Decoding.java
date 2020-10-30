package com.nc.example.solution.Decoding;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Solution_Decoding {
    public static void run(String[] args) {
        try(FileInputStream fin = new FileInputStream("1.txt")) {
            byte[] buffer = new byte[fin.available()-2];
            fin.read(buffer, 0, fin.available()-2);
            try (FileOutputStream imageOutFile = new FileOutputStream("image.png")) {
                byte[] imageByteArray = Base64.getDecoder().decode(buffer);
                imageOutFile.write(imageByteArray);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
