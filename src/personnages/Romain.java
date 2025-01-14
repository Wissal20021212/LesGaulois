package personnages;

public class Romain {
private String name ; 
private int force ; 

public Romain (String name , int force)
{
	this.name = name;
	this.force = force ;
}

public String getRomain

	{
		return name;
	}

	public String parler(String texte) {
		return ("le romain " + getRomain() + " : < " + texte + " > ."  );
	}
