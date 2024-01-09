import java.util.Arrays;

public class StringsMethods {
    public static void main(String[] args) {

        String text = "Java is a good programming languauge";
        String [] a1 = text.split("");
        String [] a2 = text.split(" ");
        String [] a3 = text.split("o");

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        System.out.println(a3.length);


//        The compareTo() method compares two strings lexicographically (in the dictionary order). The comparison is based on the Unicode value of each character in the strings.

        String str1 = "Learn Java";
        String str2 = "Learn Java";
        String str3 = "Learn Kolin";
        int result;
        result = str1.compareTo(str2);
        System.out.println(result);
        result = str1.compareTo(str3);
        System.out.println(result);
        result = str3.compareTo(str1);

        System.out.println(result);

//        compareToIgnoreCase() Return Value
//                returns 0 if the strings are equal, ignoring case considerations
//                returns a negative integer if string comes before the str argument in the dictionary order
//                returns a positive integer if string comes after the str argument in the dictionary order

        int result1;
        result1 = str1.compareToIgnoreCase(str2);
        System.out.println(result1);
        result1 = str1.compareToIgnoreCase(str3);
        System.out.println(result1);
        result1 = str3.compareToIgnoreCase(str1);
        System.out.println(result1);

        System.out.println("Length : "+str1.length());


        System.out.println(text.replace("Java", "JAVA"));

        System.out.println(text.substring(9));
        System.out.println(text.substring(5,10));
        System.out.println(text.subSequence(5, 10));

//        The equals() method returns true if two strings are identical and false if the strings are different.
//        equalsIgnoreCase
        System.out.println(str1.equalsIgnoreCase("Learn Java"));

        if (str1.contains("Java")) {
            System.out.println(str1 + " contains " + "Java");
        }

//         trim()
//         removes any leading (starting) and trailing (ending) whitespaces from the specified string
//         charAt() method returns the character at the specified index.
//        toLowerCase()
//        toUpperCase()

//        concat() Vs the + Operator for Concatenation
//
//        concat()                                                                             the + Operator
//
//        Suppose, str1 is null and str2 is "Java".                                       Suppose, str1 is null and str2 is "Java". Then, str1 + str2 gives "nullJava".
//        Then, str1.concat(str2) throws NullPointerException.
//
//
//        You can only pass a String to the concat() method.                              If one of the operands is a string and another is a non-string value.
//                                                                                        The non-string value is internally converted to a string before concatenation.
//                                                                                        For example, "Java" + 5 gives "Java5".



//        startsWith()
//        endsWith()
//        isEmpty()
//        intern()  -- The String interning ensures that all strings having the same contents use the same memory.

        String joined = String.join("*",str1,str2,str3);
        System.out.println("Joined:"+joined);

//        replaceFirst()
//        method returns a new string where the first occurrence of the matching substring is replaced with the replacement string.

        System.out.println(text.toCharArray());

    }
}
