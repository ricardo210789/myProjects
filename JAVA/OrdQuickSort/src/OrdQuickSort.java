public class OrdQuickSort{
	public static void QuickSort(int list[],int first, int last){
		int leftIndex, rightIndex, pivotIndex, pivotValue, aux;

		leftIndex = first;
		rightIndex = last;
		pivotIndex = 0;
		pivotValue = list[pivotIndex];

		while(leftIndex != rightIndex){
			if( list[rightIndex] > pivotValue){
				--rightIndex;
			}
			else{
				if(list[leftIndex] > pivotValue){
					aux = list[leftIndex];
					list[leftIndex] = list[rightIndex];
					list[rightIndex] = aux;
					--rightIndex;
				}
				else{ 
					++leftIndex;
					if(list[leftIndex] == pivotValue){
						pivotIndex = leftIndex; 
					}
				}
			} 
		}
		list[pivotIndex] = list[leftIndex];
		list[leftIndex] = pivotValue;

		for(int num: list){
			System.out.print(num + " ");
		}
		//QuickSort(list, 0, 0);
		//QuickSort(list, pivotIndex, list.length - 1);

	}

	public static void main(String[] args){
		int[] list = {5,4,6,3,2};

		QuickSort(list, 0,list.length - 1);
		//QuickSort(list, 0,3);


	//	for(int num: list){
	//		System.out.print(num + " ");
	//	}
	} 
}
