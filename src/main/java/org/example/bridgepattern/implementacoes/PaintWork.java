package org.example.bridgepattern.implementacoes;

import org.example.bridgepattern.contrato.PaintShopInterface;

//Implements the services that Paint shop Provide
public class PaintWork implements PaintShopInterface {
    @Override
    public void doWork(){
        System.out.println("Paint Shop doing paint works");
    }
}