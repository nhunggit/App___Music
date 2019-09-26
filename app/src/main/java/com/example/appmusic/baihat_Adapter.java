package com.example.appmusic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.text.Spanned.*;

public class baihat_Adapter extends RecyclerView.Adapter<baihat_Adapter.WordViewHolder> {
    public static final String EXTRA_MESSAGE="com.example.android.appMusic.extra.MESSAGE";
    int i;
    ArrayList<baihat> baihats;
    Context context;

    public baihat_Adapter(ArrayList<baihat> baihats, MainActivity context) {
        this.baihats = baihats;
        this.context = context;
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemview=inflater.inflate(R.layout.item_layout,parent,false);
        return new WordViewHolder(itemview,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        holder.mstt.setText(baihats.get(position).getStt());
        holder.mname.setText(baihats.get(position).getTenhaihat());
        holder.mtuychon.setImageResource(baihats.get(position).getTuychon());
    }

    @Override
    public int getItemCount() {
        return baihats.size();
    }

    public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mstt;
        TextView mname;
        ImageView mtuychon;
        TextView songplaying;
        final baihat_Adapter mAdapter;
        public WordViewHolder(@NonNull View itemView, baihat_Adapter adapter) {
            super(itemView);
            this.mAdapter=adapter;
            mstt=(TextView)itemView.findViewById(R.id.item_stt);
            mname=(TextView)itemView.findViewById(R.id.item_name);
            mtuychon=(ImageView) itemView.findViewById(R.id.imageView);
            songplaying=(TextView)itemView.findViewById(R.id.song_playing);
            mtuychon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PopupMenu tuychon=new PopupMenu(context,mtuychon);
                    tuychon.getMenuInflater().inflate(R.menu.tuychon_menu,tuychon.getMenu());
                    tuychon.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem menuItem) {
                            switch (menuItem.getItemId()){
                                case R.id.cute:
                                    break;
                                case  R.id.xinhdep:
                                    break;
                            }
                            return false;
                        }
                    });
                    tuychon.show();
                }
            });
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
           String name=mname.getText().toString();
            int mposition=getLayoutPosition();
            baihat element =baihats.get(mposition);
            baihats.set(mposition,element);
            mAdapter.notifyDataSetChanged();
            mname.setTypeface(null,Typeface.BOLD);
            //songplaying= Activity.this.findViewById(R.id.song_playing);

        }

    }

}
