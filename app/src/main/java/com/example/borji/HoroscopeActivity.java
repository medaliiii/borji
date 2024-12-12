package com.example.borji;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HoroscopeActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView signNameFr;
    private TextView signNameAr;
    private ImageView signImage;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope);

        datePicker = findViewById(R.id.datePicker);
        signNameFr = findViewById(R.id.signNameFr);
        signNameAr = findViewById(R.id.signNameAr);
        signImage = findViewById(R.id.signImage);
        description = findViewById(R.id.description);

        datePicker.init(
                datePicker.getYear(),
                datePicker.getMonth(),
                datePicker.getDayOfMonth(),
                (view, year, monthOfYear, dayOfMonth) -> updateHoroscope(monthOfYear + 1, dayOfMonth)
        );

        // Horoscope initial basé sur la date actuelle
        updateHoroscope(datePicker.getMonth() + 1, datePicker.getDayOfMonth());
    }

    private void updateHoroscope(int month, int day) {
        HoroscopeD sign = HoroscopeDD.getZodiacSign(month, day);
        if (sign != null) {
            signNameFr.setText(sign.getNameFr());
            signNameAr.setText(sign.getNameAng());
            signImage.setImageResource(sign.getImageResource());
            description.setText(sign.getDescription());
        }
    }
}
