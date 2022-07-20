public class Caderno {
    private int numMaterias, numFolhas, idCaderno;
    private double precoCaderno;
    
    Caderno(int nm, int nf, int id, double preco){
        setNumMaterias(nm);
        setNumFolhas(nf);
        this.idCaderno = id;
        setPrecoCaderno(preco);
    }
    int getNumMaterias(){
        return this.numMaterias;
    }
    
    void setNumMaterias(int nm){
        if(nm > 0) this.numMaterias = nm; 
        else this.numMaterias = 1;
    }   
    
    int getNumFolhas(){
        return this.numFolhas;
    }
    
    void setNumFolhas(int nf){
        if(nf > 0) this.numFolhas = nf;
        else this.numFolhas = 1;
    }
    double getPrecoCaderno(){
        return this.precoCaderno;
    }
     
    void setPrecoCaderno(double preco){
        if (preco > 0) this.precoCaderno = preco;
        else this.precoCaderno = 1;
    }

    public int getIdCaderno() {
        return idCaderno;
    }
    
    public void setIdCaderno(int idCaderno) {
        if (idCaderno > 0) this.idCaderno = idCaderno;
        else this.idCaderno = 1;
        
    }

    public String toString(){
        return "Caderno: \n Materias: " + this.numMaterias +"\n Número de Folhas: " + this.numFolhas + "\n Preço : " + this.precoCaderno + "\n idCaderno: " + this.idCaderno;  
    }
}