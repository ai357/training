public class ALH {

    public static void main (String[] args) {

        int i = 0;
        int loopCount = 100;
        int numFizz = 3;
        int numBuzz = 5;
        String strFizz ="Fizz";
        String strBuzz ="Buzz";
    

        // 初期化式（iは1）条件式(iが100以下の間)変化式(iに1を足す)
        for ( i = 1; i <= loopCount; i++ ){
            // i÷(numfizz*numBuzz)の余りが０つまり15の倍数のとき
            if ( i % (numFizz * numBuzz) == 0 ){
                // FizzBuzzと教示する
                System.out.println(strFizz + strBuzz);
                //i÷numFizzの余りが０つまり３の倍数のとき 
            } else if ( i % numFizz == 0 ){
                // Fizzと表示する
                System.out.println(strFizz);
                // i÷numBuzzの余りが０つまり５の倍数のとき   
            } else if ( i % numBuzz == 0){
                // Buzzと表示する
                System.out.println(strBuzz);
                // どれでもなかったらそのままiを表示する
            } else {
                System.out.println(i);
            }
        }

        int num = 7;

        System.out.println(num + 3);


        
    }

    public static void sub (String[] args){
        for(int l = 1; l <= 3; ++l){
            for(int j = 3; j <= 1; --j){
                System.out.println("(" + l + "," + j + ")");
            }
            System.out.println("a" );
        }

    }

    
    }
    

