package estruturas;

public class Fila {
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

    public boolean isEmpty(){
        return (tamanho == 0);
    }

    public boolean isFull(){
        return (tamanho == tamanhoMax);
    }

    public int peek(){
        if(isEmpty() ){
            System.out.println("A Fila está vazia!");
            return -1;
        }else {
            return filaArray[inicio];
        }
    }

    public void enqueue(int elemento){
        if (this.isFull()){
            System.out.println("Fila esta cheia");
        } else {
            if(fim == tamanhoMax -1){
                fim = -1;
            }
            fim++;
            filaArray[fim] = elemento;
            tamanho++;
        }
    }

    public int daqueue(){
        if (this.isEmpty()){
            System.out.println("A fila esta vazia!");
            return -1;
        } else {
            int elemento = filaArray[inicio];
            inicio++;
            if(inicio == tamanhoMax){
                inicio = 0;
            }
            tamanho--;
            return elemento;
        }
    }

    public static void main(String[] args) {
        Fila filinha = new Fila(5);
        filinha.enqueue(21);
        filinha.enqueue(2);
        filinha.enqueue(251);
        filinha.enqueue(243);

        System.out.println(filinha.daqueue());
        System.out.println(filinha.daqueue());
        System.out.println(filinha.daqueue());
        System.out.println(filinha.daqueue());

    }
}
