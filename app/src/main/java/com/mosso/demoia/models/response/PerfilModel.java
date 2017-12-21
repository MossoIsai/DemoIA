package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class PerfilModel {

    @SerializedName("email")
    private String email;
    @SerializedName("name")
    private String name;
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("profile_picture")
    private String profilePicture;
    @SerializedName("card_number")
    private String cardNumber;

    public PerfilModel(String email, String name, String phoneNumber, String profilePicture, String cardNumber) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;
        this.cardNumber = cardNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
