package org.example.factory.executors;

public class TruckType implements Transport {
    @Override
    public void Deliver() {
        System.out.println("Transportando por Caminhão");
    }
}
