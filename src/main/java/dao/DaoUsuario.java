package dao;

import dao.IDao;
import models.Usuario;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoUsuario implements IDao<Usuario> {

    final String INSERTAR = "INSERT INTO USUARIO (correo,nom_usuario,app_usuario,direccion,id_ciudad,id_comuna,password,id_tipo_usuario,num_telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    final String EDITAR = "UPDATE USUARIO SET correo= ?, nom_usuario= ?, app_usuario= ?, direccion= ?, id_ciudad= ?, id_comuna= ?,password= ?,id_tipo_usuario= ? ,num_telefono= ? WHERE id_usuario= ?";

    final String ELIMINAR = "DELETE FROM USUARIO WHERE id_usuario= ?";

    final String SELECCIONAR = "SELECT * FROM USUARIO ORDER BY id_usuario";

    final String SELECCIONARUNO = "SELECT * FROM USUARIO WHERE id_usuario= ?";

    public int agregar(Usuario u) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(INSERTAR);
            ps.setString(1, u.getCorreo());
            ps.setString(2, u.getNom_usuario());
            ps.setString(3, u.getApp_usuario());
            ps.setString(4, u.getDireccion());
            ps.setInt(5, u.getCiudad());
            ps.setInt(6, u.getComuna());
            ps.setString(7, u.getPassword());
            ps.setInt(8, u.getTipo_usuario());
            ps.setInt(9, u.getNum_telefono());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(Usuario u) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, u.getCorreo());
            ps.setString(2, u.getNom_usuario());
            ps.setString(3, u.getApp_usuario());
            ps.setString(4, u.getDireccion());
            ps.setInt(5, u.getCiudad());
            ps.setInt(6, u.getComuna());
            ps.setString(7, u.getPassword());
            ps.setInt(8, u.getTipo_usuario());
            ps.setInt(9, u.getNum_telefono());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(Usuario u) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, u.getId_usuario());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<Usuario> seleccionar() {
        Conexion conexion = null;

        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usu = new Usuario();

                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setCorreo(rs.getString("correo"));
                usu.setNom_usuario(rs.getString("nom_usuario"));
                usu.setApp_usuario(rs.getString("app_usuario"));
                usu.setDireccion(rs.getString("direccion"));
                usu.setCiudad(rs.getInt("id_ciudad"));
                usu.setComuna(rs.getInt("id_comuna"));
                usu.setPassword(rs.getString("password"));
                usu.setTipo_usuario(rs.getInt("id_tipo_usuario"));
                usu.setNum_telefono(rs.getInt("num_telefono"));

                usuarios.add(usu);

                usu = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuarios;
    }

    public Usuario seleccionaruno(int id) {
        Conexion conexion = null;

        Usuario usu = new Usuario();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usu.setId_usuario(rs.getInt("id_usuario"));
                usu.setCorreo(rs.getString("correo"));
                usu.setNom_usuario(rs.getString("nom_usuario"));
                usu.setApp_usuario(rs.getString("app_usuario"));
                usu.setDireccion(rs.getString("direccion"));
                usu.setCiudad(rs.getInt("id_ciudad"));
                usu.setComuna(rs.getInt("id_comuna"));
                usu.setPassword(rs.getString("password"));
                usu.setTipo_usuario(rs.getInt("id_tipo_usuario"));
                usu.setNum_telefono(rs.getInt("num_telefono"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usu;
    }

}
