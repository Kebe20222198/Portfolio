package com.portfolio.app;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class RendezVousActivity extends AppCompatActivity {
    private TextView tvDate, tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rendez_vous);

        tvDate = findViewById(R.id.tv_date);
        tvTime = findViewById(R.id.tv_time);
        Button btnDate = findViewById(R.id.btn_date);
        Button btnTime = findViewById(R.id.btn_time);
        Button btnConfirmer = findViewById(R.id.btn_confirmer);

        btnDate.setOnClickListener(v -> {
            Calendar c = Calendar.getInstance();
            DatePickerDialog dpd = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
                tvDate.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
            }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
            dpd.show();
        });

        btnTime.setOnClickListener(v -> {
            Calendar c = Calendar.getInstance();
            TimePickerDialog tpd = new TimePickerDialog(this, (view, hourOfDay, minute) -> {
                tvTime.setText(hourOfDay + ":" + minute);
            }, c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), true);
            tpd.show();
        });

        btnConfirmer.setOnClickListener(v -> {
            // Handle confirmation
        });
    }
}