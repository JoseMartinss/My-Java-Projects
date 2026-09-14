public class App {
    public static void main(String[] args) throws Exception {
        

        //TESTE COM IA**
        
        // 1. Instanciando o Time (Item a)
        TimeFutebol time = new TimeFutebol("Flamengo", "Tite");

        System.out.println("=== TESTE DO SISTEMA DE TIME ===");
        System.out.println("Time: " + time.getNomeTime() + " | Técnico: " + time.getTecnico());
        System.out.println();

        // 2. Criando objetos Jogador
        Jogador j1 = new Jogador("Gabigol", "Atacante");
        Jogador j2 = new Jogador("Arrascaeta", "Meio-Campo");
        Jogador j3 = new Jogador("Pedro", "Atacante");

        // Simulando gols nos jogadores
        j1.adicionarGols(5);
        j2.adicionarGols(3);
        j3.adicionarGols(8);

        // 3. Adicionando Jogadores ao Time (Item c)
        time.adicionarJogador(j1);
        time.adicionarJogador(j2);
        time.adicionarJogador(j3);

        // 4. Registrando Partidas (Item e)
        // Isso também deve incrementar automaticamente as partidas jogadas dos atletas
        time.registrarPartida("Vasco", 2, 1, "10/02/2026"); // Vitória
        time.registrarPartida("Fluminense", 0, 0, "15/02/2026"); // Empate
        time.registrarPartida("Botafogo", 1, 2, "20/02/2026"); // Derrota
        time.registrarPartida("Palmeiras", 3, 0, "25/02/2026"); // Vitória

        // 5. Exibindo Elenco Completo (Item i)
        System.out.println("--- ELENCO INICIAL ---");
        time.exibirJogadores();
        System.out.println();

        // 6. Exibindo Estatísticas do Time (Item f)
        time.exibirEstatisticas();
        System.out.println();

        // 7. Testando Busca de Artilheiro (Item g)
        Jogador artilheiro = time.getArtilheiro();
        if (artilheiro != null) {
            System.out.println("Artilheiro do Time: " + artilheiro.getNome() + " com " + artilheiro.getGols() + " gols.");
        }

        // 8. Testando Busca por Mais Partidas (Item h)
        Jogador maisPartidas = time.getMaisPartidas();
        if (maisPartidas != null) {
            System.out.println("Jogador com mais partidas: " + maisPartidas.getNome() + " (" + maisPartidas.getPartidasJogadas() + " jogos).");
        }
        System.out.println();

        // 9. Testando Remoção de Jogador (Item d)
        System.out.println("--- REMOVENDO JOGADOR (Gabigol) ---");
        time.removerJogador(j1);
        
        // Exibindo novamente para checar se foi removido
        time.exibirJogadores();
    }
    }

