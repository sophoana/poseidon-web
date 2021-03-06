package edu.mum.se.poseidon.web.models;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Course {

	private Long id;
	@NotEmpty
	private String name;
    @NotNull
	private Integer number;
    
    private List<Course> prerequisites = new ArrayList<>();
    private List<FacultyModel> faculties = new ArrayList<>();
    private List<SectionModel> sections = new ArrayList<>();
    
    public Long getId() {
    	return id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    public void addPrerequisite(Course prerequisite) {
    	prerequisites.add(prerequisite);
    }

    public List<SectionModel> getSections() {
        return sections;
    }

    public void setSectionList(List<SectionModel> sections) {
        this.sections = sections;
    }
    
    public List<FacultyModel> getFaculties(){
    	return faculties;
    }
    
    public void setFaculties(List<FacultyModel> faculties) {
    	this.faculties = faculties;
    }
    
    public void addFaculty(FacultyModel faculty) {
    	faculties.add(faculty);
    }
}
