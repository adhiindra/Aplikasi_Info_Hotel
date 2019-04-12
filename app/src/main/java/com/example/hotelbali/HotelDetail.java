package com.example.hotelbali;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;

public class HotelDetail extends AppCompatActivity {

    private static final String TAG = "HotelDetail";
    public String boking;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") ){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String alamathotel = getIntent().getStringExtra("alamat_hotel");
            Integer ratinghotel = getIntent().getIntExtra("rating_hotel",0);
            String hargahotel = getIntent().getStringExtra("harga_hotel");

            boking = imageName;


            setImage(imageUrl, imageName, alamathotel, ratinghotel, hargahotel);

        }
    }


    private void setImage(String imageUrl, String imageName, String alamathotel, Integer ratinghotel, String hargagotel ){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView alamat = findViewById(R.id.alamat_hotel);
        alamat.setText(alamathotel);

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);

        RatingBar rating = findViewById(R.id.rating_detail);
        rating.setRating(ratinghotel);

        TextView harga = findViewById(R.id.harga_kamar);
        harga.setText(hargagotel);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }
    

    public void displayToastMsg(View v) {
        Toast toast = Toast.makeText(this, "You Are Booked On "+boking+" !", Toast.LENGTH_LONG);
        toast.show();

    }

}
