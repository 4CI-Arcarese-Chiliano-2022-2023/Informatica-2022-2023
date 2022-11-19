import java.util.Scanner;

public class LavatriceView{
  private Scanner scanner = new Scanner(System.in);
  private Lavatrice l;

  public void LavatriceView(){
    l = new Lavatrice();
  }

  public void start(){
    l = new Lavatrice();
    l.accendi();
    l.setProgramma(getUserProgram());
    calcolaConsumo();
    l.spegni();
  }

  private int getUserProgram(){
    int program;
    String out = "Scegli il programma:";
    out += "\n\t0) Tempo Giri: 120 Centrifuga: 1200 Temperatura: 40";
    out += "\n\t1) Tempo Giri: 60 Centrifuga: 400 Temperatura: 30";
    out += "\n\t2) Tempo Giri: 40 Centrifuga: 800 Temperatura: 40";
    out += "\nInserisci il numero del programma: ";
    do{
      System.out.println(out);
      program = scanner.nextInt();
      if (program < 0 || program > 2)
        System.out.println("Programma non valido, scegli 0, 1 o 3.");
    }while(program < 0 || program > 2);
    return program;
  }

  private void calcolaConsumo(){
    System.out.println("Consumo:" + l.getTempo() / 60 * l.getKiloWatt() + "kW/h");
  }

}
