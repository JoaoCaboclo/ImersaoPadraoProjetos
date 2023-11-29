package org.example.facade;

import org.example.facade.subsystems.BillingSystem;
import org.example.facade.subsystems.OrderSystem;
import org.example.facade.subsystems.StockSystem;

public class OnlineShoppingFacade {

    private OrderSystem orderSystem;
    private StockSystem stockSystem;
    private BillingSystem billingSystem;

    public OnlineShoppingFacade() {
        this.orderSystem = new OrderSystem();
        this.stockSystem = new StockSystem();
        this.billingSystem = new BillingSystem();
    }

    // Métodos simplificados para o cliente interagir com o sistema
    public void buyProduct() {
        orderSystem.placeOrder();
        stockSystem.checkStock();
        billingSystem.generateInvoice();
    }
}
