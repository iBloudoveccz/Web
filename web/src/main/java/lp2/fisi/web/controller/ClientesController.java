package lp2.fisi.web.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lp2.fisi.web.model.Clientes;
import lp2.fisi.web.model.dao.IClientesDAO;

@Controller
@RequestMapping("/web")

public class ClientesController {
    @Autowired

    private IClientesDAO clienteDAO;

    // Mostrar todos los clientes
    @GetMapping("/clientes")
    public String Todos(Model model){
        List<Clientes> lista = clienteDAO.findAll();
        model.addAttribute("lista", lista);
        return "clientes/index";
    }



    //Llennar
    // Mostrar formulario de registro de cliente
    @GetMapping("/clientes/form")
    public String formulario(){
        return "clientes/form";
    }

    // Guardar un nuevo cliente
    @PostMapping("/clientes/create")
    public String guardar(Clientes cliente){
        clienteDAO.save(cliente);
        return "redirect:/web/clientes";
    }



    //Editar
    // Obtener cliente por ID para editar
    @GetMapping("/clientes/editar/{id}")
    public String obtenerId(@PathVariable Integer id, Model model) {
        Optional<Clientes> clienteid = clienteDAO.findById(id);
        Clientes cliente = clienteid.get();
        model.addAttribute("cliente", cliente);
        return "clientes/update";
    }
    
    // Actualizar un cliente existente
    @PostMapping("/clientes/update")
    public String actualizar(Clientes cliente) {
        clienteDAO.save(cliente);
        return "redirect:/web/clientes";
    }


    // Eliminar cliente por ID
    @GetMapping("/clientes/eliminar/{id}")
    public String eliminar(@PathVariable Integer id){
        clienteDAO.deleteById(id);
        return "redirect:/web/clientes";
    }

}
