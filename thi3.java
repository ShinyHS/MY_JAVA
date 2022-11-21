import java.util.Scanner;
class thi3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n];
int odd[]= new int[n];
int even[]=new int[n];
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
int x=0,y=0;
for(int i=0;i<n;i++)
{
	if(arr[i]%2==0){
		even [x]=arr[i];
		x++;
	}
	else{
	odd[y]=arr[i];
	y++;}
}
System.out.printlnrntln("odd number");
for(int i=0;i<odd.length;i++){
	System.out.println(odd[i]);
}
System.out.println("even number");
for(int i=0;i<even.length;i++){
System.out.println(even[i]);
}
}
}
	
