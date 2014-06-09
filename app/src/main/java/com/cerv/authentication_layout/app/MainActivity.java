package com.cerv.authentication_layout.app;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

// Login Activity
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit1 = (EditText) findViewById(R.id.usuario);
        EditText edit2 = (EditText) findViewById(R.id.pass);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        // setup parameters of edittext 1
        RelativeLayout.LayoutParams rl1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,                                                                               RelativeLayout.LayoutParams.WRAP_CONTENT);
        rl1.leftMargin = (int)(width*0.25);
        rl1.topMargin = (int)(height*0.4);
        rl1.width = (int)(width*0.6);
        rl1.height = (int)(height/18);
        edit1.setBackgroundResource(R.drawable.fieldshape);
        edit1.setHint("Usuario");
        edit1.setLayoutParams(rl1);

        // setup parameters of edittext 1
        RelativeLayout.LayoutParams rl2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        rl2.leftMargin= (int)(width*0.25);
        rl2.topMargin = (int)(height*0.48);
        rl2.width = (int)(width*0.6);
        rl2.height = (int)(height/18);
        edit2.setLayoutParams(rl2);
        edit2.setHint("Contraseña");
        edit2.setBackgroundResource(R.drawable.fieldshape);

        Button enter = (Button) findViewById(R.id.enter);

        // setup parameters of button enter
        RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        rel_btn.topMargin = (int)(height/1.5);
        rel_btn.addRule(RelativeLayout.CENTER_HORIZONTAL);
        rel_btn.width = (int)(width*0.45);
        enter.setBackgroundResource(R.drawable.buttonshape);
        enter.setText("Ingresar");
        enter.setLayoutParams(rel_btn);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
