package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class MovieModel {

  @SerializedName("rating")
  private String rating;
  @SerializedName("media")
  private List<MediaModel> medialList;
  @SerializedName("cast")
  private List<CastModel> castList;
  @SerializedName("cinemas")
  private List<Integer> cinemasList;
  @SerializedName("position")
  private int position;
  @SerializedName("categories")
  private List<String> categoriesList;
  @SerializedName("genre")
  private String genre;
  @SerializedName("synopsis")
  private String synopsis;
  @SerializedName("length")
  private String length;
  @SerializedName("release_date")
  private String release_date;
  @SerializedName("id")
  private int id;
  @SerializedName("name")
  private String  name;
  @SerializedName("code")
  private String code;
  @SerializedName("original_name")
  private String original_name;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<MediaModel> getMedialList() {
        return medialList;
    }

    public void setMedialList(List<MediaModel> medialList) {
        this.medialList = medialList;
    }

    public List<CastModel> getCastList() {
        return castList;
    }

    public void setCastList(List<CastModel> castList) {
        this.castList = castList;
    }

    public List<Integer> getCinemasList() {
        return cinemasList;
    }

    public void setCinemasList(List<Integer> cinemasList) {
        this.cinemasList = cinemasList;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<String> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<String> categoriesList) {
        this.categoriesList = categoriesList;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }
}
