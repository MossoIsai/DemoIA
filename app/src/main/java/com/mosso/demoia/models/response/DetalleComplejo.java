package com.mosso.demoia.models.response;

import com.google.gson.annotations.SerializedName;

/**
 * Created by isaigarciamoso on 20/12/17.
 */

public class DetalleComplejo {

    @SerializedName("id")
    private int id;
    @SerializedName("vista_id")
    private String vistaId;
    @SerializedName("uris")
    private String  uris;
    @SerializedName("city_id")
    private int cityId;
    @SerializedName("name")
    private String nombre;
    @SerializedName("lat")
    private String lat;
    @SerializedName("lng")
    private String lng;
    @SerializedName("phone")
    private String phone;
    @SerializedName("address")
    private String address;
    @SerializedName("position")
    private int position;
    @SerializedName("settings")
    private SettingModel settingModel;


    public DetalleComplejo(int id, String vistaId, String uris, int cityId, String nombre, String lat, String lng, String phone, String address, int position, SettingModel settinModel) {
        this.id = id;
        this.vistaId = vistaId;
        this.uris = uris;
        this.cityId = cityId;
        this.nombre = nombre;
        this.lat = lat;
        this.lng = lng;
        this.phone = phone;
        this.address = address;
        this.position = position;
        this.settingModel = settinModel;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVistaId() {
        return vistaId;
    }

    public void setVistaId(String vistaId) {
        this.vistaId = vistaId;
    }

    public String getUris() {
        return uris;
    }

    public void setUris(String uris) {
        this.uris = uris;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public SettingModel getSettingModel() {
        return settingModel;
    }

    public void setSettingModel(SettingModel settingModel) {
        this.settingModel = settingModel;
    }
}
