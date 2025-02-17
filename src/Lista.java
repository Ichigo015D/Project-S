import java.util.function.Predicate;

public class Lista{
    private Nodo head;
    private int elementi;

    public Lista() {
        head = null;
        elementi = 0;
    }
    public void visitaLista(){
        Nodo p = head;

        while(p !=null) {
            esamina(p.getInfo());
            p = p.getLink();
        }
    }

    private void esamina(Tipo info) {
    }

    private void visitaRicorsivaLista(Nodo p) {
        if (p == null)
            return;
        esamina(p.getInfo());
        visitaRicorsivaLista(p.getLink());
    }

public void inserisciInTesta(Tipo info){
        Nodo n = new Nodo (info);
        n.setLink(head);

        head = n;
        elementi++;
}
public void inserisciInCoda(Tipo info){
        Nodo p = head;
        Nodo n = new Nodo(info);
        if (p == null)
        inserisciInTesta(info);
        else{
            while (p.getLink() != null)
                p = p.getLink();
            n.setLink(null);
            p.setLink(n);
            elementi++;
    }
}
public void eliminaInTesta(){
        if (head == null)
            return;
        head = head.getLink();

        elementi--;
}
public void eliminaIncoda(){
        if (head == null)
            return;
        if (head.getLink() == null)
            eliminaInTesta();
        else{
            Nodo p =head, pp = head.getLink();
            while (pp.getLink() != null){
                p = pp;
                pp = pp.getLink();
            }
            p.setLink(null);
            elementi--;
        }
}
}
