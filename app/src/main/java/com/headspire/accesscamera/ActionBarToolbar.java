package com.headspire.accesscamera;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

public class ActionBarToolbar extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        toolbar=findViewById(R.id.action_tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("-----Action BAR----");
        toolbar.setSubtitle("action bar sub title..");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.delete:
                Toast.makeText(getApplicationContext(),"delete clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.save:
                Toast.makeText(getApplicationContext(),"save clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:
                Toast.makeText(getApplicationContext(),"settingss",Toast.LENGTH_SHORT).show();
                break;
            case R.id.open:
                Toast.makeText(getApplicationContext(),"open content",Toast.LENGTH_SHORT).show();
                break;
            case R.id.update:
                Toast.makeText(getApplicationContext(),"update",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
