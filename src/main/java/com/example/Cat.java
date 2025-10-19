package com.example;

import java.util.List;

public class Cat {

    private final FelineBehavior feline;

    public Cat(FelineBehavior feline) {
        this.feline = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

}
