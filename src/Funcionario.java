public class Funcionario{
    private String nome;
    private double salarioBase;

    //construtor
    public Funcionario (){
        this.nome = "NomeVazio";
        this.salarioBase = 0.00;
    }

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //getters e setters
    public String getNome(){ return nome; }

    public void setNome(String nome){ this.nome = nome; }

    public double getSalarioBase(){ return salarioBase; }

    public void setSalarioBase(double salarioBase){ this.salarioBase = salarioBase; 0}

    //metodos

    public void salarioFinal(){
        double salarioFinal;

        salarioFinal = getSalarioBase();

        System.out.println("Salário Final: " + salarioFinal);
    }
    

}