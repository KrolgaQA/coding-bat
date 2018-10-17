package string2;

public class ZipZap {
    public String zipZap(String str) {
//        String s = "";
//        for (int i = 0; i <str.length()-3 ; i+=2) {
//           if(str.charAt(i)=='z'&&str.charAt(i+2)=='p'){
//               s = s + str.charAt(i)+str.charAt(i+2);
//           }else{
//               s = s+str.substring(i, i+3);
//           }
//
//        }return s;

        return str.replaceAll("z.p", "zp");

    }
}
