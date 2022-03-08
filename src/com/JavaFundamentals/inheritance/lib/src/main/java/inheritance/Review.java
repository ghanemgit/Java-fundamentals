package com.JavaFundamentals.inheritance.lib.src.main.java.inheritance;

public class Review {

    String body;
    String author;
    int stars;

    public Review() {
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Review(String reviewBody, String reviewAuthor, int reviewStars) {

        this.body = reviewBody;
        this.author = reviewAuthor;
        this.stars = reviewStars;

    }


    @Override
    public String toString() {
        return "Review{" +
                "review Body='" + body + '\'' +
                ", review Author='" + author + '\'' +
                ", review Stars=" + stars +
                '}';
    }
}
