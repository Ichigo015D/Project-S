public class NodoAlberoBinario {
    private Tipo info;
    private NodoAlberoBinario psx;
    private NodoAlberoBinario pdx;

    public NodoAlberoBinario(Tipo info) {
        this.info = info;
        psx = null;
        pdx = null;
    }

    public void setInfo(Tipo info) {
        this.info = info;
    }

    public Tipo getInfo() {
        return info;
    }

    public void setLeftChild(NodoAlberoBinario psx) {
        this.psx = psx;
    }

    public NodoAlberoBinario getLeftChild() {
        return psx;
    }

    public void setRightChild(NodoAlberoBinario pdx) {
        this.pdx = pdx;
    }

    public NodoAlberoBinario getRightChild() {
        return pdx;
    }
}