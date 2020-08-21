
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item1 = "book";
		String item2 = "hat";
		double bookPrice = 24.99;
		double hatPrice = 19.99;
		double derekBalance = 100.82;
		double melanieBalance = 220.65;
		//*
		System.out.println("Derek’s balance started at $" + derekBalance + " and after his purchase of a "+item2+", costing $"+hatPrice+
				", the remaining balance of his account is $" + (derekBalance-hatPrice)+".");
		System.out.println();
		System.out.println("Melanie’s balance started at $" + melanieBalance + " and after her purchase of a "+item1+", costing $"+bookPrice+
				", the remaining balance of her account is $" +(melanieBalance - bookPrice)+".");
		System.out.println();
		//*
		//*
		//*
		//number of friends made each year
		//*
		int derekFriends = 5;
		int melanieFriends = 15;
		int derekAge = 33;
		int melanieAge = 34;
		//*
		System.out.println("Derek is "+derekAge+" and he has "+derekFriends+" friends. ");
		System.out.println("On average, Derek has made a friend every " + (derekAge / derekFriends)+" years.");
		System.out.println();
		System.out.println("Melanie is "+melanieAge+" and she has "+melanieFriends+" friends.");
		System.out.println("On average, Melanie has made a friend every " + (melanieAge / melanieFriends)+" years.");
		System.out.println();
		//*
		//*
		//full names
		//*
		String firstName = "Derek";
		char middleName = 'M';
		String lastName = "Vukusich";
		String firstNameSpouse = "Melanie";
		char middleNameSpouse = 'S';
		String maidenNameSpouse = "Hartmann";
		//*
		System.out.println(firstName + "'s entire name is " + firstName +" "+ middleName +" "+ lastName +".");
		System.out.println();
		System.out.println(firstNameSpouse + "'s entire maiden name is " + firstNameSpouse +" "+ middleNameSpouse +" "+ maidenNameSpouse+".");


	}

}
