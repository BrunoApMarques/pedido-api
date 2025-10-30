package com.bruno.pedido.api.service;

import com.bruno.pedido.api.model.Pedido;
import com.bruno.pedido.api.repository.PedidoRepository;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PedidoServiceTest {

    @Test
    void deveCriarPedidoComSucesso() {
        // 1. montar o cenário (arrange)
        PedidoRepository repo = mock(PedidoRepository.class);
        PedidoService service = new PedidoService(repo);

        Pedido novo = new Pedido();
        novo.setDescricao("Compra de teclado");
        novo.setValor(new BigDecimal("150.00"));
        // não setamos o status aqui porque o @PrePersist cuida disso no entityManager

        // simulando que o repo salva e devolve com id
        Pedido salvo = new Pedido();
        salvo.setId(1L);
        salvo.setDescricao("Compra de teclado");
        salvo.setValor(new BigDecimal("150.00"));
        salvo.setStatus("PENDENTE");

        when(repo.save(novo)).thenReturn(salvo);

        // 2. executar a ação (act)
        Pedido resultado = service.criar(novo);

        // 3. validar (assert)
        assertNotNull(resultado);
        assertEquals(1L, resultado.getId());
        assertEquals("Compra de teclado", resultado.getDescricao());
        assertEquals("PENDENTE", resultado.getStatus());

        // 4. garantir que chamou o repo
        verify(repo, times(1)).save(novo);
    }
}
