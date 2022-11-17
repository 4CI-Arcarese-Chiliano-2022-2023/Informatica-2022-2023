/*
  Parte view del progetto.
  autor: Chiliano Arcarese 4CI
  version: 1.0.2
                                            */

import java.util.Scanner;

public class Vendita{

  private Articolo articolo;

  public Vendita(){
    articolo = new Articolo();
  }

  public void start(){
    describeProgram();
    getInput();
    computing();
    displayOutput();
  }

  private void describeProgram(){
    System.out.println("Questo programma vende un articolo.");
  }
  private void getInput(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Inserire la descrizione dell'articolo: ");
    articolo.setDescrizione(scanner.nextLine());
    System.out.println("Inserire il prezzo dell'articolo: ");
    articolo.setPrezzo(scanner.nextDouble());
  }
  private void computing(){
    System.out.println("Articolo venduto");
  }
  private void displayOutput(){
    System.out.println(articolo.toString());
  }
}
