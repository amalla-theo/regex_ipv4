public class Ipv4 {


    // Les regex de ce paragraphes sont fonctionnels
    private String _192_a_223 = "(19[2-9]|2[0-2][0-3])";
    private String _0_a_255 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    private String _0_a_126 = "([0-9]|[1-9][0-9]|1[0-1][0-9]|12[0-6])";
    private String _128_a_191 = "(12[8-9]|1[3-8][0-9]|19[0-1])";


    private String adressesPrivees;
    private String apipa;

/*
    public boolean classeA (String _0_a_255, String classeIpV4) {
        boolean classeA = false;
        if (classeIpV4.matches(_0_a_255)) {
            classeA = true;
        }
        return classeA;
    }

*/

/*
    public class Test ((String _0_a_255, String classeIpV4)){
        boolean bTest = false;
        if (classeIpV4.matches(_0_a_255)) {
            bTest = true;
        }
        return bTest;
    }
}


 */