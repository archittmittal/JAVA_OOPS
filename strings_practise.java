public class strings_practise {

    public static void vowel(String str){
        str = str.toLowerCase();
        for (int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch=='u'){
                System.out.println("Vowels present are: " + ch);
            }

        }
    }

    public static int vowelFrequency(String str){
        int count = 0;
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        for(int i=0 ; i<c.length ; i++){
            if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void countEachVowel(String str){
        str = str.toLowerCase();
        int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
        
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == 'a') countA++;
            else if(ch == 'e') countE++;
            else if(ch == 'i') countI++;
            else if(ch == 'o') countO++;
            else if(ch == 'u') countU++;
        }
        System.out.println("Frequency of a: " + countA);
        System.out.println("Frequency of e: " + countE);
        System.out.println("Frequency of i: " + countI);
        System.out.println("Frequency of o: " + countO);
        System.out.println("Frequency of u: " + countU);
    }

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

        // lexographic comapriosn

        System.out.println(s.compareTo(s1)); //-ve means s1 greater than s
        System.out.println(s.compareTo(s2)); // all equals

        System.out.println(s.compareToIgnoreCase(s4)); // without case checks lexographic order


        // character array
        // System.err.println(s[0]); not array

        char c [] = s.toCharArray();
        System.out.println(c[3]);
        System.out.println(c.length); // this is feature not fxn as in string

        // we have no null character in java chracter array we can add manually

        String str = "mY NAME IS Archit";
        vowel(str);
        
        System.out.println("Frequency of vowels: " + vowelFrequency(str));
        countEachVowel(str);

        //split fxn
        String s13 = "IAS   Archit Mittal ";
        String[] s12 = s13.split("\\s+");
         // space ka aadhr pr split krdega jo hoga fxn me , kitne b space ko to split krdega

        for(String word:s12){
            System.out.println(word);
        }
    }
}

