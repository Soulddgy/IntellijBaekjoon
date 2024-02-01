package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class ex11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs){
                return o1 > o2 ? 1 : -1; // o1 이 o2보다 크면 o1은 나중에나오고 o2가 먼저나옴
            }else{
                return first_abs - second_abs;
            }
        });
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.add(a);
            }
        }

    }
}



