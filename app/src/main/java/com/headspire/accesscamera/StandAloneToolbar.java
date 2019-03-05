package com.headspire.accesscamera;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class StandAloneToolbar extends AppCompatActivity implements Toolbar.OnMenuItemClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        Toolbar toolbar=findViewById(R.id.mytoolbar);
        toolbar.setTitle(R.string.stand_alone_toolbar);
        toolbar.setSubtitle(R.string.subtitle);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //this show the shadow effect at the bottom of toolbar
            toolbar.setElevation(30f);
        }

        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(this);
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        Toast.makeText(this,menuItem.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }
}
