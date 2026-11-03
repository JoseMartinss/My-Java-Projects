public class FolhaPagamento {
    
    public void processar(Colaborador c){
        double bonificacao = c.calcularBonificacao();
        System.out.println(" Bonificação: " + bonificacao);
    }
}
