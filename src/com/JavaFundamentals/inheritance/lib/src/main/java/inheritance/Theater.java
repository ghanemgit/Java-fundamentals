package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Theater {
    Scanner input = new Scanner(System.in);

    String name;
    float stars;
    List<String> movies = new ArrayList<>();
    int reviewCounter;
    List<Review> movieReviews = new ArrayList<>();
    List<String> watchedMovie = new ArrayList<>();
    int sumOfStars = 0;

    public Theater() {
    }

    public Theater(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReviewCounter() {
        return reviewCounter;
    }

    public void setReviewCounter(int reviewCounter) {
        this.reviewCounter = reviewCounter;
    }

    public List<Review> getMovieReviews() {
        return movieReviews;
    }

    public void setMovieReviews(List<Review> movieReviews) {
        this.movieReviews = movieReviews;
    }

    public void addMovie(String toBeAddMovie) {

        movies.add(toBeAddMovie);
        System.out.println(toBeAddMovie + " Added");
    }

    public void removeMovie() {
        System.out.println("Enter the number of movie you want to delete");

        //Print all element in list to show it to user to let him/her select from it
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + "- " + movies.get(i));
        }
        //Take input from the user
        int idxRemove = input.nextInt() - 1;
        //Show error message when the user input wrong number
        if (idxRemove > movies.size()) {
            System.err.println("Error, please enter correct number");
            removeMovie();//if user type wrong input back to method by this recursion
        }
        System.out.print("Before delete => " + movies);
        movies.remove(idxRemove);
        System.out.print(",  After delete => ");

    }

    //this different signature methode help me to do test
    public String removeMovie(int num) {
        String string = "";

        int idxRemove = num - 1;
        if (idxRemove > movies.size()) {
            string = "Error, please enter correct number";
        } else {
            string = "Before delete => " + movies;
            movies.remove(idxRemove);
            string += ",  After delete => movies = " + movies;
        }
        return string;
    }


    public void addReview() {

        reviewCounter++;
//////////////// from line 100 to line 111 this is to let user choose the movie he watched and save it in list\\\\\\\\\\\\\
        System.out.println("Which movie you have watched? press 0 to skip");
        //Print all element in list to show it to user to let him/her select from it
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + "- " + movies.get(i));
        }
        //Take input from the user
        int idx = input.nextInt() - 1;
        if (idx >= 0 && idx <movies.size()){
            //Add the movie user selected it to watched movie list
            watchedMovie.add(movies.get(idx));
            //Print out the watched movies list
            System.out.println("The movies you have seen are => " + watchedMovie);
        }
        //Show error message when the user input wrong number
        else if (idx > movies.size()) {
            System.err.println("Sorry, the movie you entered is not found!");
            addReview();
        }
        else
            System.out.println("Skipping.......");



        input.nextLine();
//////////////// from line 115 to line 111 this is to add new review related with the movie the user watched it\\\\\\\\\\\\\\\\\
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
        movieReviews.add(review);//add the whole review to reviews list
        this.sumOfStars += review.getStars();
        setStars((float) sumOfStars / reviewCounter);//calculate the average of the star
    }


    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", movieReviews=" + movieReviews +
                ", reviewCounter=" + reviewCounter +
                '}';
    }
}
