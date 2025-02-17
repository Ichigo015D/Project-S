public class Nodo {
    private Tipo info;
    private Nodo Link;

    public Nodo (Tipo data){
       this.info = data;
        this.Link = null;
    }
    public Nodo setinfo(Tipo info){
        this.info = info;
        return null;
    }

    public Tipo getInfo(){
        return info;
    }

    public void setLink (Nodo Link){
        this.Link = Link;
    }
    public Nodo getLink(){
        return Link;
    }
}

