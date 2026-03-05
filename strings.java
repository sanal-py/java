public class strings {
    public static void main(String[] args) {

        String str1 = "hello worlds";
        String str2 = "java is simple";
        int length = str1.length();
        System.out.println("length of string" + length);

        // string concatination
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        // string comparsion
        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        // index of
        int index = str1.indexOf("o");
        System.out.println(index);

        // replace
        String replaced = str1.replace('o', 'l');
        System.out.println("replaced string :" + replaced);

        // substring
        String sub = str2.substring(0, 4);
        System.out.println(sub);

        // Trim
        String str5 = "   java   ";
        String trimmed = str5.trim();
        System.out.println(trimmed);

        // ascii value
        byte ascii[] = { 75, 72, 102 };
        String f = new String(ascii);
        System.out.println(f);

        // ascii value str1
        byte[] bytearray = str1.getBytes();
        System.out.println("asci value of string 1 :" + java.util.Arrays.toString(bytearray));

    }
}