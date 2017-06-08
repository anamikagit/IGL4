package com.example.anamika.igl4.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.model.MeterReadingResponce;

import java.util.List;
import java.util.zip.Inflater;

public class ReadingAdapter extends RecyclerView.Adapter<ReadingAdapter.ReadingViewHolder> {

    private List<MeterReadingResponce> meterReadingResponceList;
    private int rowLayout;
    private Context context;

    public class ReadingViewHolder extends RecyclerView.ViewHolder {
        TextView tv_reading;
        TextView tv_date;
        RelativeLayout relativeLayout;
        public ReadingViewHolder(View itemView) {
            super(itemView);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.reading_layout);
            tv_reading = (TextView) itemView.findViewById(R.id.tv_reading);
            tv_date = (TextView) itemView.findViewById(R.id.tv_reading_date);
        }
    }
    public ReadingAdapter(List<MeterReadingResponce> meterReadingResponceList, int rowLayout, Context context) {
        this.meterReadingResponceList = meterReadingResponceList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ReadingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout,parent,false);
        return new ReadingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReadingViewHolder holder, int position) {
        holder.tv_date.setText(meterReadingResponceList.get(position).getReading());
        holder.tv_reading.setText(meterReadingResponceList.get(position).getIMGDATE());
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
