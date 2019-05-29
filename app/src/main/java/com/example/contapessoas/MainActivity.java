package com.example.contapessoas;

import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numeroHomem = 0;
    int numeroMulher = 0;
    int numeroPessoa = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("meuLog","A Entrada Triunfal");




        final TextView campoTexto= (TextView) findViewById(R.id.textoPessoa);

        final Button botaoHomem = (Button) findViewById(R.id.botaoHomem);
        final Button botaoMulher = (Button) findViewById(R.id.botaoMulher);
        final Button botaoReset = (Button) findViewById(R.id.botaoReset);

        botaoHomem.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroHomem++;
                numeroPessoa++;
                String mensagem = Integer.toString(numeroPessoa);
                campoTexto.setText("Total: "+mensagem+" pessoas");
                botaoHomem.setText(Integer.toString(numeroHomem));
            }
        });


        botaoMulher.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroMulher++;
                numeroPessoa++;
                String mensagem = Integer.toString(numeroPessoa);
                campoTexto.setText("Total: "+mensagem+" pessoas");
                botaoMulher.setText(Integer.toString(numeroMulher));
            }
        });


        botaoReset.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                numeroHomem = 0;
                numeroMulher = 0;
                numeroPessoa = 0;
                String mensagem = Integer.toString(numeroPessoa);
                campoTexto.setText("Total: "+mensagem+" pessoas");
                botaoMulher.setText(Integer.toString(numeroMulher));
                botaoHomem.setText(Integer.toString(numeroHomem));

            }
        });


    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("meulog","TUDO COMEÇA AGORA!!!!!!!!!!!!!!!!!!!!!");
    }


    @Override
    public void onPause(){
        super.onPause();
        Log.d("meulog","PAROU!!!!!!!!!!!!!!!!!!!!!");

    }


    @Override
    public void onResume(){
        super.onResume();
        Log.d("meulog","RETORNOU!!!!!!!!!!!!!!!!!!!!!");

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        Log.d("meulog","Evento tocou na cena!!!!!!!!!!!!!!!!!!!");
        return super.onTouchEvent(event);
    }
    @Override
    protected void onRestart(){
        super.onRestart();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }



}
