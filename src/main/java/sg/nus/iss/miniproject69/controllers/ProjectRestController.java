package sg.nus.iss.miniproject69.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.nus.iss.miniproject69.services.ProjectService;

@RestController
@RequestMapping(path = "/api/add_item", produces = MediaType.APPLICATION_JSON_VALUE )
public class ProjectRestController {
    @Autowired
    private ProjectService projectService;

    

   
    
}
