package builderdesign;
public class PhoneBuilder {
    private String os;
    private String battery;
    private int size;
    private String camera;
    private double display;
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }
    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }
    public PhoneBuilder setSize(int size) {
        this.size = size;
        return this;
    }
    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }
    public PhoneBuilder setDisplay(double display) {
        this.display = display;
        return this;
    }

    public Phone getPhone() {
        return new Phone(os,battery,size,camera,display);
    }
    
}
