package com.sdabyd2.programowanie.View;

import com.sdabyd2.programowanie.Model.GiantModel;

public class GiantView {//wysyłamy model do widoku


    public GiantView() {
    }

    public void displayGiant(GiantModel giantModel){
        System.out.println(giantModel.toString());
    }

}
