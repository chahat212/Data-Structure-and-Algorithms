package twodarray;

public class diagonalsum {
    public static int matri(int matrix[][]){
        // not an optimal approoach as time complexity is o(n^2)
        // int sum = 0;

        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum += matrix[i][j];

        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];


        //         }
        //     }
        // }
        // return sum;


        // Optimal approach;
         int sum = 0;
            
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
            if(i != matrix.length-1-i){ 
            sum += matrix[i][matrix.length-1-i];
            }
        
           
        }
        return sum;



    }

    

    public static void main(String[] args) {
        
        int matrix[][] = {{1 , 2 , 3 },
                          {5 , 6 , 7 },
                          {9 , 10 , 11}};
         int x = matri(matrix);
         System.out.print(x);



        
    }
    
}
