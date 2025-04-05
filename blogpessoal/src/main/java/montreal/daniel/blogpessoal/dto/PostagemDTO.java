package montreal.daniel.blogpessoal.dto;

public record PostagemDTO(
    String titulo,
    String texto,
    Long temaId,
    Long usuarioId,
    String temaDescricao
) {}
