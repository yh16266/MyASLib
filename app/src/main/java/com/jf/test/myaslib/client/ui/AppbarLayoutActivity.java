package com.jf.test.myaslib.client.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jf.test.myaslib.R;

import java.util.ArrayList;
import java.util.List;

public class AppbarLayoutActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AppbarLayoutAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MD AppbarLayoutActivity 测试");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        initView();
        initData();
    }

    private void initView(){
        this.recyclerView = (RecyclerView) findViewById(R.id.rvToDoList);
    }

    private void initData(){
        List<String> mData = new ArrayList<>();
        for (int i=0;i<20;i++){
            mData.add("test"+i);
        }
        mAdapter = new AppbarLayoutAdapter(this,mData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }
}
