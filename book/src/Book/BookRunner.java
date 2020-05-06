package Book;

public class BookRunner {

	public static void main(String[] args) {
		Book ArtOfWar = new Book();
		Book Ikigai = new Book();

		ArtOfWar.name = "Art Of War";
		ArtOfWar.author = "Sun Tzu";
		ArtOfWar.releaseDate = "29-04-2020";
		ArtOfWar.numPages = "89";

		Ikigai.name = "Ikigai";
		Ikigai.author = "Gaurav";
		Ikigai.releaseDate = "30-04-2020";
		Ikigai.numPages = "88";

		ArtOfWar.readBook(); // Reading Art of War
		Ikigai.readBook(); // Reading Ikigai

	}

}
