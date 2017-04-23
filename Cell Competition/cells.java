import java.util.Scanner;

public class cells {
	static Scanner input = new Scanner(System.in);
	
	static int[] cellCompete(int[] cells, int days){
		int[] compCells = new int[8];
		int index;
		
		while(days > 0){
			for(index = 0 ; index < 8 ; index++){
				switch(index){
					case 0: if(cells[index + 1] == 0){
								compCells[index] = 0;
							}else{
								compCells[index] = 1;
							}
							break;
						
					case 7:	if(cells[index - 1] == 0){
								compCells[index] = 0;
							}else{
								compCells[index] = 1;
							}
							break;
					
					default:	if(cells[index - 1] == cells[index + 1]){
									compCells[index] = 0;
								}else{
									compCells[index] = 1;
								}
				}
			}
			days--;
		}	
		
		return compCells;
	}
	
	public static void main(String[] args){
		
		int[] orgCells = new int[8];
		int days, index;
		
		for(index = 0 ; index < 8 ; index++){
			orgCells[index] = input.nextInt();
		}
		
		days = input.nextInt();
		
		for(index = 0 ; index < 8 ; index++){
			System.out.print(" " + cellCompete(orgCells, days)[index]);
		}
	}
}
