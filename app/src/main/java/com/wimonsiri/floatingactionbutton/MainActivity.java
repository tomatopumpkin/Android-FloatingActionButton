package com.wimonsiri.floatingactionbutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        fab = (FloatingActionButton) findViewById(R.id.floatingActionButton);
        fab.setOnClickListener( this);
    }
    @Override
    public void onClick(View v) {
        textView.setText("Floating Action Button Mail Clicked !");
        Intent intent = new Intent( this, RegistorActivity.class);
        startActivity( intent );
    }
}