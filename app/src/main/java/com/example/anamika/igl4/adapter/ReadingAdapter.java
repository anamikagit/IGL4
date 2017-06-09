package com.example.anamika.igl4.adapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.anamika.igl4.R;
import com.example.anamika.igl4.model.MeterReadingResponce;

public class ReadingAdapter extends RecyclerView.Adapter<ReadingAdapter.ReadingViewHolder> {

    private List<MeterReadingResponce> meterReadingResponceList = new ArrayList<>();

    public class ReadingViewHolder extends RecyclerView.ViewHolder {
        TextView tv_reading;
        TextView tv_date;
        public ReadingViewHolder(View itemView) {
            super(itemView);
            tv_reading = (TextView) itemView.findViewById(R.id.tv_reading);
            tv_date = (TextView) itemView.findViewById(R.id.tv_reading_date);
        }
    }

    public void updateList(List<MeterReadingResponce> meterReadingResponces){
        this.meterReadingResponceList = meterReadingResponces;
        notifyDataSetChanged();

    }

    @Override
    public ReadingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meter_reading_row,parent,false);
        return new ReadingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReadingViewHolder holder, int position) {
        holder.tv_date.setText(meterReadingResponceList.get(position).getIMGDATE());
        holder.tv_reading.setText(meterReadingResponceList.get(position).getReading());
    }

    @Override
    public int getItemCount() {
        return meterReadingResponceList.size();
    }
}
