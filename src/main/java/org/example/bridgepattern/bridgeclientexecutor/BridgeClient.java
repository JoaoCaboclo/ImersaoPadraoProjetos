package org.example.bridgepattern.bridgeclientexecutor;

import org.example.bridgepattern.contrato.VehicleAbstractClass;
import org.example.bridgepattern.extendabstractclass.Car;
import org.example.bridgepattern.extendabstractclass.Truck;
import org.example.bridgepattern.implementacoes.PaintWork;
import org.example.bridgepattern.implementacoes.PolishWork;

public class BridgeClient {

    public static void main(String[] args) {
        VehicleAbstractClass vehicleAbstractClass1 = new Truck(new PaintWork(), new PolishWork());
        vehicleAbstractClass1.applyChange();
        VehicleAbstractClass vehicleAbstractClass2 = new Car(new PaintWork(), new PolishWork());
        vehicleAbstractClass2.applyChange();
    }

}
