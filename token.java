import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//patients Token
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[] ar=new String[size];
		int[] arT=new int[size];
		for(int i=0;i<size;i++){
		    ar[i]=sc.next();
		    String tim=sc.next();
		    String[] timeAr=tim.split(":");
		    arT[i]=(Integer.parseInt(timeAr[0])*60)+Integer.parseInt(timeAr[1]);
		    
		}
		for(int i=0;i<size;i++){
		    for(int j=i+1;j<size;j++){
		        if(arT[i]>arT[j]){
		            int tmp=arT[i];
		            arT[i]=arT[j];
		            arT[j]=tmp;
		            String tem=ar[i];
		            ar[i]=ar[j];
		            ar[j]=tem;
		        }
		    }
		}
		for(int i=0;i<size;i++)
		System.out.println(ar[i]+" "+(i+1));
	}
}
