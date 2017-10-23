package Tasks7.Tasks74Enum;

/**
 * Created by pavlo.balyuk on 10/20/2017.
 */
public abstract class StudentEnum {

        public static Student getStudent() {
                return student;
        }

        public static void setStudent(Student student) {
                StudentEnum.student = student;
        }

        // You can also create get/set methods for encapsulation if you want
        public static Student student;
}
