class CallUsingArray {
    String string;
    public CallUsingArray(String string)
    {
        this.string=string;
        System.out.println("This is " + string);
    }
    public static void main(String args[])
    {
        CallUsingArray ob[]=new CallUsingArray[6];
        ob[0]=new CallUsingArray("first constructor call");
        ob[1]= new CallUsingArray("second constructor call");
        ob[2]= new CallUsingArray("third constructor call");
        ob[3]= new CallUsingArray("fourth constructor call");
		    ob[4]= new CallUsingArray("fifth constructor call");
		    ob[5]= new CallUsingArray("sixth constructor call");
    }
}
