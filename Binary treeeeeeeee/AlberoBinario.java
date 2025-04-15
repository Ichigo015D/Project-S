public class AlberoBinario {
    private NodoAlberoBinario root;

    public AlberoBinario() {
        root = null;
    }

    public void setRoot(NodoAlberoBinario root) {
        this.root = root;
    }

    public void visitaSimmetrica() {
        visitaSimmetrica(root);
    }

    private void visitaSimmetrica(NodoAlberoBinario p) {
        if (p == null)
            return;

        visitaSimmetrica(p.getLeftChild());
        esamina(p.getInfo());
        visitaSimmetrica(p.getRightChild());
    }

    private void esamina(Tipo info) {
        System.out.println(info);
    }
}