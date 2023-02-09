package org.generation.db_bogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.generation.db_blogpessoal.model.Usuario;
import org.generation.db_blogpessoal.repository.UsuarioRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(Lifecycle.PER_CLASS)

public class UsuarioRepositoryTest {	
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		usuarioRepository.deleteAll();
		usuarioRepository.save(new Usuario(0L,"João Da Silva","joão@email.com.br","12345678","https://i.imgur.com/FETvs20.jpg"));
		usuarioRepository.save(new Usuario(0L,"Manuela Silva","manuela@email.com.br","12345678","https://i.imgur.com/NtyGneo.jpg"));
		usuarioRepository.save(new Usuario(0L,"Adriana Silva","adriana@email.com.br","12345678","https://i.imgur.com/mB3VM2N.jpg"));
		usuarioRepository.save(new Usuario(0L,"Paulo Antunes","paulo@email.com","123456788","https://i.imugur.com/JR7kUFU.jpg"));
	}
	
	
	@Test
	@DisplayName("Retorna 1 usuario")
	public void deveRetornarUmUsuario() {
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("joão@email.com.br");
		assertTrue(usuario.get().getUsuario().equals("joão@email.com.br"));
	}
	@Test
	@DisplayName("Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {
		
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Silva");
		assertEquals(3, listaDeUsuarios.size());
		assertTrue(listaDeUsuarios.get(0).getNome().equals("João Da Silva"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Manuela Silva"));
		assertTrue(listaDeUsuarios.get(3).getNome().equals("Adriana Silva"));
		
	}
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();}
	}
	
			
		


