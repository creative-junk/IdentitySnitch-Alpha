package com.crysoft.me.identitysnitch;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setIcon(R.drawable.ic_icon);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


    }
    public void goToProfessional(View view){
        Intent intent = new Intent(MainActivity.this,ProfessionalActivity.class);
        startActivity(intent);
    }
    public void goToCertificate(View view){
        Intent intent = new Intent(MainActivity.this,CertificateActivity.class);
        startActivity(intent);
    }
    public void goToProduct(View view){
        Intent intent = new Intent(MainActivity.this,ProductActivity.class);
        startActivity(intent);
    }
    public void goToBusiness(View view){
        Intent intent = new Intent(MainActivity.this,BusinessActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }
}
