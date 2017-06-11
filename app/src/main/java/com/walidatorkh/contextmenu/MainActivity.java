package com.walidatorkh.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private LinearLayout linearLayoutMain;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        linearLayoutMain = (LinearLayout)findViewById(R.id.LinearLayoutMain);
//        registerForContextMenu(linearLayoutMain);
        imageView = (ImageView) findViewById(R.id.imageViewChange);
        registerForContextMenu(imageView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuItemBunny:
                Toast.makeText(this, "Bunny", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.bunny);
                return true;
            case R.id.menuItemPuppy:
                Toast.makeText(this, "Puppy", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.puppy);
                return true;
            case R.id.menuItemKitten:
                Toast.makeText(this, "Kitten", Toast.LENGTH_SHORT).show();
                imageView.setImageResource(R.drawable.kitten);
                return true;
            case R.id.menuItemDucking:
                Toast.makeText(this, "Ducking", Toast.LENGTH_SHORT).show();

                return true;
        }
        return false;
    }
}
