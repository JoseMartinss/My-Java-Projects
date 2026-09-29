public class App {
    public static void main(String[] args) throws Exception {
       Funcionario f1 = new Funcionario("Joao", 3000.00);
       Gerente g1 = new Gerente("Jose Pedro", 7000.00, 1500.00);

       f1.salarioFinal();
       g1.salarioFinal();
    }
}
