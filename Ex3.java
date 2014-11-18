
class Ex3{

    public String ex3_0(int n){
        if(n > 0){
            return "その値は正です";
        }else{
            return "その値は０か負です";
        }

    }

    public int ex3_1(int n){

        return Math.abs(n);
    }

    public String ex3_2(int a, int b){

        if ( a % b == 0 ){
            return b + "は" + a + "の約数です";
        }else{
            return b + "は" + a + "の約数ではありません";
        }
    }

    public String ex3_3(int a, int b){


        if (a < b){
            return b + "の方が大きいです";
        }else if(a > b){
            return a + "の方が大きいです";
        }else{
            return "同じ値です";
        }

    }

    public String ex3_4(int a){

        if( a > 0 ){

            if ( a %  5 == 0 ){
                return "その値は5で割り切れます";
            }else{
                return "その値は5で割り切れません";
            }

        }else{
            return "正でない整数値です"; 
        }

    }

    public String ex3_5(int a){

        if ( a > 0 ){
            if ( a % 10 == 0 ){
                return "その値は10の倍数です";
            }else{
                return "その値は10の倍数ではありません";
            }
        }else{
            return "正でない整数値です";
        }
    }

    public String ex3_6(int a){

        if ( a > 0 ){
            if( a % 3 == 0 ){
                return "その値は3で割り切れます";
            }else if( a % 3 == 1 ){
                return "その値を3で割った余りは1です";
            }else{
                return "その値を3で割った余りは2です";
            }
        }else{
            return "正でない整数値です";
        }
    }

    public String ex3_7(int a){

        if ( a > 100 ){
            return "範囲(0～100)外の値です"; 
        }else if ( a > 79 ){
            return "優";
        }else if ( a > 69 ){
            return "良";
        }else if ( a > 59 ){
            return "可";
        }else if ( a > -1 ){
            return "不可";
        }else{
            return "範囲(0～100)外の値です";
        }
    }

    public double ex3_8(double a, double b){
        if ( a < b ){
            return b;
        }else{
            return a;
        }
    }

    public int ex3_9(int a, int b){
        return Math.abs(a-b);
    }

    public String ex3_10(int a, int b){
        if ( Math.abs(a-b) < 11 ){
            return "それらの差は10以下です";
        }else{
            return "それらの差は11以上です";
        }
    }

    public int ex3_11(int a, int b, int c){
            int x = Math.min(a,b);
            return Math.min(x,c);

    }

    public int ex3_12(int a, int b, int c){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        if ( max < c ){
            return max;
        }else if ( min > c ){
            return min;
        }else{
            return c;
        }
    }

    public String ex3_13(int a){
        if(a == 12 || a == 1 || a == 2){
            return "冬";
        }else if ( a >= 3 && a <= 5 ){
            return "春";
        }else if ( a >= 6 && a <= 8 ){
            return "夏";
        }else if ( a >= 9 && a <= 11 ){
            return "秋";
        }else{
            return "範囲(1～12)外の値です";
        }
    }

}
