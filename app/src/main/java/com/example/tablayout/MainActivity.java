package com.example.tablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar tbar;
    private ViewPager viewPager;
    private VPAdapter vpAdapter;
    private TabLayout t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbar = findViewById(R.id.tbar);
        setSupportActionBar(tbar);


        viewPager=findViewById(R.id.viewpager);
        vpAdapter = new VPAdapter(getSupportFragmentManager());
        viewPager.setAdapter(vpAdapter);

        t = findViewById(R.id.tab);
        t.setupWithViewPager(viewPager);
    }

}
