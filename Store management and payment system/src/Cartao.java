import java.util.Scanner;

public class Cartao implements FormaPagamento, Parcelavel, Estornavel{

private double limite;
private double taxa = 1.03;
double numeroParcelas;
double valorParcelas;
boolean aprovado = true;

Scanner scanner = new Scanner(System.in);

//getters e setters (n é a ia fazendo coments ta)
public double getLimite() {
    return limite;
}
public void setLimite(double limite) {
    this.limite = limite;
}
public double getTaxa() {
    return taxa;
}
public void setTaxa(double taxa) {
    this.taxa = taxa;
}

//=== METODOS ===
public void informarDescricao(){
    System.out.println("= Cartão de Crédito =");
}

public void realizarCobranca(){

    if(getLimite() > 0){
        
        if(aberto = true){
        aprovado = true;

    limite = limite - (valorPedido * taxa);
    //obs: criar variavel valorPedido depois
        }
    }
    else{
        System.out.println("Sem limite disponível");
    }
}

public void parcelasPermitidas(){
    System.out.println("Quantidade de parcelas permitidas: 6");
}

public void numeroParcelas(){

boolean continuarPedindo = true;

while (continuarPedindo) {
    
}
    System.out.println("Escolha em quantas vezes quer parcelar (Máximo 6x): ");
    
     double entrada = scanner.nextDouble();

     if(entrada >= 1 && entrada <= 6){
        numeroParcelas = entrada;
        continuarPedindo = false;   
     }
     else{
        System.out.println("\t = ERRO: SÓ É POSSIVEL PARCELAR DE 1x ATÉ 6x! =");
     }

    

}

public void calcularValorParcelas(){

    valorParcelas = (valorPedido/6)*getTaxa();

}

public  void devolverValor(double valorPedido){

}



    
}
