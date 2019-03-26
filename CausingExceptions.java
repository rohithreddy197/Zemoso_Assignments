public class CausingExceptions{

    public void bewareOfExceptions()
    {
        int a=1,b=0;
        String str=null;
        int outofboundsarr[]=new int[200];
        try {
	    //causes arithmetic exception. divide by zero causes exception here.
            int result = a / b; 
	    //causes null pointer exception
            System.out.println("doesn't print this string" + str); 
	    //causes array index out of bounds exception
            int result1=outofboundsarr[300];
        }
        catch(Exception e){
            System.out.println("hi im catch block.Too many exceptions caused.");
        }
        finally{
            System.out.println("hi im finally block");
        }
    }
    public static void main(String args[]){
        CausingExceptions ec=new CausingExceptions();
        ec.bewareOfExceptions();
    }
}
