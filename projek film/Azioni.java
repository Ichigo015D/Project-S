import java.util.ArrayList;

public class Azioni extends Catalogo{
    public ArrayList<Film> filmAzione = new ArrayList<>();

    public Azioni(){
        //filmAzione = new ArrayList<Film>();
        super();
    }


    public void aggiungiAzione(String titolo, String regista, int anno, int durata, double rating){
        Film nuovoFilmAzione = new Film(titolo,"Azione", regista, anno, durata, rating);
        filmAzione.add(nuovoFilmAzione);
    }

    public ArrayList<Film> getFilmAzione() {
        return filmAzione;
    }
}