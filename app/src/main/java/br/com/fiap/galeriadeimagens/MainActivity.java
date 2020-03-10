package br.com.fiap.galeriadeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Integer[] images = new Integer[]{
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6,
    };

    ImageView imagem;
    Integer indice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagem = findViewById(R.id.image);
    }

    public void imagemAnterior(View view) {
        if(indice == 0){
            indice = 6;
        } else {
            indice--;
        }
        imagem.setImageResource(images[indice]);
    }

    public void proximaImagem(View view) {
        if(indice == 6){
            indice = 0;
        } else {
            indice++;
        }
        imagem.setImageResource(images[indice]);
    }
}

