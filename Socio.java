public abstract class Socio {

    protected String nome;
    protected String cpf;
    protected double valor_anuidade;
    protected int idade;

    public Socio(String n, String c, double vA, int i) {
        nome = c;
        cpf = c;
        valor_anuidade = vA;
        idade = i;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setValor_anuidade(double valor_anuidade) {
        this.valor_anuidade = valor_anuidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getValor_anuidade() {
        return valor_anuidade;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void imprimir();
}