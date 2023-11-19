package ogrenciBilgiSistemi;

public class Course {

	String name;
	String code;
	String prefix;
	int note;
	int verbalNote;
	Teacher teacher;

	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.verbalNote = 0;
	}

	void addTeacher(Teacher teacher) {
		if (this.prefix.equals(teacher.branch)) {
			this.teacher = teacher;
			System.out.println(this.name + " dersine " + teacher.name + " başarıyla eklendi");
		} else {
			System.out.println(teacher.name + " bu dersi veremez.	");
		}
	}

	void printTeacher() {
		if (this.teacher != null) {
			System.out.println(this.name + " dersinin öğretmeni " + teacher.name);
		} else {
			System.out.println(this.name + " dersinin öğretmeni yoktur.");
		}
	}

}
