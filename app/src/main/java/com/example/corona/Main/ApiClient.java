package com.example.corona.Main;

        import retrofit2.Retrofit;
        import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = " https://api.collectapi.com";
    private static Retrofit retrofit;
    private static JsonPlaceHolderApi api;

    public static JsonPlaceHolderApi getInstance() {

        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();

        return api = retrofit.create(JsonPlaceHolderApi.class);
    }
}
