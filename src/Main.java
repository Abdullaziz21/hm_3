
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            double [] massiv ={1.2,1.3,-1.4,1.5,1.6,-1.7,1.8,1.9,1.10,-1.11,1.12,1.13,1.14,1.15};
            double count=0;
            double counter=0;
        for (double i : massiv) {
            count=count+i;
            counter++;
            if(i<=0){
                counter=0;
                count=0;
                continue;
            }
        }
        System.out.println("среднее :"+count/counter);
        int [] sorted={5,6,48,4,8,23};
        System.out.println(Arrays.toString(sorted));
        sort(sorted);
        System.out.println(Arrays.toString(sorted));
    }

    public static void sort(int[] sortmosiv){
        for (int i = 0; i < sortmosiv.length; i++) {
            int index = i;
            int min = sortmosiv[i];
            for (int j = i + 1; j < sortmosiv.length; j++) {
                if (sortmosiv[j] < min) {
                    index = j;
                    min = sortmosiv[j];
                }
            }
            sortmosiv[index] = sortmosiv[i];
            sortmosiv[i] = min;
        }
    }



}