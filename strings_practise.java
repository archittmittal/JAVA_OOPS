public class strings_practise {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "BIE";
        String s2 = "Hello";
        //strlenghth
        System.out.println(s.length());
        //concatenate
        System.out.println(s.concat(s1)); // string is immutable not chnaged  // garbage bnra no refrence iska
        System.out.println(s); // strings are immutable cannot be chnaged
        System.out.println(s.length());

        String ss = "Strings are immutable";
        System.out.println(ss.charAt(4)); // 0 based index

        /*s= s.concat(s1); // ab s ki value chnage hogui aur s ki purani value garbage hogyi!! 
        // // low priority thread garbage collector part of execution enginge in jvm 
        System.out.println(s); */

        System.out.println(s.equals(s2)); // points same memory location 

        String s3 = new String("Hello");
        System.out.println(s==s3); // object compare differnet location
        System.out.println(s.equals(s3)); // value comapre

        String s4 = "hELLo";
        System.out.println(s.equalsIgnoreCase(s4));

        System.out.println(ss.indexOf('t', 5));
        System.out.println(ss.indexOf("immutable"));
        ss.toLowerCase();
        System.err.println(ss); // original value won't chnage, until assigned i,e they aare immutable

        String s7 = "  a. b. c. ";
        String s8 = "";
        System.out.println(s7.trim());
        System.out.println(s7.length()); // original lentgh wont chnage until assined

        System.out.println(s7.isEmpty());
        System.out.println(s8.isEmpty());

        //susbstring
        String s9 = "hellothere";
        System.out.println(s9.substring(5)); // beginning index ke baad se start krdega
        System.out.println(s9.substring(5,8)); // 6 to 8 chlega si<word<=endinex


    }
    
}
