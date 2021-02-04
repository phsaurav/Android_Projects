package com.delaroystudios.cardview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.delaroystudios.cardview.Model.AlbumStudent;
import com.delaroystudios.cardview.R;

import java.util.List;

public class AdapterStudent extends RecyclerView.Adapter<AdapterStudent.MyViewHolder> {
    Context context;
    private List<AlbumStudent>albumStudents;


    public AdapterStudent(Context context, List<AlbumStudent> albumStudents) {
        this.context = context;
        this.albumStudents = albumStudents;
    }

    @Override
    public AdapterStudent.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View itemView = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.album_card, parent, false);
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.album_card,parent,false);
        return new MyViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(AdapterStudent.MyViewHolder holder, int position) {
        AlbumStudent album = albumStudents.get(position);
        holder.textView1.setText(album.getTile());
        holder.textView2.setText(album.getNumofsong());



    }

    @Override
    public int getItemCount() {
        return albumStudents.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2;
        ImageView imageView1,imageView;
        public MyViewHolder(View itemView) {
            super(itemView);

            //title = (TextView) view.findViewById(R.id.title);

            textView1= (TextView) itemView.findViewById(R.id.title);
            textView2= (TextView) itemView.findViewById(R.id.count);
            imageView= (ImageView) itemView.findViewById(R.id.thumbnail);

        }
    }
}
