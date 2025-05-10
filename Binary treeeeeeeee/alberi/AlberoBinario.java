package alberi;

public class AlberoBinario {
    private Nodo radice;

    public AlberoBinario() {
        radice = null;
    }

    public Nodo getRadice() {
        return radice;
    }

    public void inserisci(Tipo valore) {
        radice = inserisciRicorsivo(radice, valore);
    }

    private Nodo inserisciRicorsivo(Nodo nodo, Tipo valore) {
        if (nodo == null) {
            return new Nodo(valore);
        }

        if (valore.getValore() < nodo.getInfo().getValore()) {
            nodo.setFiglioSx(inserisciRicorsivo(nodo.getFiglioSx(), valore));
        } else if (valore.getValore() > nodo.getInfo().getValore()) {
            nodo.setFiglioDx(inserisciRicorsivo(nodo.getFiglioDx(), valore));
        }

        return nodo;
    }

    public boolean ricerca(int valore) {
        return ricercaRicorsiva(radice, valore);
    }

    private boolean ricercaRicorsiva(Nodo nodo, int valore) {
        if (nodo == null) return false;

        if (valore == nodo.getInfo().getValore()) {
            return true;
        } else if (valore < nodo.getInfo().getValore()) {
            return ricercaRicorsiva(nodo.getFiglioSx(), valore);
        } else {
            return ricercaRicorsiva(nodo.getFiglioDx(), valore);
        }
    }

    public void vistaSimmetrica(Nodo n) {
        if (n == null) return;
        vistaSimmetrica(n.getFiglioSx());
        System.out.println(n.getInfo().getValore());
        vistaSimmetrica(n.getFiglioDx());
    }

    public void vistaAnticipata(Nodo n) {
        if (n == null) return;
        System.out.println(n.getInfo().getValore());
        vistaAnticipata(n.getFiglioSx());
        vistaAnticipata(n.getFiglioDx());
    }

    public void vistaDifferita(Nodo n) {
        if (n == null) return;
        vistaDifferita(n.getFiglioSx());
        vistaDifferita(n.getFiglioDx());
        System.out.println(n.getInfo().getValore());
    }
}
