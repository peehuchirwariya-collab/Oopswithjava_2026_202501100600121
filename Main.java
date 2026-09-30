// Create a program to sort a collection of integers in descending order.
// Also define a comparable Student class having members name, age, rollNo, and marks.
// Sort the collection of Student objects in ascending order based on their roll number.
// Create a comparator to sort students by descending marks; if marks are equal,
// order them in ascending roll number.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String name;
    int age;
    int rollNo;
    int marks;

    Student(String name, int age, int rollNo, int marks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(12);
        numbers.add(45);

        System.out.println("Original integers: " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending integers: " + numbers);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 20, 101, 85));
        students.add(new Student("Alice", 22, 102, 90));
        students.add(new Student("Bob", 21, 103, 85));

        Comparator<Student> byMarksDescendingThenRollAscending =
                Comparator.comparingInt((Student student) -> student.marks)
                        .reversed()
                        .thenComparingInt(student -> student.rollNo);

        students.sort(byMarksDescendingThenRollAscending);
        System.out.println("Students sorted by marks descending then roll no ascending: " + students);
    }
}
