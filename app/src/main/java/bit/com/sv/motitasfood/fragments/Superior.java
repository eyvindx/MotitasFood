package bit.com.sv.motitasfood.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bit.com.sv.motitasfood.R;
import bit.com.sv.motitasfood.activities.MainActivity;
import butterknife.BindView;

/**
 * Created by Eyvind on 05/02/2017.
 */

public class Superior extends Fragment {
    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.companytextView)
    TextView companyTextView;

    View rootView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        rootView = inflater.inflate(R.layout.superior,container,false);
        return rootView;
    }
}
