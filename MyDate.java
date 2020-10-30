import java.util.Scanner;
public class MyDate
{
  private int day,month,year;
  MyDate()
  {
   day=20;month=10;year=2020;
  }
MyDate(int day,int month,int year)
{
	
this.day=day;

	this.month=month;

	this.year=year;
}
void accept()
{
Scanner s=new Scanner(System.in);
System.out.println("Day");
this.day=s.nextInt();
System.out.println("Month");
this.month=s.nextInt();
System.out.println("Year");
this.year=s.nextInt();
}
   int getDay(){return day;}
   void setDay(int d){day=d;}
   void display(){System.out.println(day+"/"+month+"/"+year);}
   static void show(){System.out.println("In Static Method");}
   public static void main(String args[])
   {
    MyDate d=new MyDate(1,2,2020);
int s;
d.accept();
    d.display();
    MyDate.show();
d.setDay(7);
s=d.getDay();
System.out.println(s);
   }
};
