package com.kayak.androidinternexcercise;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {

    private OnNoteListener mOnNoteListener;

    private int[] images;
    private String[] texts;

    public RecyclerAdapter(int[] images, String[] texts, OnNoteListener onNoteListener) {
        this.images = images;
        this.texts = texts;
        this.mOnNoteListener = onNoteListener;
    }

    //to create each item in the recycler view

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ariline_list, parent, false);
//return an object of view holder
        ImageViewHolder imageViewHolder = new ImageViewHolder(view, mOnNoteListener);
        return imageViewHolder;


    }


    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {


        int imageId = images[position];
        holder.airlineimg.setImageResource(imageId);

        String textId = texts[position];
        holder.airlineText.setText(textId);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public interface OnNoteListener {
        void onNoteClick(int position);
    }

    //create separate class fo the view holder
    public static class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView airlineimg;
        TextView airlineText;

        OnNoteListener onNoteListener;


        public ImageViewHolder(@NonNull View itemView, OnNoteListener onNoteListener) {
            super(itemView);

            airlineimg = itemView.findViewById(R.id.AirTranimg);
            airlineText = itemView.findViewById(R.id.txtAirTran);

            this.onNoteListener = onNoteListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            onNoteListener.onNoteClick(getAdapterPosition());

        }
    }


}
