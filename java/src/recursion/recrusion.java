package recursion;

import java.util.Arrays;

public class recrusion {

    int[] arr = {1,2,3};
    public static void main(){
        recrusion mainRecrusion = new recrusion();
        int total = mainRecrusion.recursion(mainRecrusion.arr);

        System.out.println(total);
    }

    public int recursion(int[] array){
        if(array.length == 0) {
            return 0;
        } else{
            
            int[] novoArr = Arrays.copyOfRange(array, 1, array.length);
             
            return array[0] + recursion(novoArr);
        }

    }
    
}
