package org.example.facade;

public class FacadeRunner {

    public static void main(String[] args) {
        // Usando a Fachada para simplificar a interação com o sistema
        OnlineShoppingFacade facade = new OnlineShoppingFacade();
        facade.buyProduct();
    }
}
