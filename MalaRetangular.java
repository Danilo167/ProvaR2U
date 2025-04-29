public class MalaRetangular implements ItemASerEmbaladoIF {
    private double lado1;
    private double lado2;
    private double peso;

    public MalaRetangular(double lado1, double lado2, double peso) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.peso = peso;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public double calculaArea() {
        return lado1 * lado2;
    }

    @Override
    public double calculaQtdeEmbalagem() {
        return calculaArea() * peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String getDescricaoEmbalagem() {
        return "Mala retangular - área: " + calculaArea() + ", peso: " + peso + ", qtde embalagem: " + calculaQtdeEmbalagem();
    }

    @Override
    public int hashCode() {
        return (int)(lado1 * 31 + lado2 * 17 + peso * 13);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MalaRetangular)) return false;
        MalaRetangular outra = (MalaRetangular) o;
        return this.lado1 == outra.lado1 && this.lado2 == outra.lado2 && this.peso == outra.peso;
    }

    @Override
    public String toString() {
        return "MalaRetangular{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", peso=" + peso +
                '}';
    }
}
