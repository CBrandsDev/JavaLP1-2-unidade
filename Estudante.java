public class Estudante extends Socio {

    
    private String universidade;

    public Estudante(String n, String c, double vA, int i, String u) {
        super(n, c, vA, i);
        universidade = u;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
    public String getUniversidade() {
        return universidade;
    }

    public void imprimir() {
        System.out.println("O Estudante " +super.nome+ " de " +super.idade+ " anos, estudante da universidade " + universidade);
    }
}