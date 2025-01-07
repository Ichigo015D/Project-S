public class Main {
    public static void main(String[] args) {

        Azioni catalogoAzione = new Azioni();
        Commedia catalogoCommedia = new Commedia();
        Drama catalogoDrama = new Drama();

        catalogoAzione.aggiungiAzione("Marvel Infinity War", "Marvel Studio", 2018, 180, 4.8);
        catalogoAzione.aggiungiAzione("John Wick 4","Chad Stahelski", 2023, 189,3.8);
        catalogoAzione.aggiungiAzione("The Dark Knight",        "Christopher Nolan", 2008, 152, 4.9);
        catalogoAzione.aggiungiAzione("The Great Wall",         "Zhang Yimou",       2016, 103, 4.3);
        catalogoAzione.aggiungiAzione("Spider-Man: No Way Home","Jon Watts",         2021, 148, 4.7);

        catalogoCommedia.aggiungiCommedia("Benvenuti al Sud",                 "Luca Miniero", 2010 ,102, 4.6);
        catalogoCommedia.aggiungiCommedia("Tolo Tolo",                        "Checco Zalone",2020, 90,5.7 );
        catalogoCommedia.aggiungiCommedia("South Park:Bigger: Longer & Uncut","Trey Parker",  1999, 81, 4.7);
        catalogoCommedia.aggiungiCommedia("Home Alone",                       "John Williams",1990, 103, 4.8);

        catalogoDrama.aggiungiDrama("Titanic",                    "James Cameron",    1997,194, 4.8);
        catalogoDrama.aggiungiDrama("Oppenheimer",                "Christopher Nolan",2023,180, 3.6);
        catalogoDrama.aggiungiDrama("Life of Pi",                 "Ang Lee",          2012,162, 4.7);
        catalogoDrama.aggiungiDrama("Violet Evergarden:The Movie","Taichi Ishidate",  2020,132, 4.9);

        // Menampilkan daftar genre film
        System.out.println("Elenco dei Film Azioni: ");
        for (Film film : catalogoAzione.filmAzione) {
            System.out.println(film);
        }

        System.out.println("\nElenco dei film Drammatici: ");
                for(Film film : catalogoDrama.filmDrama){
                    System.out.println(film);
                }

        System.out.println("\nElenco dei film Commedie: ") ;
                for(Film film: catalogoCommedia.filmCommedia){
                    System.out.println(film);
                }

    }
}

