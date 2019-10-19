package com.example.countingclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView  viewone,viewtwo,viewthree,viewfour;
    Button btnclick;
    int clickcount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnclick=findViewById(R.id.clickhere);
        viewone= findViewById(R.id.imageViewOne);
        viewtwo= findViewById(R.id.imageViewTwo);
        viewthree= findViewById(R.id.imageViewThree);
        viewfour= findViewById(R.id.imageViewFour);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickcount++;
                if (clickcount == 5)
                {
                    clickcount=1;

                }


                if(clickcount==1)
                {
                    viewone.setImageResource(R.drawable.bird);
                    viewtwo.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewfour.setImageDrawable(null);

                }
                else if(clickcount==2)
                {
                    viewtwo.setImageResource(R.drawable.snake);
                    viewone.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewfour.setImageDrawable(null);
                }
                else if(clickcount==3)
                {
                    viewthree.setImageResource(R.drawable.tiger);
                    viewtwo.setImageDrawable(null);
                    viewone.setImageDrawable(null);
                    viewfour.setImageDrawable(null);
                }
                else if(clickcount==4)
                {
                    viewfour.setImageResource(R.drawable.dog);
                    viewtwo.setImageDrawable(null);
                    viewthree.setImageDrawable(null);
                    viewone.setImageDrawable(null);
                }

            }
        });
    }
}
