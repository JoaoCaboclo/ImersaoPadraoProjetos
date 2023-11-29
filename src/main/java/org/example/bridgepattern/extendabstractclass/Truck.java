package org.example.bridgepattern.extendabstractclass;

import org.example.bridgepattern.contrato.PaintShopInterface;
import org.example.bridgepattern.contrato.VehicleAbstractClass;

// Get the required services from PaintShop
public class Truck extends VehicleAbstractClass {
    public Truck(PaintShopInterface paintWork, PaintShopInterface polishWork) {
        super(paintWork,polishWork);
    }
    @Override
    public void applyChange(){
        System.out.println("Truck work going to start");
        paintWork.doWork();
        polishWork.doWork();
    }
}