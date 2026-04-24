package fr.takima.training.simpleapi.service;

import fr.takima.training.simpleapi.entity.Department;
import fr.takima.training.simpleapi.repository.DepartmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<Department> getDepartments() { return departmentRepository.findAll(); }
    public Department getDepartmentByName(String name) { return departmentRepository.findByName(name); }
}