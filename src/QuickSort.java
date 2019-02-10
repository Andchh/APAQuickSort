import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o numero de elementos no array:\n");
		int n = s.nextInt();
		int[] entry = new int[n];
		System.out.print("Digite os numeros que serao organizados com enter apos cada:\n");
		
		for(int i = 0; i < n; i++){  //vai lendo e salvando no array os valores
			entry[i] = s.nextInt();
		}
		
		// TODO adicionar chamada de função quicksort
		int length = entry.length;
		quickSort(entry, 0, length - 1);
		for(int j = 0; j < entry.length; j++){
			System.out.print(entry[j]+" ");
		}
		s.close();

	}
	
	public static void quickSort(int [] array, int esq_index, int dir_index){ 
		
		int i = esq_index;
		int j = dir_index;
		
		//calcula o pivot, assumindo que o pivot está no meio;
		int pivot = array[esq_index + (dir_index - esq_index)/2];
		
		while(i <= j){
			
			while(array[i] <  pivot) {
				i++;
			}
			while(array[j] > pivot){
				j--;
			}
			
			if(i <= j){
				troca(array,i,j);
				i++;
				j--;
			}
		}
		if(esq_index < j){
			quickSort(array, esq_index, j);
		}
		if(i < dir_index){
			quickSort(array, i, dir_index);
		}
		
	}
	
	private static void troca(int[] array,int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
 
}
