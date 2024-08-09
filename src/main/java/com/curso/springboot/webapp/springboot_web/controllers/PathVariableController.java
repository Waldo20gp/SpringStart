package com.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.webapp.springboot_web.models.User;
import com.curso.springboot.webapp.springboot_web.models.DTO.ParamDto;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.code}")
    private Integer codigo;

    @Value("${config.listOfValues}")
    private List<String> listOfValues;
    
    @Value("#{ '${config.listOfValues}'.split(',') }")
    private List<String> valueList;
    
    @Value("#{ '${config.listOfValues}'}")
    private String valueString;

    @Value("#{ ${config.valuesMap} }")
    private Map<String, Object> valuesMap;
    
    @Value("#{ ${config.valuesMap}.product }")
    private String product;

    

    @GetMapping("/baz/{message}")
    public ParamDto getMethodName(@PathVariable String message) {
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        
        return param;
    }
    
    @GetMapping("/mix/{product}/{id}")
    public Map<String,Object> mixPathVar(@PathVariable String product, @PathVariable Long id){
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){

        return user;
    }

    @GetMapping("/values")
    public Map<String,Object> getMethodName() {
        Map<String,Object> values = new HashMap<>();

        values.put("code", codigo);
        values.put("listOfValues", listOfValues);
        values.put("valueList", valueList);
        values.put("valueString", valueString);
        values.put("valueMap", valuesMap);
        values.put("product", product);
        
        return values;
    }
    

}
