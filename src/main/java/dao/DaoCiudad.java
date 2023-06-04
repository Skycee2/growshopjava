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
import models.Ciudad;

/**
 *
 * @author sebas
 */
public class DaoCiudad {

    final String INSERTAR = "INSERT INTO CIUDAD (desc_ciudad) VALUES (?)";

    final String EDITAR = "UPDATE CIUDAD SET desc_ciudad= ? WHERE id_ciudad= ?";

    final String ELIMINAR = "DELETE FROM CIUDAD WHERE id_ciudad= ?";

    final String SELECCIONAR = "SELECT * FROM CIUDAD ORDER BY id_ciudad";

    final String SELECCIONARUNO = "SELECT * FROM CIUDAD WHERE id_ciudad= ?";

    public int agregar(Ciudad c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection con = conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(INSERTAR);
            ps.setString(1, c.getDesc_ciudad());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(Ciudad c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, c.getDesc_ciudad());
            ps.setInt(2, c.getId_ciudad());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(Ciudad c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, c.getId_ciudad());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<Ciudad> seleccionar() {
        Conexion conexion = null;

        List<Ciudad> ciudades = new ArrayList<Ciudad>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Ciudad ciu = new Ciudad();

                ciu.setId_ciudad(rs.getInt("id_ciudad"));
                ciu.setDesc_ciudad(rs.getString("desc_ciudad"));

                ciudades.add(ciu);

                ciu = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ciudades;
    }

    public Ciudad seleccionaruno(int id) {
        Conexion conexion = null;

        Ciudad ciu = new Ciudad();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ciu.setId_ciudad(rs.getInt("id_ciudad"));
                ciu.setDesc_ciudad(rs.getString("desc_ciudad"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCiudad.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ciu;
    }

}
