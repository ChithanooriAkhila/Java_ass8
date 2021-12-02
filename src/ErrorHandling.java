public class ErrorHandling {
    public static void main(String[] args) {
        ErrorHandling.ExceptionHandling();
    }
    public static void ExceptionHandling(){
        try{
            int value=10/0;
            String str="Error handling";
            System.out.println(str.charAt(30));
            int num=Integer.parseInt("error");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block");
        }
    }
}
