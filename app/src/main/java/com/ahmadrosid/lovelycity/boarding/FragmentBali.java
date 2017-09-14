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

public class FragmentBali extends Fragment {
    public static FragmentBali newInstance() {

        Bundle args = new Bundle();

        FragmentBali fragment = new FragmentBali();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bali, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.learnMore).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DetailCityDialog detailCityDialog = DetailCityDialog.newInstance("BALI",
                        "Gateway city with a lots of nice beaches, religious temple, the famous Tari Kacak and of course beer.");
                detailCityDialog.show(getChildFragmentManager(), "detail_city");
            }
        });
    }
}
