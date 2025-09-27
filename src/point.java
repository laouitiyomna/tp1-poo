class point {
	private String Nom;
	private int Abscisse;
	private int Ordonné;
	
	public point (int Abscisse,int Ordonné) {
		this.Abscisse=Abscisse;
		this.Ordonné=Ordonné;
	}
	public point (String Nom) {
		this.Nom=Nom;}
	public point (String Nom,int Abscisse,int Ordonné) {
		this.Abscisse=Abscisse;
		this.Nom=Nom;
		this.Ordonné=Ordonné;
	}
	public void Affiche() {
		System.out.println(this.Nom+"("+this.Abscisse+","+this.Ordonné+")");
	}
	public void TranslHoriz (int a) {
		this.Abscisse+= a;
	}
	public void TranslVert (int a) {
		this.Ordonné+= a;
	}
	public void Translation (int a, int b) {
		this.Abscisse+=a;
		this.Ordonné+=b;
	}
	public  boolean coincide (point p) {
		return this.Abscisse==p.Abscisse && this.Ordonné==p.Ordonné ;
	}
	public String getNom() {
		return this.Nom;
	}
	public int getAbscisse() {
		return this.Abscisse;
	}
	public int getOrdonnée() {
		return this.Ordonné;
	}
	public void setNom(String ch) {
		this.Nom=ch;
	}
	public void setAbscisse(int a) {
		this.Abscisse=a;
	}
	public void setOrdonnée(int a) {
		this.Ordonné=a;
	}
}