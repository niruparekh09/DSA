public class Pract {
    public static void main(String[] args) {
        String str = "Tony";
        String str2 = "Tony";
        String str3 = new String("Tony");

        System.out.println(str.charAt(0) == str2.charAt(0));
        System.out.println(str.charAt(0) == str3.charAt(0)); // Will give True because comparing primitive data type
        System.out.println(str.equals(str2));
        System.out.println(str.equals(str3));
    }

}
