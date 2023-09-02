package com.cydeo.converter;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.service.ProjectService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoConvertor implements Converter<String, ProjectDTO> {

    ProjectService projectService;

    public ProjectDtoConvertor(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public ProjectDTO convert(String source) {
        return projectService.finById(source);
    }
}
