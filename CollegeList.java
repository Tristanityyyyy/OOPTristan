package package1;
import java.util.*;
public class CollegeList {
	public static void main(String[] args)throws Exception {
		
		
		Employee e = new Employee();
		Faculty f = new Faculty();
		Scanner scn = new Scanner(System.in);
		
		try { 
			Person p = new Person();
			System.out.println("Select one.");
			System.out.print("Which one are you [E]Employee, [F]Faculty or [S]Student? ");
			char who = scn.next().toUpperCase().charAt(0);
			
			System.out.print("Type your name: ");
			String name = scn.nextLine();
			p.setName(name);
			
			scn.nextLine();
			
			System.out.print("Type your contact no.: ");
			String conNum = scn.nextLine();
			p.setContactNum(conNum);
			
			switch(who) {
			case 'E':
					System.out.print("Please enter your monthly salary: ");
					double monSal = scn.nextDouble();
					e.setSalary(monSal);
					
					System.out.print("Please enter your department: ");
					String dep = scn.nextLine();
					e.setDepartment(dep);
					
					System.out.println("Name: " + e.getName());
					System.out.println("Contact no: " + e.getContactNum());
					System.out.println("Monthly Salary " + e.getSalary());
					System.out.println("Department: " + e.getDepartment());
					break;
			case 'F':
					
					System.out.print("Press [Y] if Regular and [N] if not: ");
					char pick = scn.next().toUpperCase().charAt(0);
						if(pick == 'Y') {
							
							System.out.print("Please enter your monthly salary: ");
							double monSal2 = scn.nextDouble();
							f.setSalary(monSal2);
							
							System.out.print("Please enter your department: ");
							String dep2 = scn.nextLine();
							f.setDepartment(dep2);
							
							System.out.println("Name: " + f.getName());
							System.out.println("Contact no: " + f.getContactNum());
							System.out.println("Monthly Salary " + f.getSalary());
							System.out.println("Department: " + f.getDepartment());
							System.out.println("Status: " + f.isRegular());
						}
						else if(pick == 'N') {
							System.out.print("Please enter your monthly salary: ");
							double monSal3 = scn.nextDouble();
							f.setSalary(monSal3);
							
							System.out.print("Please enter your department: ");
							String dep3 = scn.nextLine();
							f.setDepartment(dep3);
							
							System.out.println("Name: " + f.getName());
							System.out.println("Contact no: " + f.getContactNum());
							System.out.println("Monthly Salary " + f.getSalary());
							System.out.println("Department: " + f.getDepartment());
							System.out.println("Status: " + f.isRegular());
						}
						else {
							//continue;
						}
				
				case 'S':
					
					Student s = new Student();
					System.out.print("Please enter your program: ");
					String prog = scn.nextLine();
					s.setProgram(prog);
					
					System.out.print("Please enter your year level: ");
					int yrLvl = scn.nextInt();
					s.setYearLevel(yrLvl);
					System.out.println("******************************");
					System.out.println("Name: " + s.getName());
					System.out.println("Contact no: " + s.getContactNum());
					System.out.println("Program : " + s.getProgram());
					System.out.println("Year Level: " + s.getYearLevel());
				
				default:
					 System.out.println("gago");
				
			}
			
		}catch(InputMismatchException ime) {
				System.err.println("Invalid input.");
				//continue;
		}
	}
}

