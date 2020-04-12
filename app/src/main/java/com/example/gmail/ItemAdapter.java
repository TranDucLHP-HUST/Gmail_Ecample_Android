package com.example.gmail;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {

    List<ItemModel> listItem;

    public ItemAdapter(List<ItemModel> listItem) {
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView ==null)
        {
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent,false);
            viewHolder=new ViewHolder();
            viewHolder.img =convertView.findViewById(R.id.img);
            viewHolder.cap = convertView.findViewById(R.id.caption);
            viewHolder.time = convertView.findViewById(R.id.time);
            viewHolder.text1 = convertView.findViewById(R.id.content1);
            viewHolder.text2 = convertView.findViewById(R.id.content2);
            viewHolder.star = convertView.findViewById(R.id.star);

            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)convertView.getTag();
        }

        final ItemModel item = listItem.get(position);
        viewHolder.img.setText(item.getThumbId());
        viewHolder.cap.setText(item.getCapId());
        viewHolder.time.setText(item.getTimeId());
        viewHolder.text1.setText(item.getText1Id());
        viewHolder.text2.setText(item.getText2Id());
        //star.setImageResource(item.getStarId());
        if (item.isSelected())
            viewHolder.star.setImageResource(R.drawable.ic_star_favorite);
        else
            viewHolder.star.setImageResource(R.drawable.ic_star_normal);
        viewHolder.star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isSelected = listItem.get(position).isSelected();
                listItem.get(position).setSelected(!isSelected);
                notifyDataSetChanged();
            }
        });

        return convertView;
    }

    class ViewHolder
    {
        TextView img ;
        TextView cap;
        TextView time ;
        TextView text1 ;
        TextView text2 ;
        ImageView star;
    }
}
