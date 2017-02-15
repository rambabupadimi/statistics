package com.firebase.statistics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = (PieChart) findViewById(R.id.chart);
        ArrayList<Entry> entries = new ArrayList<>();


            entries.add(new Entry(Integer.parseInt("4"), 0));
            entries.add(new Entry(Integer.parseInt("8"), 1));
            entries.add(new Entry(Integer.parseInt("7"), 2));
            entries.add(new Entry(Integer.parseInt("6"), 3));


        PieDataSet dataset = new PieDataSet(entries, "");

        // creating labels<br />
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Hiring");
        labels.add("Hackathon");
        labels.add("Bot");
        labels.add("Competitive");

        PieData data = new PieData(labels, dataset); // initialize Piedata<br />
        pieChart.setData(data);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.animateY(1000);


    }
}
