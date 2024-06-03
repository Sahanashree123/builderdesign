package builderdesign;
public class LaptopBuilder {
    private String os;
    private String battery;
    private int size;
    private String camera;
    private double display;
    public LaptopBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public LaptopBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }
    public LaptopBuilder setSize(int size) {
        this.size = size;
        return this;
    }
    public LaptopBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }
    public LaptopBuilder setDisplay(double display) {
        this.display = display;
        return this;
    }

    public Laptop getLaptop() {
        return new Laptop(os,battery,size,camera,display);
    }
}
