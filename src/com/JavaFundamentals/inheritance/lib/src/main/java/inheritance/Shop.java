package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    Scanner input = new Scanner(System.in);
    String name;
    String description;
    String priceCategory;
    int reviewCounter = 1;
    List<Review> shopReviews = new ArrayList<>();
    int sumOfStars = 0;
    float stars;


    public Shop() {
    }

    public Shop(List<Review> reviews) {
        this.shopReviews = reviews;
    }

    public Shop(String name, String description, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public Shop(String name, String description, int star, String priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.sumOfStars = star;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public List<Review> getShopReviews() {
        return shopReviews;
    }

    public void setShopReviews(List<Review> shopReviews) {
        this.shopReviews = shopReviews;
    }

    public void addReview() {

        reviewCounter++;

        //create new object from review class at same time make connection between this class and review class
        Review review = new Review();

        System.out.println("A small description, Tell us your experience");
        review.setBody(input.next());//take the review body from the user and set it by set body method

        System.out.println("Your Name?");
        review.setAuthor(input.next());//take the review author from the user and set it by set author method

        System.out.println("How likely are you to recommend " + this.name + " to a friend (0-5)");
        review.setStars(input.nextInt());//take the review Stars from the user and set it by set Stars method

        boolean wrongInput = false;
        while (!wrongInput) {

            if (review.getStars() <= 5 && review.getStars() >= 0) {

                wrongInput = true;

            } else {

                System.out.println("Wrong input please enter rate between 0 and 5");
                review.setStars(input.nextInt());

            }
        }
        shopReviews.add(review);//add the whole review to reviews list
        this.sumOfStars += review.getStars();
        setStars((float) sumOfStars / reviewCounter);//calculate the average of the star
    }


    //this different signature method created to help me in test application
    public void addReview(String body, String author, int stars) {

        reviewCounter++;
        Review review = new Review();
        review.setBody(body);
        review.setAuthor(author);
        review.setStars(stars);

        boolean correctAnswer = true;
        while (correctAnswer) {

            if (review.getStars() <= 5 && review.getStars() >= 0) {

                correctAnswer = false;

            } else {

                System.out.println("Wrong input please enter rate between 0 and 5");
                review.setStars(input.nextInt());

            }
        }
        shopReviews.add(review);
        this.sumOfStars += review.getStars();
        setStars((float) sumOfStars / reviewCounter);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                String.format(", stars= %.1f", getStars()) +
                ", Review=" + shopReviews + '\'' +
                ", description='" + description + '\'' +
                ", priceCategeory='" + priceCategory + '\'' +
                '}';
    }
}
