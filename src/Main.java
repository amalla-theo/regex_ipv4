import clavier.In;

public class Main {

    public static void main(String[] args) {

        Ipv4 saisie = new Ipv4();

        // Variable stockant la saisie de l'utilisateur
        String classeIpV4 = new String("0");

        System.out.println("Veuillez entrer une adresse IPv4");
        classeIpV4 = In.readString();

        // Classe A
        if (saisie.classeA(classeIpV4) == true) {
            System.out.println("Cette adresse est de classe A");
            if (saisie.classeAPrivee(classeIpV4) == true) {
                System.out.println("Cette adresse est privée");
            } else if (saisie.routeParDefaut(classeIpV4) == true) {
                System.out.println("Cette adresse est une route par defaut");
            } else {
                System.out.println("Cette adresse est publique");
            }
        }
        if (saisie.loopback(classeIpV4) == true) {
            System.out.println("Cette adresse est un loopback");
        }

        // Classe B
        if (saisie.classeB(classeIpV4) == true) {
            System.out.println("Cette adresse est de classe B");
            if (saisie.classeBPrivee(classeIpV4) == true) {
                System.out.println("Cette adresse est privée");
            } else {
                System.out.println("Cette adresse est publique");
            }
        }

        // Classe C
        if (saisie.classeC(classeIpV4) == true) {
            System.out.println("Cette adresse est de classe C");
            if (saisie.classeCPrivee(classeIpV4) == true) {
                System.out.println("Cette adresse est privée");
            } else {
                System.out.println("Cette adresse est publique");
            }
        }

    }
}