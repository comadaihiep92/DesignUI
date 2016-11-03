package dev.and.stork.designui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkCream, checkSuger;
    private Button buttonPay, buttonEx2, buttonEx3, buttonEx4, buttonEx5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

        buttonEx2=(Button)findViewById(R.id.btnEx2);
        buttonEx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEx2= new Intent(MainActivity.this, Ex2.class);
                startActivity(intentEx2);
            }
        });
        buttonEx3=(Button)findViewById(R.id.btnEx3);
        buttonEx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEx3 = new Intent(MainActivity.this, Ex3.class);
                startActivity(intentEx3);
            }
        });
        buttonEx4=(Button)findViewById(R.id.btnEx4);
        buttonEx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEx4 = new Intent(MainActivity.this, Ex4.class);
                startActivity(intentEx4);
            }
        });
        buttonEx5=(Button)findViewById(R.id.btnEx5);
        buttonEx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentEx5 = new Intent(MainActivity.this, Ex5.class);
                startActivity(intentEx5);
            }
        });
    }
    public void addListenerOnButton(){
        checkCream =(CheckBox)findViewById(R.id.cbCream);
        checkSuger =(CheckBox)findViewById(R.id.cbSuger);
        buttonPay= (Button)findViewById(R.id.btnPay);
        buttonPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkCream.isChecked()&&checkSuger.isChecked()){
                    Toast.makeText(MainActivity.this, "Coffe & Cream & Suger", Toast.LENGTH_SHORT).show();
                }else if(checkSuger.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Coffe & Suger", Toast.LENGTH_SHORT).show();
                }else if(checkCream.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Coffe & Cream", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "No Drink Coffe", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
