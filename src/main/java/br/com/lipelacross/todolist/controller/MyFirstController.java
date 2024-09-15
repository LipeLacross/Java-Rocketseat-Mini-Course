package br.com.lipelacross.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Utilizado para APIs
@RequestMapping("/firstRote") // -> Rota do controller
public class MyFirstController {

    /*
     * GET - Buscar uma informação
     * POST - Adicionar uma informação
     * PUT - Alterar uma informação
     * DELETE - Deletar uma informação
     * PATCH - Alterar só uma parte da informação
     */

    @GetMapping()
    public String firstMessage() {
        return "Works!";
    }
}
