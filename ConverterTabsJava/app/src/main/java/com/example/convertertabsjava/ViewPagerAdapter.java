package com.example.convertertabsjava;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(AppCompatActivity activity) {
        super(activity);
    }

    @Override
    public Fragment createFragment(int position) {
        if (position == 0) return new TemperatureFragment();
        else return new DistanceFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

