package edu.max.giflib.Model;

import java.time.LocalDate;

public class Gif {

    public String name;
    private int categoryID;
    private LocalDate dateUploaded;
    private String creator;
    private boolean favorite;


    public Gif(String name, int categoryID, LocalDate dateUploaded, String creator, boolean favorite) {
        this.name = name;
        this.categoryID = categoryID;
        this.dateUploaded = dateUploaded;
        this.creator = creator;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
