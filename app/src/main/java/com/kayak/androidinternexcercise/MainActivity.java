package com.kayak.androidinternexcercise;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerAdapter.OnNoteListener {


    //create the handler for the recyclerview
    private RecyclerView recyclerView;


    //images resource id
    private int[] images = {


            R.drawable.logo_aa, R.drawable.logo_fl, R.drawable.logo_ac, R.drawable.logo_af,
            R.drawable.logo_as, R.drawable.logo_az, R.drawable.logo_nh, R.drawable.logo_os,
            R.drawable.logo_ba, R.drawable.logo_sn, R.drawable.logo_dl, R.drawable.logo_ek,
            R.drawable.logo_ey, R.drawable.logo_f9, R.drawable.logo_b6, R.drawable.logo_kl,
            R.drawable.logo_lh, R.drawable.logo_sk, R.drawable.logo_lx, R.drawable.logo_ib,
            R.drawable.logo_tp, R.drawable.logo_tk, R.drawable.logo_ua, R.drawable.logo_us
    };


    //text resource id
    private String[] texts = {

            "American Airlines", "AirTran", "Air Canada", "Air France",
            " Alaska Airlines ", " Alitalia", "All Nippon Airways", " austrian Airline",
            "British Airways", "Brussels Airlines", "Delta Air Lines", "Emirates Airline",
            "Etihad Arieline", "Frontier", "JetBlue Airways", "KLM",
            "Lufthansa", "Scandinavian Airway", "Swiss Airway", "Iberia airline", "TAP Air Portugal",
            "Turkish Airline", "United Airway", "US Airway",

    };

    //create adapter variable
    private RecyclerAdapter adapter;


    //create layout manager for the recycler view
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //we initialize the handler
        recyclerView = findViewById(R.id.recyclerView);

        //initialize the layout manager
        layoutManager = new LinearLayoutManager(this);

        //layoutManager = new GridLayoutManager(this, 2);
        //to improve the performance of layout manager
        recyclerView.setHasFixedSize(true);

        //set the layout manager on the recycler view
        recyclerView.setLayoutManager(layoutManager);

        //initialize the adapter
        adapter = new RecyclerAdapter(images, texts, this);

        //set eh adapter in the recycle view
        recyclerView.setAdapter(adapter);


        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        dividerItemDecoration.setDrawable(getResources().getDrawable(R.drawable.recyclerview_divider));

    }


    @Override
    public void onNoteClick(int position) {

        if (position == 0) {
            Intent americaAirline = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.aa.com/homePage.do?locale=en_US"));
            startActivity(americaAirline);
        } else if (position == 1) {
            Intent AirTran = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.alternativeairlines.com/airtran-airways"));
            startActivity(AirTran);
        } else if (position == 2) {

            Intent AirCanada = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.aircanada.com/en/us/home.html"));
            startActivity(AirCanada);

        } else if (position == 3) {

            Intent AirFrance = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.airfrance.us"));
            startActivity(AirFrance);

        } else if (position == 4) {

            Intent AlaskaAirline = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.alaskaair.com"));
            startActivity(AlaskaAirline);

        } else if (position == 5) {

            Intent Alitalia = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.alitalia.com/en_us/"));
            startActivity(Alitalia);

        } else if (position == 6) {

            Intent AllNipponAirways = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.ana.co.jp/en/us/"));
            startActivity(AllNipponAirways);

        } else if (position == 7) {

            Intent austrian = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.austrian.com/?sc_lang=en&cc=US"));
            startActivity(austrian);
        } else if (position == 8) {

            Intent BritishAirways = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.britishairways.com/en-us/home#/"));
            startActivity(BritishAirways);

        } else if (position == 9) {

            Intent BrusselsAirlines = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.brusselsairlines.com"));
            startActivity(BrusselsAirlines);

        } else if (position == 10) {

            Intent DeltaAirLines = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.delta.com"));
            startActivity(DeltaAirLines);

        } else if (position == 11) {

            Intent EmiratesAirline = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.emirates.com/us/english/"));
            startActivity(EmiratesAirline);

        } else if (position == 12) {

            Intent EtihadAirways = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.etihadairways.com"));
            startActivity(EtihadAirways);

        } else if (position == 13) {

            Intent Frontier = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.flyfrontier.com"));
            startActivity(Frontier);

        } else if (position == 14) {

            Intent JetBlueAirways = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.jetblue.com"));
            startActivity(JetBlueAirways);

        } else if (position == 15) {

            Intent KLM = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.klm.com"));
            startActivity(KLM);

        } else if (position == 16) {

            Intent Lufthansa = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.lufthansa.com/us/en/homepage"));
            startActivity(Lufthansa);

        } else if (position == 17) {

            Intent Scandinavian = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http:// www.flysas.com/us-en/"));
            startActivity(Scandinavian);

        } else if (position == 18) {

            Intent Swiss = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.swiss.com/usa/EN"));
            startActivity(Swiss);


        } else if (position == 19) {

            Intent Iberia = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.iberia.com/us/"));
            startActivity(Iberia);

        } else if (position == 20) {

            Intent TAPAirPortugal = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.flytap.com/USA/en/"));
            startActivity(TAPAirPortugal);

        } else if (position == 21) {

            Intent Turkish = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.turkishairlines.com/en-int/"));
            startActivity(Turkish);

        } else if (position == 22) {

            Intent United = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.united.com"));
            startActivity(United);

        } else if (position == 23) {

            Intent US = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.usairways.com"));
            startActivity(US);

        }


    }
}
