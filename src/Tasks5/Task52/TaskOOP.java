package Tasks5.Task52;

/**
 * Created by pavlo.balyuk on 9/19/2017.
 */
class TaskOOP {
    public static void main(String args[]) {

        PhdStudent phdStudent = new PhdStudent();
        phdStudent.setName("Vasya");
        phdStudent.setSurname("Pupkin");
        phdStudent.enrollCourse();
        phdStudent.startStudy();
        phdStudent.finishStudy();
        phdStudent.getScore();
        phdStudent.defendThesis();
        phdStudent.graduate();

        MasterStudent masterStudent = new MasterStudent();
        masterStudent.setName("Vasya");
        masterStudent.setSurname("Pupkin");
        masterStudent.enrollCourse();
        masterStudent.startStudy();
        masterStudent.finishStudy();
        masterStudent.getScore();
        masterStudent.graduate();
    }
}