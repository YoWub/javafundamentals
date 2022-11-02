package com.fundamentals.practice;

public class AcousticGuitar extends Guitar {
    private int bridgeCount;
    private String boxMaterial;
    private String neckMaterial;

    public AcousticGuitar() {
        this(400, 500, "Red", "Steel", 10);
    }

    public AcousticGuitar(int stringCount, int neckLength, int bridgeCount) {
        this(400, 500, "Beige", "Trapezoid", 25);
    }

    public AcousticGuitar(int stringCount, int neckLength, String boxColor, String headStockShape, int bridgeCount) {
        super(stringCount, neckLength, boxColor, headStockShape);
        this.bridgeCount = bridgeCount;
    }

    public void echoSound() {
        super.soundQuality();
        System.out.println("The guitar has a nice echo sound.");
    }

    @Override
    public void soundQuality() {
        System.out.println("This guitar sounds groovy and also has a thick sound.");
    }

    public int getBridgeCount() {
        return bridgeCount;
    }

    public void setBridgeCount(int bridgeCount) {
        this.bridgeCount = bridgeCount;
    }

    public String getBoxMaterial() {
        return boxMaterial;
    }

    public void setBoxMaterial(String boxMaterial) {
        this.boxMaterial = boxMaterial;
    }

    public String getNeckMaterial() {
        return neckMaterial;
    }

    public void setNeckMaterial(String neckMaterial) {
        this.neckMaterial = neckMaterial;
    }
}
