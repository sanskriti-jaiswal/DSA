
public class StringBuilders {
public static void main(String[] args) {
    //Declaration
    StringBuilder sb= new StringBuilder("Sanskriti");
    System.out.println(sb);

    //charAt(index)
    System.out.println(sb.charAt(3));

    //setcharAt(index, char)
    sb.setCharAt(3,'m');
    System.out.println(sb);

    //insert(index, char)
    sb.insert(0,'j');
    sb.insert(0,'a');
    sb.insert(0,'i');
    System.out.println(sb);

    //delete
    sb.delete(0,3);
    System.out.println(sb);

    //append
    StringBuilder s= new StringBuilder("h");
    s.append("e");
    s.append("l");
    s.append("l");
    s.append("o");
    s.append("o");
    System.out.println(s);
    

    //REVERSE A STRING
    StringBuilder b= new StringBuilder("hello");
    for (int i=0; i<b.length()/2; i++){
        int front= i;
        int back= b.length() - 1- i;
        char frontChar= b.charAt(front);
        char backChar= b.charAt(back);
        b.setCharAt(front,backChar);
        b.setCharAt(back,frontChar);
    }
    System.out.println(b);
}    
}
