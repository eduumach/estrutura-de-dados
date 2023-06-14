import estruturas.TableHash;

public class Main {
    public static void main(String[] args) {
        TableHash tableHash = new TableHash(10);
        tableHash.put(101, "A");
        tableHash.put(102, "E");
        tableHash.put(105, "doooo");
        tableHash.put(107, "BUUUUU");
        tableHash.put(207, "TAAA");

        System.out.println(tableHash.busca(107));
    }
}