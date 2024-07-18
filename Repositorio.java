public class Repositorio {
    
    private Socio[] BD;
    private int indice;

    public Repositorio() {
        BD = new Socio[4];
        indice = 0;
    }

    public void inserir(Socio s) {
        if(indice == 0) {
            BD[indice] = s;
            indice++;
            return;
        }
        for (int i = 0; i < indice; i++) {
            if(s.getCpf().equals(BD[i].getCpf())) {
                System.out.println("Participante já cadastrado");
                return;
            }
        }
        BD[indice] = s;
        indice++;
    }

    public void remover(String cpf) {
        if (indice == 0) {
            System.out.println("Não há participantes cadastrados");
        } else {
            for(int i = 0; i < indice; i++) {
                if(BD[i] != null && BD[i].getCpf().equals(cpf)) {
                    for(int j = i; j < indice - 1; j++) {
                        BD[j] = BD[j + 1];
                    }
                    BD[indice - 1] = null;
                    indice--;
                    System.out.println("Participante removido com sucesso");
                    return;
                }
            }
        }
    }

    public int maisVelho() {
        int maisVelho = 0;
        if (indice == 0) {
            System.out.println("Não há participantes cadastrados");
        } else {
            for (int i = 0; i < indice; i++) {
                if(BD[i].getIdade() > maisVelho) {
                    maisVelho = BD[i].getIdade();
                }
            }
        }
        return maisVelho;
    }
}