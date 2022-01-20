package com.example.rezan.landmarkapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.rezan.landmarkapp.databinding.ActivityDetailsBinding;
import com.example.rezan.landmarkapp.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<Landmark>();

        //Data
        Landmark malabadi = new Landmark("Malabadi Bridge","Turkey",R.drawable.malabadi);
        Landmark tacmahal = new Landmark("Tac Mahal","India",R.drawable.tacmahal);
        Landmark times = new Landmark("Times Square","UK",R.drawable.times);

        landmarkArrayList.add(malabadi);
        landmarkArrayList.add(tacmahal);
        landmarkArrayList.add(times);


        LandmarkAdapter landmarkAdapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        //Adapter
         //ListView
        //Mapping
        ArrayList<String> names = new ArrayList<String>();
        int n = landmarkArrayList.size();

        for(int i = 0; i<n; i++) {
            names.add(landmarkArrayList.get(i).name);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                names
        );
        binding.listView.setAdapter(arrayAdapter);

        //Tıklanma eventi

            binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    //Toast.makeText(MainActivity.this, landmarkArrayList.get(i).name ,Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this, ActivityDetails.class);
                    intent.putExtra("landmark",landmarkArrayList.get(i));
                    startActivity(intent);
                }
            });

    */



    }
}