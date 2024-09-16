package EmailAPP;

import java.util.Scanner;

public class Email {
   private String  firstname;
   private String Lastname;
   private String password;
   private String department;
   private String email;
   private int mailboxcapacity = 500;
   private int defaultpasswordlength = 10;
   private String alternaeEmail;
   private String companySuffix = "bainalwar.com";
   
   //constructor to receive fname and lastname
   //ask for department 
   //generate random password
   //set the mailbox capacity
   
   public void setmailboxcapacity(int capacity) {
	   this.mailboxcapacity = capacity;
   }
   
   public void setAlternateEmail(String altemail) {
	   this.alternaeEmail=altemail;
   }
   
   public void changePassword(String password) {
	   this.password=password;
   }
   
   public int getmailboxcapacity() { return mailboxcapacity; }
   
   public String getAlternateEmail() { return alternaeEmail; }
   
   public String getpassword() { return password; }
   //set alternate email
   //change password
   
   public String showInfo() {
	   return "\nDisplayname: "+firstname + " "+Lastname + " "+
			   "\nCompany email: " + email + " "+
			   "\nMailbox cpacity: " + mailboxcapacity + "mb";
   }
   
   public Email(String firstname,String Lastname) {
	   this.firstname=firstname;
	   this.Lastname=Lastname;
	   System.out.println("Email created: "+this.firstname + " "+this.Lastname);
	   
	   this.department = setDepartment();
	   System.out.println("Department: "+this.department);
	   
	   this.password = randompassword(defaultpasswordlength);
	   System.out.println("your password is: "+this.password);
	   
	 //combine elements to generate email
	   
	   email = firstname.toLowerCase() + "." + Lastname.toLowerCase() + "@" + department + "." + companySuffix;
	   System.out.println("your email is: "+email);
	   }
   //call a method asking for department - return departent
   private String setDepartment() {
	   System.out.println("Enter the department\n1 for sales\n2 for development\n3 for accounting\n0 for none");
	   Scanner in = new Scanner(System.in);
	   int depChoice = in.nextInt(); // Correctly capture the input once
	   if(depChoice == 1) {
	       return "Sales";
	   }
	   else if(depChoice == 2) {
	       return "Development";
	   }
	   else if(depChoice == 3) {
	       return "Accounting";
	   }
	   else {
	       return "None";
	   }
	   
	}
   private String randompassword(int length) {
	   String passwordset= "ABCDEFGHIJKLMOPQRSTUVWXYZ0123456789!@#$";
	   char[] password = new char[length];
	   for(int i =0;i<length;i++) {
		  int rand = (int)(Math.random() * passwordset.length());
		  password[i] = passwordset.charAt(rand);
	   }
	   return new String(password);
	   
	   
   }
}

