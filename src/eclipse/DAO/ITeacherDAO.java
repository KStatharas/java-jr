package eclipse.DAO;

import java.sql.SQLException;

public interface ITeacherDAO {
    void insert(Teacher teacher) throws SQLException;
    Teacher delete(Teacher teacher) throws SQLException;
    void update(Teacher oldTeacher, Teacher newTeacher) throws SQLException;

    List<Teacher> getTeachersByLastname(String lastname) throws SQLException;

    Teacher getTeacherById(int id) throws SQLException;
}
