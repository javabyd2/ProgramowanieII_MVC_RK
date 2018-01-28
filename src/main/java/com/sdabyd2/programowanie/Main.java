package com.sdabyd2.programowanie;

        import com.sdabyd2.programowanie.Controller.GiantController;
        import com.sdabyd2.programowanie.Model.Fatigue;
        import com.sdabyd2.programowanie.Model.GiantModel;
        import com.sdabyd2.programowanie.Model.Health;
        import com.sdabyd2.programowanie.Model.Nourishment;
        import com.sdabyd2.programowanie.View.GiantView;

        import java.util.List;

public class Main {

    public static void main(String[] args) {

        GiantModel giant1 = new GiantModel(Health.HEALTH, Fatigue.NO, Nourishment.NOTHUNGRY);
        GiantModel frankestein = new GiantModel(Health.HEALTH, Fatigue.YES, Nourishment.STRAVING);

      

        GiantView view = new GiantView();
        GiantController controller = new GiantController(frankestein, view);

      controller.updateView();

      controller.setHealth(Health.DEAD);
      controller.updateView();




    }
}
