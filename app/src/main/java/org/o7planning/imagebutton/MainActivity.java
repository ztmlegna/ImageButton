package org.o7planning.imagebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Australia(View view){
        Toast.makeText(this, "Australia", Toast.LENGTH_SHORT).show();
    }
    public void Brasil(View view){
        Toast.makeText(this, "Brasil", Toast.LENGTH_SHORT).show();
    }

    public void Canada(View view){
        Toast.makeText(this, "Canada", Toast.LENGTH_SHORT).show();
    }
    public void Sudafrica(View view){
        Toast.makeText(this, "Sudáfrica", Toast.LENGTH_SHORT).show();
    }
    public void Italia(View view){
        Toast.makeText(this, "Italia", Toast.LENGTH_SHORT).show();
    }
}