package com.example.dell.egame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Cult=(Button)findViewById(R.id.button);
        Button Foc=(Button)findViewById(R.id.button2);
        TextView hel=(TextView) findViewById(R.id.textView);

        Button qui=(Button)findViewById(R.id.button3);

        qui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizz=new Intent(MainActivity.this, quiz.class);
                startActivity(quizz);

            }
        });

        Cult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cultr=new Intent(MainActivity.this, QuizActivity.class);
                startActivity(Cultr);


            }
        });





    }

    public void help(View view) {
        Intent H_elp=new Intent(MainActivity.this, Help.class);
        startActivity(H_elp);
    }

    public void Focus_cli(View view) {
        Intent focu=new Intent(MainActivity.this,Focus.class);
        startActivity(focu);
    }
}
