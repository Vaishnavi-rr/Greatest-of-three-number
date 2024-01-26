import java.util.*;
public class Main{
public static void main (String arg[]){
Scanner sc =new Scanner(System.in);
int first = sc.nextInt();
int second = sc.nextInt();
int third = sc.nextInt();
int temp,result;
temp = first>second?first:second;
result = temp>third?temp:third;
System.out.println(result+"is the largest");
}
}
