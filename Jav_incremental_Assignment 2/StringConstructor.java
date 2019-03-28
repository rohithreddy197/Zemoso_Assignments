public class StringConstructor {
    String string;
    public StringConstructor(String string)
    {
        this.string=string;
        System.out.println("The Value of string is :" + string);
    }

    public static void main(String args[])
    {
        StringConstructor objects[]=new StringConstructor[3];
        objects[0]=new StringConstructor("passtocons");
        objects[1]= new StringConstructor("passtocons again");
    }
}
