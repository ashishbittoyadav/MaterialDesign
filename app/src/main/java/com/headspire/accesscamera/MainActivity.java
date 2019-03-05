package com.headspire.accesscamera;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * @version 1.0  05-03-2019
 * @author Ashish yadav
 * @objective Material Design (Contextual menu, Action tool bar, Stand Alone Tool bar)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO for the backward compatibility.
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {

        }
        else
        {

        }
    }

    public void showStandAloneToolBar(View view) {
        Intent intent=new Intent(this,StandAloneToolbar.class);
        startActivity(intent);
    }

    public void showToolBarAsAction(View view) {
        Intent intent=new Intent(this, ActionBarToolbar.class);
        startActivity(intent);
    }

    public void contextualMenu(View view) {
        Intent intent=new Intent(this,ContextualMenu.class);
        startActivity(intent);
    }
}
