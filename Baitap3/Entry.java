package Baitap3;

public class Entry {
    public static void main(String[] args) {
        Iemployee employee1 = new PartTimeEmployee("Trung", 200000, 8);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        Iemployee employee2 = new FullTimeEmployee("Quan", 165000);
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}