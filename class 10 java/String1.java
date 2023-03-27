public class String1 {
    public static void main(String[] args) {
        String str1=" sutlan MAMUD";
        String str2="zubaid adnan";
        
        System.out.println(str2);
        System.out.println(str2.trim());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());

        System.out.println(str1.length()); //important
        System.out.println(str1.charAt(3)); //important
        System.out.println(str1.indexOf('z')); //important
        System.out.println(str1.lastIndexOf('a')); //important

        String str3 = str1.concat(str2);
        System.out.println(str3);
    }
}
