package com.spring.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dhavalpatel on 15/04/17.
 */
@RestController
public class VisitorController {
    private static final Logger logger = LoggerFactory.getLogger(VisitorController.class);

    @Autowired
    private VisitorRepository visitorRepository;

    @RequestMapping("/visitors")
    public Map<String, List<Visitor>> getVisitors(){
        Map<String, List<Visitor>> data = new HashMap<String, List<Visitor>>();
        data.put("visitors", visitorRepository.findAll());
        return data;
    }
}
