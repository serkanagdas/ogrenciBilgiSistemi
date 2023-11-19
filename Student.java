package ogrenciBilgiSistemi;

public class Student {

	String name;
	int stuNo;
	String classes;
	double average;
	boolean isPass;

	Course mat;
	Course fizik;
	Course kimya;

	public Student(String name, int stuNo, String classes, Course mat, Course fizik, Course kimya) {

		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.kimya = kimya;
		this.fizik = fizik;
		this.isPass = false;
		this.average = calcAverage();
	}

	void addBulkExamNote(int matNote, int fizikNote, int kimyaNote) {

		if (matNote >= 0 && matNote <= 100) {
			this.mat.note = matNote;
		}
		if (fizikNote >= 0 && fizikNote <= 100) {
			this.fizik.note = fizikNote;
		}
		if (kimyaNote >= 0 && kimyaNote <= 100) {
			this.kimya.note = kimyaNote;
		}
	}

	void addVerbalNote(int matVerbalNote, int fizikVerbalNote, int kimyaVerbalNote) {

		if (matVerbalNote >= 0 && matVerbalNote <= 100) {
			this.mat.verbalNote = matVerbalNote;
		}
		if (fizikVerbalNote >= 0 && fizikVerbalNote <= 100) {
			this.fizik.verbalNote = fizikVerbalNote;
		}
		if (kimyaVerbalNote >= 0 && kimyaVerbalNote <= 100) {
			this.kimya.verbalNote = kimyaVerbalNote;
		}
	}

	double calcAverage() {
		double matNote = (this.mat.note * 0.80) + (this.mat.verbalNote * 0.20);
		double fizikNote = (this.fizik.note * 0.80) + (this.fizik.verbalNote * 0.20);
		double kimyaNote = (this.kimya.note * 0.80) + (this.kimya.verbalNote * 0.20);
		return this.average = (matNote + fizikNote + kimyaNote) / 3;
	}

	void isPass() {
		calcAverage();
		if (this.average >= 55) {
			System.out.println("Sınıfı geçtiniz. " + " Ortalamanız : " + this.average);
			isPass = true;
		} else {
			System.out.println("Sınıfta kaldınız. " + " Ortalamanız : " + this.average);
			isPass = false;
		}
	}

	void printNote() {
		System.out.println("------------------");
		System.out.println("Öğrenci : " + this.name);
		System.out.println("Matematik notu : " + this.mat.note + "  Matematik sözlü notu : " + this.mat.verbalNote);
		System.out.println("Kimya notu : " + this.kimya.note + "  Kimya sözlü notu : " + this.kimya.verbalNote);
		System.out.println("Fizik notu : " + this.fizik.note + "  Fizik sözlü notu : " + this.fizik.verbalNote);
		System.out.println("Ortalama : " + this.average);
	}

}
