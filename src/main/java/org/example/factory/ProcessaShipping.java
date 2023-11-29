package org.example.factory;

import org.example.factory.executors.Transport;
import org.example.factory.logistic.LogisticsTransportTypeFactory;
import org.example.factory.logistic.RoadLogisticsTransportTypeFactory;
import org.example.factory.logistic.SeaLogisticsTransportTypeFactory;

public class ProcessaShipping {

    public static void main(String[] args) {

        // Criando instâncias das fábricas específicas
        LogisticsTransportTypeFactory shipFactory = new SeaLogisticsTransportTypeFactory();
        LogisticsTransportTypeFactory truckFactory = new RoadLogisticsTransportTypeFactory();

        // Criando configurações de acesso usando as fábricas
        Transport shipConfig  = shipFactory.CreateTransport();
        Transport truckConfig = truckFactory.CreateTransport();

        // Configurando o acesso
        shipConfig.Deliver();
        truckConfig.Deliver();
    }

}
