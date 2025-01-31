public class CreaProdotto {

    public static void main(String[] args) {
        Prodotto cappotto = new Prodotto("Cappotto");
        cappotto.getCodice();
        cappotto.nomeProdotto();
     //   cappotto.aliquota(0.22);
        cappotto.prezzoBase(100);

        Prodotto jeans = new Prodotto("Jeans");
        jeans.getCodice();
        jeans.nomeProdotto();
        jeans.prezzoBase(40);

        
    }
    
}
