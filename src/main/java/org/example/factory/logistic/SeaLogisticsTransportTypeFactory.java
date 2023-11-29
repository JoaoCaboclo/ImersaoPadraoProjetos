package org.example.factory.logistic;

import org.example.factory.executors.ShipType;
import org.example.factory.executors.Transport;

public class SeaLogisticsTransportTypeFactory implements LogisticsTransportTypeFactory {

    @Override
    public Transport CreateTransport() {
        return new ShipType();
    }


}
