package com.sdabyd2.programowanie.Model;

public enum Fatigue {

    YES("yes"), NO("no"), SLEEPING("sleeping");

    private String title;

    Fatigue(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return  title + "\t\n";
    }
}
