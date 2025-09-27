
class personne {
	private String Nom ;
	private String Prenom ;
	private int Age ;
	private String sexe;
	
	public personne () {
		this.Nom="Med";
		this.Prenom="Ben Ali";
		this.Age=30;
		this.sexe="Homme";
			}
	public personne (String Nom,String Prenom,int age,String sexe) {
		this.Nom=Nom;
		this.Prenom=Prenom;
		this.Age=age;
		this.sexe=sexe;
			}
	public String getNom() {
		return this.Nom;
	}
	public String getPrenom() {
		return this.Prenom;
	}
	public int getAge() {
		return this.Age;
	}
	public String getSexe(){
		return this.sexe;
		}
	public void setNom(String Nom){
		this.Nom=Nom;
		}
	public void setPrenom(String Prenom){
		this.Prenom=Prenom;
		}
	public void setAge(int Age){
		this.Age=Age;
		}
	public void setSexe(String sexe){
		this.sexe=sexe;
		}
	public void affiche(){
		System.out.println("\nLe nom : "+Nom+"\n Le prenom :"+Prenom+"\n l age : "+Age+"\n sexe : "+sexe);
		}
	public boolean sameLastName(personne p){
		return this.Nom==p.Nom;
		}
	public static void main(String args[]){
		personne p1 = new personne("Laouiti","Yomna",20,"Femme");
		personne p2 = new personne("Juini","Ghofrane",19,"Femme");
		p1.affiche();
		p2.affiche();
		if (p1.sameLastName(p2)) {
		System.out.println("meme nom de famille");
		}
		else{
		System.out.println("n est pas le meme nom de famille");
		}
		if (p1.getAge()>p2.getAge()){
		System.out.println(p1.getNom()+" est le plus agé");
		}
		else if(p1.getAge()<p2.getAge()){
		System.out.println(p2.getNom()+" est le plus agé");
		}
		else{
		System.out.println("meme age");
		}
		
		}

}