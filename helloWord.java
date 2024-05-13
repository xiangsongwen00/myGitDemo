public class helloWord {
    private static String yj="yangJie";
    public static void main(String[] args) {
        String user=getYj();
        System.out.println("Hello,"+user+" welcome to the World!");

    }
    private static String getYj(){
        return yj;
    }
}
