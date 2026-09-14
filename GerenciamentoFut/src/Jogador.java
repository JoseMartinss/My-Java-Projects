public class Jogador {
    private String nome, posicao;
    private int gols, partidasJogadas;

    //construtor pra inicializar um jogador
    public Jogador (String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public String getPosicao(){
        return posicao;
    }

    public int getGols(){
        return gols;
    }

    public int getPartidasJogadas(){
        return partidasJogadas;
    }

    //setters (somente para variaveis q podem mudar constantemente)
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    //metodos
    public void adicionarGols(int quantidade){
        if(quantidade >= 0){ 
            this.gols += quantidade;
        }
    }

    public void adicionarPartidas(){
        this.partidasJogadas++;
    }

}