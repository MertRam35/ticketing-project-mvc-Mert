package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.enums.Status;
import com.cydeo.service.CrudService;
import com.cydeo.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO, String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO project) {

       if (project.getProjectStatus()==null)project.setProjectStatus(Status.OPEN);

        return super.save(project.getProjectCode(), project);
    }

    @Override
    public ProjectDTO finById(String projectCode) {
        return super.finById(projectCode);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String projectCode) {
        super.deleteById(projectCode);
    }

    @Override
    public void update(ProjectDTO project) {

        if (project.getProjectStatus()==null){
            project.setProjectStatus(finById(project.getProjectCode()).getProjectStatus());
        }
        super.update(project.getProjectCode(), project);
    }

    @Override
    public void complete(ProjectDTO project) {

        project.setProjectStatus(Status.COMPLETE);
    }
}
