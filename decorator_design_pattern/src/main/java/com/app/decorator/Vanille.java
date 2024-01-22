package com.app.decorator;


import com.app.produits.Boisson;
public class Vanille extends DecorateurBoisson {
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Au Vanille";
    }

    @Override
    public double cout() {
        return 2.6 + boisson.cout();
    }
}
