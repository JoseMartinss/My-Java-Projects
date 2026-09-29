public class Gerente extends Funcionario{

    private double bonus;

    //construtor
    public Gerente(){
        super();
        this.bonus = 0.00;
    }

    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override 
    public void salarioFinal(){
        double salarioFinal = getSalarioBase() + bonus;
        System.out.println("Salário Final Gerente: " + salarioFinal);
    }

    
}