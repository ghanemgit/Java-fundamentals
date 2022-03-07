package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

public class Review {

    String reviewBody;
    String reviewAuthor;
    int reviewStars;

    public Review() {
    }

    public Review(String reviewBody, String reviewAuthor, int reviewStars) {

        this.reviewBody = reviewBody;
        this.reviewAuthor = reviewAuthor;
        this.reviewStars = reviewStars;

    }



    @Override
    public String toString() {
        return "Review{" +
                "review Body='" + reviewBody + '\'' +
                ", review Author='" + reviewAuthor + '\'' +
                ", review Stars=" + reviewStars +
                '}';
    }
}
