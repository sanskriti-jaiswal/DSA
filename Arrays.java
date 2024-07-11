import java.util.* ;
public class Arrays
{ public static void main(String args[])
{

    // int marks[] = new int[3];
    // marks[0]= 98;
    // marks[1]= 97;
    // marks[2]= 90;
    // System.out.println(marks[0]);

    // for (int i=0; i<3; i++){
    //     System.out.println(marks[i]);
    // }




    // Scanner sc = new Scanner(System.in);
    // int size= sc.nextInt();
    // int numbers[]= new int[size];
    // for (int i=0; i<size; i++){
    //     System.out.println(numbers[i]);
    // }



    // Scanner sc= new Scanner(System.in);
    // int size= sc.nextInt();
    // int []numbers = new int[size];
    // for(int i=0; i<size; i++){
    //     numbers[i]= sc.nextInt();
    // }
    // for (int i=0; i<size; i++){
    //     System.out.println(numbers[i]);
    // }



    Scanner sc= new Scanner(System.in);
    int size = sc.nextInt();
    int []numbers= new int[size];
    for(int i=0; i<size; i++){
        numbers[i]= sc.nextInt();

    }

    for (int i=0; i<size; i++){
        System.out.println( numbers[i]);
    }
    int x= sc.nextInt();
    for (int i=0; i<size; i++){
        if(numbers[i]==x){
            System.out.println("index:"+ i);
        }
    } 
}}