package baek;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class ex9935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String boom = br.readLine();
        int boom_length = boom.length();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
            if(stack.size()>=boom_length){
                boolean flag = true;
                for(int j=0;j<boom_length;j++){
                    if(stack.get(stack.size()-boom_length+j) != boom.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0;j<boom_length;j++){
                        stack.pop();
                    }
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : stack){
            sb.append(c);
        }
        if(sb.length()==0){
            System.out.print("FRULA");
        }else{
            System.out.print(sb.toString());
        }





    }

}
