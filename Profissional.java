public class Profissional extends Socio implements Professor_EBTT {

    private String empresa;

    public Profissional(String n, String c, double vA, int i, String e) {
        super(n, c, vA, i);
        empresa = e;
    }

    public void imprimir() {
        System.out.println("O profissional " +super.nome+ ", de CPF " +super.cpf+ ", trabalha na empresa " +empresa);
    }

    public void desconto() {
        valor_anuidade = valor_anuidade - (valor_anuidade * 0.2);
        System.out.println("A nova anuidade do Professor" + super.nome + " é de R$" + valor_anuidade);
    }
}