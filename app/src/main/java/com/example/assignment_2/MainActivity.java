package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five;
    TextView details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        details=findViewById(R.id.details);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details.setText("Dua Before eating Food\n" +
                        "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ\n" +
                        "Translation\n" +
                        "In the name of Allah and with the blessings of Allah I begin (eating)”.(Mustadrak)");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details.setText("Dua Before eating Food\n" +
                        "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ\n" +
                        "Translation\n" +
                        "In the name of Allah and with the blessings of Allah I begin (eating)”.(Mustadrak)");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp="بِاسْمِكَ رَبِّي وَضَعْتُ جَنْبِي، وَبِكَ أَرْفَعُهُ، فَإِنْ أَمْسَكْتَ نَفْسِي فَارْحَمْهَا، وَإِنْ أَرْسَلْتَهَا فَاحْفَظْهَا، بِمَا تَحْفَظُ بِهِ عِبَادَكَ الصَّالِحِينَ.\n" +
                        "Bismika rabbee wadaAAtu janbee wabika arfaAAuh, fa-in amsakta nafsee farhamha, wa-in arsaltaha fahfathha bima tahfathu bihi AAibadakas-saliheen\n" +
                        "In Your name my Lord, I lie down and in Your name I rise, so if You should take my soul then have mercy upon it, and if You should return my soul then protect it in the manner You do so with Your righteous servants.";
                details.setText(temp);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details.setText("Dua Before eating Food\n" +
                        "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ\n" +
                        "Translation\n" +
                        "In the name of Allah and with the blessings of Allah I begin (eating)”.(Mustadrak)");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details.setText("Dua Before eating Food\n" +
                        "بِسْمِ اللَّهِ وَعَلَى بَرَكَةِ اللَّهِ\n" +
                        "Translation\n" +
                        "In the name of Allah and with the blessings of Allah I begin (eating)”.(Mustadrak)");
            }
        });
    }
}