public class lesKlassen
{
	public static void main (String args[])
	{
		werknemer jan;
		jan = new werknemer ("Jan", "Janssens", 1, 20.0f);

		werknemer herman;
		herman = new werknemer ("Herman", "Hermans", 2, 30.0f);

		werknemer piet;
		piet = new werknemer ("Piet", "Boedt", 3, 25.0f);

		werknemer ivan;
		ivan = new werknemer ("Ivan", "Waumans", 4, 31.5f);

		ivan.salarisverhogen(10);
		herman.salarisverhogen(10);

		System.out.println(jan.voornaam + " verdient " + jan.getSalaris());
		System.out.println(herman.voornaam + " verdient " + herman.getSalaris());
		System.out.println(piet.voornaam + " verdient " + piet.getSalaris());
		System.out.println(ivan.voornaam + " verdient " + ivan.getSalaris());
	}
}