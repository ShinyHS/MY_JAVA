import java.util.Scanner;
class thi2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
int arr[]=new int[n];
double arr2[]=new double[n];

for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for( int i=0;i<n;i++){
arr2[i]=arr[i]/2.0;
}

for(int i=0;i<n;i++){
System.out.println(arr2[i]);
}
}
}




