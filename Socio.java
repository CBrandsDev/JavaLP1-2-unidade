public abstract class Socio {

    protected String nome;
    protected String cpf;
    protected double valor_anuidade;
    protected int idade;

    public Socio(String n, String c, double va, int i) {
        n = nome;
        c = cpf;
        va = valor_anuidade;
        i = idade;
    }

    public abstract void imprimir();

    public String getcpf() {
        return cpf;
    }
    public int getidade() {
        return idade;
    }
}