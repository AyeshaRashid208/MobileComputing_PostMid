package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycle and Crad view");
        rcv = (RecyclerView)findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
         adapter = new myadapter(dataqueue());
         rcv.setAdapter(adapter);
    }
    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder = new ArrayList<>();
        Model obj1 = new Model();
        obj1.setHeader("C++ ");
        obj1.setDesc("Desktop C++ Programming");
        obj1.setImgname(R.drawable.img);

        Model obj2 = new Model();
        obj2.setHeader("Java");
        obj2.setDesc("Desktop Java Programming");
        obj2.setImgname(R.drawable.img_1);

        Model obj3 = new Model();
        obj3.setHeader("Python ");
        obj3.setDesc("Desktop Python Programming");
        obj3.setImgname(R.drawable.img_2);

        Model obj4 = new Model();
        obj4.setHeader(".NET ");
        obj4.setDesc("Desktop .Net Programming");
        obj4.setImgname(R.drawable.img_3);

        Model obj5 = new Model();
        obj5.setHeader("Javascript");
        obj5.setDesc("Javascript Programming");
        obj5.setImgname(R.drawable.img_4);

        Model obj6 = new Model();
        obj6.setHeader("Angular");
        obj6.setDesc("Desktop Angular Programming");
        obj6.setImgname(R.drawable.img_5);

        Model obj7 = new Model();
        obj7.setHeader("React");
        obj7.setDesc("Desktop React Programming");
        obj7.setImgname(R.drawable.img_6);

        Model obj8 = new Model();
        obj8.setHeader("Java");
        obj8.setDesc("Desktop Java Programming");
        obj8.setImgname(R.drawable.img_1);

        Model obj9 = new Model();
        obj9.setHeader("Python Programming");
        obj9.setDesc("Desktop Python Programming");
        obj9.setImgname(R.drawable.img_2);
        holder.add(obj1);
        holder.add(obj2);
        holder.add(obj3);
        holder.add(obj4);
        holder.add(obj5);
        holder.add(obj6);
        holder.add(obj7);
        holder.add(obj8);
        holder.add(obj9);

        return holder;
    }
}