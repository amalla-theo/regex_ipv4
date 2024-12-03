import clavier.In;

public class Main {

    public static void main(String[] args) {

        Ipv4 saisie = new Ipv4();

        String classeIpV4 = new String("0");

        System.out.println("Veuillez entrer une adresse IPv4");
        classeIpV4 = In.readString();


        if (saisie.classeA(classeIpV4) == true) {
            System.out.println("Cette adresse est de classe A");
        }else {
            System.out.println("Erreur");
        }

    }
}