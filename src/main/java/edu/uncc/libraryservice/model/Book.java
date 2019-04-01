package edu.uncc.libraryservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The type Book.
 *
 * @author venky
 */
@Document(collection = "book")
public class Book {

    @Id
    private String id;
    private long isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publisher;
    private double price;
    private double rating;
    private String description;
    private String imageUrl;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id
     *         the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets isbn.
     *
     * @return the isbn
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * Sets isbn.
     *
     * @param isbn
     *         the isbn
     */
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title
     *         the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets subtitle.
     *
     * @return the subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Sets subtitle.
     *
     * @param subtitle
     *         the subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * Gets author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets author.
     *
     * @param author
     *         the author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets publisher.
     *
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets publisher.
     *
     * @param publisher
     *         the publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     *         the price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets rating.
     *
     * @return the rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * Sets rating.
     *
     * @param rating
     *         the rating
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description
     *         the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets image url.
     *
     * @return the image url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets image url.
     *
     * @param imageUrl
     *         the image url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
