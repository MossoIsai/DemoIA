package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by isaigarciamoso on 21/12/17.
 */

public class MovieMain {

    @SerializedName("movies")
    private List<MovieModel> movieModelList;
    @SerializedName("routes")
    private List<RoutesModel> routesModelList;


    public List<MovieModel> getMovieModelList() {
        return movieModelList;
    }

    public void setMovieModelList(List<MovieModel> movieModelList) {
        this.movieModelList = movieModelList;
    }

    public List<RoutesModel> getRoutesModelList() {
        return routesModelList;
    }

    public void setRoutesModelList(List<RoutesModel> routesModelList) {
        this.routesModelList = routesModelList;
    }
}
