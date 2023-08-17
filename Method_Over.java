// method over-loading
// simply change parameters with same method name 

public class Method_Over {
    
    public static void  main (String [] args ){
       
        Calculator obj =new Calculator();
        int r1 = obj.add(3,4,5);
        System.out.println(r1);

    }
}

class Calculator {
     public int add(int n1 ,int n2){
        int result = n1 +n2; 
        return result;
     }
      public int add(int n1 ,int n2,int n3){
        int result = n1 +n2+n3; 
        return result;
     }
}