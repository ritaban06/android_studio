package com.example.funnystickers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewPager;
    public List<Integer> imagesList;
    public ImagePagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getString(R.string.viewpager_description);


        viewPager = findViewById(R.id.view_pager);

        imagesList = new ArrayList<>();
        // add your images to the list
        imagesList.add(R.drawable.a01);
        imagesList.add(R.drawable.a02);
        imagesList.add(R.drawable.a03);
        imagesList.add(R.drawable.a04);
        imagesList.add(R.drawable.a05);
        imagesList.add(R.drawable.a06);
        imagesList.add(R.drawable.a07);
        imagesList.add(R.drawable.a08);
        imagesList.add(R.drawable.a09);
        imagesList.add(R.drawable.a10);
        imagesList.add(R.drawable.a11);
        imagesList.add(R.drawable.a12);
        imagesList.add(R.drawable.a13);
        imagesList.add(R.drawable.a14);
        imagesList.add(R.drawable.a15);
        imagesList.add(R.drawable.a16);
        imagesList.add(R.drawable.a17);
        imagesList.add(R.drawable.a18);
        imagesList.add(R.drawable.a19);
        imagesList.add(R.drawable.a20);
        imagesList.add(R.drawable.a21);
        imagesList.add(R.drawable.a22);
        imagesList.add(R.drawable.a23);
        imagesList.add(R.drawable.a24);
        imagesList.add(R.drawable.a25);
        imagesList.add(R.drawable.a26);
        imagesList.add(R.drawable.a27);
        imagesList.add(R.drawable.a28);
        imagesList.add(R.drawable.a29);
        imagesList.add(R.drawable.a30);
        imagesList.add(R.drawable.a31);
        imagesList.add(R.drawable.a32);

        viewPager.setAdapter(new ImagePagerAdapter(getApplicationContext(), imagesList));
        viewPager.setContentDescription(getString(R.string.viewpager_description));

        adapter = new ImagePagerAdapter(this, imagesList);
        viewPager.setAdapter(adapter);
    }
}
