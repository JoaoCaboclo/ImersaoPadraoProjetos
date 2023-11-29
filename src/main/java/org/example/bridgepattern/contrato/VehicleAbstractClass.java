package org.example.bridgepattern.contrato;

// Bridge the PaintShop and Vehicles
public abstract class VehicleAbstractClass {
    protected PaintShopInterface paintWork;
    protected PaintShopInterface polishWork;
    public VehicleAbstractClass(PaintShopInterface paintWork, PaintShopInterface polishWork) {
        this.paintWork=paintWork;
        this.polishWork=polishWork;
    }
    public abstract void applyChange();
}