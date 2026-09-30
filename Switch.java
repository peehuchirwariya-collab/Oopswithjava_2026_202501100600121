// switch statement 
public class Switch{
    public static void main(String[] args) {
        // switch statements 
        int i = 3 ;

        switch(i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2 ");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater than 3 ");
                break;
        }
    }
}
// switch -> limited use case .
//switch(expression) -> byte , short , int , char , enumeration 
//should evaluate to byte , short , int ,char , enumeration .
//no duplicate cases allowed.
// after jdk7 strings can also be used as switch expression .
//after jdk-14 switch is enhanced to much.
