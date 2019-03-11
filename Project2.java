class Project2{
	public static void main(String[] a){
		int n=a.length;
		int temp;
		int[] arr=new int[n];
		int z=0;
		for(String str:a){
			arr[z]=Integer.parseInt(str);
			z++;
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i:arr){
			System.out.print(i+"\t");
		}
	}
}