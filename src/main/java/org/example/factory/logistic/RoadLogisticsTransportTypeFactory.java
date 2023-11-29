package org.example.factory.logistic;

import org.example.factory.executors.Transport;
import org.example.factory.executors.TruckType;

public class RoadLogisticsTransportTypeFactory implements LogisticsTransportTypeFactory {
    @Override
    public Transport CreateTransport() {
       return new TruckType();
    }


}
