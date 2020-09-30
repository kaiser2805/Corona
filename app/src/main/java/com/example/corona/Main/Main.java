package com.example.corona.Main;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Main {
    @SerializedName("result")
    @Expose
    List<Post> resultData;
    @SerializedName("success")
    @Expose

    private boolean success;

    public List<Post> getResultData()
    {
        return resultData;
    }

    public void setResultData(List<Post> resultData)
    {
        this.resultData = resultData;
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {

        this.success = success;
    }
}
