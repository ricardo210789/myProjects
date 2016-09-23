public class OrdBurbuja{
	public static void main(String[] args){
		int[] list = {5,4,3,2,1,0};
		int brbPos, brbLstPos, brbLeftField, brbRightField, aux;
		for(brbLstPos = list.length - 2; brbLstPos >= 0; --brbLstPos){
			for(brbPos = 0; brbPos <= brbLstPos; ++brbPos){
				brbLeftField = list[brbPos];
				brbRightField = list[brbPos];
				if( brbRightField < brbLeftField ){
					aux = brbRightField;
					brbRightField = brbLeftField;
					brbLeftField = aux;
				}
			}
		}

		for(int num: list){
			System.out.print(num + " ");
		}
	}
}
