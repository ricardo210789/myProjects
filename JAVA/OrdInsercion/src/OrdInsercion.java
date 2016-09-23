public class OrdInsercion{
	public static void main(String[] args){
		int[] list = {9,4,5,7,6,1,2,3};
		int i, j, aux;
		for(i = 1; i <= list.length - 1; ++i){
			if(list[i] < list[i - 1]){
				aux = list[i];
				list[i] = list[i - 1];
				for(j = i - 2; j >= 0; --j){
					if(aux < list[j]){
						list[j + 1] = list[j];
					} 
					else
						break;
				}
				list[j + 1] = aux;
			}
		} 

		for(int num: list){
			System.out.print(num + " ");
		}
	}
}

