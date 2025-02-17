public class Tipo {
    private String info;

    public Tipo(String data) {
        this.info = data;
    }

    public String getData() {
        return info;
    }

    @Override
    public String toString() {
        return info;
    }
}