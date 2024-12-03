public class Ipv4 {


    // Regex
    private String _192_a_223 = "(19[2-9]|2[0-2][0-3])";
    private String _0_a_255 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    private String _0_a_126 = "([0-9]|[1-9][0-9]|1[0-1][0-9]|12[0-6])";
    private String _128_a_191 = "(12[8-9]|1[3-8][0-9]|19[0-1])";

    // Variables inutiles en l'état
    private String adressesPrivees;
    private String apipa;


    // Comparaison entre la valeur entrée par l'utilisateur et les diverses classes
    public boolean classeA(String ip) {
    String regexA =  _0_a_126 + "\\." + _0_a_255 + "\\." + _0_a_255 + "\\." + _0_a_255;
    return ip.matches(regexA);
    }
    public boolean classeAPrivee(String ip) {
        String regexAPrivee =  "(10)" + "\\." + _0_a_255 + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexAPrivee);
    }
    public boolean loopback(String ip) {
        String regexLoopback =  "(127)" + "\\." + _0_a_255 + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexLoopback);
    }
    public boolean routeParDefaut(String ip) {
        String regexRouteParDefaut =  "(0)" + "\\." + _0_a_255 + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexRouteParDefaut);
    }
    public boolean classeB(String ip) {
        String regexB =  _128_a_191 + "\\." + _0_a_255 + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexB);
    }
    public boolean classeBPrivee(String ip) {
        String regexBPrivee =  "(172)" + "\\." + "(1[6-9]|2[0-9]|3[0-1])" + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexBPrivee);
    }
    public boolean classeC(String ip) {
        String regexC =  _192_a_223 + "\\." + _0_a_255 + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexC);
    }
    public boolean classeCPrivee(String ip) {
        String regexCPrivee =  "(192)" + "\\." + "(168)" + "\\." + _0_a_255 + "\\." + _0_a_255;
        return ip.matches(regexCPrivee);
    }

}