/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

public class Student extends Person {
    int numCourses;
    int[] grades;
    String[] courses;

    Student(String name, String address, int numCourses, int[] grades, String[] courses) {
        super(name, address);
        this.numCourses = numCourses;
        this.courses= courses;
        this.grades = grades;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nama: ").append(name).append(", Alamat: ").append(address).append("\n");
        sb.append("Kursus yang diambil:\n");
        for (int i = 0; i < numCourses; i++) {
            sb.append(courses[i]).append(": ").append(grades[i]).append("\n");
        }
        return sb.toString();
    }

    void addCourseGrede(String course, int grade) {
        int index = -1;
        for(int i = 0; i < numCourses; i++){
            if(courses[i].equals(course)) {
                index=i;
                break;
            }
            if (index != -1) {
                grades[index] = grade;
                System.out.println("Nilai untuk kursus " + course + " telah diperbarui menjadi " + grade);
            } else {
                System.out.println("Kursus " + course + " tidak ditemukan.");
            }
        }
    }

    void printGrades(){
        System.out.println("Nilai Mahasiswa");
        for(int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    double getAverageGrade() {
        int totalGrade = 0;
        for (int grade : grades) {
            totalGrade += grade;
        }
    
        double averageGrade = (double) totalGrade / numCourses;
        return averageGrade;
    }

    // public String toString() {
    //     return "Nama : " + name + ", Alamat: " + address ;
    // }
}
