package Exceptions;

// public class Main {
//     public static void main(String[] args) {
//         try{
//             int a = 5;

//             int result = a/0;

//             System.out.println(result);
//         }catch(Exception e){
//             System.out.println("Something went wrong");
//         }
//     }
// }

class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}

public class Main {
    static void check(int age) throws CustomException{
        if(age > 18){
            System.out.println("Eligible");
        }else{
            throw new CustomException("Not Eligible");
        }
    }

    public static void main(String[] args) {
        try{
            check(16);
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}