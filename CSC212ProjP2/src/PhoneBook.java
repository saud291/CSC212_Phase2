/*************Example***************
CLASS: PhoneBook.java
CSC212 Data structures - Project phase I
Fall 2023
EDIT DATE:
17-10-2023
TEAM:
IT PhoneBook
AUTHORS:
meshari al-harbi , (443102229)
saud al-dossaari (441102913)
Omar al-juwayr (443101385)

***********************************/
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneBook {
	static BST<Contact> conts = new BST();
	static LinkedList<Event> events = new LinkedList();
	static Scanner input = new Scanner(System.in);

	
	//method for search contact in list
	public static void Searchcontact() {
		System.out.println("Enter search criteria:"); //1
		System.out.println("1.Name"); //1
		System.out.println("2.Phone Number");//1
		System.out.println("3.Email Address");//1
		System.out.println("4.Address");//1
		System.out.println("5.Birthday");//1
		System.out.print("Enter your choise");//1
		String Choicec = input.nextLine();//1
		

		if (conts.empty())//if contact list is empty (1)
			System.out.println("Contact its empty");//1
		else {// if contact list not empty (1)
			// user choose the serach criteria
			switch (Choicec) {//1
		
}
		}
	}

	// method that search events by contact name or event title.
	public static void printEventDetails() { 
		System.out.println("Enter search criteria:");//1
		System.out.println("1.contact name");//1
		System.out.println("2.Event title\r\n");//1
		int eventChoice = input.nextInt();//1
		// check if contact list is empty or not
		
		if(conts.empty())              //1                                                                             
		{
			System.out.println("Sorry there is no contact !");    //1                                                                               
		}else//1
		// check if events list is empty or not
		if (events.empty())//1
			  System.out.println("Sorry No Event there !");      //1                      
		// events list is not empty
		else {//1
			switch (eventChoice) {//1
			// if user want search by contact name
			case 1: {//1
				// set events current into first element (head)
				events.findFirst();//1
				System.out.print("Enter the contact name:");//1
				input.nextLine();//1
				String n = input.nextLine();//1
				boolean foundCon = false;//1
				// check elements in events list
				while (!events.last()) {//n-1
					// if event has same contact name that user enter.
					if (events.retrieve().Contact.getContact_name().compareTo(n) == 0) {//n
						System.out.println("Event found!\r\n");//n
						System.out.println("Event title:" + events.retrieve().getEvent_title());//n
						System.out.println("Contact name:" + events.retrieve().Contact.getContact_name());//n
						System.out.println("Event date and time:" + events.retrieve().getEvent_date_time());//n
						System.out.println("Event location:" + events.retrieve().getEvent_location());//n
						// change boolean found to true that means system find event has same contact name that user enter.
						foundCon = true;//n
					}
					// move current into next element

						events.findNext(); //n
					
				}
				// check the last element in event list
				// if event has same contact name that user enter.
				if (events.retrieve().Contact.getContact_name().compareTo(n) == 0) {//1
					System.out.println("Event found!\r\n");//1
					System.out.println("Event title:" + events.retrieve().getEvent_title());//1
					System.out.println("Contact name:" + events.retrieve().Contact.getContact_name());//1
					System.out.println("Event date and time:" + events.retrieve().getEvent_date_time());//1
					System.out.println("Event location:" + events.retrieve().getEvent_location());//1
					// change boolean found to true that means system find event has same contact name that user enter.

					foundCon = true;//1
				}
				// if contact not found
				if(foundCon == false)//1
					System.out.print("events not found !\n");//1
			}
				break;//1
				
				// if user want search by event title.
			case 2: {//1 
				// set events current into first element (head)
				events.findFirst();//1
				System.out.print("Enter the event title:");//1
				String n = input.next();//1
				boolean foundCon = false;//1
				// check elements in events list
				while (!events.last()) {//n-1
					// if event has event title that user enter.
					if (events.retrieve().getEvent_title().equalsIgnoreCase(n)) {//n
						System.out.println("Event found!\r\n");//n
						System.out.println("Event title:" + events.retrieve().getEvent_title());//n
						System.out.println("Contact name:" + events.retrieve().Contact.getContact_name());//n
						System.out.println("Event date and time:" + events.retrieve().getEvent_date_time());//n
						System.out.println("\nEvent location:" + events.retrieve().getEvent_location());//n
						// change boolean found to true that means system find event has same event title that user enter.

						foundCon = true;//n
					}
					// move current into next element
					events.findNext();//n

				}
				// check the last element in event list
				// if event has event title that user enter.
				if (events.retrieve().getEvent_title().equalsIgnoreCase(n)) {//1
					System.out.println("Event found!\r\n");//1
					System.out.println("Event title:" + events.retrieve().getEvent_title());//1
					System.out.println("Contact name:" + events.retrieve().Contact.getContact_name());//1
					System.out.println("Event date and time:" + events.retrieve().getEvent_date_time());//1
					System.out.println("Event location:" + events.retrieve().getEvent_location());//1
					// change boolean found to true that means system find event has same event title that user enter.
					foundCon = true;//1
				}
				// if contact not found
				if(foundCon == false)//1
					System.out.println("Sorry there is No event");                                                                 //1                          1 
			}
				break;//1

			}

		}
	}
	

	// method for delete a contact
	public static void deletcontact(String name) {
		
	}
	
		
	
	
	
		 /* this method for search in contacts list by name to get object */
		public static Contact searchByName(String name) {
		
			return null;//1
			}
			
		
	/*
	 * this method for search in contacts list by number
	 */
	public static boolean search_number(String number) { 
		return false;
	}
	

	public static void print_firstname(String name) {
	
	
	}
	
	
	
	// method for print events alphabetically
	public static void print_alph() {
		
		// check if events list is empty or not
		if (events.empty()) {//1
			System.out.println("There are no events\n");//1
			return; //1
		}
		// set events current into first element (head)
		events.findFirst();//1
		// check elements in events list
		while (!events.last()) {//n-1
			System.out.println("Event title:" + events.retrieve().getEvent_title());//n
			System.out.println("Contact name:" + events.retrieve().Contact.getContact_name());//n
			System.out.println("Event date and time:" + events.retrieve().getEvent_date_time());//n
			System.out.println("Event location:" + events.retrieve().getEvent_location());//n
			System.out.print("\n");//n
			// move current into next element
			events.findNext();//n
		}
		// print last element in event list.
		System.out.println("Event title:" + events.retrieve().getEvent_title());//1
		System.out.println("Contact name:" + events.retrieve().Contact.getContact_name());//1
		System.out.println("Event date and time:" + events.retrieve().getEvent_date_time());//1
		System.out.println("Event location:" + events.retrieve().getEvent_location());//1
		System.out.print("\n");//1
		}
	
	// Time Complexity of print_alph method : 7n + 8 O(n)

	 //this method for schecule an Event   
	 public static void shceduleEvent() {       
			System.out.println("Enter event title:"); //1
			String event_title=input.next();//1
			System.out.println("Enter contact name:");//1
			input.nextLine();//1
			String event_contactname=input.nextLine();//1
			Contact contact = searchByName(event_contactname);//n
			if(contact==null) {//1
				System.out.println("contact not found !");//1
				return;//1
			}
			
			System.out.println("Enter event date and time (MM/DD/YYYY HH:MM):");//1
			Date event_datetime;

			try {
				 event_datetime = new Date(input.nextLine());//1
				}catch(IllegalArgumentException i) {
					System.out.print("date is not correct, enter correct date \n");//1
					 event_datetime = new Date(input.nextLine());//1

				
				}
			
			System.out.println("Enter event location:");//1
			String event_location=input.nextLine();		//1
	
			// check if events list is empty or not
			if(events.empty()) {    //1

				Event e = new Event(event_title, event_datetime, event_location, contact);//1
				// insert into big event list
				events.insert(e);    //1
				// insert into event list for contact list
				contact.event.insert(e);//1
			return; //1
			}else {//1
				// if events list is not empty
				// set current into first element in list
				events.findFirst();   //1     
				// check events list
				while(!events.last()) {//n-1
					
					// check if there event for this contact in same event date/time
					if(events.retrieve().getEvent_date_time().equals(event_datetime) && events.retrieve().getContact().getContact_name().equals(contact.getContact_name())) { //2n
						System.out.println("Sorry there is event this time");  //n
					return;
					}
					// move to next element
					events.findNext();//n
				}
				// check last element in event list
				// check if there event for this contact in same event date/time
				if(events.retrieve().getEvent_date_time().equals(event_datetime) && events.retrieve().getContact().getContact_name().equals(contact.getContact_name())) { //2
					System.out.println("Sorry there is event this time");                    //1        
					return;//1
				
				}
				
//make object for event
				Event e = new Event(event_title, event_datetime, event_location, contact);//1
		//insert into big event list
				events.insert(e); //1
				// insert into event list for contact list
				contact.event.insert(e);//1
							
			}                                                                                           
		
}
	 
	 //5n + 25 O(n)
	public static void main(String[] args) {

		
	
	
		Scanner input = new Scanner(System.in);
		int choice = 0;

		System.out.println("\nWelcome to the Linked Tree Phonebook !");
		do {
			System.out.println("Please choose an option");
			System.out.println("1. Add a contact");
			System.out.println("2. Search for a contact");
			System.out.println("3. Delete a contact");
			System.out.println("4. Schedule an event/appointments");
			System.out.println("5. Print event details");
			System.out.println("6. Print contacts by first name");
			System.out.println("7. Print all events alphabetically");
			System.out.println("8. Exit\n");
			System.out.print("Enter your choice: ");
			
			try {
			choice = input.nextInt();
	
			
			System.out.println();
			switch (choice) {
				case 1:

				       System.out.print("Enter the contact's name:");
				       input.nextLine();
				        String contact_name = input.nextLine();
						while(searchByName(contact_name) != null) {
							System.out.print("Contact is already exists! ");
							
							System.out.print("\nEnter contact's name: ");
							 contact_name = input.next();

						}
				        System.out.print("Enter the contact's phone number:");
				        String contact_phone = input.next();
						while(search_number(contact_phone)) {
							System.out.print("Contact number is already exists! ");
							
							System.out.print("Enter the contact's phone number: ");
							contact_phone = input.next();

						}
				        System.out.print("Enter the contact's email address:");
				        String contact_mail = input.next();
				        System.out.print("Enter the contact's address:");
				        input.nextLine();
				        String contact_address = input.nextLine();
				        System.out.print("Enter the contact's birthday:");
				        Date contact_birthday;
						try {
					        contact_birthday = new Date(input.nextLine());
							}catch(IllegalArgumentException i) {
								System.out.print("date is not correct \n");
								break;
							
							}
				        System.out.print("Enter any notes for the contact:");
				        String contact_note = input.nextLine();
				        
						Contact newcont = new Contact(contact_name, contact_phone, contact_mail, contact_address, contact_birthday, contact_note);
						conts.insert(contact_name, newcont);
						System.out.println("Contact added successfully!");

					break;

					
				case 2:
					Searchcontact();

					break;
				case 3:
					
					System.out.print("Enter Contact name: ");
					String cont_delete_name = input.next();
					deletcontact(cont_delete_name);
					break;
				case 4:
					
	
					shceduleEvent();
					break;
			
				case 5:
					printEventDetails();
					break;
				case 6:
					
					System.out.print("Enter the first name: ");
					String firstname = input.next();

					print_firstname(firstname);

					break;
				case 7:
					print_alph();
					break;

				default:
					System.out.println("Invalid input! \n");
			}
			}catch(InputMismatchException e) {
				input.nextLine();
							}
		} while (choice != 8);
		System.out.println("Goodbye!");


	}



}