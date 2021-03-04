import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.*;
class email{
	public static void validator(ArrayList<String> emails, String search)
	{
		int flag=0;
		for(String str_email: emails) {
	        if (str_email.contains(search)) {
	        	String regex = "^[a-zA-Z0-9_!#$%&'+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&'+/=?`{|}~^-]+)@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)$";
	        	Pattern pattern = Pattern.compile(regex);
	        	Matcher matcher = pattern.matcher(str_email);
	        	flag=1;
	        	if(matcher.matches()) {
	        		System.out.println(search+":"+"Email is found and is valid email.");
	        	}
	        	else {
	        		System.out.println(search+":"+"Email is found but is not a valid email.");
	        	}
	        	break;
	        }

	    }
		if(flag==0) {
			System.out.println(search+":"+"Email is not found in the array.");
		}

	}
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter size of array");
		int arrlength = reader.nextInt();
		System.out.println("Enter emails:");
		ArrayList<String> emails = new ArrayList<String>();
		for(int i=0;i<arrlength;i++) {
			String email_str = reader.next();
			emails.add(email_str.trim());
		}
		System.out.println("enter the email to be searched");
		String str= reader.next();
		validator(emails,str);
		reader.close();
	}
}