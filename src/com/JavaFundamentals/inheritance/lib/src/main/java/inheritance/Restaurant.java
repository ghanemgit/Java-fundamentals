package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {

    Scanner input = new Scanner(System.in);
    String name;
    float stars;
    String priceCategory;
    int reviewCounter = 1;
    List<Review> restaurantReviews = new ArrayList<>();
    int sumOfStars = 0;


    public Restaurant() {
    }

    public Restaurant(List<Review> reviews) {
        this.restaurantReviews = reviews;
    }

    public Restaurant(String name, int star) {
        this.name = name;
        this.stars = star;
    }


    public Restaurant(String name, int star, String priceCategory) {
        this.name = name;
        this.stars = star;
        this.priceCategory = priceCategory;
        this.sumOfStars = star;
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

    public List<Review> getRestaurantReviews() {
        return restaurantReviews;
    }

    public void setRestaurantReviews(List<Review> restaurantReviews) {
        this.restaurantReviews = restaurantReviews;
    }

    public void addReview() {

        reviewCounter++;

  //create new object from review class at same time make connection between this class and review class
        Review review = new Review();
        System.out.println("A small description, Tell us your experience");
        review.setBody(input.nextLine());//take the review body from the user and set it by set body method

        System.out.println("Your Name?");
        review.setAuthor(input.nextLine());//take the review author from the user and set it by set author method

        System.out.println("How likely are you to recommend " + this.name + " to a friend (0-5)");
        review.setStars(input.nextInt());//take the review Stars from the user and set it by set Stars method

        boolean wrongInput = false;

        /*
        I created this while loop because I suppose that the user input wrong rate more than one
        time so will keep loop until the user input the right rate
         */
        while (!wrongInput) {

            if (review.getStars() <= 5 && review.getStars() >= 0) {

                wrongInput = true;

            } else {

                System.out.println("Wrong input please enter rate between 0 and 5");
                review.setStars(input.nextInt());

            }
        }
        restaurantReviews.add(review);//add the whole review to reviews list
        this.sumOfStars += review.getStars();
        setStars((float) sumOfStars / reviewCounter);//calculate the average of the star
    }



    //this different signature method created to help me in test application
    public void addReview(String body,String author, int stars) {

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
        restaurantReviews.add(review);
        this.sumOfStars += review.getStars();
        setStars((float) sumOfStars / reviewCounter);
    }
    @Override
    public String toString() {
        return "Restaurant{" + "name='" + name + '\'' + String.format(", stars= %.1f", stars) + ", priceCategory='" + priceCategory + '\'' + ", reviews=" + restaurantReviews + '\'' + ", Number of reviews=" + reviewCounter + '}';
    }
}
