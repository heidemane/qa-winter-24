package model;

public class Coctail {

    private String Name;
    private int alcoholPercent;
    private String category;
    private String mainIngredient;
    private boolean sweet;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAlcoholPercent() {
        return alcoholPercent;
    }

    public void setAlcoholPercent(int alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public boolean isSweet() {
        return sweet;
    }

    public void setSweet(boolean sweet) {
        this.sweet = sweet;
    }
}
