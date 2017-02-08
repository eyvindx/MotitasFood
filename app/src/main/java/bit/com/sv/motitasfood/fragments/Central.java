package bit.com.sv.motitasfood.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import bit.com.sv.motitasfood.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Eyvind on 05/02/2017.
 */

public class Central extends Fragment {

    View rootView;
    @BindView(R.id.mascotaImageView)
    ImageView mascotaImageView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.central,container,false);
        ButterKnife.bind(this,rootView);
        return rootView;
    }
}
