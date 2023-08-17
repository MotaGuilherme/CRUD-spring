package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOderConfirmationEmail(Pedido obj);

    void senEmail(SimpleMailMessage msg);
}
