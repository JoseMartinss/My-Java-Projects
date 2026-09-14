import java.util.ArrayList;
import java.util.List;

public class TimeFutebol{
    private String nomeTime, tecnico;
    private List<Jogador> jogadores;
    private List<Partida> historicoPartidas;
    
    //construtor
    public TimeFutebol(String nomeTime, String tecnico){
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;

        this.jogadores = new ArrayList<>();
        this.historicoPartidas = new ArrayList<>();
    }

    //getter e setters
    public String getNomeTime(){
        return nomeTime;
    }
    public void setNomeTime(String nomeTime){
        this.nomeTime = nomeTime;
    }

    public String getTecnico(){
        return tecnico;
    }
    public void setTecnico(String tecnico){
        this.tecnico = tecnico;
    }

    //METODOS
    public void adicionarJogador(Jogador jogador){
        if(jogador != null){
            this.jogadores.add(jogador);

        }
        else {
            System.out.println("Jogador Inválido!");
        }
    }

    public void removerJogador (Jogador jogador){
        if( this.jogadores.contains(jogador) ){
            this.jogadores.remove(jogador);
        }
        else{
            System.out.println("Jogador inválido!");
        }
    }

    public void registrarPartida (String oponente, int placarTime, int placarOponente, String data){

        Partida novaPartida = new Partida(oponente, placarTime, placarOponente, data);

        this.historicoPartidas.add(novaPartida);

        //for-each (usado pra listas p/ ficar mais  ez)

        for(Jogador j : jogadores){
            j.adicionarPartidas();
        }

    }

    public void exibirEstatisticas(){
        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;

        for(Partida p : historicoPartidas){
            if(p.isVitoria()){
                vitorias++;
            }
            else if(p.isEmpate()){
                empates++;
            }
            else if (p.isDerrota()){
                derrotas++;
            }
        }

        System.out.println("=== ESTATÍSTICAS DO TIME ===");
        System.out.println("Partidas jogadas: " + historicoPartidas.size());
        System.out.println("Vitórias" + vitorias);
        System.out.println("Derrotas: "+ derrotas);
        System.out.println("Empates: "+ empates);
    }

    public Jogador getArtilheiro(){

        if(jogadores.isEmpty()){
            return null;
        }

        Jogador artilheiro = jogadores.get(0);

        for(Jogador j : jogadores){
            if(j.getGols() > artilheiro.getGols()){
                artilheiro = j;
            }
        }

        return artilheiro;

    }

    public Jogador getMaisPartidas(){

        if(jogadores.isEmpty()){
            return null;
        }

        Jogador jogouMais = jogadores.get(0);

        for(Jogador j : jogadores){
            if(j.getPartidasJogadas() > jogouMais.getPartidasJogadas()){
                jogouMais = j;
            }

        }

        return jogouMais;
    }

    public void exibirJogadores(){

        if(jogadores.isEmpty()){
            System.out.println("ERRO: NENHUM JOGADOR NA LISTA");
        }
        
        for(Jogador j : jogadores){
            System.out.println("----------");
            System.out.println("Nome: " + j.getNome());
            System.out.println("Posição: "+ j.getPosicao());
            System.out.println("Gols: " + j.getGols());
            System.out.println("Partidas jogadas: " + j.getPartidasJogadas());
        }
    }

    
}
    
