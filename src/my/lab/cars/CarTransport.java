package my.lab.cars;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class CarTransport extends Car implements Flatbed, List {

    private int CurrFlatbedAngle;
    private boolean Flatbed;
    List<Objects> LoadedCars = new LinkedList<>();


   public CarTransport() {
       super(2,Color.red,1000,"Car Transport");
       this.CurrFlatbedAngle = 0;


   }
    @Override
    public void ChangeFlatbedAngle(int amount) {
        if (CurrFlatbedAngle+amount > 0) {
            Flatbed=false
            ;


        }
    }
}
