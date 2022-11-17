/*
  Parte model del progetto.
  autor: Chiliano Arcarese 4CI
  version: 1.0.1
                                            */

public class Articolo{

  private String descrizione;
  private static int codA = 0;
  private double prezzo;

  // Costruttori
  public Articolo(){
    descrizione = "Unknown";
    codA ++;
    prezzo = 0.0;
  }
  public Articolo(String d, double p){
    if (d != null)
      descrizione = d;
    else
      descrizione = "Unknown";
    codA ++;
    if (p > 0.0)
      prezzo = p;
    else
      prezzo = 0.0;
  }
  public Articolo(Articolo a){
    this.descrizione = a.descrizione;
    this.prezzo = a.prezzo;
  }

  //set methods
  public void setDescrizione(String d){
    if (d != null)
      descrizione = d;
    else
      descrizione = "Unknown";
  }
  public void setPrezzo(double p){
    if (p > 0.0)
      prezzo = p;
    else
      prezzo = 0.0;
  }

  //get methods
  public String getDescrizione(){
    return descrizione;
  }
  public int getCodA(){
    return codA;
  }
  public double getPrezzo(){
    return prezzo;
  }

  public String toString(){
    String out = "\n-----------------------------------" +
                 "\n\tDescrizione: " + descrizione +
                 "\n\tCodA: " + codA +
                 "\n\tPrezzo: " + prezzo;

    return out;
  }

  public boolean equals(Articolo a){
    if(this.descrizione == a.descrizione && this.prezzo == a.prezzo)
      return true;
    return false;
  }
}
