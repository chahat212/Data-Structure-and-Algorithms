public class subsets{
    public static void set(String str ,int i  , String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
            
        }
        set(str,i+1,str.charAt(i)+ans);
        set(str,i+1,ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        set(str , 0 , " ");

        
    }
}