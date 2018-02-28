package id.co.digitalindo.recyclerviewandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by nandoseptianhusni on 2/28/18.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    String[] judul ;
    int [] gambar ;
    int [] ratting ;

    public MyAdapter(String[] judul, int[] gambar, int[] ratting) {
        this.judul = judul;
        this.gambar = gambar;
        this.ratting = ratting;
    }


    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView judul;
        public RatingBar ratingBar ;
        public ImageView img ;
        public ViewHolder(View v) {
            super(v);
            judul = v.findViewById(R.id.customTitle);
            ratingBar = v.findViewById(R.id.rattingbar);
            img = v.findViewById(R.id.customImage);
        }
    }


    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_list, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.judul.setText(judul[position]);
        holder.ratingBar.setRating(ratting[position]);
        holder.img.setImageResource(gambar[position]);


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return judul.length;
    }
}