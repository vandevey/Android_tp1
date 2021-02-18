package fr.gobelins.edu.vandevelde.yoan;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import fr.gobelins.edu.vandevelde.yoan.databinding.ActivitySecondBinding;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    private int firstValue;
    private int secondValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.calculate.setOnClickListener(v -> {
            firstValue = parseInt(String.valueOf(binding.editTextNumber.getText()));

            secondValue = parseInt(String.valueOf(binding.editTextNumber2.getText()));

            binding.result.setText(String.valueOf(firstValue + secondValue));
        });
    }

}
