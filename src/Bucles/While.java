package Bucles;

public class While {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        int count = 0;


        while(target< 15){

            target ++;
            if(target== 12){
                continue;
            }
            System.out.println("El precio" + target);
        }

    }
}
