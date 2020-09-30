package com.example.corona.Main;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.corona.Adapter.CoronaAdapter;
import com.example.corona.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private CoronaAdapter mCoronaAdapter;
    private List<Post> mPostList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info();
        getDataList();
    }

    public void getDataList () {
        JsonPlaceHolderApi call = ApiClient.getInstance();
        call.getPosts("Turkey").enqueue(new Callback<Main>() {
            @Override
            public void onResponse(@NonNull Call<Main> call, @NonNull Response<Main> response) {
                if (response.body() != null) { // ?
                    mPostList = response.body().getResultData();
                    mCoronaAdapter = new CoronaAdapter(mPostList);
                    mRecyclerView.setAdapter(mCoronaAdapter);
                }
            }

            @Override
            public void onFailure(@NonNull  Call<Main> call,@NonNull Throwable t) {
                t.printStackTrace();
                Log.e("Retrofit Failed:",String.valueOf(t.getMessage()));

            }
            });
    }

    public void info(){
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(new CoronaAdapter(new ArrayList<Post>()));
    }

}