
class A {
A() {
System.out.println("Class-A : Costrcutor");
}
static {
System.out.println("Class-A : Static Block");
}
{
System.out.println("Class-A : Instance Block");
}
}
public class Order extends A {
Order() {
System.out.println("Order : Costrcutor");
}
static {
System.out.println("Order : Static Block");
}
{
System.out.println("Order : Instance Block");
}
public static void main(String[] args) {
A ob = new A(); //only A Class
System.out.println("A========Completed");
Order o1 = new Order(); //Order class Contains A Class DataMembers
System.out.println("Order1 =========== Completed");
Order o2 = new Order(); //Order class Contains A Class DataMembers
System.out.println("Order2 =========== Completed");
}
}