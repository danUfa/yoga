package com.example.yoga;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;

import android.widget.ImageView;



import java.io.InputStream;

import java.net.URL;



public class Main extends AppCompatActivity {
    private AsyncTask<String, Void, Bitmap> img1;
    private AsyncTask<String, Void, Bitmap> img2;
    private AsyncTask<String, Void, Bitmap> img3;
    private AsyncTask<String, Void, Bitmap> img4;
    private AsyncTask<String, Void, Bitmap> img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img1 = new DownloadImageTask((ImageView) findViewById(R.id.imageView14)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/calm%20(4).png");
        img2 = new DownloadImageTask((ImageView) findViewById(R.id.imageView17)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/Relax.png");
        img3 = new DownloadImageTask((ImageView) findViewById(R.id.imageView18)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/Focus.png");
        img4 = new DownloadImageTask((ImageView) findViewById(R.id.imageView16)).execute("http://mskko2021.mad.hakta.pro/uploads/feeling/Focus.png");
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}



