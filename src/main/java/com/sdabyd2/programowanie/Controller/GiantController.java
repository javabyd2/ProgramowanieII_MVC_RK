package com.sdabyd2.programowanie.Controller;

import com.sdabyd2.programowanie.Model.Fatigue;
import com.sdabyd2.programowanie.Model.GiantModel;
import com.sdabyd2.programowanie.Model.Health;
import com.sdabyd2.programowanie.Model.Nourishment;
import com.sdabyd2.programowanie.View.GiantView;

import java.util.List;

public class GiantController { //odpowiedzialna za ustawianie

    private List<GiantModel> giantModel;
    private GiantView giantView;

    public GiantController(List<GiantModel> giantModel, GiantView giantView) {

        this.giantModel = giantModel;
        this.giantView = giantView;

    }

    public Health getHealth(int k) {
        return giantModel.get(k).getHealth();  //każdy potworek może mieć swoje zdrowie
    }

    public void setHealth(Health health, int k) {
        this.giantModel.get(k).setHealth(health);

    }

    public Fatigue getFatigue(int k){
        return giantModel.get(k).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int k){
        this.giantModel.get(k).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int k){
        return giantModel.get(k).getNourishment();
    }

    public void setNourishment (Nourishment nourishment, int k){
        this.giantModel.get(k).setNourishment(nourishment);
    }

    public void updateView(){
        for(GiantModel model: giantModel)

        this.giantView.displayGiant(model);

    }

}
