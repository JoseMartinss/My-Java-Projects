public class Partida{
    private String oponente;
    private int placarTime, placarOponente;
    private String data;

    //Construtor
    public Partida(String oponente, int placarTime, int placarOponente, String data){
        this.oponente = oponente;
        this.placarTime = placarTime;
        this.placarOponente = placarOponente;
        this.data = data;
    }

    //getters (so getter pq essa classe é so pra armazenar dados)
    public String getOponente(){
        return oponente;
    }

    public int getPlacarTime(){
        return placarTime;
    }
    
    public int getPlacarOponente(){
        return placarOponente;
    }

    public String getData(){
        return data;
    }

    //metodos booleanos pra registrar resultados
    public boolean isVitoria(){
        return placarTime > placarOponente;
    }

    public boolean isEmpate(){
        return placarTime == placarOponente;
    }

    public boolean isDerrota(){
        return placarTime < placarOponente;
    }


}