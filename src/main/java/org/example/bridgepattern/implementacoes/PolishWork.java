package org.example.bridgepattern.implementacoes;

import org.example.bridgepattern.contrato.PaintShopInterface;

public class PolishWork implements PaintShopInterface {
    @Override
    public void doWork(){
        System.out.println("Paint Shop doing polish works");
    }
}