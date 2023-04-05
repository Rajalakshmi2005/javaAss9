import java.util.*;
class Assignment9{
public static void main(String []args){
// 1. Area and Volume
Cylinder no1 = new Cylinder();
no1.volume();
// 2. Rectangle and Cuboid
Cuboid no2 = new  Cuboid();
no2.get();
// 3. Member
Employee no3 = new Employee();
no3.processing("Harish",23,8608787750l,"Golden Beach Road",10000);
Manager no4 = new Manager();
no4.processing("Mohan",34,9578987750l,"Marina Beach Road",15000);
// 4. Shapes
Square no5 = new Square();
no5.print1();
// 5. Parent Child
Parent no6 = new Parent();
Child no7 = new Child();
no6.print1();
no7.print2();
}    
}
// 1. Area and Volume
class createCircle{
int p = 7;
double ans;
void area(){
ans=3.14 *p*p;
System.out.println("Area of the Circle = "+ans);
}    
}
class Cylinder extends createCircle{
int k = 5;
void volume(){
area();
System.out.println("Volume of the Cylinder = "+(ans*k));
System.out.println("\n");
}
}
// 2. Rectangle and Cuboid
class Rectangle{
int p;
int k;
int area;
void getter(){
System.out.println("Area of the Rectangle = "+area());
}
int area(){
area = p*k;
return area;
}
void setter(int a,int b){
p=a;
k=b;
}
}
class Cuboid extends Rectangle{
int r;
void get(){
setter(15,17);
getter();
set(7);
System.out.println("Volume of Cuboid = "+volum());
}    
int volum(){
return area * r;
}
void set(int c){
r=c;
System.out.println("\n");
}
}
// 3. Member
class Member{
String name;
int age;
long phoneNumber;
String address;
double salary;
void salary(){
System.out.println("Salary = "+salary);
}
}
class Employee extends Member{
String work = "Developer";
void processing(String a,int b,long c,String d,double e){
name = a;
age = b ;
phoneNumber = c;
address = d;
salary = e;
System.out.println("Employee's Name = "+name+"\n Employee's Age = "+age+"\n Employee's Phone Number = "+phoneNumber+"\n Employee's Address = "+address+"\n Employee's Work = "+work);
salary();
}
}
class Manager extends Member{
String department = "Security";
void processing(String a,int b,long c,String d,double e){
name = a;
age = b ;
phoneNumber = c;
address = d;
salary = e;
System.out.println("Manager's Name = "+name+"\n Manager's Age = "+age+"\n Manager's Phone Number = "+phoneNumber+"\n Manager's Address = "+address+"\n Manager's Department = "+department);
salary();
System.out.println("\n");
}
}
// 4. Shapes
class Shape{
void print1(){
System.out.println("This is Shapes");
}
class Rectangles extends Shape{
void print2(){
System.out.println("\n This is Rectangle Shape");
}    
}
class Square extends Shape{
void print3(){
System.out.println("\n This is Squre Shape");
}    
}
class Circles extends Shape{
void print4(){
System.out.println("\n This is Circle Shape");
}    
}
class square extends Rectangles{
void print5(){
System.out.println("\n This Squre is Rectangle");
System.out.println("\n");
}    
}
}
// 5. Parent Child
class Parent{
void print1(){
System.out.println("This Parent Class");
}    
}
class Child{
void print2(){
System.out.println("This is Child Class");
}
}
