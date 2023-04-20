package quizSecciones;

public class Conica {
    private double A;
    private double B;
    private double C;
    private double D;
    private double E;
    private double F;

    public Conica(double A, double B, double C, double D, double E, double F) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.E = E;
        this.F = F;
    }

    public String clasificar() {
        if (B == 0) {
            if (A == 0 || C == 0) {
                return "Parabola";
            } else if (A == C) {
                return "Circunferencia";
            } else if (A * C > 0) {
                return "Elipse";
            } else if (A * C < 0) {
                return "Hipérbola";
            }
        } else {
            double I = Math.pow(B, 2) - 4 * A * C;
            if (I == 0) {
                return "Parabola";
            } else if (I < 0) {
                return "Elipse";
            } else if (I > 0) {
                return "Hipérbola";
            }
        }
        return "";
    }
}
