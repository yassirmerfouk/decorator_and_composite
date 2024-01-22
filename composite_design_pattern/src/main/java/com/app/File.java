package com.app;

public class File extends Composante{


    public File(String file) {
        super(file);
    }

    @Override
    public void afficher() {

        System.out.println(getTab()+"File => "+name);
    }
}
