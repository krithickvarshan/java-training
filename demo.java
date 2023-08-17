class computer {

    public void  playMusic(){
    System.out.println("Music playing..");
   }
   public String getMePen(int money){
    if(money>=10)
       return "pen";
  
        return "money is lesser than pen value";
    }
    
   

}

public class demo {

    public static void main(String ags[]) {

     computer play = new computer();
     play.playMusic();
     String result =play.getMePen(3);
     System.out.println(result);
     calculator obj = new calculator();
     int r1 = obj.add(3,4);
     System.out.println(r1);
    }
}
class calculator{

    public int add(int n1, int n2){
        
        return n1 + n2;
    }
}