package string2;

public class SameStarChar {
    public boolean sameStarChar(String str) {
//        String sep = "/*";
//        String[] sepArr =str.split(sep);
//        for (int i = 0; i <sepArr.length-1 ; i++) {
//            if(sepArr[i].equals(sepArr[i+1])){
//                return true;
//            }
//        }
//        return false;

        int a;
        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i).contains("/*")){
                a = str.indexOf("/*", i);
                if(a>0&a<str.length()-1){
                    if(str.substring(i, a).equals(str.substring(a+1, str.indexOf("/*")))){
                        return true;
                    }
                }
            }
        }return false;
    }

}
