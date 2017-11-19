package com.example.rashmi.myapplicationnew;

/**
 * Created by QCS2015 on 19-11-2017.
 */

public class DataProvider   {
    private String movie_name;
    private String description;

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DataProvider(String movie_name, String description) {
        this.movie_name = movie_name;
        this.description = description;
    }
}
