package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

public class Restaurant {

    String name;
    byte star;
    String priceCategory;

    public Restaurant() {
    }

    public Restaurant(String name, byte star) {
        this.name = name;
        this.star = star;
    }



    public Restaurant(String name, byte star, String priceCategory) {
        this.name = name;
        this.star = star;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getStar() {
        return star;
    }

    public void setStar(byte star) {
        this.star = star;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }



    public void addReview(byte addRate){

        this.star = addRate;
    }



    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", star=" + star +
                ", priceCategory=" + priceCategory +
                '}';
    }
}
