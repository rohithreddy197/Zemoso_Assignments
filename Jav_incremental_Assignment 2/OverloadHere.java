public class OverloadHere {

    int var;
    public OverloadHere(){
        System.out.println("Contructor with no parameters");
    }

    public OverloadHere(int var){
        this.var=var;
        System.out.println("Constructor with parameter value : "+var);
        new OverloadHere();
    }

    public static void main(String args[])
    {
        OverloadHere object1= new OverloadHere();
        OverloadHere object2= new OverloadHere(7);
    }

}
