package DogsComparator___C;

public class Pudel extends Dog {

    private String lieblingsEssen;

    public Pudel(String name, int age, String lieblingsEssen) {
        super(name, age);
        this.lieblingsEssen = lieblingsEssen;
    }

    public String getLieblingsEssen() {
        return lieblingsEssen;
    }

    public void setLieblingsEssen(String lieblingsEssen) {
        this.lieblingsEssen = lieblingsEssen;
    }

    public void isstBeilage(String beilage) {
        //name ist private können nicht direkt zugreifen aber über getter
        // alter ist protected können zugreifen
        System.out.println(getName() + "(" + age + ") isst " + lieblingsEssen + " Beilage: " + beilage);
    }

}
