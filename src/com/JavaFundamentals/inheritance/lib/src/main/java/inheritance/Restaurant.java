package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Formatter;
public class Restaurant {

    String name;
    float stars;
    String priceCategory;
    int reviewCounter = 0;
    List <Review> reviews = new ArrayList<>();
    int sumOfStars = 0;


    public Restaurant() {
    }

    public Restaurant(String name, int star) {
        this.name = name;
        this.stars = star;
    }



    public Restaurant(String name, int star, String priceCategory) {
        this.name = name;
        this.stars = star;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }



    public void addReview(String body, String author, int stars){
        reviewCounter++;
        Review review = new Review(body,author,stars);
        reviews.add(review);
        sumOfStars+=  stars;
        setStars((float) sumOfStars/ reviewCounter);
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                String.format(", stars= %.1f" , stars) +
                ", priceCategory='" + priceCategory + '\'' +
                ", reviews=" + reviews +'\'' +
                ", Number of reviews=" + reviewCounter +
                '}';
    }
}
