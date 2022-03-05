public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo, String cilindradas, String modeloM) {
        this.potencia = potencia;
        this.tipo = tipo;
        this.cilindradas = cilindradas;
        this.modeloM = modeloM;
    }
    private String cilindradas;
    private String modeloM;

    void setPotencia(int p){
        this.potencia = p;
    }

    void setTipo(String t){
        this.tipo = t;
    }

    void setCilindradas(String c){
        this.cilindradas = c;
    }

    void setModelo(String m){
        this.modeloM = m;
    }

    //getters

    public String getTipo(){
        return this.tipo;
    }

    public String getModeloM(){
        return this.modeloM;
    }

    public String getCilindradas(){
        return this.cilindradas;
    }

    public int getPotencia(){
        return this.potencia;
    }

    // outros metodos....

    void showStatusMotor(){
        System.out.println("Motor = "+ this.getModeloM()+"\nTipo = "+this.getTipo()+"\nCilindradas = "+this.getCilindradas()
                +"\nPotencia = "+this.getPotencia());
    }


}

