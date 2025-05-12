package alberi;

public class main {
    public static void main(String[] args) {
        AlberoBinario albero = new AlberoBinario();

        albero.inserisci(new Tipo(10));
        albero.inserisci(new Tipo(5));
        albero.inserisci(new Tipo(15));

        System.out.println("Visita Simmetrica:");
        albero.vistaSimmetrica(albero.getRadice());

        System.out.println("Visita Anticipata:");
        albero.vistaAnticipata(albero.getRadice());
        System.out.println("Visita Differita:");
        albero.vistaDifferita(albero.getRadice());

        System.out.println("Ricerca 5: " + albero.ricerca(5));   // true
        System.out.println("Ricerca 20: " + albero.ricerca(20)); // false.
    }
}
