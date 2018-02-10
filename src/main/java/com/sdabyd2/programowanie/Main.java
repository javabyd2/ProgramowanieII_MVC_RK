package com.sdabyd2.programowanie;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sdabyd2.programowanie.Controller.GiantController;
import com.sdabyd2.programowanie.Model.Fatigue;
import com.sdabyd2.programowanie.Model.GiantModel;
import com.sdabyd2.programowanie.Model.Health;
import com.sdabyd2.programowanie.Model.Nourishment;
import com.sdabyd2.programowanie.View.GiantView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

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

        ObjectMapper mapper = new ObjectMapper();
        File fileName = new File("monsters.json");
        fileName.createNewFile();
        mapper.writeValue(fileName, lista);

        List<GiantModel> monsters = mapper.readValue(new File("monsters.json"),
                new TypeReference<List<GiantModel>>(){});

        for (GiantModel giants : monsters) {
            System.out.println(monsters.toString());
        }

    }
}
