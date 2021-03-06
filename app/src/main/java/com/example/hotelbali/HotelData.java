package com.example.hotelbali;

import java.util.ArrayList;

public class HotelData {

    public ArrayList<String> getmNames() {
        return mNames;
    }

    public ArrayList<String> getmImageUrls() {
        return mImageUrls;
    }

    public ArrayList<String> getmAlamat() {
        return mAlamat;
    }

    public ArrayList<Integer> getmRating() {
        return mRating;
    }

    public ArrayList<String> getmHarga() {
        return mHarga;
    }

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mAlamat = new ArrayList<>();
    private ArrayList<Integer> mRating = new ArrayList<>();
    private ArrayList<String> mHarga = new ArrayList<>();


    void initHotelData(){
        mNames.add("Bali Hyatt");
        mImageUrls.add("https://d22ir9aoo7cbf6.cloudfront.net/wp-content/uploads/sites/4/2018/10/Hyatt-Regency-Bali-Sanur-Hotel-5.jpg");
        mAlamat.add("Jl. Danau Tamblingan No.89, Sanur, Denpasar Sel., Kota ");
        mRating.add(5);
        mHarga.add("2.485.000");

        mNames.add("St Regis Bali");
        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-s/0f/8e/ce/80/strand-villa.jpg");
        mAlamat.add("Kawasan Pariwisata, Nusa Dua, Blok Lot S6, Nusa Dua, Bali 80363");
        mRating.add(5);
        mHarga.add("8.433.000");

        mNames.add("Four Season Jimbaran");
        mImageUrls.add("https://s-ec.bstatic.com/images/hotel/max1024x768/842/84207442.jpg");
        mAlamat.add("Jimbaran, Kuta Sel., Kabupaten Badung, Bali 80361");
        mRating.add(5);
        mHarga.add("9.580.000");

        mNames.add("Trans Resort Bali");
        mImageUrls.add("https://www.travelonline.com/bali/accommodation/the-trans-resort-bali/entrance-53042-crop.jpg");
        mAlamat.add("Jalan Sunset Road Kerobokan, Kerobokan Kelod, Kuta Utara, Kabupaten Badung, Bali 80361");
        mRating.add(5);
        mHarga.add("5.652.000");

        mNames.add("Intercontinental Bali");
        mImageUrls.add("https://pix10.agoda.net/hotelImages/3632/0/4e2b644f32b31a0496324f1934cf542c.jpg");
        mAlamat.add("Jl. Uluwatu 45, Jimbaran, Bali, Kabupaten Badung, Bali 80361");
        mRating.add(5);
        mHarga.add("12.542.000");

        mNames.add("The Westin Bali");
        mImageUrls.add("https://kintamaniid-a903.kxcdn.com/wp-content/uploads/Hotel-Westin-Resort-Nusa-Dua-2-1024x536.jpg");
        mAlamat.add("Kawasan Pariwisata Nusa Dua BTDC, Jl. Nusa Dua No.3, Bali 80363");
        mRating.add(5);
        mHarga.add("11.452.000");


        mNames.add("Ayana Bali");
        mImageUrls.add("https://s-ec.bstatic.com/images/hotel/max1024x768/136/13626238.jpg");
        mAlamat.add("Jl. Karang Mas Sejahtera, Jimbaran, Kuta Selatan, Jimbaran, Kuta Sel., Kabupaten Badung, Bali 80364");
        mRating.add(5);
        mHarga.add("7.250.000");

        mNames.add("Munduk Sari Garden Villa");
        mImageUrls.add("https://munduksarivilla.com/gallery/munduk-sari15.jpg");
        mAlamat.add("Jalan Raya Kayu Putih, Munduk, Banjar, Kabupaten Buleleng, Bali 81152");
        mRating.add(3);
        mHarga.add("790.000");

        mNames.add("Ibis Styles Bali Denpasar");
        mImageUrls.add("https://origin.pegipegi.com/jalan/images/pict2L/Y9/Y158819/Y158819010.jpg");
        mAlamat.add("Jl. Teuku Umar No.183, Dauh Puri Kauh, Denpasar Bar., Kota Denpasar, Bali 80114");
        mRating.add(3);
        mHarga.add("397.000");

        mNames.add("Favehotel Kuta - Kartika Plaza");
        mImageUrls.add("https://t-ec.bstatic.com/images/hotel/max1280x900/758/75862511.jpg");
        mAlamat.add("Jl. Kartika Plaza No.45X, Kuta, Kabupaten Badung, Bali 80361");
        mRating.add(3);
        mHarga.add("498.000");

        mNames.add("POP! Hotel Denpasar - Bali");
        mImageUrls.add("https://d1nabgopwop1kh.cloudfront.net/hotel-asset/30000001000069658_wh_5");
        mAlamat.add("Jl. Cokroaminoto No.23 - 25, Pemecutan Kaja, Denpasar Utara, Kota Denpasar, Bali 80118");
        mRating.add(4);
        mHarga.add("321.000");



    }
}
