
// Q5 - Given few lines of input(number of lines unknown) where each line has two
// strings, concatenate the strings.

// Input :
// Hello World
// Happy Faces
// Sunny Day
// Good Morning

// Output :
// HelloWorld
// HappyFaces
// SunnyDay
// GoodMorning
import java.util.Scanner;
public class takingInput_Question5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
while(sc.hasNextLine()){
String str1 = sc.next();
String str2 = sc.next();
System.out.println(str1+str2);
}
}
}

