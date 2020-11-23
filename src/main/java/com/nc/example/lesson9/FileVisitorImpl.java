package com.nc.example.lesson9;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorImpl implements FileVisitor<Path> {

    private int myCountFile = 0;
    private int myCountDir = 0;

    public int getMyCountFile() {
        return myCountFile;
    }

    public void setMyCountFile(int myCountFile) {
        this.myCountFile = myCountFile;
    }

    public int getMyCountDir() {
        return myCountDir;
    }

    public void setMyCountDir(int myCountDir) {
        this.myCountDir = myCountDir;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        myCountDir++;
        //System.out.printf("dir %s\n", dir.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.toFile().getName().contains(".class")) {
            myCountFile++;
            System.out.println(file.toFile().getName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return FileVisitResult.CONTINUE;
    }
}
