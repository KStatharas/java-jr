package eclipse.service.exceptons;

public class TeacherNotFoundExcption  extends  Exception{

    private  static  final  long serialVersonUID = 1L;

    public TeacherNotFoundExcption(Teacher teacher){
        super("Teacher wth id =" + teacher.getd() + " was not found.");
    }
}
