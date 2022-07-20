public class Mochila{
    private Caderno caderno;
    private Estojo estojo;
    private double precoMochila;

    public Mochila(Caderno caderno, Estojo estojo, double precoMochila) {
        setCaderno(caderno);
        setEstojo(estojo);
        setPrecoMochila(precoMochila);
    }

    public void setPrecoMochila(double precoMochila) {
       if (precoMochila > 0.0) 
            this.precoMochila = precoMochila;
       else this.precoMochila = 1;
    }
   
    double getPrecoMochila(){
        return this.precoMochila;
    }
    
    double precoCadernoTotal(){
        return this.precoMochila + caderno.getPrecoCaderno() + estojo.getPrecoEstojo();
    }

    public Caderno getCaderno() {
        return caderno;
    }

    public void setCaderno(Caderno caderno) {
        this.caderno = caderno;
    }

    public Estojo getEstojo() {
        return estojo;
    }

    public void setEstojo(Estojo estojo) {
        this.estojo = estojo;
    }
    
    public String toString(){
        return this.caderno + "\n" + this.estojo + "\n" + "Preço da mochila: R$ " + this.precoMochila + "\n Preço total: " + this.precoCadernoTotal();
    }
}