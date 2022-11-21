import java.util.Scanner;
class thi1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int arr[]=new int[n];
int s=1;
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int j =0;j<n;j++){
s=s*arr[j];
}
System.out.println(s);
}
}
