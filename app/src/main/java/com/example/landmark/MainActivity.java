package com.example.landmark;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.landmark.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Landmark pisa = new Landmark("PISA", "ITALY", R.drawable.pisa);
        Landmark eiffel = new Landmark("EIFFEL TOWER", "FRANCE", R.drawable.eiffel);
        Landmark colosseum = new Landmark("COLOSSEUM", "ITALY", R.drawable.colosseum);
        Landmark big_ben = new Landmark("BIG BEN", "ENGLAND", R.drawable.big_ben_tower);
        Landmark london_bridge = new Landmark("LONDON BRIDGE", "ENGLAND", R.drawable.london_bridge);
        Landmark taj_mahal = new Landmark("TAJ MAHAL", "INDIA", R.drawable.taj_mahal);
        Landmark peri_bacalari = new Landmark("PERI BACALARI", "TURKEY", R.drawable.peri_bacalari);
        Landmark chandeokgung = new Landmark("CHANDEOKGUNG", "KOREA", R.drawable.changdeokgung);
        Landmark la_sagra_da_familia = new Landmark("LA SAGRA DA\n\t\tFAMILIA", "SPAIN", R.drawable.la_sagrada_familia);
        Landmark louvre_museum = new Landmark("LOUVRE MUSEUM", "FRANCE", R.drawable.louvre_museum);
        Landmark aya_sofia = new Landmark("AYA SOFYA", "TURKEY", R.drawable.ayasofia);
        Landmark cinque_terre = new Landmark("CINQUE TERRE", "ITALY", R.drawable.cinque_terre);

        landmarkArrayList = new ArrayList<>();
        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(big_ben);
        landmarkArrayList.add(london_bridge);
        landmarkArrayList.add(taj_mahal);
        landmarkArrayList.add(peri_bacalari);
        landmarkArrayList.add(chandeokgung);
        landmarkArrayList.add(la_sagra_da_familia);
        landmarkArrayList.add(louvre_museum);
        landmarkArrayList.add(aya_sofia);
        landmarkArrayList.add(cinque_terre);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter adapter = new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(adapter);


    }
}