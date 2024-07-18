public class Main {
    public static void main(String[] args) {
        Profissional p1 = new Profissional("Carlos", "01247835962", 1458, 42, "NortonVPN");
        Profissional p2 = new Profissional("Danilo", "01455797538", 1669, 36, "Google Enterprise");
        Estudante e1 = new Estudante("Calil", "55698598752", 620, 23, "IFBA");
        Estudante e2 = new Estudante("Camila", "16488396246", 850, 21, "UFBA");

        System.out.println(p1.getNome());
        System.out.println(e2.getCpf());

        Repositorio pessoas = new Repositorio();
        pessoas.inserir(p1);
        pessoas.inserir(p2);
        pessoas.inserir(e1);
        pessoas.inserir(e2);

        System.out.println(pessoas.maisVelho());

        pessoas.remover(p1.getCpf());

        System.out.println(pessoas.maisVelho());

        p1.imprimir();
        e2.imprimir();

        p2.desconto();
    }
}