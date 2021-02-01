package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import core.Utilidades;

@RestController
//@RequestMapping("scalculadora")
public class CalculadoraController {
	@Autowired
	Utilidades util;
	@GetMapping(value="sumar/{n1}/{n2}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String suma(@PathVariable("n1") int a, @PathVariable("n2") int b) {
		return String.valueOf(a+b);
	}
	@GetMapping(value="multiplicar/{n1}/{n2}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String multiplica(@PathVariable("n1") int a, @PathVariable("n2") int b) {
		return String.valueOf(a*b);
	}
	@GetMapping(value="cuadrado/{n1}",produces=MediaType.TEXT_PLAIN_VALUE)
	public String cuadrado(@PathVariable("n1") int x) {
		return String.valueOf(x*x);
	}
}
