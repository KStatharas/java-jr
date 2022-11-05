package eclipse.DAO;

import eclipse.dto.TeacherDTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import static gr.aueb.sev.dao.dbutl.DButil.*;
import static gr.aueb.sev.dao.dbutl.DButil.closeConnection;
public class TeacherDAOImpl implements ITeacherDAO {

    @Override
    public void insert(Teacher teacher) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();

        try {
            String sql = "INSERT INTO TEACHERS (FIRSTNAME,LASTNAME) VALUES (?, ?)";

            pst = conn.prepareStatement(sql);
            pst.setString(1, teacher.getFirstname());
            pst.setString(2, teacher.getLastname());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (pst != null) pst.close();
            if (getConnection != null) closeConnection();
        }
    }

    @Override
    public void delete(Teacher teacher) throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();

        try {
            String sql = "DELETE FROM TEACHERS WHERE ID = ?";

            pst = conn.prepareStatement(sql);
            pst.setID(1, teacher.getId());
            pst.executeUpdate();
            if (n== 0){
                return null;
            }
            else {
                return teacher;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (pst != null) pst.close();
            if (getConnection != null) closeConnection();
        }
    }

    @Override
    public void update(Teacher oldTeacher, Teacher newTeacher) throws SQLException {
        public Teacher delete (Teacher teacher) throws SQLException {
            PreparedStatement pst = null;
            Connection conn = getConnection();

            try {
                String sql = "UPDATE TEACHERS SET FIRSTNAME = ?, LASTNAME = ? WHERE ID = ?";

                pst = conn.prepareStatement(sql);
                pst.setString(1, newTeacher.getFirstname());
                pst.setString(2, newTeacher.getLastname());
                pst.setInt(3, oldTeacher.getId());

                pst.executeUpdate();


            } catch (SQLException e) {
                e.printStackTrace();
                throw e;
            } finally {
                if (pst != null) pst.close();
                if (getConnection != null) closeConnection();
            }
        }
    }

    @Override
    public List<Teacher> getTeachersByLastname throws SQLException {
        PreparedStatement pst = null;
        Connection conn = getConnection();
        List<Teacher> teachers = new ArrayList<>();
        ResultSet rs = null;
        while (rs.next()){
            Teacher.teacher = new Teacher();
            teacher.setId(rs.getInt("ID"));
            teacher.setFirstname(rs.getString("FIRSTNAME"));
            teacher.setLastname(rs.getString("LASTNAME"));

            teachers.add(teacher);

        }
        return (teachers.size() > 0)? teachers : null;
        try {
            String sql = "SELECT ID, FIRSTNAME, LASTNAME FROM TEACHERS WHERE LASTNAME LIKE ?";

            pst = conn.prepareStatement(sql);
            pst.setString(1,lastname);

            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (pst != null) pst.close();
            if (getConnection != null) closeConnection();
        }

    }
    @Override
    public Teacher getTeacherById(int id) throws SQLException{
        PreparedStatement pst = null;
        Connection conn = getConnection();
        ResultSet rs = null;
        try {

            pst = conn.prepareStatement(sql);
            pst.setInt(1,id);

            if (rs.next()){
                teacher = new Teacher();
                teacher.setId(rs.getInt("ID"));
                teacher.setFirstname(rs.getString("FIRSTNAME"));
                teacher.setLastname(rs.getString("LASTNAME"));

                teachers.add(teacher);

            }

            return teacher;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (pst != null) pst.close();
            if (getConnection != null) closeConnection();
        }
    }

}