public class progate {
    public static void main(String[] args) {
        int n = 1;
        
        // switch文を用いて、変数nの値に応じて条件分岐をしてください
        switch(n){
          case 1:
            System.out.println("大吉です");
            break;
          case 2:
            System.out.println("吉です");
            break; 
        }
      }
    
    public static void sub(String[] args) {
      printData("Kete Jones");
      printDate("Jhon Cristopher Smith");
    }
    
    public static void printDate(String name, int age){
      System.out.println("私の名前は"+name+"です");
      System.out.println("私の年齢は"+age+"す");
    }


}
