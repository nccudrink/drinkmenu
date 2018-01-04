package nccudrink;

import java.util.Scanner;
import java.io.IOException;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String url = "";
		System.out.println("請輸入地名");
		while(sc.hasNextLine()) {
			
			url  = sc.next();
			if(url.equalsIgnoreCase("Q")) {
				System.out.println("掰掰");
				return;
			}
			DataCollector dc = new DataCollector(url);
			dc.call();
			System.out.println("請輸入飲料種類");
			dc.DrinkSuggest(sc.next());
			System.out.println();
			System.out.println("請輸入新的地名或輸入Q離開");
		}
	}

}
