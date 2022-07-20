public class Estojo {
    private int quantidadeMateriais, idEstojo;
    private double precoEstojo;

    public Estojo(int quantidadeMateriais, int idEstojo, double precoEstojo) {
        this.quantidadeMateriais = quantidadeMateriais;
        this.idEstojo = idEstojo;
        this.precoEstojo = precoEstojo;
    }

    public int getQuantidadeMateriais() {
        return quantidadeMateriais;
    }

    public void setQuantidadeMateriais(int quantidadeMateriais) {
        this.quantidadeMateriais = quantidadeMateriais;
    }

    public int getIdEstojo() {
        return idEstojo;
    }

    public void setIdEstojo(int idEstojo) {
        this.idEstojo = idEstojo;
    }

    public double getPrecoEstojo() {
        return precoEstojo;
    }

    public void setPrecoEstojo(double precoEstojo) {
        this.precoEstojo = precoEstojo;
    }

    @Override
    public String toString(){
        return "Estojo: \n Quantidade Materiais: "+ getQuantidadeMateriais() + "\n idEstojo: "+ getIdEstojo() + "\n Preço Estojo: " + getPrecoEstojo();
    }
}
