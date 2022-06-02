package tcc.appmotociclistas;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;

import tcc.appmotociclistas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ListView sessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        sessions = (ListView)findViewById(R.id.sessionsList);

        ArrayList<String> sessionsList = new ArrayList<>();

        sessionsList.add("Session_1");
        sessionsList.add("Session_2");
        sessionsList.add("Session_3");
        sessionsList.add("Session_4");
        sessionsList.add("Session_1");
        sessionsList.add("Session_2");
        sessionsList.add("Session_3");
        sessionsList.add("Session_4");
        sessionsList.add("Session_1");
        sessionsList.add("Session_2");
        sessionsList.add("Session_3");
        sessionsList.add("Session_4");
        sessionsList.add("Session_1");
        sessionsList.add("Session_2");
        sessionsList.add("Session_3");
        sessionsList.add("Session_4");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.list_item,sessionsList);
        sessions.setAdapter(arrayAdapter);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}