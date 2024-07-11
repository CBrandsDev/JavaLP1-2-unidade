public class Estudante extends Socio {
    private String universidade;

    public Estudante(String n, String c, double va, int i, String u) {
        super(n, c, va, i);
        universidade = u;
    }

    public void imprimir() {
        System.out.println(nome+", "+idade+" anos, de CPF: "+cpf+", estudante da universidade "+universidade+", que paga um valor de anuidade de R$ "+valor_anuidade);
    }
}