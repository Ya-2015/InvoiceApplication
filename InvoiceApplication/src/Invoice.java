import java.util.*;

public class Invoice {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double taxRate = 0;
		
		System.out.println("Tax Rate?");
		taxRate = scan.nextDouble();

		double currentPrice = -1;
		ArrayList<Double> priceList = new ArrayList<Double>();
		
		
		int i = 0;
		while(currentPrice != 0){
			i++;
			System.out.println("Price # "+ i + "?");
			currentPrice = scan.nextDouble();
			System.out.println("Price # " + i + "\t: " + currentPrice);
			
			if(currentPrice != 0){
				priceList.add(currentPrice);
			}
		}
		
		System.out.println("\n------------------\n");
		System.out.println("Receipt");
		double sum = 0;
		for (int j =0; j < priceList.size(); j++){
			System.out.println(priceList.get(j).toString());
			sum += priceList.get(j);
		}
		
		double tax = sum*taxRate;
		System.out.printf("%.2f \tsubtotal\n", sum);
		System.out.printf("%.2f \ttax\n", tax);
		System.out.printf("%.2f \tgrand total\n", sum+tax);
		
		scan.close();
	}

	
	
}
