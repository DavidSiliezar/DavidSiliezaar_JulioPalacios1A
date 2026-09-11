public class Usuario {

    private String username;
    private String password;
    private String nombreCompleto;
    private String email;

    public Usuario(String username, String email, String nombreCompleto, String password) {
        this.username = username;
        this.email = email;
        this.nombreCompleto = nombreCompleto;
        this.password = password;
    }



    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
