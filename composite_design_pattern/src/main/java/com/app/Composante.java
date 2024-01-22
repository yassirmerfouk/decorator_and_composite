package com.app;

public abstract class Composante {
    protected String name;
    protected int level=0;

    public Composante(String name) {
    }

    public abstract void afficher();

    public String getTab(){
        String tab = "";
        for(int i = 0 ; i< level ; i++){
            tab=tab+"\t";
        }
        return tab;
    }
}
