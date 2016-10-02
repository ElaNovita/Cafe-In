package com.novita.ela.cafe_in.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.novita.ela.cafe_in.Model.CafeModel;
import com.novita.ela.cafe_in.OnItemClickListener;
import com.novita.ela.cafe_in.R;

import java.util.List;

/**
 * Created by e on 28/09/16.
 */

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.ViewHolder> {

    Context context;
    List<CafeModel> models;
    public  static OnItemClickListener listener;

    public CafeAdapter(Context context, List<CafeModel> models, OnItemClickListener listener) {
        this.context = context;
        this.models = models;
        this.listener = listener;
    }

    private void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cafe_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(models.get(position).getName());
        holder.address.setText(models.get(position).getAddress());
        holder.openTime.setText(models.get(position).getOpenTime());
        holder.cafe_img.setImageResource(models.get(position).getImgUrl());
        holder.logo.setImageResource(models.get(position).getLogo());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cafe_img, logo;
        TextView name, address, openTime;


        public ViewHolder(View itemView) {
            super(itemView);

            cafe_img = (ImageView) itemView.findViewById(R.id.cafe_img);
            name = (TextView) itemView.findViewById(R.id.cafe_name);
            address = (TextView) itemView.findViewById(R.id.cafe_address);
            openTime = (TextView) itemView.findViewById(R.id.open_time);
            logo = (ImageView) itemView.findViewById(R.id.cafe_logo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(v, getLayoutPosition(), false);
                }
            });
        }
    }
}
