package com.sdabyd2.programowanie.Controller;

import com.sdabyd2.programowanie.Model.Fatigue;
import com.sdabyd2.programowanie.Model.GiantModel;
import com.sdabyd2.programowanie.Model.Health;
import com.sdabyd2.programowanie.Model.Nourishment;
import com.sdabyd2.programowanie.View.GiantView;

public class GiantController { //odpowiedzialna za ustawianie

    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {

        this.giantModel = giantModel;
        this.giantView = giantView;

    }

    public Health getHealth() {
        return giantModel.getHealth();  //każdy potworek może mieć swoje zdrowie
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);

    }

    public Fatigue getFatigue(){
        return giantModel.getFatigue();
    }

    public void setFatigue(Fatigue fatigue){
        this.giantModel.setFatigue(fatigue);
    }

    public Nourishment getNourishment(){
        return giantModel.getNourishment();
    }

    public void setNourishment (Nourishment nourishment){
        this.giantModel.setNourishment(nourishment);
    }

    public void updateView(){
        //metoda
        this.giantView.displayGiant(giantModel);

    }

}
