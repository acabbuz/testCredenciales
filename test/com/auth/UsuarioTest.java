package com.auth;

import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;
import com.auth.Usuario;

class UsuarioTest {
	@Test
	void esModificadaPassword() {
		assert (new Usuario("Adrian", "Cabeza", "password1").modificarPassword("Contraseña1", "Contraseña2",
				"Contraseña2"));
		
	}
	
	@Test
	void testLogin() {
		Usuario usuario = new Usuario("pepe", "Garcia", "Usuario1");
		assert(usuario.hacerLogin("pepGar100", "Usuario1"));
		assertFalse(usuario.hacerLogin("Juan", "Usario1"));
		assertFalse(usuario.hacerLogin("HuaGar100", "Usario2"));
		//Para bloquear la cuenta
		usuario.hacerLogin("CesGar100", "Usario2");
		usuario.hacerLogin("CesGar100", "Usario2");
		assert(usuario.esCuentaBloqueada());
		assertFalse(usuario.hacerLogin("CesGar100", "Usuario1"));
	}
}
