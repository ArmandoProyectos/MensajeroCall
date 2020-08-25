package com.example.proyecton3;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.proyecton3.Fragments.ContactosFragment;
import com.example.proyecton3.Fragments.LlamadasFragment;
import com.example.proyecton3.Fragments.MensajesFragment;
import com.example.proyecton3.Fragments.PerfilFragment;
import com.google.android.material.tabs.TabLayout;
import com.example.proyecton3.Adapters.PagerAdapter;


public class TabActivity extends AppCompatActivity {
    ContactosFragment contactosFragment;
    LlamadasFragment llamadasFragment;
    MensajesFragment mensajesFragment;
    PerfilFragment perfilFragment;

    @SuppressLint("WrongViewCast")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Toolbar myToolbar = ( Toolbar ) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        TabLayout tabLayout = ( TabLayout ) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Contactos"));
        tabLayout.addTab(tabLayout.newTab().setText("Llamadas"));
        tabLayout.addTab(tabLayout.newTab().setText("Mensajes"));
        tabLayout.addTab(tabLayout.newTab().setText("Perfil"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = ( ViewPager ) findViewById(R.id.pager);

        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        /*contactosFragment = new ContactosFragment();
        llamadasFragment = new LlamadasFragment();
        mensajesFragment = new MensajesFragment();
        perfilFragment = new PerfilFragment();*/

        perfilFragment = new PerfilFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.pager, perfilFragment).commit();

    }

    public void onClick(View view){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.botonCamara:
                    Intent intentCamera = new Intent("android.media.action.IMAGE_CAPTURE");
                    startActivity(intentCamera);
                break;
            case R.id.botonMensaje:
                    transaction.replace(R.id.pager, mensajesFragment);
                break;
            case R.id.botonLlamar:
                    Intent intentLlamar = new Intent(Intent.ACTION_DIAL);
                    startActivity(intentLlamar);
                break;
            case R.id.llamadasBotonLlamar1:
                Intent intentLlamar2 = new Intent(Intent.ACTION_DIAL);
                startActivity(intentLlamar2);
                break;
            case R.id.llamadasBotonLlamar2:
                Intent intentLlamar3 = new Intent(Intent.ACTION_DIAL);
                startActivity(intentLlamar3);
                break;
            case R.id.llamadasBotonLlamar3:
                Intent intentLlamar4 = new Intent(Intent.ACTION_DIAL);
                startActivity(intentLlamar4);
                break;
            case R.id.llamadasBotonLlamar4:
                Intent intentLlamar5 = new Intent(Intent.ACTION_DIAL);
                startActivity(intentLlamar5);
                break;
            case R.id.mensajesBotonCamara:
                Intent intentCamera2 = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intentCamera2);
                break;
        }

        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
