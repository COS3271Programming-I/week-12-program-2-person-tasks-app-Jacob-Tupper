package person_tasks_APP;

import java.io.PrintStream;
import java.util.Scanner;

//Created Person Class with Attributes
class Person {
	Scanner usin = new Scanner(System.in);
	PrintStream so = System.out;
	
	String First, Last, gender, height, ethnicity, religion;
	int age, weight;
	
	//Created different functions depending on the user
	void greeting() {
		so.println("Hello Pal");
	}
	void prayer() {
		so.println("May God be our light, lighting up the path ahead of us");
	}
	void nap() {
		so.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	}
	void eat() {
		so.println("Yummmm Stroganoff");
	}
	void name() {
		so.println("My name is " + First + " " + Last);
	}
	//Method to select new religion
	void Self_revalation() {
		so.print("OOOOO I have a new thought\nType in a new religion: ");
		religion = usin.next();
		so.println("I am now practicing " + religion);
	}
}

public class Person_Tasks_APP {
	static Scanner usin = new Scanner(System.in);

	public static void main(String[] args) {
		// Creating variables and new objects
		PrintStream so = System.out;
		Person person1 = new Person();
		int selection = 0, cont = 1;

		// Getting information for the object from user
		so.println("Please enter the information about the Person.");
		so.print("First Name: ");
		person1.First = usin.next();
		so.print("Last Name: ");
		person1.Last = usin.next();
		so.print("Gender: ");
		person1.gender = usin.next();
		so.print("Age: ");
		person1.age = usin.nextInt();
		so.print("Weight: ");
		person1.weight = usin.nextInt();
		so.print("Height: ");
		person1.height = usin.next();
		so.print("Ethnicity: ");
		person1.ethnicity = usin.next();
		so.print("Religion: ");
		person1.religion = usin.next();

		// Printing the person out
		so.printf("Full Name: %S %S\nGender: %S\nAge: %d\nWeight: %d\nHeight: %S\nEthnicity: %S\nReligion: %S",
				person1.First, person1.Last, person1.gender, person1.age, person1.weight, person1.height,
				person1.ethnicity, person1.religion);
		
	//The user selecting an action 	
	while(cont == 1) {
		so.print("\n1. Greetings\n2. Prayer\n3. Nap\n4. Eat\n5. Give Name\n6. Religious Revelation\n7.End\nSelect Choice: ");
		selection = usin.nextInt();
		switch(selection) {
		case(1) : {person1.greeting();break;}
		case(2) : {person1.prayer();break;}
		case(3) : {person1.nap();break;}
		case(4) : {person1.eat();break;}
		case(5) : {person1.name();break;}
		case(6) : {person1.Self_revalation();break;}
		case(7) : {cont = 0;break;}
		}
		}
	}
}
