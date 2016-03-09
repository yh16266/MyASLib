package com.jf.test.myaslib.client.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jf.test.myaslib.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2016/3/9.
 */
public class AppbarLayoutAdapter extends RecyclerView.Adapter<AppbarLayoutAdapter.ViewHolder> {

    private Context mContext;
    private List<String> mData = new ArrayList<>();

    public AppbarLayoutAdapter(Context mContext, List<String> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.appbar_recyclerview_itme, null);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txv_title.setText(mData.get(position));
        holder.txv_time.setText(DateFormat.format("yyyy-MM-dd",System.currentTimeMillis()));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txv_title;
        public TextView txv_time;

        public ViewHolder(View view){
            super(view);
            txv_title = (TextView)view.findViewById(R.id.txv_title);
            txv_time = (TextView)view.findViewById(R.id.txv_time);
        }

    }
}
