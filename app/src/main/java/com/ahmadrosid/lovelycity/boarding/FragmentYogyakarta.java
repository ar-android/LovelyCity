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

public class FragmentYogyakarta extends Fragment{
    public static FragmentYogyakarta newInstance() {

        Bundle args = new Bundle();

        FragmentYogyakarta fragment = new FragmentYogyakarta();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_yogyakarta, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.learnMore).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailCityDialog detailCityDialog = DetailCityDialog.newInstance("YOGYAKARTA","One of the lovely city atmosphere with traditional and great place to visit such as Mount Merapi.");
                detailCityDialog.show(getChildFragmentManager(), "detail_city");
            }
        });
    }
}
