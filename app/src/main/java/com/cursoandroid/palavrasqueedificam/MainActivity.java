package com.cursoandroid.palavrasqueedificam;

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
                "Família abençoada é igual à igreja abençoada, deixemos todo embaraço desta vida e vivamos para Deus.",
                "Quando somos novos na fé precisamos de ajuda, mas se somos experientes devemos contribuir para a Obra de Deus.",
                "Plantados na casa do Senhor, florescerão nos átrios do nosso Deus.",
                "Quanto mais o Homem avança no campo científico, mais ele encolhe emocionalmente.",
                "Quando temos a certeza de algo, de alguma forma nos acomodamos e isso poderá limitar seu crescimento. Incomode-se.",
                "Um dos desafios de se compreender o mundo à sua volta é permanecer fiel à Deus. Não perca a sua Fé!",
                "O que não se busca da maneira correta não se encontra.",
                "As pessoas sempre seguirão aqueles que as motivam e se afastarão daqueles que as desanimam.",
                "Se você tem computador em casa, por que não se interligar na Internet para ter acesso a arquivos de estudo bíblico? Você não faz isso com jogos e outros aplicativos?",
                "Quando a família cultua a Deus ela se capacita para enfrentar suas dificuldades.",
                "Todas as coisas me são lícitas, mas nem todas as coisas me convêm. Todas as coisas me são lícitas, mas eu não me deixarei dominar por nenhuma.",
                "Bem-aventurado o homem que põe no Senhor a sua confiança e não pende para os arrogantes, nem para os afeiçoados à mentira.",
                "Quando o sábio usa a violência, ele se torna tolo. Quem aceita suborno estraga o seu caráter. ",
                "O fim de uma coisa vale mais do que o seu começo. A pessoa paciente é melhor do que a orgulhosa.",
                "Controle sempre o seu gênio; é tolice alimentar o ódio.",
                "Se você deixa o machado perder o corte e não o afia, terá que trabalhar muito mais. É mais inteligente planejar antes de agir."
                };
        String[] autor = {
                "Fonte: www.estudosgospel.com.br",
                "Fabiano Catrinck",
                "Salmos 92:13",
                "Hernandes Dias Lopes",
                "Pr. Edson J. Santos",
                "Fabiano Catrinck",
                "Autor desconhecido",
                "Pr. Edson J. Santos",
                "Israel Belo de Azevedo",
                "Retirado de: O Poder da União das Famílias",
                "1 Coríntios 6:12",
                "Salmos 40:4",
                "Eclesiastes 7:7",
                "Eclesiastes 7:8",
                "Eclesiastes 7:9",
                "Eclesiastes 10:10"
        };

        int numero = new Random().nextInt(16);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
        TextView nomeAutor = findViewById(R.id.textAutor);
        nomeAutor.setText(autor[numero]);
    }
}