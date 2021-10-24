package com.example.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
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
                String temp="بِسْمِ اللّٰہِ الرَّحْمٰنِ الرَّحِيْمِ\n" +
                        "Bismi-llāhi r-raḥmāni r-raḥīm\n" +
                        "In the name of Allah , the Entirely Merciful, the Especially Merciful.\n";
                details.setText(temp);
                details.setMovementMethod(new ScrollingMovementMethod());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp="بِاسْمِكَ رَبِّي وَضَعْتُ جَنْبِي، وَبِكَ أَرْفَعُهُ، فَإِنْ أَمْسَكْتَ نَفْسِي فَارْحَمْهَا، وَإِنْ أَرْسَلْتَهَا فَاحْفَظْهَا، بِمَا تَحْفَظُ بِهِ عِبَادَكَ الصَّالِحِينَ.\n" +
                        "Bismika rabbee wadaAAtu janbee wabika arfaAAuh, fa-in amsakta nafsee farhamha, wa-in arsaltaha fahfathha bima tahfathu bihi AAibadakas-saliheen\n" +
                        "In Your name my Lord, I lie down and in Your name I rise, so if You should take my soul then have mercy upon it, and if You should return my soul then protect it in the manner You do so with Your righteous servants.";

                details.setText(temp);
                details.setMovementMethod(new ScrollingMovementMethod());

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp="رَبِّ اجْعَلْنِيْ مُقِيْمَ الصَّلٰوةِ وَمِنْ ذُرِّيَّتِيْ رَبَّنَا وَتَقَبَّلْ دُعَاۗءِ\n" +
                        "Rabbij-A’lnee Muqeemas’ S’alaati Wa Min D’urrriyyatee Rabbanaa Wa Taqabbal Du-A’aa\n" +
                        "O my Lord! Make me one who performs As-Salaat (Iqaamat-as-Salaat), and (also) from my offspring, our Lord! And accept my invocation.";
                        details.setText(temp);
                details.setMovementMethod(new ScrollingMovementMethod());

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String temp="سُبْحَانَ الَّذِي سَخَّرَ لَنَا هَذَا وَمَا كُنَّا لَهُ مُقْرِنِينَ وَإِنَّا إِلَى رَبِّنَا لَمُنْقَلِبُونَ.\n" +
                       "Subhana-alladhi sakh-khara la-na hadha wa ma kunna la-hu muqrinin. Wa inna ila Rabbi-na la munqalibun.\n" +
                       "Glory unto Him Who created this transportation, for us, though we were unable to create it on our own. And unto our Lord we shall return.";
               details.setText(temp);
                details.setMovementMethod(new ScrollingMovementMethod());

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String temp="اللّهُـمَّ عافِـني في بَدَنـي ، اللّهُـمَّ عافِـني في سَمْـعي ، اللّهُـمَّ عافِـني في بَصَـري ، لا إلهَ إلاّ أَنْـتَ. اللّهُـمَّ إِنّـي أَعـوذُبِكَ مِنَ الْكُـفر ، وَالفَـقْر ، وَأَعـوذُبِكَ مِنْ عَذابِ القَـبْر ، لا إلهَ إلاّ أَنْـتَ\n" +
                       "Allaahumma 'aafinee fee badanee, Allaahumma 'aafinee fee sam'ee, Allaahumma 'aafinee fee basaree, laa 'ilaaha 'illaa 'Anta. Allaahumma 'innee 'a'oothu bika minal-kufri, walfaqri, wa 'a'oothu bika min 'athaabil-qabri, laa 'ilaaha 'illaa 'Anta.\n" +
                       "O Allah, make me healthy in my body. O Allah, preserve for me my hearing. O Allah, preserve for me my sight. There is none worthy of worship but You . O Allah , I seek refuge in You from disbelief and poverty and I seek refuge in You from the punishment of the grave . There is none worthy of worship but You.";
               details.setText(temp);
                details.setMovementMethod(new ScrollingMovementMethod());

            }
        });
    }
}