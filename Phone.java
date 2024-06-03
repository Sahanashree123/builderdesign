package builderdesign;
public class Phone {
    private String os;
    private String battery;
    private int size;
    private String camera;
    private double display;
    public Phone(String os, String battery, int size, String camera, double display) {
        super();
        this.os = os;
        this.battery = battery;
        this.size = size;
        this.camera = camera;
        this.display = display;
    }
    @Override
    public String toString() {
        return "Phone [os=" + os + ", battery=" + battery + ", size=" + size + ", camera=" + camera + ", display="
                + display + "]";
    }
    
}