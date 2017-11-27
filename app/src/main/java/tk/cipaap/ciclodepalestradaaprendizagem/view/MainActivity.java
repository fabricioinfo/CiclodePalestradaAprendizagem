package tk.cipaap.ciclodepalestradaaprendizagem.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;

import tk.cipaap.ciclodepalestradaaprendizagem.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout sidebar;
    private ActionBarDrawerToggle togglebar;
    private Menu menu;
    private NavigationView nav_sidebar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sidebar = (DrawerLayout) findViewById(R.id.drawer_layout);
        togglebar = new ActionBarDrawerToggle(this,sidebar,R.string.open,R.string.close);
        menu = (Menu) findViewById(R.id.navigation_menu);
        // menu.add("Teste");
        sidebar.addDrawerListener(togglebar);
        togglebar.syncState();
        nav_sidebar = (NavigationView) findViewById(R.id.nav_sidebar);
        nav_sidebar.setNavigationItemSelectedListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(togglebar.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int selected = item.getItemId();

        if(selected == R.id.nav_login){
            Intent chamar = new Intent(getBaseContext(), CadastroActivity.class);
            startActivity(chamar);
        }
        return true;
    }
}
