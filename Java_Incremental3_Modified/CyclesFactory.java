package cyclefactory;

public class CyclesFactory {

    public enum Cycles {
        Unicycle, Bicycle, TriCycle
    }

    Cycles cName;

    public CyclesFactory(Cycles cName) {
        this.cName = cName;
    }

    public void companyDetails() {
        switch (cName) {
            case Unicycle: {
                Unicycle unicycle=new Unicycle();
                unicycle.speed();
                break;
            }
            case Bicycle:
            {
                Bicycle bicycle=new Bicycle();
                bicycle.speed();
                break;
            }


            case TriCycle:
            {
                Tricycle tricycle=new Tricycle();
                tricycle.speed();
                break;
            }


            default:
                System.out.println("oops no wheels");
                break;
        }
    }

    public static void main(String[] args) {
        CyclesFactory unicycle = new CyclesFactory(Cycles.Unicycle);
        unicycle.companyDetails();
        CyclesFactory bicycle = new CyclesFactory(Cycles.Bicycle);
        bicycle.companyDetails();
        CyclesFactory tricycle = new CyclesFactory(Cycles.TriCycle);
        tricycle.companyDetails();

    }
}
