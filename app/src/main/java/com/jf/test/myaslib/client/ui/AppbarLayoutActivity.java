package com.jf.test.myaslib.client.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.jf.test.myaslib.R;

public class AppbarLayoutActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appbar_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("MD AppbarLayoutActivity 测试");
        setSupportActionBar(toolbar);

    }

    private void initView(){
        this.recyclerView = (RecyclerView) findViewById(R.id.rvToDoList);
    }
}
