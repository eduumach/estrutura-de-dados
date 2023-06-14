package estruturas;

public class TableHash {
    private int M;
    private String[] tableHash;

    public TableHash(int tamanho) {
        this.M = GFG.closetPrime(2 * tamanho);
        tableHash = new String[M];
    }

    public int hash(String key) {
        int h = 0;
        for (int i = 0; i < key.length(); i++) {
            h = (31 * h + key.charAt(i)) % M;
        }
        return h;
    }

    public void put(String key) {
        int i = hash(key);
        while (tableHash[i] != null) {
            i = (i + 1) % M;
        }
        tableHash[i] = key;
    }

    public String busca(String key) {
        int i = hash(key);
        while (tableHash[i] != null) {
            if (tableHash[i].equals(key)) {
                return tableHash[i];
            }
            i = (i + 1) % M;
        }
        return null;
    }
}
