public class ControlVelocidad {
    private double velocidadActual;
    private double velocidadMaximaPermitida;

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadMaximaPermitida() {
        return velocidadMaximaPermitida;
    }

    public void setVelocidadMaximaPermitida(double velocidadMaximaPermitida) {
        this.velocidadMaximaPermitida = velocidadMaximaPermitida;
    }

    public ControlVelocidad(double velocidadActual, double velocidadMaximaPermitida) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaximaPermitida = velocidadMaximaPermitida;
    }

    void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadActual += incremento;

            if (this.velocidadActual > this.velocidadMaximaPermitida) {
                this.velocidadActual = this.velocidadMaximaPermitida;
            }
        }
    }

    void frenar(double decremento) {
        if (decremento > 0) {
            this.velocidadActual -= decremento;

            if (this.velocidadActual < 0.0) {
                this.velocidadActual = 0.0;
            }
        }
    }
}

