package com.ahmadrosid.lovelycity.boarding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmadrosid.lovelycity.R;

/**
 * Created by ocittwo on 9/14/17.
 */

public class FragmentBandung extends Fragment{
    public static FragmentBandung newInstance() {

        Bundle args = new Bundle();

        FragmentBandung fragment = new FragmentBandung();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bandung, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.learnMore).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailCityDialog detailCityDialog = DetailCityDialog.newInstance("BANDUNG", "The city with nice view, lots of trees, warm yet cool weather and of course, our people are nice.");
                detailCityDialog.show(getChildFragmentManager(), "detail_city");
            }
        });
    }
}
