package com.example.corona.Main;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Post {

    @SerializedName("country")
    @Expose
    private String main;
    @SerializedName("totalCases")
    @Expose
    private String totalCases;
    @SerializedName("newCases")
    @Expose
    private String newCases;
    @SerializedName("totalDeaths")
    @Expose
    private String totalDeaths;
    @SerializedName("newDeaths")
    @Expose
    private String newDeaths;
    @SerializedName("totalRecovered")
    @Expose
    private String totalRecovered;
    @SerializedName("activeCases")
    @Expose
    private String activeCases;

    // ??
    public static List<Post> responseList;

    public Post(String main, String totalCases, String newCases, String totalDeaths, String newDeaths, String totalRecovered, String activeCases) {
        this.main = main;
        this.totalCases = totalCases;
        this.newCases = newCases;
        this.totalDeaths = totalDeaths;
        this.newDeaths = newDeaths;
        this.totalRecovered = totalRecovered;
        this.activeCases = activeCases;
    }

    public String getMain() { return main;
    }

    public String getTotalCases() {
        return totalCases;
    }

    public String getNewCases() {
        return newCases;
    }

    public String getTotalDeaths() {
        return totalDeaths;
    }

    public String getNewDeaths() {
        return newDeaths;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public String getActiveCases() {
        return activeCases;
    }




}

