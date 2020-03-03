package com.example.angelruiz.disma;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Menus extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        }

    public void ir (View v){
        switch (v.getId()){
         case R.id.bt01:
        Intent ir1 = new  Intent(this, discal.class);
          startActivity(ir1);
            break;

            case R.id.bt02:
                Intent ir2 = new Intent(this, examen.class);
                startActivity(ir2);
                break;

            case R.id.bt03:
                Intent ir3 = new Intent(this, deta.class);
                startActivity(ir3);
                break;

            case R.id.bt1:
                Intent ir4 = new Intent(this, n1.class);
                startActivity(ir4);
                break;

            case R.id.bt2:
                Intent ir5 = new Intent(this, pn1.class);
                startActivity(ir5);
                break;

            case R.id.bt3:
                Intent ir6 = new Intent(this, n2.class);
                startActivity(ir6);
                break;

            case R.id.bt4:
                Intent ir7 = new Intent(this, pn30.class);
                startActivity(ir7);
                break;
        }
    }

    //Intent  menu = new Intent(this, screen.class);
    //startActivity(menu);
                //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                //contador ++;



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent ir8 = new Intent(this, Registro1.class);
            startActivity(ir8);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        if (contador == 0) {
            Intent menu = new Intent(Intent.ACTION_MAIN);
            menu.addCategory(Intent.CATEGORY_HOME);
            menu.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(menu);
            //super.onBackPressed();
            //moveTaskToBack(true);
            //onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment miFragment=null;
        boolean fragmentSeleccionado=false;

        //if (id == R.id.nav_camera) {
            miFragment=new fRegistro1();
            fragmentSeleccionado=true;
        //}

        if (fragmentSeleccionado==true) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, miFragment).commit();
        }
        /*
       else if (id == R.id.examen) {
            //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment2()).commit();
             Intent ver1 = new Intent(this, examen.class);
             startActivity(ver1);
       } else if (id == R.id.det) {
            //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment3()).commit();
             Intent ver2 = new Intent(this, deta.class);
             startActivity(ver2);
        } else if (id == R.id.n1) {
            //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment4()).commit();
             Intent ver3 = new Intent(this, n1.class);
            startActivity(ver3);
        } else if (id == R.id.n2) {
            //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment5()).commit();
             Intent ver4 = new Intent(this, n2.class);
            startActivity(ver4);
        } else if(id == R.id.n3){
            //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment6()).commit();
             Intent ver5 = new Intent(this, n3.class);
             startActivity(ver5);
        }else if(id == R.id.pn1) {
            //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment6()).commit();
            Intent ver6 = new Intent(this, pn1.class);
            startActivity(ver6);
        }else if(id == R.id.pn20) {
             //fragmentManager.beginTransaction().replace(R.id.contenedor, new Fragment6()).commit();
             Intent ver7 = new Intent(this, pn20.class);
            startActivity(ver7);

        }else if(id == R.id.pn30){
            Intent ver8 = new Intent(this, pn30.class);
            startActivity(ver8);
        }
*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
