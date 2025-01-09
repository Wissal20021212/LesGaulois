package personnages;

public class Gaulois {
private String name ; 
private int force ; 

public Gaulois(String name , int force ) {
	this.name = name ; 
	this.force = force ; 
}

public String getGaulois () {
	return name;
}

public String parler(String texte) {
	return ("le gaulois " + getGaulois() + " : < " + texte + " > ."  );
}
 
public static void main(String[] args) {
	Gaulois asterix = new Gaulois ("Astérix",8);
	System.out.println(asterix.getGaulois());
	
}
}
