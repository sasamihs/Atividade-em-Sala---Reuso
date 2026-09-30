/**
 * Samih_Jogo - jogo da forca
 * 
*/

import java.util.ArrayList;


class Samih_Jogo {

    public static void main(String[] args){

        Personagem player_1 = new Personagem(nome:"Sasa");
        player_1.set_tentativas = 7;

        
        Palavras adivinhar_palavra = new Palavra();
        
        palavra.set_nome("Fazendinha");
        ArrayList<Palavras> player = new ArrayList<>();
        
        palavra.set_letras(7);
        
        System.out.println(palavra.palavras_acertadas());
        System.out.println();

        palavra.set_tentativas(7);
        System.out.println(palavra.palavras_acertadas());
        System.out.println();
        
        int v = player_1.get_tentativa(1);
        System.out.println("tentativas do player 1: " + v);
        System.out.println();

        player_1.palpite(palavra);
        player_1.palpite(palavra);
        System.out.println();
        
        System.out.println(palavra.ficha());
        
    }
    
    public void set_tentativas(int v) {
        
        if (acertou >= 0) {
            tentativas = v;
        } else {
            System.out.println("tentativa inválida: " + v);
        }
    }
    
    void acertar_letra(int errar, Personagem player_1) {
        for (char c : adivinha_palavra.toCharArray()) {
            if (palavras_acertadas(player_1).indexOf(c) >= 0) {

                set_tentativas(Math.max(0, player_1.chances - errar));
            }
            System.out.println(player_1.nome + " errou " + errar + " vezes");
        }
    }

    
    String palavras_acertadas(Personagem player_1) {
        return player_1.nome + " (total tentativas: " + player_1.tentativas + ", falta: " + player_1.palavras_acertadas + ")";
    }
    
    void acertar(Personagem acerta_letra) {
        System.out.println(nome + " palavras_acertadas " + alguma_letra.getNome());
        alguma_letra.receber_acerto(palavras_acertadas);
    }
    
}
abstract class Jogador{

    private String nome;
    private int tentativas = 7;
}
abstract class Palavras {
    
    private String nome;    
    private int quantidade = 10; //limite
}

public Personagem(String nome){

    set_nome(nome);
}

public Personagem(int tentativas){

    set_tentativas(tentativas);

}
class Personagem extends Jogador{

    public Jogador(String nome){


    }

}