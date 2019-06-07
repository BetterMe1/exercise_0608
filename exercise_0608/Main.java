package exercise.exercise_0608;

//DNA序列
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int len = str.length();
        int start = 0;
        int end = len>=n ? n : 0;
        int max = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'G'||str.charAt(i) == 'C'){
                max++;
            }
        }
        int before = max;
        for(int i=n; i<len; i++){
            if(str.charAt(i) == 'G'||str.charAt(i) == 'C'){
                if(!(str.charAt(i-n) == 'G'||str.charAt(i-n) == 'C')){
                    before++;
                }
            }else{
                if(str.charAt(i-n) == 'G'||str.charAt(i-n) == 'C'){
                    before--;
                }
            }
            if( before > max){
                max = before;
                end = i+1;
                start = end-n;
            }
        }
        System.out.println(str.substring(start,end));
    }
}

//百万富翁问题

/*
public class Main {
    public static void main(String[] args) {
        solution(30);
    }
    public static void solution(int d){//d表示天数
        int a = 10*d;//富翁教出的万元数
        int b = 0;//陌生人交出的钱（分）
        int tmp = 1;
        for(int i=0; i<d; i++){
            b += tmp;
            tmp *= 2;
        }
        System.out.println(a+" "+b);
    }
}*/
