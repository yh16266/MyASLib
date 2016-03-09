package com.jf.test.myaslib.client.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.jf.test.myaslib.R;

public class ToolsbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolsbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.setTitle("MD toolbar 测试");
        toolbar.setSubtitle("副标题");
        //toolbar.setLogo(R.drawable.ic_menu_slideshow);
        //toolbar.setNavigationIcon(android.R.drawable.ic_menu_crop);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onBackPressed();
//            }
//        });
        //toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
        //    @Override
        //    public boolean onMenuItemClick(MenuItem item) {
        //        return true;
        //    }
        //});
        //toolbar.inflateMenu(R.menu.activity_toolsbar_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_toolsbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //if(item.getItemId() == android.R.id.home){
        //   onBackPressed();
        //}
        return true;
        //return super.onOptionsItemSelected(item);
    }
}
