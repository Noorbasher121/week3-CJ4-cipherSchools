public class String2 {
    public static void main(String[] args) {
        String s1="hello";
        s1=s1+"peeps";
        System.out.println(s1);
    System.out.println(s1 +"how are you doing?");   
        //String s2="Peeps";
        System.out.println(s1);
       // Another way to concatenate is used function
       String s2=new String("Hello");
       String s3=new String("People");
       String s4=s2.concat(s3);
       System.out.println(s4);
       System.out.println(s2);
       String name1="noor";
       String name2="noor";
       System.out.println(name1.equals(name2));
    
    }
}
