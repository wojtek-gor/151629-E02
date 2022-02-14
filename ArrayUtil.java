import java.time.LocalTime;

public class ArrayUtil {
    public static<T extends Comparable<T>> boolean jestPalindromem(T[] tablica){
        for(int i=0, j=tablica.length-1;i<=j;i++,j--)
        {
            if(!tablica[i].equals(tablica[j]))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Integer[] tabi = new Integer[5];
        tabi[0]=0;
        tabi[1]=3;
        tabi[2]=6;
        tabi[3]=4;
        tabi[4]=0;
        System.out.println(jestPalindromem(tabi));
        Integer[] tabi2 = new Integer[5];
        tabi2[0]=0;
        tabi2[1]=3;
        tabi2[2]=6;
        tabi2[3]=3;
        tabi2[4]=0;
        System.out.println(jestPalindromem(tabi2));
        LocalTime[] czas = new LocalTime[6];
        czas[0]=LocalTime.of(12,10,4);
        czas[1]=LocalTime.of(15,8,2);
        czas[2]=LocalTime.of(12,30,4);
        czas[3]=LocalTime.of(12,30,4);
        czas[4]=LocalTime.of(15,8,2);
        czas[5]=LocalTime.of(12,10,4);
        System.out.println(jestPalindromem(czas));
        LocalTime[] czas2 = new LocalTime[6];
        czas2[0]=LocalTime.of(12,10,4);
        czas2[1]=LocalTime.of(15,8,2);
        czas2[2]=LocalTime.of(12,30,4);
        czas2[3]=LocalTime.of(12,30,4);
        czas2[4]=LocalTime.of(15,8,1);
        czas2[5]=LocalTime.of(12,10,4);
        System.out.println(jestPalindromem(czas2));
    }
}
