public class Film {
    protected String titolo;
    protected String Genere;
    protected String regista;
    protected int anno;
    protected int durata;
    protected double rating; // double can store fractional number

    public Film(String titolo, String Genere,String regista, int anno, int durata, double rating) {
        this.titolo = titolo;
        this.Genere = Genere;
        this.regista= regista;
        this.anno   = anno;
        this.durata = durata;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }


    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Da 0 a 5");
        }
    }


    protected String getSimbol() {
        switch (Genere.toLowerCase()) {
            case "azione": return "⭐";
            case "drama": return "😢";
            case "commedia": return "😂";
            default: return "⭐";
        }
    }

    @Override
    public String toString() {
        return "Titolo: " + titolo + ", Genere: " + Genere + ", Regista: " + regista + ", Anno: " + anno + ", Durata: " + durata + " minuti, Rating: " + rating +
                " / 5 " + getSimbol();
    }
}
