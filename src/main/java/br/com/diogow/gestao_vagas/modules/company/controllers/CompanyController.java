package br.com.diogow.gestao_vagas.modules.company.controllers;

import br.com.diogow.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.diogow.gestao_vagas.modules.company.useCases.CreateCompanyUseCase;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CreateCompanyUseCase createCompanyUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CompanyEntity companyEntity){
       try {
           var result = this.createCompanyUseCase.execute(companyEntity);
           return ResponseEntity.ok().body(result);
       } catch (Exception ex){
           return ResponseEntity.badRequest().body(ex.getMessage());
       }
    }
}
