public class App {
    public static void main(String[] args) throws Exception {
        
        Contato contato1 = new Contato();
        contato1.Exibirdados();

        Contato contato2 = new Contato("Jose", "(91) 999", "jp21.com");
        contato2.Exibirdados();
    }
}
