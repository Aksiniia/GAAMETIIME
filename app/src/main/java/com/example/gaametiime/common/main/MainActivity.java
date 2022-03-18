package com.example.gaametiime.common.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gaametiime.R;
import com.example.gaametiime.login.SIgnInActivity;
import com.example.gaametiime.common.adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 pager = findViewById(R.id.viewPager);
        pager.setAdapter(new ViewPagerAdapter());
    }

    public void toSignIn(View view) {
        startActivity(new Intent(MainActivity.this,
                SIgnInActivity.class));
        finish();
    }

    public void toSignInfromBtn(View view) {
        startActivity(new Intent(MainActivity.this,
                SIgnInActivity.class));
        finish();
    }
}