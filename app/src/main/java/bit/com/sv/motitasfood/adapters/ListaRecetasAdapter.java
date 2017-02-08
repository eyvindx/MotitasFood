package bit.com.sv.motitasfood.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bit.com.sv.motitasfood.R;

/**
 * Created by Eyvind on 07/02/2017.
 */

public class ListaRecetasAdapter extends RecyclerView.Adapter<ListaRecetasAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,parent,false);
        ViewHolder viewHolder = new ViewHolder(rootView);
        return viewHolder;

    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView titulo;
        public TextView listaNombre;

        public ViewHolder(View itemView){
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.title);
            listaNombre = (TextView) itemView.findViewById(R.id.listanombre);
        }


    }
}
