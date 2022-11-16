
package javarevision;

public class Student {
    int id;
    String name;
    boolean gender;
    float gpa;

    public Student() {
    }

    public Student(int id, String name, boolean gender, float gpa) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "id=" + id + "\nname=" + name + "\ngender=" + gender + "\ngpa=" + gpa + "\n\n";
    }
    
    
    
}
