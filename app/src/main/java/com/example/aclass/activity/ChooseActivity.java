package com.example.aclass.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aclass.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChooseActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        initData();
        initView();







    }

    private void initView() {
        listView = findViewById(R.id.list_item);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    private List<String> data;
    private void initData() {
        data = new ArrayList<>();
        data.add("Android应用程序开发");
        data.add("移动应用程序测试");
        data.add("高等数学");
        data.add("高职英语");
        data.add("Java程序设计语言");
        data.add("Android游戏开发");
        data.add("心理健康");
        data.add("体育");


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String text = (String) parent.getItemAtPosition(position);
        if ("Android应用程序开发".equals(text)) {
            Intent intent = new Intent(ChooseActivity.this, TextActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("text", "《Android应用开发》为Android应用开发的入门课程，以深入浅出、循序渐进的方式讲述Android开发，并且结合实际例子讲解各个知识点。主要内容包括：机器部署；Java和XML简介；使用Eclipse的高效开发；应用框架概览；UI和图形设计；添加交互；内容提供程序、Intent、IntentFilter；用Java和XML基础知识构建高级应用等。");
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}
