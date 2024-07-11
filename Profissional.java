public class Profissional extends Socio implements Professor_EBTT {
    private String empresa;
    
    public Profissional(String n, String c, double va, int i, String e) {
        super(n, c, va, i);
        empresa = e;
    }

    public void imprimir() {
        System.out.println(nome+", "+idade+" anos, de CPF:"+cpf+", que trabalha na empresa "+empresa+", que paga um valor de anuidade de R$"+valor_anuidade);
    }

    public void desconto() {
        valor_anuidade = valor_anuidade - (valor_anuidade * 0.2);
        System.out.println("O profissional "+nome+" teve sua anuidade ajustada para: R$ "+valor_anuidade);
    }
}