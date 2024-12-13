public class Robo {
    private Integer linha;
    private Integer coluna;
    private Integer passo;

    public Robo(Integer linha, Integer coluna, Integer passo) {
        this.linha = linha;
        this.coluna = coluna;
        this.passo = passo;
    }

    public void andarFrente(){
        if (linha + passo < 20) {
            linha += passo;
        } else {
            linha = 19; //antes da borda
        }
    }

    public void andarTras(){
        if (linha - passo >= 0){
            linha -= passo;
        } else {
            linha = 0; //antes da borda
        }
    }

    public void andarDireita(){
        if (coluna + passo < 40) {
            coluna += passo;
        } else {
            coluna = 39; //antes da borda
        }
    }

    public void andarEsquera(){
        if(coluna - passo >= 0) {
            coluna -= passo;
        } else {
            coluna = 0; // antes da borda
        }
    }

    public void mostrarPosicao(){
        System.out.println("\nPosição atual: (" + linha + coluna + ")\n");
    }

    public void mostrarSala(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 40; j++) {
                if (i == linha && j == coluna) {
                    System.out.print("1 "); //representação do robô
                } else {
                    System.out.print("0 "); //espaços vazios
                }
            }
            System.out.println();
        }
    }
}
