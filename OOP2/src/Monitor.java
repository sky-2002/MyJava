public class Monitor {
    private String model;
    private String manufacturer;
    private int size;

    // this is composition, monitor has a resolution, resolution is not a monitor
    private Resolution resolution;

    public Monitor(String model, String manufacturer, int size, Resolution resolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x,int y){
        System.out.println("Drawing pixel at "+x+" "+y);
    }
}
