package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

public class Review extends Restaurant implements ReviewForm{

    String reviewBody;
    String reviewAuthor;
    byte reviewStars;

    public Review() {
    }

    public Review(String name,String reviewBody, String reviewAuthor, byte reviewStars) {
        super(name,reviewStars);
        this.reviewBody = reviewBody;
        this.reviewAuthor = reviewAuthor;
        this.reviewStars = reviewStars;

    }


    @Override
    public void restName(String name) {
        super.name = name;
    }

    @Override
    public void restStars(byte stars) {
        this.reviewStars = stars;
    }

    @Override
    public void reviewBody(String body) {
        this.reviewBody = body;
    }

    @Override
    public void reviewAuthor(String author) {
        this.reviewAuthor = author;
    }


    @Override
    public String toString() {
        return "Review{" +
                "name='" + name + '\'' +
                ", review Body='" + reviewBody + '\'' +
                ", review Author='" + reviewAuthor + '\'' +
                ", review Stars=" + reviewStars +
                '}';
    }
}
