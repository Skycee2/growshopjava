/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.TipoUsuario;

public class DaoTipoUsuario {

    final String INSERTAR = "INSERT INTO TIPO_USUARIO (desc_tipo_usuario) VALUES (?)";

    final String EDITAR = "UPDATE TIPO_USUARIO SET desc_tipo_usuario= ? WHERE id_tipo_usuario= ?";

    final String ELIMINAR = "DELETE FROM TIPO_USUARIO WHERE id_tipo_usuario= ?";

    final String SELECCIONAR = "SELECT * FROM TIPO_USUARIO ORDER BY id_tipo_usuario";

    final String SELECCIONARUNO = "SELECT * FROM TIPO_USUARIO WHERE id_tipo_usuario= ?";

    public int agregar(TipoUsuario tu) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection con = conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(INSERTAR);
            ps.setString(1, tu.getDesc_tipo_usuario());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(TipoUsuario tu) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, tu.getDesc_tipo_usuario());
            ps.setInt(2, tu.getId_tipo_usuario());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(TipoUsuario tu) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, tu.getId_tipo_usuario());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<TipoUsuario> seleccionar() {
        Conexion conexion = null;

        List<TipoUsuario> tipousuarios = new ArrayList<TipoUsuario>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TipoUsuario tu = new TipoUsuario();

                tu.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
                tu.setDesc_tipo_usuario(rs.getString("desc_tipo_usuario"));

                tipousuarios.add(tu);

                tu = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tipousuarios;
    }

    public TipoUsuario seleccionaruno(int id) {
        Conexion conexion = null;

        TipoUsuario tu = new TipoUsuario();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                tu.setId_tipo_usuario(rs.getInt("id_tipo_usuario"));
                tu.setDesc_tipo_usuario(rs.getString("desc_tipo_usuario"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tu;
    }
}
