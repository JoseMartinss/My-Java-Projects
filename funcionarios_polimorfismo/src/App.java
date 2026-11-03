import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Colaborador> ListaColaboradores = new ArrayList<>();
        
        Colaborador c0 = new Colaborador();
        Colaborador c1 = new Supervisor();
        Colaborador c2 = new GerenteSenior();

        ListaColaboradores.add(c0);
        ListaColaboradores.add(c1);
        ListaColaboradores.add(c2);

        FolhaPagamento folha = new FolhaPagamento();

         for(Colaborador c : ListaColaboradores){
            folha.processar(c);
         }
        }
    }