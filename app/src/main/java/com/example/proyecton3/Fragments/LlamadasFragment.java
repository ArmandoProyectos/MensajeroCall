package com.example.proyecton3.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.proyecton3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LlamadasFragment extends Fragment {

    public LlamadasFragment() {
        // Required empty public constructor
    }

    ViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_llamadas, container, false);

        ImageView cara1 = ( ImageView ) view.findViewById(R.id.llamadasCara1);
        viewPager = ( ViewPager ) getActivity().findViewById(R.id.pager);
        cara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        ImageView cara2 = ( ImageView ) view.findViewById(R.id.llamadasCara2);
        viewPager = ( ViewPager ) getActivity().findViewById(R.id.pager);
        cara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        ImageView cara3 = ( ImageView ) view.findViewById(R.id.llamadasCara3);
        viewPager = ( ViewPager ) getActivity().findViewById(R.id.pager);
        cara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        ImageView cara4 = ( ImageView ) view.findViewById(R.id.llamadasCara4);
        viewPager = ( ViewPager ) getActivity().findViewById(R.id.pager);
        cara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);
            }
        });

        return view;
    }
}
