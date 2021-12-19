package day04_arithmatic_operators;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pies=10,people=4;
		double piesPerson=pies/people;
		
		System.out.println(piesPerson);
		
		
		//inter/int=int.  double=int/int= int.0	
		
		
		
		int pies2=10,people2=4;
		double piesPerson2;
		piesPerson2=(double)pies2/people2;
		System.out.println(piesPerson2);
		//double= double/int
		
		int pies3=10,people3=4;
		double piesPerson3;
		piesPerson3=pies2/(double)people2;
		System.out.println(piesPerson3);
		//double=int/double
		
		int pies4=10,people4=4;
		double piesPerson4;
		piesPerson4=(double)(pies4/people4);
		System.out.println(piesPerson4);
		//double (int/int)
		
		
		
		
	
	}

}
