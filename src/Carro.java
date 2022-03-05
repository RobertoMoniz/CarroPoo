public class Carro {
    private String modelo;
    private String cor;
    private int velMaxima;
    private Motor motor;
    private Pneus pneu;

    public Carro(String modelo, String cor, int velMaxima, Motor motor, Pneus pneu) {
        this.modelo = modelo;
        this.cor = cor;
        this.velMaxima = velMaxima;
        this.motor = motor;
        this.pneu = pneu;
    }


// setters

    public void setPneu(Pneus pneu) {
        this.pneu = pneu;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setCor(String c) {
        this.cor = c;

    }

    public void setVelMaxima(int v) {
        this.velMaxima = v;
    }

    public void setMotor(Motor m) {
        this.motor = m;
    }

// getters

    public Pneus getPneu() {
        return pneu;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getVelMaxima() {
        return this.velMaxima;
    }

    public Motor getMotor() {
        return this.motor;
    }

// outros metodos...

    public void showStatusCarro() {
        System.out.println("Modelo = " + this.getModelo() + "\nCor = " + this.getCor() + "\nVelocidade maxima = "
                + "" + this.getVelMaxima() + "\nMotor = " + this.motor.getModeloM());
        System.out.println("Modelo pneu = " + this.pneu.getMarca() + "\nTipo = " + this.pneu.getTipo());

    }

    public void showStatusMotorCarro() {
        this.motor.showStatusMotor();
    }

    public void showStatusPneusCarro() {
        this.pneu.showStatusPneu();
    }

}