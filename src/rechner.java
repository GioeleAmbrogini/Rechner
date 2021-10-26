import java.util.Scanner;

public class rechner {

    // Die zweite If esle Schleife funktioniert nicht und leider habe ich keine Lösung gefunden aber wenn man bei der zweitenWährung eine Währung eingibt
    // dann rechnet das Programm alles richtig aus.

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Variabel initialieseren
        String eingabe;
        double ergebnis;
        String ZweiteWährung;

        System.out.println("Bitte geben Sie eine Währung an Dollar/Euro/Franken:");
        // Man wählt eine Währung die man hat

        eingabe = (scan.nextLine());
            if (eingabe.equals("Dollar")) {
                // Man gibt die Menge an
                System.out.println("Geben Sie ihre Menge an: ");
                double dollars = scan.nextDouble();
                System.out.println("Geben Sie die Währung an in die Sie umrechnen wollen: ");

                // Man gibt die Währung an in die man Umrechnen will
                ZweiteWährung = (scan.nextLine());
                    if (ZweiteWährung.equals("Euro")) {
                        // es wird umgerechnet in die gewünschte Währung
                        ergebnis = dollars*0.8617;
                        // das ergebniss wird ausgegeben
                        System.out.println("Sie haben " + ergebnis + " Euro");
                    }
                    else if (ZweiteWährung.equals("Franken")) {
                        ergebnis = dollars*0.926;
                        System.out.println("Sie haben " + ergebnis + " Franken");
                    }
                    else {
                        // Wenn keine gültige Währung angegeben wird gibt die Konsole das aus
                        System.out.println("Geben Sie eine gültige Währung an !!");
                    }
            }

            else if (eingabe.equals("Euro")) {
                System.out.println("Geben Sie ihre Menge an: ");
                double euros = scan.nextDouble();
                System.out.println("Geben Sie die Währung an in die Sie umrechnen wollen: ");

                ZweiteWährung = "Franken";
                if (ZweiteWährung.equals("Dollar")) {
                    ergebnis = euros*1.1605;
                    System.out.println("Sie haben " + ergebnis + " Dollar");
                }
                else if (ZweiteWährung.equals("Franken")) {
                    ergebnis = euros*1.0746;
                    System.out.println("Sie haben " + ergebnis + " Franken");
                }
                else {
                    System.out.println("Geben Sie eine gültige Währung an !!");
                }
            }

            else if (eingabe.equals("Franken")) {
                System.out.println("Geben Sie ihre Menge an: ");
                double frankens = scan.nextDouble();
                System.out.println("Geben Sie die Währung an in die Sie umrechnen wollen: ");

                ZweiteWährung = "Euro";
                if (ZweiteWährung.equals("Dollar")) {
                    ergebnis = frankens*1.0799;
                    System.out.println("Sie haben " + ergebnis + " Dollar");
                }
                else if (ZweiteWährung.equals("Euro")) {
                    ergebnis = frankens*0.9306;
                    System.out.println("Sie haben " + ergebnis + " Euro");
                }
                else {
                    System.out.println("Geben Sie eine gültige Währung an !!");
                }
            }

            else    {
                // wenn keine gültige Währung gegeben wird, wird das ausgegeben
                System.out.println("Geben Sie bitte eine gültige Währung an !!");
            }


        // System.out.println("Die Summe ergibt genau: " + ergebnis + " Dollar");
    }
}
