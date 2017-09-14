package com.ahmadrosid.lovelycity.boarding;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import com.ahmadrosid.lovelycity.R;

/**
 * Created by ocittwo on 9/14/17.
 */

public class DetailCityDialog extends DialogFragment{

    private TextView cityName;
    private TextView cityDescription;

    public static DetailCityDialog newInstance(String cityNames, String cityDescriptions) {
        Bundle args = new Bundle();
        args.putString("cityNames", cityNames);
        args.putString("cityDescriptions", cityDescriptions);
        DetailCityDialog fragment = new DetailCityDialog();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);

        // request a window without the title
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_detail_city, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cityName = (TextView) view.findViewById(R.id.cityName);
        cityDescription = (TextView) view.findViewById(R.id.cityDescription);

        view.findViewById(R.id.btnDone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        String name = getArguments().getString("cityNames");
        String desc = getArguments().getString("cityDescriptions");

        cityName.setText(name);
        cityDescription.setText(desc);
    }
}
