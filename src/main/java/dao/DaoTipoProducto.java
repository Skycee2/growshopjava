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
import models.TipoProducto;

/**
 *
 * @author sebas
 */
public class DaoTipoProducto {

    final String INSERTAR = "INSERT INTO TIPO_PRODUCTO (desc_tipo_producto) VALUES (?)";

    final String EDITAR = "UPDATE TIPO_PRODUCTO SET desc_tipo_producto= ? WHERE id_tipo_producto= ?";

    final String ELIMINAR = "DELETE FROM TIPO_PRODUCTO WHERE id_tipo_producto= ?";

    final String SELECCIONAR = "SELECT * FROM TIPO_PRODUCTO ORDER BY id_tipo_producto";

    final String SELECCIONARUNO = "SELECT * FROM TIPO_PRODUCTO WHERE id_tipo_producto= ?";

    public int agregar(TipoProducto tp) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection con = conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(INSERTAR);
            ps.setString(1, tp.getDesc_tipo_producto());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(TipoProducto tp) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, tp.getDesc_tipo_producto());
            ps.setInt(2, tp.getId_tipo_producto());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(TipoProducto tp) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, tp.getId_tipo_producto());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<TipoProducto> seleccionar() {
        Conexion conexion = null;

        List<TipoProducto> tipoproductos = new ArrayList<TipoProducto>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TipoProducto tp = new TipoProducto();

                tp.setId_tipo_producto(rs.getInt("id_tipo_producto"));
                tp.setDesc_tipo_producto(rs.getString("desc_tipo_producto"));

                tipoproductos.add(tp);

                tp = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tipoproductos;
    }

    public TipoProducto seleccionaruno(int id) {
        Conexion conexion = null;

        TipoProducto tp = new TipoProducto();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                tp.setId_tipo_producto(rs.getInt("id_tipo_producto"));
                tp.setDesc_tipo_producto(rs.getString("desc_tipo_producto"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoTipoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tp;
    }

}
