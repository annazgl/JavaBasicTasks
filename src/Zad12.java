import java.util.Scanner;

public class Zad12 {

    //Napisz program, który odczytuje napis i wypisuje go wspak

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        if(a==b){
            System.out.println("równe");
        }
        else{
            System.out.println("nierówne");
        }

    }
}
