 package com.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.PrivateKey;

 public class MainActivity extends AppCompatActivity {

     String griya = "-7.315770813786741, 110.49892098189754";
     String hijau = "-7.315190847566364, 110.49755948186785";
     String larosse = "-7.308453204154302, 110.50334121575712";
     String pondokan = "-7.30315761416023, 110.49449757470823";
     String putra = "-7.317762873699639, 110.49373596567271";
     String sartono = "-7.312883555655133, 110.5020410567309";

     Button griya_btn;
     Button hijau_btn;
     Button larosse_btn;
     Button pondokan_btn;
     Button putra_btn;
     Button sartono_btn;

     private VideoView vv;
     private MediaController mediaController;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.kos_pondokan);


         vv = (VideoView) findViewById(R.id.video);

         if (mediaController == null) {
             mediaController = new MediaController(this);
             mediaController.setAnchorView(vv);
         }
         vv.setMediaController(mediaController);
         Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.kos);
         vv.setVideoURI(uri);
         vv.start();
//-----------------------------------------------------------------------------------------//
     }

     private void ContentView(int kos_sartono) {
         ContentView(R.layout.kos_sartono);
         sartono_btn = (Button) findViewById(R.id.btnsartono);
         sartono_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Intent.ACTION_VIEW,
                         Uri.parse("google.navigation:q=" + sartono ));
                 intent.setPackage("com.google.android.apps.maps");
                 if (intent.resolveActivity(getPackageManager()) != null) {
                     startActivity(intent);
                 }
             }
         });

         ContentView(R.layout.kos_putra);
         putra_btn = (Button) findViewById(R.id.putrabtn);
         putra_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Intent.ACTION_VIEW,
                         Uri.parse("google.navigation:q=" + putra ));
                 intent.setPackage("com.google.android.apps.maps");
                 if (intent.resolveActivity(getPackageManager()) != null) {
                     startActivity(intent);
                 }
             }
         });

         setContentView(R.layout.kos_pondokan);
         pondokan_btn = (Button) findViewById(R.id.pondokanbtn);
         pondokan_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Intent.ACTION_VIEW,
                         Uri.parse("google.navigation:q=" + pondokan ));
                 intent.setPackage("com.google.android.apps.maps");
                 if (intent.resolveActivity(getPackageManager()) != null) {
                     startActivity(intent);
                 }
             }
         });
         setContentView(R.layout.kos_larosse);
         larosse_btn = (Button) findViewById(R.id.larossebtn);
         larosse_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Intent.ACTION_VIEW,
                         Uri.parse("google.navigation:q=" + larosse));
                 intent.setPackage("com.google.android.apps.maps");
                 if (intent.resolveActivity(getPackageManager()) != null) {
                     startActivity(intent);
                 }
             }
         });
         setContentView(R.layout.kos_hijau);
         hijau_btn = (Button) findViewById(R.id.hijaubtn);
         hijau_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Intent.ACTION_VIEW,
                         Uri.parse("google.navigation:q=" + hijau));
                 intent.setPackage("com.google.android.apps.maps");
                 if (intent.resolveActivity(getPackageManager()) != null) {
                     startActivity(intent);
                 }
             }
         });
         setContentView(R.layout.kos_griya);
         griya_btn = (Button) findViewById(R.id.griyabtn);
         griya_btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent = new Intent(Intent.ACTION_VIEW,
                         Uri.parse("google.navigation:q=" + griya));
                 intent.setPackage("com.google.android.apps.maps");
                 if (intent.resolveActivity(getPackageManager()) != null) {
                     startActivity(intent);
                 }
             }

         });


     }
     }
