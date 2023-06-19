public class InvalidEmailAddressException  extends  Exception{
    public InvalidEmailAddressException(String EmailAddress,int num)
    {
        switch (num) {
            case 1:
                System.out.println("ERROR: InvalidEmailAddress " + EmailAddress +" @ is not the first char ");
                break;
            case 2:
                System.out.println("ERROR: InvalidEmailAddress " + EmailAddress +" @ is not the end char ");
                break;
            case 3:
                System.out.println("ERROR: InvalidEmailAddress " + EmailAddress +" @ is not exist ");
                break;
            case 4:
                System.out.println("ERROR: InvalidEmailAddress " + EmailAddress +" is not exist point after @ ");
                break;

        }
    }
}
