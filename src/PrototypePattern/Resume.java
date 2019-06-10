package PrototypePattern;

public class Resume implements Cloneable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Resume clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (Resume)obj;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("They can't support the method of clone");
        return null;
    }
}
