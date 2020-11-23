package com.nc.example.solution.lesson9;

import com.nc.example.Constants;
import com.nc.example.LessonAPI;
import com.nc.example.lesson9.FileVisitorImpl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution_lesson9 implements LessonAPI {

    @Override
    public void executeSolution(String[] args) {
        //fileIO();
        //fileBuffer();
        //fileIOScanner();
        //consoleIO();
        //consoleScanner();

//        Path path = Paths.get("");
//        URI uri = path.toUri();
//        System.out.println(path.toAbsolutePath());
//        System.out.println(uri);

        try {
            FileVisitorImpl visitor = new FileVisitorImpl();
            Files.walkFileTree(Paths.get("").toAbsolutePath(), visitor);
            System.out.println("file in project: " + visitor.getMyCountFile());
            System.out.println("dir in project: " + visitor.getMyCountDir());

        } catch (IOException e) {
            e.printStackTrace();
        }

        FileVisitorImpl fileVisitor = new FileVisitorImpl();
        int cnt = fileVisitor.getMyCountFile();
    }

    public void fileBuffer() {
        try(BufferedReader buffer = new BufferedReader(new FileReader(Constants.FROM));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(Constants.TO))) {
            String s;
            while ((s = buffer.readLine()) != null) {
                bufferedWriter.write(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fileIO() {
        try(InputStream inputStream = new FileInputStream(Constants.FROM);
            OutputStream outputStream = new FileOutputStream(Constants.TO)) {
            int c;
            while((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fileIOScanner() {
        try(Scanner sc = new Scanner(new FileInputStream(Constants.FROM))) {
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void consoleIO() {
        try(BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 3; i++) {
                System.out.println(buffer.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void consoleScanner() {
        try(Scanner scanner = new Scanner(System.in)) {
             String s = scanner.nextLine();
            System.out.println(s);

        }
    }
}
