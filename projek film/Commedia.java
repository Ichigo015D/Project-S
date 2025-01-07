import java.util.ArrayList;

public class Commedia  extends Catalogo{
    public ArrayList<Film> filmCommedia = new ArrayList<>();

    public Commedia(){
        filmCommedia = new ArrayList<>();

    }

    public void aggiungiCommedia(String titolo, String regista, int anno, int durata, double rating){
        Film nuovoFilm = new Film(titolo,"Commedia", regista, anno, durata, rating );
        filmCommedia.add(nuovoFilm);
    }

    public ArrayList<Film> getFilmCommedia() {
        return filmCommedia;
    }
}
