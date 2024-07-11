public class Profissional extends Socio implements Professor_EBTT {
    private String empresa;
    
    public Profissional(String n, int c, double va, int i, String e) {
        super(n, c, va, i);
        empresa = e;
    }

    public void imprimirEmpresa() {
        System.out.println(name+", "+idade+" anos, de CPF:"+cpf+", que paga um valor de anuidade de R$"+valor_anuidade);
    }

    public void desconto() {
        valor_anuidade = valor_anuidade - (valor_anuidade * 0.2);
        System.out.println("O profissional "+nome+" teve sua anuidade ajustada para: R$ "+valor_anuidade);
    }
}