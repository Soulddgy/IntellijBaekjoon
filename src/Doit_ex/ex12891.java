package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex12891 {
    static int checkarr[] = new int[4];
    static char[] array;
    static int myarr[] = new int[4];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        array = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for( int i=0; i<4; i++){
            checkarr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<num;i++){
            if(array[i]=='A') myarr[0]++;
            if(array[i]=='C') myarr[1]++;
            if(array[i]=='G') myarr[2]++;
            if(array[i]=='T') myarr[3]++;
        }
        int count =0;
        if(checkCount()==true) count++;

        for(int j=num;j<M;j++){
            int i = j-num;
            if(array[i]=='A') myarr[0]--;
            if(array[i]=='C') myarr[1]--;
            if(array[i]=='G') myarr[2]--;
            if(array[i]=='T') myarr[3]--;

            if(array[j]=='A') myarr[0]++;
            if(array[j]=='C') myarr[1]++;
            if(array[j]=='G') myarr[2]++;
            if(array[j]=='T') myarr[3]++;

            if(checkCount()==true) count++;


        }

        System.out.print(count);


    }

    public static boolean checkCount(){
        for(int i=0;i<4;i++){
            if(myarr[i] < checkarr[i]){
                return false;
            }
        }
        return true;
    }
}
