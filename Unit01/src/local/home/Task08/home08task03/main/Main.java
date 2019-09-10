package local.home08task03.main;

import java.util.List;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из
 * пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {
	public static void main(String[] args) {
		GroupLogic grLogic = new GroupLogic();

		Group gr = new Group(10);

		gr.add(new Student("Vasa P.B.", 0, new int[] { 2, 4, 2, 4, 4 }));
		gr.add(new Student("Vika L.V.", 0, new int[] { 10, 10, 10, 10, 10 }));
		gr.add(new Student("Anton D.G.", 0, new int[] { 3, 2, 1, 8, 9 }));
		gr.add(new Student("Serg S.T", 0, new int[] { 9, 10, 9, 9, 10, }));
		gr.add(new Student("Andrey R.T.", 0, new int[] { 2, 3, 5, 5, 4 }));
		gr.add(new Student("Egor A.V.", 0, new int[] { 3, 4, 5, 6, 7 }));
		gr.add(new Student("Ivan T.S.", 0, new int[] { 3, 2, 1, 8, 7 }));
		gr.add(new Student("Masha X.E.", 0, new int[] {10, 10, 10, 10, 10 }));
		gr.add(new Student("Gek E.R.", 0, new int[] { 7, 8, 8, 6, 7 }));
		gr.add(new Student("Ola E.G.", 0, new int[] { 2, 7, 6, 8, 5 }));

		List<Student> aLevelStudents = grLogic.takeALevelStudents(gr);
		printAStudent(aLevelStudents);
	}

	public static void printAStudent(List<Student> aLevelStudents) {
		for (Student st : aLevelStudents) {

			System.out.print(st.getName() + " - " + " marks: ");
			for (int i = 0; i < st.getMarks().length; ++i) {
				System.out.print(st.getMarks()[i] + " ");
			}
			System.out.println();

		}
	}

}
