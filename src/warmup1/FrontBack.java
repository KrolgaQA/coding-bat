package warmup1;

public class FrontBack {
    public String frontBack(String str) {
//        char[] ch = str.toCharArray();
//        char first = ch[0];
//        char last = ch[ch.length-1];
//        ch[0] = last;
//        ch[ch.length-1] = first;
//        String s= new String(ch);
//        return s;


//if(str.length()<=1){
//    return str;
//}else {
        //   String s1 = str.substring(0,1);
//    System.out.println(s1);
        //   String s2 = str.substring(str.length() - 1);
//    System.out.println(s2);
//    String str1 = str.replace(str.substring(0,1), "");
//    String str2 = str1.replace(str1.substring(str1.length() - 1), "");
//    System.out.println(str1);
//    System.out.println(str2);
//    return s2 + str2 + s1;
//}


//if(str.length()<=1){
        //return str;
//}else {
        //   return s2 + str.substring(1, str.length()-1) +s1;
//}

//}


        if (str.length() < 2) {
            return str;

        } else {
            String s1 = str.substring(0, 1);
            String s2 = str.substring(str.length() - 1);
            return s2 + str.substring(1, str.length() - 1) + s1;
        }
    }

}

