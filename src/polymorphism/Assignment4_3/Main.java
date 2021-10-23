package polymorphism.Assignment4_3;

import java.util.Scanner;

import polymorphism.Assignment4_3.employeeinfo.Employee;

public class Main {

	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);	
		
				
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"A. See a report of all accounts.\nB. Make a deposit.\nC. Make a withdrawal.\nMake a selection (A/B/C):");
		String answer = sc.next().toUpperCase();

		switch (answer) {
		case "A": {

			String info = getFormattedAccountInfo();
			System.out.println(info);
		}

		case "B": {
			int count = 0;
			for (Employee e : emps) {

				System.out.println(count + ". " + emps[count++].getName());

			}
			System.out.println("Select an employee: (type a mumber)");
			int empIndex = sc.nextInt();

			if (empIndex > emps.length || empIndex < 0) {
				System.out.println("please select an input within the range listes. appliaction is exiting...");
				return;
			} else {

				// System.out.println(Arrays.toString(emps[input].getNamesOfAccounts()));
				String[] account = emps[empIndex].getNamesOfAccounts();

				int actCount = 0;
				for (String act : account) {

					System.out.println(actCount + ". " + account[actCount++]);
				}
				System.out.println("Select an account: (type a mumber)");
				int acctIndex = sc.nextInt();

				if (acctIndex < 0 || acctIndex > account.length - 1)
					System.out.println("please select an input within the range listes. appliaction is exiting...");
				else {
					System.out.println("Deposit amount: ");
					double depAmount = sc.nextDouble();

					emps[empIndex].deposit(acctIndex, depAmount);

					System.out.println("\n$" + depAmount + " has been deposited in the\n"
							+ account[acctIndex].toLowerCase() + " account of "
							+ emps[empIndex].getName());

				}
			}
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + answer);
		}

	}
	String getFormattedAccountInfo(){
		//loop through employees array and get formatted
		//account info for each employee, and assemble into a string

		String outPut = "";

		for (Employee e : emps) {

			outPut += "ACCOUNT INFO FOR " + e.getName() + ":" + "\n\n" + e.getFormattedAcctInfo() + "\n";
			
		}

		return outPut;
	}

}
