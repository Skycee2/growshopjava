package models;

public class Usuario {
    private int id_usuario;
    private String correo;
    private String nom_usuario;
    private String app_usuario;
    private String direccion;
    private int ciudad;
    private int comuna;
    private String password;
    private int tipo_usuario;
    private int num_telefono;

    public Usuario() {
    }

    public Usuario(int id_usuario, String correo, String nom_usuario, String app_usuario, String direccion, int ciudad, int comuna, String password, int tipo_usuario, int num_telefono) {
        this.id_usuario = id_usuario;
        this.correo = correo;
        this.nom_usuario = nom_usuario;
        this.app_usuario = app_usuario;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.password = password;
        this.tipo_usuario = tipo_usuario;
        this.num_telefono = num_telefono;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public String getApp_usuario() {
        return app_usuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCiudad() {
        return ciudad;
    }

    public int getComuna() {
        return comuna;
    }

    public String getPassword() {
        return password;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public int getNum_telefono() {
        return num_telefono;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public void setApp_usuario(String app_usuario) {
        this.app_usuario = app_usuario;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public void setComuna(int comuna) {
        this.comuna = comuna;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public void setNum_telefono(int num_telefono) {
        this.num_telefono = num_telefono;
    }
}
