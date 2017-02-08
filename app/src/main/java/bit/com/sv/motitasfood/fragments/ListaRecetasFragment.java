package bit.com.sv.motitasfood.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bit.com.sv.motitasfood.R;
import bit.com.sv.motitasfood.adapters.ListaRecetasAdapter;

/**
 * Created by Eyvind on 07/02/2017.
 */

public class ListaRecetasFragment extends Fragment {
    public static final String TAG = "RecyclerViewFragment"; // sirve para recordar algo
    View rootView;
    RecyclerView listaRecetas;
    ListaRecetasAdapter listaRecetasAdapter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){
        rootView = layoutInflater.inflate(R.layout.fragment_recetas_lista,container,false);
        rootView.setTag(TAG);
        listaRecetas.findViewById(R.id.listarecetas);
        listaRecetas.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        listaRecetas.setAdapter(listaRecetasAdapter);
        return rootView;
    }

}


