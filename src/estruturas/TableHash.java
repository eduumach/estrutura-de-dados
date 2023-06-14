package estruturas;

public class TableHash {
    private int M;
    private String[] tableHash;

    public TableHash(int tamanho) {
        this.M = GFG.closetPrime(2 * tamanho);
        tableHash = new String[M];
    }

    public int hash(int key) {
        return key % M;
    }

    public void put(int key, String value) {
        int i = hash(key);
        tableHash[i] = value;
    }

    public String busca(int key) {
        int i = hash(key);
        return tableHash[i];
    }
}
