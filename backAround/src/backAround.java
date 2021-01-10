public class backAround{
    public String backAround(String str){
        int lastCharPos = str.length()-1;
        String newStr = str.charAt(lastCharPos) + str + str.charAt(lastCharPos);
        return newStr;
    }
}
