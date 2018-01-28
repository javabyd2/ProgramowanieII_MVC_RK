package com.sdabyd2.programowanie.Model;

public enum Health {

    HEALTH("healthy"), NOTHEALTHY("nothealthy"), DEAD("dead"); //typ wyliczeniowy enum

    private String title;

    Health(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return  title + "\n\t";
    }


}
