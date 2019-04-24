package com.example.recyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Spanned;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalerryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started");

        getIncomingIntent();
    }

    public void getIncomingIntent(){
        Log.d(TAG,"GetIncomingIntentData: check incoming intent.");
        if(getIntent().hasExtra("namechar") && getIntent().hasExtra("imgchar") && getIntent().hasExtra("chardesc")){
            Log.d(TAG,"GetIncomingIntentData: Get Intent Extra.");

            String Imgchar = getIntent().getStringExtra("imgchar");
            String Namechar = getIntent().getStringExtra("namechar");
            String Descchar = getIntent().getStringExtra("chardesc");

            setName(Imgchar, Namechar, Descchar);
        }
    }

    private void setName(String Imgchar, String Namechar, String Descchar){
        Log.d(TAG, "setImage: Setting img and name.");
        setTitle(Namechar);
        Spanned Text;

        TextView name = findViewById(R.id.tv_item_name);
        name.setText(Namechar);

        TextView desc = findViewById(R.id.tv_item_from);
        desc.setText(Descchar);

        ImageView image = findViewById(R.id.img_item_photo);
        Glide.with(this)
                .load(Imgchar)
                .into(image);
    }
}

