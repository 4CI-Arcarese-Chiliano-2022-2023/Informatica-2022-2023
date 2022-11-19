public class Lavatrice{

	private String marca;
	private String modello;
	private double prezzo;
	private double tempo;
	private int programma;
	private int temperatura;
	private int giriCentrifuga;
	private int kg;
	private double kiloWatt;
	private boolean acceso;


	// Costruttori
	public Lavatrice(){
		this.marca = "anonimo";
		this.modello = "anonimo";
		this.prezzo = 0;
		this.tempo = 0;
		this.programma = 0;
		this.temperatura = 0;
		this.giriCentrifuga = 0;
		this.kg = 0;
		this.acceso = false;

	}
	public Lavatrice(String m, String mod, double p){
		if (m != null)
			this.marca = m;
		else
			this.marca = "anonimo";
		if (mod != null)
			this.modello = mod;
		else
			this.modello = "anonimo";
		if (p > 0)
			this.prezzo = p;
		else
		this.prezzo = 0;
		this.programma = 0;
		this.temperatura = 0;
		this.giriCentrifuga = 0;
		this.kg = 0;
		this.acceso = false;
	}

	//set methods
	public void setMarca(String m){
		if (m != null)
			this.marca = m;
		else
			this.marca = "anonimo";
	}
	public void setModello(String mod){
		if (mod != null)
			this.modello = mod;
		else
			this.modello = "anonimo";
	}
	public void setPrezzo(double p){
		if (p > 0)
			this.prezzo = p;
		else
			this.prezzo = 0;
	}
	public void setTempo(double t){
		if (t > 0)
			this.tempo = t;
		else
			this.tempo = 0;
	}
	public void setProgramma(int prog){
			switch (prog) {
				case 0:
					this.programma = 0;
					this.tempo = 120;
					this.giriCentrifuga = 1200;
					this.temperatura = 40;
					this.kiloWatt = 0.6;
					break;
				case 1:
					this.programma = 1;
					this.tempo = 60;
					this.giriCentrifuga = 400;
					this.temperatura = 30;
					this.kiloWatt = 0.3;
					break;
				case 2:
					this.programma = 2;
					this.tempo = 30;
					this.giriCentrifuga = 800;
					this.temperatura = 40;
					this.kiloWatt = 0.4;
					break;
				default:
					this.programma = 0;
					this.tempo = 0;
					this.giriCentrifuga = 0;
					this.temperatura = 0;
			}
	}
	public void setTemperatura(int temp){
		if (temp > 0)
			this.temperatura = temp;
		else
			this.temperatura = 0;
	}
	public void setGiriCentrifuga(int g){
		if (g > 0)
			this.giriCentrifuga = g;
		else
			this.giriCentrifuga = 0;
	}
	public void setKg(int k){
		if (k > 0)
			this.kg = k;
		else
			this.kg = 0;
	}
	public void setKiloWatt(int kW){
		if (kW > 0)
			this.kiloWatt = kW;
		else
			this.kiloWatt = 0;
	}

	// on off
	public void accendi(){
		this.acceso = true;
	}
	public void spegni(){
		this.acceso = false;
	}

	//get methods
	public String getMarca(){
		return this.marca;
	}
	public String getModello(){
		return this.modello;
	}
	public double getPrezzo(){
		return this.prezzo;
	}
	public double getTempo(){
		return this.tempo;
	}
	public int getProgramma(){
		return this.programma;
	}
	public int getTemperatura(){
		return this.temperatura;
	}
	public int getGiriCentrifuga(){
		return this.giriCentrifuga;
	}
	public int getKg(){
		return this.kg;
	}
	public boolean getAcceso(){
		return this.acceso;
	}
	public double getKiloWatt(){
		return this.kiloWatt;
	}

	// increse methods
	public void aumentaGiri(){
		this.giriCentrifuga ++;
	}
	public void aumentaTemperatura(){
		this.temperatura ++;
	}
	public void aumentaKg(){
		this.kg ++;
	}
	public void aumentaTempo(){
		this.tempo ++;
	}

	// decrese methods
	public void diminuisciGiri(){
		this.giriCentrifuga --;
	}
	public void diminuisciTemperatura(){
		this.temperatura --;
	}
	public void diminuisciKg(){
		this.kg --;
	}
	public void diminuisciTempo(){
		this.tempo --;
	}

	public String toString(){
		String out =
				"-----------------------------------" +
				"\n\tMarca: " + this.marca +
				"\n\tModello: " + this.modello +
				"\n\tPrezzo: " + this.prezzo +
				"\n\tProgramma: " + this.programma +
				"\n\tTemperatura: " + this.temperatura +
				"\n\tGiri Centrifuga: " + this.giriCentrifuga +
				"\n\tkg: " + this.kg +
				"\n\tAcceso: " + this.acceso;

		return out;

	}
}//class
