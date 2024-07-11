import java.util.*;
public class Strings{
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // String name= sc.next(); //for strings with space sc.nextLine()
        // System.out.println("name is:"+ name);

        // //length()    
        // System.out.println(name.length());


        // //charAt(index)
        // for (int i=0; i< name.length(); i++){
        //     System.out.println(name.charAt(i));
        // }

        // //compareTo
        // String name1= "adam";           //s1> s2: +ve value
        // String name2= "batman";         //s1< s2: -ve value
        // if (name1.compareTo(name2)==0){ //s1==s2: 0
        //     System.out.println("equal");
        // }else{
        //     if(name1.compareTo(name2)>0){
        //         System.out.println("name1> name2");
        //     }
        //     else if(name1.compareTo(name2)<0){
        //         System.out.println("name1<name2");
        //     }
        // }


        //substring
        String sentence = "my name is sanskriti";
        //String name= sentence.substring(11);
        String name= sentence.substring(11, sentence.length());
        System.out.println(name);
        
    }
    
}
