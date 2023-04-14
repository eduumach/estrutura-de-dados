package estruturas;

public class Fila {
//    Enfileirar
//    desenfileirar
//    esta vazia
//    esta cheia
//    fim da fila

    private int tamanhoMax;
    private int[] filaArray;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
        this.filaArray = new int[tamanhoMax];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public static void main(String[] args) {
        Fila filinha = new Fila(5);

    }
}
