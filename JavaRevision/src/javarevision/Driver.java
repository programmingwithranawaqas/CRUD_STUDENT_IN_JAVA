
package javarevision;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
   
    public static void mainMenu()
    {
        System.out.println("1. add student\n"
                + "2. See all students\n"
                + "3. Search by ID\n"
                + "4. Exit\n");
    }
    public static void main(String[] args) {
        /*ArrayList<String> ages = new ArrayList<>(); 
        
        ages.add("Rana Waqas Ali");
        ages.add("Waqar");
        ages.add("Ali Raza");
        ages.add("Aswad");
        ages.add("Talha CR");
        ages.add("Sheharyar");
        
        ages.add(2, "Benish");
        
        ages.remove(3);
        
        ages.clear();
        
        for(String n:ages)
        {
            System.out.println(n+" : "+n.length());
        }

*/
        ArrayList<Student> students = new ArrayList<>();
        int choice;
        Scanner input = new Scanner(System.in);
        while(true){
            

            mainMenu();
            choice = input.nextInt();

            if(choice == 1)
            {
                int id;
                String name;
                boolean gender;
                float gpa;
                
                System.out.println("Enter id");
                id = input.nextInt();
                System.out.println("Enter name");
                input.nextLine();
                name = input.nextLine();
                System.out.println("Enter gender (true/false)");
                gender = input.nextBoolean();
                System.out.println("Enter gpa");
                gpa = input.nextFloat();
                
                Student s = new Student(id, name, gender, gpa);
                students.add(s);
            }
            else if(choice  == 2)
            {
                int studentNo = 1;
                for(Student st:students)
                {
                    System.out.println("Student #."+studentNo);
                    System.out.println(st);
                    studentNo++;
                }
            }
            else if(choice == 3)
            {
                boolean flag = false;   
                int id;
                System.out.println("Enter the id which you want to search : ");
                id = input.nextInt();
                for(Student st:students)
                {
                    if(st.getId()==id)
                    {
                        System.out.println(st);
                        flag = true;
                        break;
                    }
                }
                
                if(flag==false)
                {
                    System.out.println(id+" not founded.");
                }
                
            }
            else if(choice == 4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid Option Selected");
            }
        }
        
        
        
        
        
        
        
        
    }
}
