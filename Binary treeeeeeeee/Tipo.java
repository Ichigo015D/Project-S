public class Tipo { // devo fare anche questo clase, perchè se no non funziona tipo nel Alberobinario
    private int valore;

    public Tipo(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return String.valueOf(valore);
    }
}
