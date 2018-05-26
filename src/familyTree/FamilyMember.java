package familyTree;

public class FamilyMember {

    private final String name;
    private final String dob;
    private final FamilyMember[] parents;
    private final FamilyMember[] children;
    private final FamilyMember[] spouses;

    public FamilyMember(String name, String dob, FamilyMember[] parents, FamilyMember[] children, FamilyMember[] spouses){
        this.name = name;
        this.dob = dob;
        this.parents = parents;
        this.children = children;
        this.spouses = spouses;
    }

    public static void main(String[] args) {
        FamilyMember father = new FamilyMember("Chiranjeevi", "22 August 1955", null, null, null);
        FamilyMember mother = new FamilyMember("Surekha Konidala", "22 August 1960", null, null, null);
        FamilyMember[] parents = {father, mother};
        FamilyMember child = new FamilyMember("No one", "01 May 2018", null, null, null);
        FamilyMember[] children = {child};
        FamilyMember spouse = new FamilyMember("Upasana Kamineni", "July 20, 1989", null, null, null);
        FamilyMember[] spouses = {spouse};
        FamilyMember person = new FamilyMember("Ram Charan", "27 March 1985", parents, children, spouses);

        System.out.println(person);


    }

    @Override
    public String toString() {
        System.out.println(name);
        System.out.println("|");
        System.out.println("|---CHILDREN: "+ getNames(children));
        System.out.println("|");
        System.out.println("|---PARENTS: "+ getNames(parents));
        System.out.println("|");
        System.out.println("|---SPOUSES: "+ getNames(spouses));
        return "";
    }

    public String getNames(FamilyMember[] list) {
        String result = "";
        for (FamilyMember familyMember: list) {
            result += familyMember.name + ", ";
        }
        return result;
    }

}
