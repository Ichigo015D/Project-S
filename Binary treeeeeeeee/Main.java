public class Main {
    public static void main(String[] args) {

        NodoAlberoBinario root = new NodoAlberoBinario(new Tipo(10));
        NodoAlberoBinario kiri = new NodoAlberoBinario(new Tipo(5));
        NodoAlberoBinario kanan = new NodoAlberoBinario(new Tipo(15));


        root.setLeftChild(kiri);
        root.setRightChild(kanan);


        AlberoBinario albero = new AlberoBinario();
        albero.setRoot(root);

        System.out.println("alberi simmetrica (inorder):");
        albero.visitaSimmetrica();
    }
}