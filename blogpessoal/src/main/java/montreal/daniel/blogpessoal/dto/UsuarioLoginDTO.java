package montreal.daniel.blogpessoal.dto;

public class UsuarioLoginDTO {
    private String usuario;
    private String senha;
    private String token;

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
}
