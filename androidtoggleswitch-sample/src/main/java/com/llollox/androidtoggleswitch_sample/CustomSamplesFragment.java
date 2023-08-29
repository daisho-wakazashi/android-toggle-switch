package com.wozverine.androidtoggleswitch_sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.wozverine.androidtoggleswitch.widgets.MultipleToggleSwitch;
import com.wozverine.androidtoggleswitch.widgets.ToggleSwitch;
import com.wozverine.androidtoggleswitch_sample.databinding.FragmentCustomSamplesBinding;


/**
 * Created by lorenzorigato on 16/06/2017.
 */

public class CustomSamplesFragment extends BaseSamplesFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentCustomSamplesBinding binding = FragmentCustomSamplesBinding.inflate(inflater);

        binding.matchParentWidthToggleSwitch.setOnChangeListener(new ToggleSwitch.OnChangeListener() {
            @Override
            public void onToggleSwitchChanged(int position) {
                String[] operators = getResources().getStringArray(R.array.operators);
                showToggleChangeToast(operators, position);
            }
        });

        binding.customColorsToggleSwitch.setOnChangeListener(new ToggleSwitch.OnChangeListener() {
            @Override
            public void onToggleSwitchChanged(int position) {
                String[] planets = getResources().getStringArray(R.array.planets);
                showToggleChangeToast(planets, position);
            }
        });

        binding.customSizesToggleSwitch.setOnChangeListener(new ToggleSwitch.OnChangeListener() {
            @Override
            public void onToggleSwitchChanged(int position) {
                String[] array = {getString(R.string.apple), getString(R.string.lemon)};
                showToggleChangeToast(array, position);
            }
        });

        binding.noSeparatorToggleSwitch.setOnChangeListener(new ToggleSwitch.OnChangeListener() {
            @Override
            public void onToggleSwitchChanged(int position) {
                String[] planets = getResources().getStringArray(R.array.planets);
                showToggleChangeToast(planets, position);
            }
        });

        binding.customBordersToggleSwitch.setOnChangeListener(new MultipleToggleSwitch.OnChangeListener() {
            @Override
            public void onMultipleToggleSwitchChanged(int position, boolean checked) {
                String[] planets = getResources().getStringArray(R.array.planets);
                String label = planets[position];
                Toast.makeText(getActivity(),
                        label + "[" + position + "] => " +  checked,
                        Toast.LENGTH_SHORT).show();
            }
        });

        return binding.getRoot();
    }
}
