package twosum;

public class twosum {
    int target = 10;
    int[] array = {1,2,6,4,5};

    public static void main(String[] args) {
        twosum twosum = new twosum();
        twosum.Twofor();
    }

    public void Twofor() {
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == target) {
                    System.out.println(i + ", " + j);
                }
            }
           
        }
    }
}
