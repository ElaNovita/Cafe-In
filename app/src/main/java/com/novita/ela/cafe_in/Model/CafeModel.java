package com.novita.ela.cafe_in.Model;


/**
 * Created by e on 28/09/16.
 */

public class CafeModel  {


    public CafeModel() {
    }

    int id, imgUrl, logo;

    String openTime, name, address;
    Boolean favorite;

    public CafeModel(int id, int imgUrl, int logo, String openTime, String name, String address, Boolean favorite) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.logo = logo;
        this.openTime = openTime;
        this.name = name;
        this.address = address;
        this.favorite = favorite;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
