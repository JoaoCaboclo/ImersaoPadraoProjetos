package org.example.bridgepattern.extendabstractclass;

import org.example.bridgepattern.contrato.PaintShopInterface;
import org.example.bridgepattern.contrato.VehicleAbstractClass;

public class Car extends VehicleAbstractClass {
    public Car(PaintShopInterface paintWork, PaintShopInterface polishWork) {
        super(paintWork,polishWork);
    }
    @Override
    public void applyChange(){
        System.out.println("Car work going to start");
        paintWork.doWork();
        polishWork.doWork();
    }
}