public class werknemer 
{	//blz 21

	public String voornaam;
	public String achternaam;
	public int werknemernummer;
	protected float salaris;

	public werknemer (String voornaam, String achternaam, 	int wNummer, float salaris)
	{
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		wNummer = werknemernummer;
		this.salaris = salaris;
	}

	public void salarisverhogen(int percentage)
	{
		salaris = salaris * (1 + (percentage/100.0f));
	}

	public float getSalaris ()
	{
		return salaris;   //enkel get dus read only
	}

}

	