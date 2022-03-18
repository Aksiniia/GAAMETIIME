package com.example.gaametiime.common.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gaametiime.R;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.Holder> {

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.view_pager_item,
                                parent,
                                false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        if (position == 0) {
            holder.itemView.findViewById(R.id.onb1).setVisibility(View.VISIBLE);
            holder.itemView.findViewById(R.id.onb2).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.onb3).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.skip).setVisibility(View.VISIBLE);
            ((TextView) holder.itemView.findViewById(R.id.text1)).setText("Get Paid! Playing Video Game");
            ((TextView) holder.itemView.findViewById(R.id.descr1)).setText("Earn points and real cash when you win a battle with no delay in cashing out");
        } else if (position == 2) {
            holder.itemView.findViewById(R.id.onb1).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.onb2).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.onb3).setVisibility(View.VISIBLE);
            holder.itemView.findViewById(R.id.but).setVisibility(View.VISIBLE);
            holder.itemView.findViewById(R.id.skip).setVisibility(View.GONE);
            ((TextView) holder.itemView.findViewById(R.id.text1)).setText("Text, Audio and Video Chat");
            ((TextView) holder.itemView.findViewById(R.id.descr1)).setText("Intuitive real life experience on mobile. Chat with fellow gamers before and after combat for free!");
        } else {
            holder.itemView.findViewById(R.id.onb1).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.onb2).setVisibility(View.VISIBLE);
            holder.itemView.findViewById(R.id.onb3).setVisibility(View.GONE);
            holder.itemView.findViewById(R.id.skip).setVisibility(View.VISIBLE);
            ((TextView) holder.itemView.findViewById(R.id.text1)).setText("Schedule Games With Friends ");
            ((TextView) holder.itemView.findViewById(R.id.descr1)).setText("Easily create an upcoming event and get ready for battle. Yeah! real combat fella.");
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public static class Holder extends RecyclerView.ViewHolder {
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
