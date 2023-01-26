package uz.hakimkhon.intentnew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import uz.hakimkhon.intentnew.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] title = {
            "Jentra1", "Malibu1", "Cobalt1"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
    public void cardView(View view){
        Toast.makeText(this, "containerJentra bosildi", Toast.LENGTH_SHORT).show();
    }

}



//
//        binding.containerJentra.setOnClickListener(v ->{
//            Toast.makeText(this, "containerJentra bosildi", Toast.LENGTH_SHORT).show();
//        });
//        binding.imgJentra.setOnClickListener(v ->{
//            Toast.makeText(this, "imgJentra bosildi", Toast.LENGTH_SHORT).show();
//        });
//        binding.textviewTitleJentra.setOnClickListener(v ->{
//            Toast.makeText(this, "textviewTitleJentra bosildi", Toast.LENGTH_SHORT).show();
//        });
//        binding.textviewDiscreptionJentra.setOnClickListener(v ->{
//            Toast.makeText(this, "textviewDiscreptionJentra bosildi", Toast.LENGTH_SHORT).show();
//        });