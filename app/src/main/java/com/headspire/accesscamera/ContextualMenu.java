package com.headspire.accesscamera;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextualMenu extends AppCompatActivity implements View.OnClickListener {
    private Button clickMe;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contextual_view);
        Toolbar toolbar=findViewById(R.id.context_tool_bar);
        toolbar.setTitle("Contextual");
        toolbar.setSubtitle("following are the items..");
        clickMe=findViewById(R.id.clickToView);
        clickMe.setOnClickListener(this);
        toolbar.inflateMenu(R.menu.menu_main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.save:
                        Toast.makeText(getApplicationContext(),"saved",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.update:
                        Toast.makeText(getApplicationContext(),"updated",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.open:
                        Toast.makeText(getApplicationContext(),"view content",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.setting:
                        Toast.makeText(getApplicationContext(),"settings",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.delete:
                        Toast.makeText(getApplicationContext(),"delete",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.clickToView:
                ActionMode actionMode=ContextualMenu.this.startSupportActionMode(new ContextualCallBack());
                break;
        }
    }
     class ContextualCallBack implements ActionMode.Callback{

        //ActionMode is initial
        @Override
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.contextual_menu,menu);
            return true;
        }

        //ActionMode created and any time could be invalidates
        @Override
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            actionMode.setTitle("button clicked...");
            actionMode.setSubtitle("this the sub title for sub menu");
            return false;
        }

        //contextual item is clicked.
        @Override
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {

            switch (menuItem.getItemId())
            {
                case R.id.buttonsave:
                    Toast.makeText(getApplicationContext(),"saved",Toast.LENGTH_SHORT).show();
                    break;
            }
            return false;
        }

        //ActionMode is closed.
        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
        }
    }
}
