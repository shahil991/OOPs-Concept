package Question;

class MaxNum3 {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=30;
        System.out.println(findMax(a,b,c));

    }

    public static String findMax(int a, int b, int c){
        if(a>b && a>c) {
            return a+" is maximum";
        } else if(b>a && b>c) {
            return b+" is maximum";
        } else {
            return c+" is maximum";
        }
    }
}