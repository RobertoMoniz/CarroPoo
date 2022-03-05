public class Pneus {
    public Pneus(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String marca;
    public String tipo;


    void setTipo(String t){
        this.tipo = t;
    }

    void setMarca(String m){
        this.marca = m;
    }

    // getters

    public String getMarca(){
        return this.marca;
    }

    public String getTipo(){
        return this.tipo;
    }

    // outros metodos....

    public void showStatusPneu(){
        System.out.println("Marca = "+this.getMarca()+"\nTipo = "+this.getTipo());
    }

}

