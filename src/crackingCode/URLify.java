package crackingCode;


public class URLify {

    public static String urlifyString(String str) {
        /*
        need to trim()
        replace all spaces with %20
         */
        StringBuilder urlifyString = new StringBuilder();
        String result = str.trim();
        return  result.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        String str = "Mr John Smith";
        System.out.println(urlifyString(str));
    }
}
