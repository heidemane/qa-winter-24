package model;

public class Chocolate {

    private String Name;
    private int chocolatePercent;
    private int piecesInBox;
    private String description;
    private boolean giftWrap;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getChocolatePercent() {
        return chocolatePercent;
    }

    public void setChocolatePercent(int chocolatePercent) {
        this.chocolatePercent = chocolatePercent;
    }

    public int getPiecesInBox() {
        return piecesInBox;
    }

    public void setPiecesInBox(int piecesInBox) {
        this.piecesInBox = piecesInBox;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGiftWrap() {
        return giftWrap;
    }

    public void setGiftWrap(boolean giftWrap) {
        this.giftWrap = giftWrap;
    }
}
