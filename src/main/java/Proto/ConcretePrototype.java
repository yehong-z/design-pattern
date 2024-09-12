package Proto;

class ConcretePrototype implements Cloneable {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ConcretePrototype prototype1 = new ConcretePrototype("Prototype1");
        ConcretePrototype clone1 = (ConcretePrototype) prototype1.clone();

        System.out.println("Original: " + prototype1.getName());
        System.out.println("Clone: " + clone1.getName());

        clone1.setName("Prototype2");
        System.out.println("Modified Clone: " + clone1.getName());
        System.out.println("Original after clone modification: " + prototype1.getName());
    }
}