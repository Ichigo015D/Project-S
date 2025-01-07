import java.util.ArrayList;

public class Drama  extends Catalogo{
    public ArrayList<Film> filmDrama = new ArrayList<>();

    public Drama(){
        filmDrama = new ArrayList<>();

    }


    public void aggiungiDrama(String titolo, String regista, int anno, int durata, double rating){
        Film nuovoFilm = new Film(titolo,"Drama", regista, anno, durata, rating);
        filmDrama.add(nuovoFilm);
    }

    public void ricerca(String parola){
        for(int i=0; i < filmDrama.size(); ){
            if(filmDrama.get(i).titolo == parola){
                System.out.println("\n Film trovato! ");
                System.out.println(filmDrama.get(i));
                break;
            }else{
                System.out.println("\n film non presente nel catalogo");
                break;
            }

        }
    }
    public ArrayList<Film> getFilmDrama() {
        return filmDrama;
    }
}