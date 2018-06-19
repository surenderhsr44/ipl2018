package com.ipl2018.Surender;

public class TeamMain {

	public static void main(String[] args) {
		System.out.println("*************************************************************");

		Properties pro1 = new Properties("Kolkata Knight Riders", "Blue", "Kolkata", "Kolkata", "Yes");
		pro1.print();
		Data d1 = new Data("Dinesh Karthik", "Mitchell Starc", "Kamlesh Nagarkoti", "Shivam Mavi", "Javon Searles",
				"Ishank Jaggi");
		d1.print();
		System.out.println("*************************************************************");

		Properties pro2 = new Properties("Chennai Super Kings", "Yellow", "Chennai", "Chennai", "No");
		pro2.print();
		Data d2 = new Data("Lungi Ngidi", "Dhruv Shorey", "Sam Billings", "Karn Sharma", "Ambati Rayudu", "Mark Wood");
		d2.print();
		System.out.println("*************************************************************");

		Properties pro3 = new Properties("Delhi Daredevils", "Red", "Delhi", "Delhi", "No");
		pro3.print();
		Data d3 = new Data("Shahbaz Nadeem", "Naman Ojha", "Abhishek Sharma", "Manjot Kalra", "Colin Munro",
				" Harshal Patel");
		d3.print();
		System.out.println("*************************************************************");

		Properties pro4 = new Properties("Rajasthan Royals", "Blue", "Rajasthan", "Rajasthan", "No");
		pro4.print();
		Data d4 = new Data("Stuart Binny", "Dhawal Kulkarni", "Darcy Short", "Ben Laughlin", "Jatin Saxena",
				"Shreyas Gopal");
		d4.print();

	}

}
