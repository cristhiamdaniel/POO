package quizSecciones;

public class Main {
    public static void main(String[] args) {
        Conica ecuacion1 = new Conica(1, 0, 4, -6, 16, 21);
        System.out.println(ecuacion1.clasificar());

        Conica ecuacion2 = new Conica(4, 0, -1, -4, 0, -3);
        System.out.println(ecuacion2.clasificar());

        Conica ecuacion3 = new Conica(25, 0, 0, -10, -200, -119);
        System.out.println(ecuacion3.clasificar());

        Conica ecuacion4 = new Conica(0, 0, 1, -1, -4, -5);
        System.out.println(ecuacion4.clasificar());

        Conica ecuacion5 = new Conica(9, 0, 9, -36, 6, 34);
        System.out.println(ecuacion5.clasificar());
    }
}
