package com.wozverine.androidtoggleswitch_sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wozverine.androidtoggleswitch.widgets.ToggleSwitch;
import com.wozverine.androidtoggleswitch_sample.databinding.FragmentMatchParentWidthHeightBinding;

/**
 * Created by lorenzorigato on 20/06/2017.
 */

public class MatchParentWidthHeightFragment extends BaseSamplesFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMatchParentWidthHeightBinding binding = FragmentMatchParentWidthHeightBinding.inflate(inflater);

        binding.matchParentWidthToggleSwitch.setOnChangeListener(new ToggleSwitch.OnChangeListener() {
            @Override
            public void onToggleSwitchChanged(int position) {
                String[] planets = getResources().getStringArray(R.array.operators);
                showToggleChangeToast(planets, position);
            }
        });

        return binding.getRoot();
    }
}
