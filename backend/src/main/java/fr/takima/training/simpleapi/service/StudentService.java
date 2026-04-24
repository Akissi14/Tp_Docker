package fr.takima.training.simpleapi.service;

import fr.takima.training.simpleapi.entity.Student;
import fr.takima.training.simpleapi.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAll() { return studentRepository.findAll(); }
    public Student getStudentById(long id) { return studentRepository.findById(id).orElse(null); }
    public Student addStudent(Student student) { return studentRepository.save(student); }
    public void removeStudentById(long id) { studentRepository.deleteById(id); }
    public List<Student> getStudentsByDepartmentName(String name) { return studentRepository.findByDepartmentName(name); }
    public long getStudentsNumberByDepartmentName(String name) { return studentRepository.findByDepartmentName(name).size(); }
}