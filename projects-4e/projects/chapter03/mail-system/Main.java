public class Main { 
	public static void main (String[] args){
		MailServer ms;
		ms = new MailServer();

		MailClient mc1;
		MailClient mc2;
		mc1 = new MailClient(ms, "user1");		
		mc2 = new MailClient(ms, "user2");
 
		mc1.sendMailItem("user2", "test1");
//		mc2.getNextMailItem();
		mc2.printNextMailItem();
	}
}
