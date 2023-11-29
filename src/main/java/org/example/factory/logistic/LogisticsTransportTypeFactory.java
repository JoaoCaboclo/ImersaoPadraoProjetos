package org.example.factory.logistic;

import org.example.factory.executors.Transport;

public interface LogisticsTransportTypeFactory {
    Transport CreateTransport();

}
