package com.wozverine.androidtoggleswitch_sample;

import android.support.v4.app.Fragment;
import android.widget.Toast;

/**
 * Created by lorenzorigato on 24/06/2017.
 */

public abstract class BaseSamplesFragment extends Fragment {

    protected void showToggleChangeToast(String[] array, int position) {
        Toast.makeText(getActivity(), "Checked: " + array[position], Toast.LENGTH_SHORT).show();
    }

    protected void showMultipleToggleChangeToast(String[] array, int position, boolean checked) {
        String label = array[position];
        Toast.makeText(getActivity(),
                label + "[" + position + "] => " +  checked,
                Toast.LENGTH_SHORT).show();
    }

}
