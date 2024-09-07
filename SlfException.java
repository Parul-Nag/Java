class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
class SlfException
{
    public static void main(String[] args) 
    {
        try 
        {
            Vote(12);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
       
    }
    public static void Vote(int age) throws InvalidAgeException
        {
            if( age<18)
            {
                throw new InvalidAgeException("Not Elligible for voting...! You are Underage");
            }
            else
            {
                System.out.println("You are Elligible for Voting..");
            }
        }

}