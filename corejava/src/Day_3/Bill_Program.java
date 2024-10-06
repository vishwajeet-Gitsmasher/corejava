package Day_3;

public class Bill_Program {

	public static void main(String[] args) {
		int rquan = Integer.parseInt(args[0]);
		int pquan = Integer.parseInt(args[1]);
		int rprice = 60;
		int pprice = 25;
		int dis = 50;
		int bill = ((rprice * rquan) + (pprice * pquan));
		int fbill = bill-dis;
		System.out.println("*********************Dominos***********************");
		System.out.println("---------------------------------------------------");
		System.out.println("Item\t\tPrice\tQuan\tAmount");
		System.out.println("chicken rolls\t"+ rprice + "\t"+ rquan + "\t" + (rprice * rquan));
		System.out.println("vegetable puffs\t"+ pprice + "\t"+ pquan + "\t" + (pprice * pquan));
		System.out.println("---------------------------------------------------");
		System.out.println("Bill Amount\t\t\t="+ bill);
		System.out.println("Specail Discount\t\t= "+ dis);
		System.out.println("Final Bill Amount\t\t="+ fbill);
	}

}

/*
	*********************Dominos***********************
	---------------------------------------------------
	Item		Price	Quan	Amount
	chicken rolls	60	4	240
	vegetable puffs	25	3	75
	---------------------------------------------------
	Bill Amount			=315
	Specail Discount		= 50
	Final Bill Amount		=265
*/
