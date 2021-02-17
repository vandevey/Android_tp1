package fr.gobelins.edu.vandevelde.yoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast;
    private Button buttonInc;
    private TextView textViewCount;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    /**
     * Methods that allow to retrieve the instance of views in the layout
     */
    private void initViews() {
        buttonToast = findViewById(R.id.toast);
        buttonInc = findViewById(R.id.increment);
        textViewCount = findViewById(R.id.textCounter);

        // Intercept click on the compute button
        buttonInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //incrémenter la valeur du compteur puis mettre à jour le text
                counter++;
                textViewCount.setText(String.valueOf(counter));
            }
        });

        // Show toast
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Pour afficher un toast
                Toast.makeText(MainActivity.this, "Total click : " + counter, Toast.LENGTH_SHORT).show();
            }
        });
    }


}