package com.example.recycle_view_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerViewUser;
    private RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                                BuildConfig.FLAVOR + " " + BuildConfig.ENDPOINT,
                                     Toast.LENGTH_LONG);
        toast.setMargin(50,50);
        toast.show();
        recyclerViewUser =(RecyclerView)findViewById(R.id.recyclerViewUser);
        recyclerViewUser.setHasFixedSize(true);
        recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new UserAdapter(getData());
        recyclerViewUser.setAdapter(mAdapter);
    }

    public List<UserModel> getData(){
        List<UserModel> userModels = new ArrayList<>();

        userModels.add(new UserModel("Gustavo"));
        userModels.add(new UserModel("Daniel"));
        userModels.add(new UserModel("Cecilia"));
        userModels.add(new UserModel("Diego"));
        userModels.add(new UserModel("Carlos"));
        userModels.add(new UserModel("Juan"));

        for (int i = 1; i < 15; i++){
            userModels.add(new UserModel("Name " + i));
        }

        return userModels;
    }
}
