import estruturas.TableHash;

public class Main {
    public static void main(String[] args) {
        TableHash tableHash = new TableHash(10);
        tableHash.put("A");
        tableHash.put("B");
        tableHash.put("C");
        tableHash.put("D");
        System.out.println(tableHash.busca("A"));
    }
}