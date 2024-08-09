package com.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.webapp.springboot_web.models.DTO.ParamDto;
import com.curso.springboot.webapp.springboot_web.models.DTO.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "No se envio un mensaje") String message) {
        ParamDto param = new ParamDto();
        param.setMessage( message );
        return param;
    }
    
    @GetMapping("/bar")
    public ParamMixDto bar(
    @RequestParam String text, 
    @RequestParam Integer code
    ) {
        ParamMixDto params = new ParamMixDto();
        params.setMessage( text );
        params.setCode( code );
        return params;
    }
    

    @GetMapping("/request")
    public ParamMixDto getMethodName(HttpServletRequest request) {
        Integer code = 0;
        try{
            Integer.parseInt(request.getParameter("code"));
        }catch (NumberFormatException e){

        }
        ParamMixDto params = new ParamMixDto();
        params.setMessage( request.getParameter("text") );
        params.setCode(code);
        return params;
    }
    



}
