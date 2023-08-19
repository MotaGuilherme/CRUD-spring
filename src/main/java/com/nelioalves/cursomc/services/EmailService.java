package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

import javax.mail.internet.MimeMessage;

public interface EmailService {

    void sendOderConfirmationEmail(Pedido obj);

    void senEmail(SimpleMailMessage msg);

    void sendEmailConfirmationHtmlEmail(Pedido obj);

    void sendHtmlEmail(MimeMessage msg);

    void sendOderConfirmationHtmlEmail(Pedido obj);

    void  sendNewPasswordEmail(Cliente cliente, String newPass);
}