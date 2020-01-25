package com.sundar.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DigitalClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CalendarView cal;
    DigitalClock clk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal = (CalendarView) findViewById(R.id.calendarView1);

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(),"Selected Date is\n\n"
                                +dayOfMonth+" : "+month+" : "+year ,
                        Toast.LENGTH_LONG).show();
            }
        });



        clk = (DigitalClock) findViewById(R.id.digitalClock1);

        clk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Toast.makeText(getBaseContext(), clk.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }



}
