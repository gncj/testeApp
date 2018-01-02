package pt.gncj.testeApp.service;

import java.text.MessageFormat;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

public class TesteImpl implements Teste {

	public Response createPosInfo(String input) {
		ResponseBuilder responseBuilder = null;
		try {
			String mensagem = MessageFormat.format("Input value = {0}", input);
			System.out.println(mensagem);
			responseBuilder = Response.ok(mensagem);
		} catch (Exception e) {
			responseBuilder = Response.serverError();
		}
		return responseBuilder.build();
	}

}
