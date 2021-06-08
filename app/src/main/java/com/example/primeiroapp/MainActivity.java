package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Saber encontrar a alegria na alegria dos outros, é o segredo da felicidade.",
                "A alegria de fazer o bem é a única felicidade verdadeira.",
                "Ser feliz sem motivo é a mais autêntica forma de felicidade.",
                "A alegria não está nas coisas, está em nós",
                "Não existe um caminho para a felicidade. A felicidade é o caminho.",
                "A alegria evita mil males e prolonga a vida.",
                "A amizade duplica as alegrias e divide as tristezas.",
                "Aquele que nunca viu a tristeza, nunca reconhecerá a alegria.",
                "A amizade é um amor que nunca morre.",
                "Sofremos muito com o pouco que nos falta e gozamos pouco o muito que temos.",
                "A felicidade não é um luxo: está em nós como nós próprios.",
                "Que não há caminho para a felicidade, a felicidade é o caminho",
                "A verdadeira felicidade só existe quando é compartilhada.",
                "A jornada é o que nos traz a felicidade e não o destino",
                "A ação nem sempre traz felicidade, mas não há felicidade sem ação."

        };

        int novaFrase = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.textResultado);



        texto.setText( frases[novaFrase] );

    }

}