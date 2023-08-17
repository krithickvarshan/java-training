public class helo {
    public static void main(String args[]){

        int num1 =40;
		int num2 =50;
		calculator cal = new calculator();
     int result =   cal.add(num1,num2);
 System.out.println(result);
    }
}
class calculator {
    int a;
    public int add(int n1, int n2){
       int r = n1 +n2;
return r;
    }
}