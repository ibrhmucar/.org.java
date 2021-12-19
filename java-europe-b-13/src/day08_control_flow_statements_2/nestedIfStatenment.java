package day08_control_flow_statements_2;

public class nestedIfStatenment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	boolean isRushour=true;
	int carType=2;
	double price=0.0;
	
	if (carType==1) {
		if (isRushour==true) {
			price=30.0;
			
		}else {
			price=5.0;
		}	
			
		} else if (carType==2) {
				isRushour=false;
			if (isRushour) {
				price=55.30;
				
				
			}else {
				price=15.99;
			}
		}
		
		System.out.println("toll cost  " + price);
	}
	
	
	}
	


