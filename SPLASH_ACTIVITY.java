package com.example.splashactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
      
            protected void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);

                requestWindowFeature(Window.FEATURE_NO_TITLE);
                this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                        WindowManager.LayoutParams.FLAG_FULLSCREEN);
                setContentView(R.layout.activity_main);
                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        try{
                            sleep(3000);
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                        finally {
                            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }

                };
                thread.start();
            }
            protected void onPause(){
                super.onPause();
                finish();
            }
}
