public class GraduateStudent extends Student {

    private String specialization;

    public GraduateStudent(int id, String name, int marks, String specialization) {
        super(id, name, marks);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + specialization);
    }
}