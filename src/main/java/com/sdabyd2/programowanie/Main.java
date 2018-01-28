package com.sdabyd2.programowanie;

import com.sdabyd2.programowanie.Controller.GiantController;
import com.sdabyd2.programowanie.Model.Fatigue;
import com.sdabyd2.programowanie.Model.GiantModel;
import com.sdabyd2.programowanie.Model.Health;
import com.sdabyd2.programowanie.Model.Nourishment;
import com.sdabyd2.programowanie.View.GiantView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<GiantModel> lista = new ArrayList<>();

        GiantModel ghost = new GiantModel(Health.HEALTH, Fatigue.NO, Nourishment.NOTHUNGRY);
        lista.add(ghost);
        GiantModel frankestein = new GiantModel(Health.HEALTH, Fatigue.YES, Nourishment.STRAVING);
        lista.add(frankestein);
        GiantModel zoombie = new GiantModel(Health.DEAD, Fatigue.NO, Nourishment.HUNGRY);
        lista.add(zoombie);
        GiantModel skeleton = new GiantModel(Health.NOTHEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        lista.add(skeleton);

        GiantController giantController = new GiantController(lista, new GiantView());


        //GiantView view = new GiantView();
        //GiantController controller = new GiantController(frankestein, view);

        giantController.updateView();

        //controller.setHealth(Health.DEAD);
        // controller.updateView();


    }
}
