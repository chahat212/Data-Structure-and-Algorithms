package arrays;

public class arg {
    public static void operation(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i]+1;

        }
    }
    public static void main(String[] args) {
        
       int marks[] = {90,91,92};
       operation(marks);

       for(int i=0;i<marks.length;i++){ 
        System.out.println("updated marks is:" + marks[i]);
       }
       System.out.println();
        
       
       

        
        
    }
    
}
