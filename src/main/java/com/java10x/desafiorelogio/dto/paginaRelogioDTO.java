package com.java10x.desafiorelogio.dto;

import java.util.List;

public record paginaRelogioDTO(
        List<RelogioDTO> itens,
        long total
) {

}
