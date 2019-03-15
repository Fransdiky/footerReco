package com.example.recofooter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Footer extends AppCompatActivity {
    private ImageView imageLogoGray, imageViewLogoCopyright;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_footer);

        imageViewLogoCopyright = findViewById(R.id.logoCopyright);
        imageLogoGray = findViewById(R.id.logoGrey);

        footer();


    }


    private void loadImageFromurPanelLogogrey (String img) {
        Picasso.with(this).load(img).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageLogoGray, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });

    }

    private void loadImageFromurPanelLogoCopyright (String img) {
        Picasso.with(this).load(img).placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(imageViewLogoCopyright, new com.squareup.picasso.Callback() {
                    @Override
                    public void onSuccess() {

                    }

                    @Override
                    public void onError() {

                    }
                });

    }

    public void footer(){
        String logoCopyright = "/public/domain/v/vinege.com/images/footer_ind.png";
        String logoGrey = "/public/domain/v/vinege.com/images/logo_reco_gray.png";
        loadImageFromurPanelLogogrey("https://vinege.com" + logoGrey );
        loadImageFromurPanelLogoCopyright("https://vinege.com" + logoCopyright );
    }
}
