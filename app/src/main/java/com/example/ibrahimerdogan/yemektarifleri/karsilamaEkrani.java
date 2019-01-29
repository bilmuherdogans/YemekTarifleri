package com.example.ibrahimerdogan.yemektarifleri;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class karsilamaEkrani extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karsilama_ekrani);
        try
        {

            this.getSupportActionBar().hide();

        }
        catch (Exception e)
        {

            Toast.makeText(getApplicationContext(),(String)"", Toast.LENGTH_SHORT).show();
        }




        iv=(ImageView)findViewById(R.id.iv);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        iv.startAnimation(myanim);
       final Intent i =new Intent(this,MainActivity_anasayfa.class);
        Thread timer=new Thread(){
            public void run()
            {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    startActivity(i);
                    finish();
                }

            }
        };
        timer.start();
    }
}
