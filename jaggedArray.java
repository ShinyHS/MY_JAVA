class jagg{
     public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{3,9,1},{9,12,5,8}};
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               System.out.print(arr[i][j]);
               s+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("sum of array is "+s);
     }
}