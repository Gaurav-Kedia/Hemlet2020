package com.example.hemlet2020;

public class DataManager {
    private static DataManager dataManager;
    private String imageUrl;

    public static DataManager getInstance(){

        if(dataManager == null){
            dataManager = new DataManager();
        }
        return dataManager;
    }

    private DataManager(){}

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}
