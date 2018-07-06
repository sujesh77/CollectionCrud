package org.itglance.collectioncrud.dao;

import java.util.LinkedList;
import java.util.List;

import org.itglance.collectioncrud.model.Student;

public class StudentDao {

	public static List<Student> students = new LinkedList<>();

	static {
		students.add(new Student(1, "sujesh", "shahi", "kalimati", "maths"));
		students.add(new Student(2, "yuvraj", "khatiwada", "mulpani", "science"));
		students.add(new Student(3, "nischal", "shakya", "dallu", "nepali"));
		students.add(new Student(4, "suresh", "shahi", "swoyambhu", "english"));
	}

	public int sizeOfStudents() {

		return students.size();
	}

	public void insertStudent(Student student) {
		students.add(student);
	}

	public List<Student> studentDisplay() {
		return students;
	}

	public void studentDelete(Student student) {
		students.remove(student);
	}

	public Student findOne(int id) {
		for (Student s : students) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	public void studentUpdate(int idToUpdate, Student std) {
		students.set(students.indexOf(findOne(idToUpdate)), std);
	}
}
