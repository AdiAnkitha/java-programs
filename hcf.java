ublic class hcf {
    public static void main (String args []){
        int a = 3;
        int b = 25;
        while(b % a != 0){
       int c = b % a;
        b = a;
        a = c;
        }
        System.out.println(a);

    }
}
