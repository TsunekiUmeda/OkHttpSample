package com.sample.tumeda.okhttpsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sample.tumeda.okhttpsampler.R;

import java.util.List;

public class ListAdapter
        extends RecyclerView.Adapter<ListAdapter.ItemViewHolder> {

    private List<Item> mItems;

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private View rssFeedView;

        public ItemViewHolder(View v) {
            super(v);
            rssFeedView = v;
        }
    }

    public ListAdapter(List<Item> items) {
        mItems = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rss_feed, parent, false);
        ItemViewHolder holder = new ItemViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        final Item item = mItems.get(position);
        ((TextView) holder.rssFeedView.findViewById(R.id.titleText)).setText(item.title);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }
}

