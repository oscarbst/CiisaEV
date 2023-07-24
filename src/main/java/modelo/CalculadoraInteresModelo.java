package modelo;

public class CalculadoraInteresModelo {
    private double capital;
    private double tasaInteresAnual;
    private int años;

    public CalculadoraInteresModelo(double capital, double tasaInteresAnual, int años) {
        this.capital = capital;
        this.tasaInteresAnual = tasaInteresAnual;
        this.años = años;
    }

    public double calcularInteresSimple() {
        return capital * (tasaInteresAnual / 100) * años;
    }
}
