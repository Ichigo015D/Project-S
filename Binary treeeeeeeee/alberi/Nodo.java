package alberi;

public class Nodo {
    private Tipo info;
    private Nodo figlioSx;
    private Nodo figlioDx;

    public Nodo(Tipo info) {
        this.info = info;
        this.figlioSx = null;
        this.figlioDx = null;
    }

    public Tipo getInfo() {
        return info;
    }

    public void setInfo(Tipo info) {
        this.info = info;
    }

    public Nodo getFiglioSx() {
        return figlioSx;
    }

    public void setFiglioSx(Nodo figlioSx) {
        this.figlioSx = figlioSx;
    }

    public Nodo getFiglioDx() {
        return figlioDx;
    }

    public void setFiglioDx(Nodo figlioDx) {
        this.figlioDx = figlioDx;
    }
}