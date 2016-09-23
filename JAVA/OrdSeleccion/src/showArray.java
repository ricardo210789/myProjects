public class OrdInsercion{
	public static void main(String[] args){
		int[] list = {5,4,3,2,1,0};
		int menor, menPos, i, j;
		for(i = 0; i <= list.length - 2; ++i){
			menor = list[i];
			menPos = i;
			for(j = i + 1; j <= list.length - 1; ++j){
				if(list[j] < menor){
					menor = list[j];
					menPos = j;
				} 
			}

			list[menPos] = list[i];
			list[i] = menor;
		}

		for(int num: list){
			System.out.print(num + " ");
		}
	}
}
