public class Prodotto {

    public double codice;
    public String nome;
    public String descrizione;
    public int prezzo;
    public int prezzoIvato;
    public int iva;

    public Prodotto (String nome){

        this.nome = nome;

    }

    public int getCodice(){
        codice = Math.random() * 999;
        int getCodice = (int) codice;
        return getCodice;
    }

    public void prezzoBase(int inserisciPrezzo){

        prezzo = inserisciPrezzo;

        System.out.println("Il prezzo è : " + prezzo + " € ");
    }

   /*  public double aliquota(double inseriealiquota){
        prezzoIvato = prezzo * aliquota;
        return prezzoIvato;
    }*/

    public void nomeProdotto(){
        System.out.println("Il prodotto è : " + getCodice() + nome);
    }

}