import java.util.*;
public  class main{

    public static  void  main (String args[]){

    Scanner scan= new Scanner(System.in);
    System.out.println("Cipher or Decipher?");
    String ans=scan.nextLine();
   
    System.out.println("Type your message:");
    String message= scan.nextLine();
    String messageUpper=message.toUpperCase();
    if(ans.toLowerCase().equals("cipher"))
    {
        Cipher(messageUpper);
    }
    else if(ans.toLowerCase().equals("decipher")){
    Decipher(messageUpper);
    }
  
    //Cipher str1=new Cipher(message);
    //cipherStr(str1);
    //str1.cipherStr();
    //use a bunch of if statements to implement but is bad coding practice
    
    //maybe use a function
}


  public static void Cipher(String message)
  {
     int ascii=0,newAscii=0;
     char holder;
    ArrayList<Character> chars =new ArrayList<Character>();
    ArrayList<Character> charsNew =new ArrayList<Character>();
        for(int x=0; x<message.length();x++)
        {
            chars.add(message.charAt(x));
        }

        System.out.println("Size of Arraylist =" +chars.size());
        
        for(int x=0;x<chars.size();x++)
        {
           ascii=(int) chars.get(x);
        if(ascii==32)
        {
            holder=(char) ascii;
            charsNew.add(holder);
        }
           else if(ascii<68){
            newAscii=ascii+26-3;
            holder=(char) newAscii;
            charsNew.add(holder);
        }
        else
        {
            newAscii=ascii-3;
            holder=(char) newAscii;
            charsNew.add(holder);
        }
        }
        for(int x=0; x<charsNew.size(); x++)
        {
            System.out.print(charsNew.get(x));
        }
        System.out.println();
    }
   public static void Decipher(String message)
  {
     int ascii=0,newAscii=0;
     char holder;
    ArrayList<Character> chars =new ArrayList<Character>();
    ArrayList<Character> charsNew =new ArrayList<Character>();
        for(int x=0; x<message.length();x++)
        {
            chars.add(message.charAt(x));
        }

        System.out.println("Size of Arraylist =" +chars.size());
        
        for(int x=0;x<chars.size();x++)
        {
           ascii=(int) chars.get(x);
        if(ascii==32)
        {
            holder=(char) ascii;
            charsNew.add(holder);
        }
           else if(ascii>87){
            newAscii=ascii-26+3;
            holder=(char) newAscii;
            charsNew.add(holder);
        }
        else
        {
            newAscii=ascii+3;
            holder=(char) newAscii;
            charsNew.add(holder);
        }
        }
        for(int x=0; x<charsNew.size(); x++)
        {
            System.out.print(charsNew.get(x));
        }
        System.out.println();
    }
    
    
    
    }
    

