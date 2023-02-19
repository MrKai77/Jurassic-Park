package com.example.parkingapp;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import androidx.core.content.ContextCompat;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView displayParkingSpot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.theRefreshButton);
        displayParkingSpot = (TextView) findViewById(R.id.textView);
        ImageView imageViewEastGate = findViewById(R.id.eastGateParkade);
        ImageView imageViewEastGateRed = findViewById(R.id.eastGateParkade_RED);
        ImageView imageViewLotA = findViewById(R.id.parkingLotA);
        ImageView imageViewLotARed = findViewById(R.id.parkingLotA_RED);
        ImageView imageViewLotB = findViewById(R.id.parkingLotB);
        ImageView imageViewLotBRed = findViewById(R.id.parkingLotB_RED);
        ImageView imageViewLot1 = findViewById(R.id.parkingLot1);
        ImageView imageViewLot1Red = findViewById(R.id.parkingLot1_RED);
        ImageView imageViewLot2 = findViewById(R.id.parkingLot2);
        ImageView imageViewLot2Red = findViewById(R.id.parkingLot2_RED);
        ImageView imageViewLot3 = findViewById(R.id.parkingLot3);
        ImageView imageViewLot3Red = findViewById(R.id.parkingLot3_RED);
        ImageView imageViewLot4 = findViewById(R.id.parkingLot4);
        ImageView imageViewLot4Red = findViewById(R.id.parkingLot4_RED);
        ImageView imageViewLot5 = findViewById(R.id.parkingLot5);
        ImageView imageViewLot5Red = findViewById(R.id.parkingLot5_RED);
        ImageView imageViewLot6 = findViewById(R.id.parkingLot6);
        ImageView imageViewLot6Red = findViewById(R.id.parkingLot6_RED);
        ImageView imageViewLot6A = findViewById(R.id.parkingLot6A);
        ImageView imageViewLot6ARed = findViewById(R.id.parkingLot6A_RED);
        ImageView imageViewLot7 = findViewById(R.id.parkingLot7);
        ImageView imageViewLot7Red = findViewById(R.id.parkingLot7_RED);
        ImageView imageViewLot8 = findViewById(R.id.parkingLot8);
        ImageView imageViewLot8Red = findViewById(R.id.parkingLot8_RED);
        ImageView imageViewLot9 = findViewById(R.id.parkingLot9);
        ImageView imageViewLot9Red = findViewById(R.id.parkingLot9_RED);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibilityOfLot(parkingLocations.LOT_2, false);
            }
        });

    }


    void setVisibilityOfLot(parkingLocations location, Boolean visibility) {
        ImageView imageViewEastGateRed = findViewById(R.id.eastGateParkade_RED);
        ImageView imageViewLotARed = findViewById(R.id.parkingLotA_RED);
        ImageView imageViewLotBRed = findViewById(R.id.parkingLotB_RED);
        ImageView imageViewLot1Red = findViewById(R.id.parkingLot1_RED);
        ImageView imageViewLot2Red = findViewById(R.id.parkingLot2_RED);
        ImageView imageViewLot3Red = findViewById(R.id.parkingLot3_RED);
        ImageView imageViewLot4Red = findViewById(R.id.parkingLot4_RED);
        ImageView imageViewLot5Red = findViewById(R.id.parkingLot5_RED);
        ImageView imageViewLot6Red = findViewById(R.id.parkingLot6_RED);
        ImageView imageViewLot6ARed = findViewById(R.id.parkingLot6A_RED);
        ImageView imageViewLot7Red = findViewById(R.id.parkingLot7_RED);
        ImageView imageViewLot8Red = findViewById(R.id.parkingLot8_RED);
        ImageView imageViewLot9Red = findViewById(R.id.parkingLot9_RED);

        switch (location) {
            case PARKADE:
                imageViewEastGateRed.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_A:
                imageViewLotARed.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_B:
                imageViewLotBRed.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_1:
                imageViewLot1Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_2:
                imageViewLot2Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_3:
                imageViewLot3Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_4:
                imageViewLot4Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_5:
                imageViewLot5Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_6:
                imageViewLot6Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_6A:
                imageViewLot6ARed.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_7:
                imageViewLot7Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_8:
                imageViewLot8Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
            case LOT_9:
                imageViewLot9Red.setVisibility((visibility ? View.VISIBLE : View.GONE));
                break;
        }
    }

    enum parkingLocations {
        PARKADE,
        LOT_A,
        LOT_B,
        LOT_1,
        LOT_2,
        LOT_3,
        LOT_4,
        LOT_5,
        LOT_6,
        LOT_6A,
        LOT_7,
        LOT_8,
        LOT_9
    }
}