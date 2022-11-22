package narsistikSayi;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, tempNumber, total;
		double digit;

		System.out.println("Narsistik Sayılar: ");

		for (number = 1; number <= 100000; number++) {

			total = 0;
			tempNumber = number;

			while (tempNumber > 0) {
				digit = tempNumber % 10;
				digit = Math.pow(digit, 3);
				total = total + (int) digit;
				tempNumber = tempNumber / 10;
			}

			if (total == number) {
				System.out.println(number);
			}
		}
		
		
		
		//Kullanıcının girdiği sayının narsistik sayı(armstrong) olup olmamasının kontrolu
		
		/*
		int number, tempNumber, total = 0;
		double digit;

		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen bir sayı giriniz: ");
		number = input.nextInt();
		input.close();
		tempNumber = number;

		while (tempNumber > 0) {
			digit = tempNumber % 10;
			digit = Math.pow(digit, 3);
			total = total + (int) digit;
			tempNumber = tempNumber / 10;
		}

		if (total == number) {
			System.out.println("Girdiğiniz sayi narsistik sayıdır.");
		} else
			System.out.println("Girdiğiniz sayi narsistik sayı değildir.");
*/
	}

}
