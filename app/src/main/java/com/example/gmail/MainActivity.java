package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemModel>  items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add(new ItemModel("FACEBOOK", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "9:00 PM"));
        items.add(new ItemModel("CTT", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "6:00 PM"));
        items.add(new ItemModel("YOUTUBE", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "9:00 AM"));
        items.add(new ItemModel("24H", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "9:50 PM"));
        items.add(new ItemModel("AONE", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "19:40 PM"));
        items.add(new ItemModel("CODEFORCES", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "11:20 PM"));
        items.add(new ItemModel("PDF", "we are going to go out with my uncle, oke oke oke", "Please contact me again", "7:00 PM"));
        items.add(new ItemModel("WORD", "we are going to go out with my uncle,oke oke oke", "Please contact me again", "8:00 PM"));
        items.add(new ItemModel("EXCEL", "we are going to go out with my uncle,oke oke oke", "Please contact me again", "5:00 PM"));

        ItemAdapter adapter = new ItemAdapter(items);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

//        LinearLayout layoutList= findViewById(R.id.linear_layout);
//        for (int i=0;i<items.size();i++)
//        {
//            View itemView = getLayoutInflater().inflate(R.layout.layout_item, null);
//            TextView img =itemView.findViewById(R.id.img);
//            TextView cap = itemView.findViewById(R.id.caption);
//            TextView time = itemView.findViewById(R.id.time);
//            TextView text1 = itemView.findViewById(R.id.content1);
//            TextView text2 = itemView.findViewById(R.id.content2);
//            ImageView star = itemView.findViewById(R.id.star);
//
//            img.setText(items.get(i).getThumbId());
//            cap.setText(items.get(i).getCapId());
//            time.setText(items.get(i).getTimeId());
//            text1.setText(items.get(i).getText1Id());
//            text2.setText(items.get(i).getText2Id());
//            star.setImageResource(items.get(i).getStarId());
//
//            layoutList.addView(itemView);
//        }

    }
}
