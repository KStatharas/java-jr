package eclipse.service;

import eclipse.DAO.ITeacherDAO;
import eclipse.dto.TeacherDTO;
import eclipse.service.exceptons.TeacherNotFoundExcption;

import java.sql.SQLException;
import java.util.List;

    public class TeacherServiceImpl implements ITeacherService{

            private  final ITeacherDAO teacherDAO;

            public  TeacherServiceImpl(ITeacherDAO teacherDAO){
                this.teacherDAO = teacherDAO;
            }
            @Override
            public void insertTeacher(TeacherDTO teacherDTO) throws SQLException {
                Teacher teacher = extract(TeacherDTO);
                try {
                    teacherDAO.insert(teacher);
                } catch (SQLException e) {
                    throw e;
                }
            }

            @Override
            public void deleteTeacher(TeacherDTO teacherDTO) throws SQLException {
                Teacher teacherToDelete = extract(teacherDTO);

                try {
                    if (teacherDAO.delete(teacherToDelete) == null) throw new TeacherNotFoundExcption(teacherToDelete);
                } catch (SQLException e) {
                    throw e;
                }catch (TeacherNotFoundExcption e){
                    e.printStackTrace();
                    throw e;
                }
            }

            @Override
            public void updateTeacher(TeacherDTO oldteacherDTO, TeacherDTO newteacherDTO) throws SQLException {
                Teacher oldTeacher = extract(oldteacherDTO);
                Teacher newTeacher = extract(newteacherDTO);

                try {
                    teacherDAO.update(oldTeacher,newTeacher);
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            }

            @Override
            public List<Teacher> getTeachersByLastname(String lastname) throws SQLException {
                try {
                    Teacher teacher = teacherDAO.getTeacherById(id);

                    if (teacher == null){
                        throw new TeacherNotFoundExcption(teacher);
                    }
                    else {
                        return teacher;
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }catch (TeacherNotFoundExcption e){
                    e.printStackTrace();
                    throw e;
                }
            }

            @Override
            public Teacher getTeacherById(int id) throws SQLException, TeacherNotFoundExcption {
                try {
                    return teacherDAO.getTeachersByLastname(id);

                } catch (SQLException e) {
                    e.printStackTrace();
                    throw e;
                }
            }

            private Teacher extract(TeacherDTO teacherDTO){
                Teacher teacher = new Teacher();
                teacher.setId(teacherDTO.getId());
                teacher.setFirstname(teacherDTO.getFirstname());
                teacher.setLastname(teacherDTO.getLastname());

                return teacher;
            }
}
