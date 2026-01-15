package task105;

//https://www.codewars.com/kata/541a354c39c5efa5fa001372/train/java

public class IpTranslator {
    public static final int OCTET_LENGTH_BITS = 8;
    public static final int FULL_IP_LENGTH_BITS = 32;

    public static long ipToNum(String ip) {
        String[] ipAsArray = ip.split("\\.");

        StringBuilder resultBinary = new StringBuilder();

        for (String str : ipAsArray) {
            StringBuilder octetAsBinary = new StringBuilder(Integer.toBinaryString(Integer.parseInt(str)));

            while (octetAsBinary.length() < IpTranslator.OCTET_LENGTH_BITS) {
                octetAsBinary.insert(0, "0");
            }

            resultBinary.append(octetAsBinary);
        }

        return Long.parseLong(resultBinary.toString(), 2);
    }

    public static String numToIp(long num) {
        String binary = Long.toBinaryString(num);

        while (binary.length() < IpTranslator.FULL_IP_LENGTH_BITS) {
            binary = "0" + binary;
        }


        String[] octets = new String[4];
        int idx = 0;

        for(int i = 0; i < binary.length(); i += IpTranslator.OCTET_LENGTH_BITS) {
            int decimal = Integer.parseInt(binary.substring(i, i + IpTranslator.OCTET_LENGTH_BITS), 2);
            octets[idx] = String.valueOf(decimal);
            idx++;
        }

        return String.join(".", octets);
    }
}
