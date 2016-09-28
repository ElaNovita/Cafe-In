package com.novita.ela.caffe_in.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.novita.ela.caffe_in.Model.CafeModel;
import com.novita.ela.caffe_in.OnItemClickListener;
import com.novita.ela.caffe_in.R;

import java.util.List;

/**
 * Created by e on 28/09/16.
 */

public class CafeAdapter extends RecyclerView.Adapter<CafeAdapter.ViewHolder> {

    Context context;
    List<CafeModel> models;
    public  static OnItemClickListener listener;

    public CafeAdapter(Context context, List<CafeModel> models) {
        this.context = context;
        this.models = models;
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

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView cafe_img, fav;


        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
