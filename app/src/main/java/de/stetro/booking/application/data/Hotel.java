package de.stetro.booking.application.data;

import java.util.List;

public class Hotel {

    private int price;
    private double rating;
    private int stars;
    private List<String> nearByAttractions;
    private List<String> reviews;
    private List<String> imageUrls;
    private String thumbnailUrl;
    private String name;
    private String location;
    private String description;
    private String address;
    private String phone;

    public Hotel(int price, double rating, int stars, List<String> nearByAttractions, List<String> reviews, List<String> imageUrls, String thumbnailUrl, String name, String location, String description, String address, String phone) {
        this.price = price;
        this.rating = rating;
        this.stars = stars;
        this.nearByAttractions = nearByAttractions;
        this.reviews = reviews;
        this.imageUrls = imageUrls;
        this.thumbnailUrl = thumbnailUrl;
        this.name = name;
        this.location = location;
        this.description = description;
        this.address = address;
        this.phone = phone;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription(){ return this.description; }

    public String getAddress(){ return this.address; }

    public String getPhone(){
        return this.phone;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getNearByAttractions() {
        return nearByAttractions;
    }

    public void setNearByAttractions(List<String> nearByAttractions) {
        this.nearByAttractions = nearByAttractions;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
