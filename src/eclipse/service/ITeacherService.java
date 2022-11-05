package eclipse.service;

import eclipse.dto.TeacherDTO;
import eclipse.service.exceptons.TeacherNotFoundExcption;

import java.sql.SQLException;
import java.util.List;

public interface ITeacherService {
    /**
    * inserts a {@link Teacher} based on the data carried by the {@link TeacherDTO}
    *
    * @param teacherDTO
    *           DTO object that contains the data.
    * @throws SQLException
    *           if any error happens during SQL insert
    * */
    void insertTeacher(TeacherDTO teacherDTO) throws SQLException;
    /**
     *Deletes a {@link Teacher} based on the data carried by the {@link TeacherDTO}
     *
     * @param teacherDTO
     *           DTO object that contains the data (the teacher's id).
     * @throws SQLException
     *           if any error happens during SQL delete.
    * */
    TeacherDTO deleteTeacher(TeacherDTO teacherDTO) throws  SQLException;

    /**
     *Updates a {@link Teacher} based on the data carried by new TeacherDTO,
     * identified by their id, carried oldTeacherDTO
     *
     * @param oldteacherDTO
     *           DTO object that contains the data of the teacher to be updated.
     * @param newteacherDTO
     *          DTO object that contains the data of the new teacher.
     * @throws SQLException
     *           if any error happens during SQL delete.
     * */
    void updateTeacher(TeacherDTO oldteacherDTO, TeacherDTO newteacherDTO) throws SQLException;

    /**
    * Gets back to the caller a list of the {@link Teacher} objects identified by their lastname.
     *
     * @param lastname
     *          a string object that contains the initial letters of the teacher's last name.
     * @return
     *      a lst that contains the results of the called method or empty list if results not found
     * @throws SQLException
     * if any error happens during the SQL search
    * */
    List<Teacher> getTeachersByLastname(String lastname) throws SQLException;

    /**
     * Get back the teacher identified by their id.
     *
     * @param id
     * Teacher's id
     * @return
     *      The teacher object otherwise null id the teacher is not found
     * @throws SQLException
     * if any error happens during the SQL search
     * @throws eclipse.service.exceptons.TeacherNotFoundExcption
     *  if teacher isi not found
     * **/
    Teacher getTeacherById(int id) throws SQLException, TeacherNotFoundExcption;
}
