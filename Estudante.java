public class Estudante extends Socio {
    private String universidade;

    public Estudante(String n, int c, double va, int i, String u) {
        super(n, c, va, i);
        universidade = u;
    }

    public void imprimirUniversidade() {
        System.out.println(name+", "+idade+" anos, de CPF: "+cpf+", estudante da universidade "+universidade+", que paga um valor de anuidade de R$ "+valor_anuidade);
    }
}