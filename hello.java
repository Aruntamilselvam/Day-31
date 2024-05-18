import java.util.*;
public class Hello {
    public static char[] binVal(String a){
        char[] b=a.toCharArray();
        char k='a';
        for(int i=0;i<b.length;i++){
            if(b[i]=='1'){
                b[i]=k;
                k=(char)((int)k+1);
            }
        }
        char al='A';
        for(int i=b.length-1;i>=0;i--){
            if(b[i]=='0'){
                b[i]=al;
                al=(char)((int)al+1);
            }
        }
        return b;
    }

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(binVal(Integer.toBinaryString(a)));

	}
}
