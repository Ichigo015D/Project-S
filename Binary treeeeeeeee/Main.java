public class Main {
    public static void main(String[] args) {

        NodoAlberoBinario root = new NodoAlberoBinario(new Tipo(10));
        NodoAlberoBinario sinistra = new NodoAlberoBinario(new Tipo(5));
        NodoAlberoBinario destra = new NodoAlberoBinario(new Tipo(15));


        root.setLeftChild(sinistra);
        root.setRightChild(destra);


        AlberoBinario albero = new AlberoBinario();
        albero.setRoot(root);

        System.out.println("alberi simmetrica (inorder):");
        albero.visitaSimmetrica();
    }
}
