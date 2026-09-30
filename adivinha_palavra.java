
public class adivinha_palavra {

    // Detalhes internos: fechados para o resto do programa

    private String nome = "Fazenda";
    private int palavras = 7;
    private ArrayList<Item> acertou = new ArrayList<>();

    // Getters: leitura controlada

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return palavras;
    }
    
}
