package bit.com.sv.motitasfood.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bit.com.sv.motitasfood.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Eyvind on 05/02/2017.
 */

public class Inferior extends Fragment {
    View rootView;
    @BindView(R.id.menuTextView)
    TextView menuTextView;
    @BindView(R.id.serviciosTextView)
    TextView serviciosTextView;
    @BindView(R.id.banquetesTextView)
    TextView banquetesTextView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.inferior,container,false);
        ButterKnife.bind(this,rootView);
        return rootView;
}
}
