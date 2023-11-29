package org.example.factory.executors;

public class ShipType implements Transport {
    @Override
    public void Deliver() {
        System.out.println("Transportando por Navio");
    }
}
