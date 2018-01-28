package com.sdabyd2.programowanie.Model;

public class GiantModel { //klasa modelu opisuje nadaje jakies cechy

    private Health health;
    private Fatigue fatigue;
    private Nourishment nourishment;

    public GiantModel(Health health,
                      Fatigue fatigue,
                      Nourishment nourishment) {
        this.health = health;
        this.fatigue = fatigue;
        this.nourishment = nourishment;
    }

    public Fatigue getFatigue() {
        return fatigue;
    }

    public void setFatigue(Fatigue fatigue) {
        this.fatigue = fatigue;
    }

    public Nourishment getNourishment() {
        return nourishment;
    }

    public void setNourishment(Nourishment nourishment) {
        this.nourishment = nourishment;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "GiantModel" +
                " health = " + health +
                " fatigue = " + fatigue +
                " nourishment = " + nourishment;
    }
}


