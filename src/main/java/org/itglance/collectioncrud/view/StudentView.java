package org.itglance.collectioncrud.view;

import java.util.List;
import java.util.Scanner;

import org.itglance.collectioncrud.dao.StudentDao;
import org.itglance.collectioncrud.model.Student;

public class StudentView {

	private Scanner scanner = new Scanner(System.in);
	private StudentDao sDao = new StudentDao();

	public void mainProcess() {
		String shouldContinue = "";
		do {
			System.out.println("Hello User.What do you want to do ?");
			System.out.println("1.add student");
			System.out.println("2.display students");
			System.out.println("3.delete student");
			System.out.println("4.update student info");
			switch (scanner.next()) {
			case "add": {
				System.out.println("enter id");
				int id = scanner.nextInt();
				System.out.println("enter firstname");
				String fname = scanner.next();

				System.out.println("lastname");
				String lname = scanner.next();

				System.out.println("address");
				String address = scanner.next();

				System.out.println("subject");
				String subject = scanner.next();

				Student std = new Student(id, fname, lname, address, subject);

				sDao.insertStudent(std);
				System.out.println("Student has been added");
				break;

			}

			case "display": {

				System.out.println("student displayed...");
				System.out.println();

				List<Student> std = sDao.studentDisplay();

				for (Student s : std) {
					System.out.println(s);
				}

				break;

			}

			case "delete": {
				System.out.println("Enter which id you want to delete?");
				int idToDelete = scanner.nextInt();

				Student student = sDao.findOne(idToDelete);
				System.out.println(student.getId());
				System.out.println(student.getFname());
				System.out.println(student.getLname());
				System.out.println(student.getAddress());
				System.out.println(student.getSubject());

				if (student != null) {
					sDao.studentDelete(student);
				}

				break;
			}

			case "update": {
				System.out.println("enter which id you want to update?");
				int idToUpdate = scanner.nextInt();

				Student student = sDao.findOne(idToUpdate);
				System.out.println(student.getId());
				System.out.println(student.getFname());
				System.out.println(student.getLname());
				System.out.println(student.getAddress());
				System.out.println(student.getSubject());

				if (student != null) {
					System.out.println("enter new id");
					int id = scanner.nextInt();
					System.out.println("enter first name");
					String fname = scanner.next();
					System.out.println("enter last name");
					String lname = scanner.next();
					System.out.println("enter address");
					String address = scanner.next();
					System.out.println("enter subject");
					String subject = scanner.next();

					sDao.studentUpdate(idToUpdate, new Student(id, fname,
							lname, address, subject));

					System.out.println("Student has been updated");
				}

				break;
			}

			default: {
				System.out.println("you havenot selected a number");
			}
			}
			shouldContinue = isContinue();
		} while (shouldContinue.equalsIgnoreCase("yes"));
	}

	private String isContinue() {
		String shouldContinue;
		System.out.println("Do you want to continue? ");
		shouldContinue = scanner.next();
		return shouldContinue;
	}
}
