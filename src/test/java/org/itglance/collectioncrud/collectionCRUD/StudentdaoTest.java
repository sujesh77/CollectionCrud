package org.itglance.collectioncrud.collectionCRUD;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.itglance.collectioncrud.dao.StudentDao;
import org.itglance.collectioncrud.model.Student;
import org.junit.Test;

public class StudentdaoTest {

	StudentDao studentDao = new StudentDao();

	@Test
	public void testInsertStudent() {

		Student student = new Student(5, "ambika", "shahi", "swoyambhu", "history");

		studentDao.insertStudent(student);
		assertEquals(5, studentDao.sizeOfStudents());
	
	}

	@Test
	public void testStudentDisplay() {
		assertEquals(studentDao.sizeOfStudents(), studentDao.studentDisplay()
				.size());

	}

	@Test
	public void testStudentDelete() {
		Student student = studentDao.findOne(2);
		studentDao.studentDelete(student);

		assertNull(studentDao.findOne(2));
	}

	@Test
	public void testStudentUpdate() {
		Student studentCheck = studentDao.findOne(1);

		studentCheck.setId(1);
		studentCheck.setFirstName("Ambika");
		studentCheck.setLastName("Shahi");
		studentCheck.setAddress("Swoyambhu");
		studentCheck.setSubject("History");

		studentDao.studentUpdate(1, studentCheck);

		assertEquals(studentCheck, studentDao.findOne(1));

	}

}
