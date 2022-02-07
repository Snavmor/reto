package com.nttdata.bootcamp.confiClient.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/Operacion")
public class CalculadoraAritmeticaRestController {

	@RequestMapping(value = "/sumar", method = RequestMethod.GET, params = { "operando1", "operando2" })

	public Integer Sumar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {

		return operando1 + operando2;
	}

	@RequestMapping(value = "/multiplicar", method = RequestMethod.GET, params = { "operando1", "operando2" })

	public Integer Multiplicar(@RequestParam("operando1") Integer operando1,
			@RequestParam("operando2") Integer operando2) {

		return operando1 * operando2;
	}

	@RequestMapping(value = "/dividir", method = RequestMethod.GET, params = { "operando1", "operando2" })

	public Integer Dividir(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {

		return operando1 / operando2;
	}
	
	@RequestMapping(value = "/restar", method = RequestMethod.GET, params = { "operando1", "operando2" })
	
	public Integer Restar(@RequestParam("operando1") Integer operando1, @RequestParam("operando2") Integer operando2) {

		return operando1 - operando2;
	}
	

}
