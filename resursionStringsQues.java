public class resursionStringsQues {
    public static void main(String[] args) {
        String str = "bacceaad";
        // System.out.println(removeA(str));
        // skip("", str);
        System.out.println(skipR(str));
        
    }
    // create another string that has removed all the other strings inside it
   static String removeA(String str){
    return helper(str,"",0, str.length()-1);
   }
   private static String helper(String str, String ans,int start, int end){
    if(start == end){
        if(str.charAt(start) == 'a'){
            return ans;
        } else {
            return ans + str.charAt(start);
        }
    }

        if(str.charAt(start) == 'a'){
            return ans + helper(str, ans, start+1, end);
        }
        return ans + str.charAt(start) + helper(str, ans, start+1, end);
   }


   static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p, up.substring(1));
        } else {
            skip(p+ch, up.substring(1));
        }
   }

   static String skipR(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skipR(up.substring(1));
        } 
            return ch + skipR(up.substring(1));
        
   }
}
