package Exception;

class KarinaException extends RuntimeException
{
    public KarinaException(String message)
    {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Karina");
        int num1 = 10;
        int num2 = 0;
        try{
            int result = num1/num2;
            throw new KarinaException("Cannot divide by zero");
        }
        catch(KarinaException e)
        {
            System.out.println(e);
        }
    }
}
