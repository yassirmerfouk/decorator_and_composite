package com.app;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("Java.txt"));
        root.add(new File("pom.xml"));
        Folder src = (Folder) root.add(new Folder("src"));
        src.add(new File("data.csv"));
        src.add(new File("config.csv"));
        Folder org = (Folder) root.add(new Folder("org"));
        src.add(new File("config2.csv"));
        org.add(new File("data.bin"));
        root.afficher();
    }
}