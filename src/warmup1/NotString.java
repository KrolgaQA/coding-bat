package warmup1;

public class NotString {
    public String notString(String str) {
//        Pattern p = Pattern.compile("(^not )(.*)");
//        Matcher m = p.matcher(str);
//        if(m.matches()){
//            return str;
//        }else return "not " + str;
//        if(str.regionMatches(0, "not "+str, 0, 8)){
//            return str;
//        }else return "not " + str;

        if(str.startsWith("not ")|str=="not"){
            return str;
        }else return "not " + str;
    }
    }
