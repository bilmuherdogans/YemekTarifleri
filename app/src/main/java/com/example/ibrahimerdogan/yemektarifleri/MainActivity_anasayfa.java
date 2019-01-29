package com.example.ibrahimerdogan.yemektarifleri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class MainActivity_anasayfa extends AppCompatActivity implements View.OnClickListener{


    /*Bu kısımda menü elemanlarımızı belirledik*/
    private CardView kart_1,kart_2,kart_3,kart_4,kart_5,kart_6,kart_7,kart_8,kart_9;
    private InterstitialAd mInterstitialAd;

    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_anasayfa);
        MobileAds.initialize(this, "ca-app-pub-5431762213260797~7002507061");


        /*Reklam Geçiş*/

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5431762213260797/2484677555");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                mInterstitialAd.show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
                mInterstitialAd.show();
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
                mInterstitialAd.show();
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
                mInterstitialAd.show();
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when when the interstitial ad is closed.

            }
        });


        /*Reklam Geçiş bitiş*/

        /* Reklam  BANNER */
        mAdView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener(){

            public void OnAdLoaded(){
                super.onAdLoaded();
            }
        });

        /* Reklam banner bitis*/

        /*menü elemanlarımızla java dosyasında oluşturduğumuz menü elemanlarını bağladık.*/
        kart_1=(CardView)findViewById(R.id.kart_1);
        kart_2=(CardView)findViewById(R.id.kart_2);
        kart_3=(CardView)findViewById(R.id.kart_3);
        kart_4=(CardView)findViewById(R.id.kart_4);
        kart_5=(CardView)findViewById(R.id.kart_5);
        kart_6=(CardView)findViewById(R.id.kart_6);
        kart_7=(CardView)findViewById(R.id.kart_7);
        kart_8=(CardView)findViewById(R.id.kart_8);
        kart_9=(CardView)findViewById(R.id.kart_9);

        /*java sınıfımız içerisinde bulunan menü elemanları için bir listener oluşturduk*/
        kart_1.setOnClickListener(this);
        kart_2.setOnClickListener(this);
        kart_3.setOnClickListener(this);
        kart_4.setOnClickListener(this);
        kart_5.setOnClickListener(this);
        kart_6.setOnClickListener(this);
        kart_7.setOnClickListener(this);
        kart_8.setOnClickListener(this);
        kart_9.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId())
        {
            case R.id.kart_1:
                i=new Intent(this,anayemekler.class);
                startActivity(i);
                break;

            case R.id.kart_2:

                i=new Intent(this,tatlilar.class);
                startActivity(i);
                break;
            case R.id.kart_3:
                i=new Intent(this,balik.class);
                startActivity(i);
                break;
            case R.id.kart_4:
                i=new Intent(this,icecekler.class);

                startActivity(i);
                break;
            case R.id.kart_5: i=new Intent(this,meyveler.class);

                startActivity(i);
                break;

            case R.id.kart_6: i=new Intent(this,resimgaleri.class);

                startActivity(i);
                break;
            case R.id.kart_7: i=new Intent(this,seflerimiz.class);

                startActivity(i);
                break;
            case R.id.kart_8: i=new Intent(this,hakkimizda.class);

                startActivity(i);
                break;
            case R.id.kart_9: i=new Intent(this,iletisim.class);

                startActivity(i);
                break;
            default:break;

        }
    }
}
