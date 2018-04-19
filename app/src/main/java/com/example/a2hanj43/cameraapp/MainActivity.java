package com.example.a2hanj43.cameraapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            CameraPreview view = new CameraPreview(this);
            setContentView(view);
        }
}

