package com.cydeo.service;

import com.cydeo.dto.TaskDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.enums.Status;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService extends CrudService<TaskDTO, Long> {


    List<TaskDTO> finTasksByManager(UserDTO manager);
    List<TaskDTO> findAllTasksByStatusIsNot(Status status);
    List<TaskDTO> findAllTasksByStatus(Status status);
    void updateStatus(TaskDTO task);
}
