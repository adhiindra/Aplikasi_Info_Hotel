package com.example.hotelbali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private ArrayList<Integer> mRating = new ArrayList<>();
    private ArrayList<String> mHarga = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initData();
        initRecyclerView();
    }

    private void initData(){
        HotelData hoteldata = new HotelData();
        hoteldata.initHotelData();

        mNames = hoteldata.getmNames();
        mImageUrls = hoteldata.getmImageUrls();
        mAlamat = hoteldata.getmAlamat();
        mRating = hoteldata.getmRating();
        mHarga = hoteldata.getmHarga();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, mImageUrls, mAlamat, mRating, mHarga);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
