package fr.gobelins.edu.vandevelde.yoan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import fr.gobelins.edu.vandevelde.yoan.databinding.ActivityHomeBinding;
import fr.gobelins.edu.vandevelde.yoan.databinding.ActivitySecondBinding;

import static java.lang.Integer.parseInt;


public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.calculateButton.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(), SecondActivity.class);
            startActivity(intent);
        });
        binding.toastButton.setOnClickListener(v -> {
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
        });
        binding.mailButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String[] addresses = {"yoan.vandevelde@edu.gobelins.fr"};
            intent.putExtra(Intent.EXTRA_EMAIL, addresses);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Sujet");
            intent.putExtra(Intent.EXTRA_TEXT, "Salut");

            startActivity(Intent.createChooser(intent, "Send Email"));
        });


    }

}
