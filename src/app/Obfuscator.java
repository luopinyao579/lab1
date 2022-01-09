package app;

public class Obfuscator {
    private static String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static String target = "kiMd6GvVlzUPwjg9734pSXbEqC5ZFOQxHyfIN8Bn0LoTA2rKaRhsmJtce1WYDu";

    public static String obfuscate(String s) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            int ind = source.indexOf(chr);
            res[i] = ind != -1 ? target.charAt(ind) : chr;
        }
        return new String(res);
    }

    public static String unobfuscate(String s) {
        char[] res = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            int ind = target.indexOf(chr);
            res[i] = ind != -1 ? source.charAt(ind) : chr;
        }
        return new String(res);
    }
}
