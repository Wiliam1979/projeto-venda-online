/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vendasonline1.util;

import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author william
 */
public class JSFUtil {
    
    public static void adicionarMensagemSucesso(String mensagem){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, mensagem, mensagem);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);
	}
	
	public static void adicionarMensagemErro(String mensagem){
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, mensagem, mensagem);
		FacesContext contexto = FacesContext.getCurrentInstance();
		contexto.addMessage(null, msg);
	}
	
	public static String getParam(String nome){
		FacesContext contexto = FacesContext.getCurrentInstance();
		ExternalContext externalContext = contexto.getExternalContext();
		Map<String, String>parametros = externalContext.getRequestParameterMap();
		String valor = parametros.get(nome);
		return valor;
	}
	
}

    

