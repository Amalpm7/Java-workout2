import java.util.*;
class Employee{
String name;
int EmpId;
String result;
int ass1,ass2,ass3;
Scanner in =new Scanner(System.in);

Employee(){
System.out.println("Enter employee name:");
name = in.next();
System.out.println("Enter Employee id:");
EmpId = in.nextInt();
}
void setAssesment(){
System.out.println("Enter the assessment mark out of 100");
ass1 = in.nextInt();
ass2 = in.nextInt();
ass3 = in.nextInt();
}
void callResult(){
System.out.println("Total mark= "+(ass1+ass2+ass3));
System.out.println("Percentage = "+(float)(ass1+ass2+ass3)/300*100);
}
void checkPromotion(){
if(ass1 > 75 && ass2 > 75 && ass3 > 75)
result = "Promoted";
else
result = "Demoted";
System.out.println(name +" is being " + result);
}
}
public class EmployeeDemo {
public static void main (String[] args){
Employee e1 =new Employee();
e1.setAssesment();
e1.checkPromotion();
e1.callResult();
}
}