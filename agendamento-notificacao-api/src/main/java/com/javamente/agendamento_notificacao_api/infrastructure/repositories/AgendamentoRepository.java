package com.javamente.agendamento_notificacao_api.infrastructure.repositories;

import com.javamente.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{
}
