public abstract class Socio {

    protected String nome;
    protected int cpf;
    protected double valor_anuidade;
    protected int idade;

    public Socio(String n, int c, double va, int i) {
        n = name;
        c = cpf;
        va = valor_anuidade;
        i = idade;
    }

    public abstract void Imprimir();
}