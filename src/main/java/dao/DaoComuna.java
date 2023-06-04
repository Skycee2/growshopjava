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
import models.Comuna;

/**
 *
 * @author sebas
 */
public class DaoComuna {
    final String INSERTAR = "INSERT INTO COMUNA (desc_comuna) VALUES (?)";

    final String EDITAR = "UPDATE COMUNA SET desc_comuna= ? WHERE id_comuna= ?";

    final String ELIMINAR = "DELETE FROM COMUNA WHERE id_comuna= ?";

    final String SELECCIONAR = "SELECT * FROM COMUNA ORDER BY id_comuna";

    final String SELECCIONARUNO = "SELECT * FROM COMUNA WHERE id_comuna= ?";

    public int agregar(Comuna c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection con = conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(INSERTAR);
            ps.setString(1, c.getDesc_comuna());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(Comuna c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, c.getDesc_comuna());
            ps.setInt(2, c.getId_comuna());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(Comuna c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, c.getId_comuna());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<Comuna> seleccionar() {
        Conexion conexion = null;

        List<Comuna> comunas = new ArrayList<Comuna>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Comuna co = new Comuna();

                co.setId_comuna(rs.getInt("id_comuna"));
                co.setDesc_comuna(rs.getString("desc_comuna"));

                comunas.add(co);

                co = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return comunas;
    }

    public Comuna seleccionaruno(int id) {
        Conexion conexion = null;

        Comuna co = new Comuna();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                co.setId_comuna(rs.getInt("id_comuna"));
                co.setDesc_comuna(rs.getString("desc_comuna"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoComuna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return co;
    }

}
