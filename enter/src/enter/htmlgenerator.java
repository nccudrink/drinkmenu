package enter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class htmlgenerator {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String cofilename = ".txt";
		String filename = "";
		System.out.println("Please enter the file path");
		String address = sc.next();
				
		
		System.out.println("Please enter the file name ex:coco");
		filename = sc.next();
		
		String table = "";
		boolean key = true;
			while(key) {
				System.out.println("Please enter drink name");
				String temp1 = sc.next();
				System.out.println("Please enter the price of the drink Small size");
				String temp2 = sc.next();
				System.out.println("Please enter the price of the drink Medium size");
				String temp3 = sc.next();
				System.out.println("Please enter the price of the drink Large size");
				String temp4 = sc.next();
				System.out.println("Your just type these information below");
				System.out.println(temp1 + temp2 + temp3 + temp4);
				System.out.println("if the information is correct,enter y.otherwise,n");
				String stat = sc.next();
				if(stat.equals("y")) {
					
					table = table + "\n\t\t<tr>\n"+
					"\t\t\t<th>" + temp1 + "</th>\n" + 
					"\t\t\t<th>" + temp2 + "</th>\n" +
					"\t\t\t<th>" + temp3 +  "</th>\n" +
					"\t\t\t<th>" + temp4 +  "</th>\n" +
					"\t\t</tr>\n";
					System.out.println("Is over? y or n");
					String st = sc.next();
					if(st.equals("n"))key = true;
					else key = false;
				}
			}
        	
		
		String html = "<!DOCTYPE html>\n" + "<html>\n\n" + "\t<head>\n\t\t<meta  charset=\"utf-8\">\n\n" + "\t\t<title>" + filename + "</title>\n" + "\t</head>\n\n" + 
		"\t<body>\n" + "\t\t<table border=\"1\" width=\"80%\" cellpadding=\"5\" cellspacing=\"5\">\n";
		String end = "\t\t</table>\n" +
					 "\n\t</body>\n" +
					 "\n</html>";
		html = html + table + end;
		System.out.println(html);
		filename = filename + cofilename;
		filename = address + "\\"+filename;
		FileWriter fw = new FileWriter(filename);
		fw.write(html);
		fw.flush();
		fw.close();
		
		sc.close();
		
	}

}

