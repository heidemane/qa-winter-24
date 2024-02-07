package model;

public class Phone {

    private String model;
    private String size;
    private String color;
    private boolean chargerIncluded;
    private boolean has5G;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isChargerIncluded() {
        return chargerIncluded;
    }

    public void setChargerIncluded(boolean chargerIncluded) {
        this.chargerIncluded = chargerIncluded;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }
}
