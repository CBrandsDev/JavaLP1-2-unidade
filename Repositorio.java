public class Repositorio {
    private Socio[] BD;
    int indice;

    public Repositorio() {
        BD = new Socio[6];
        indice = 0;
    }

    public void inserir(Socio s) throws Exception {
        boolean verify = false;
        for(int i = 0; i < indice; i++) {
            if(BD[i].getcpf() == (BD[S].getcpf())) {
                throw new clickAdException();
                    verify = true;
                    break;
            }
        }
        if(!verify) {
            BD[indice] = S;
            indice++;
        }
    }
}