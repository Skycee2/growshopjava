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
import models.Producto;

/**
 *
 * @author sebas
 */
public class DaoProducto {

    final String INSERTAR = "INSERT INTO PRODUCTO (nombre,precio,descripcion,url_img,id_tipo_producto) VALUES (?, ?, ?, ?, ?)";

    final String EDITAR = "UPDATE PRODUCTO SET nombre= ?, precio= ?, descripcion= ?, url_img= ?, id_tipo_producto= ? WHERE id_producto= ?";

    final String ELIMINAR = "DELETE FROM PRODUCTO WHERE id_producto= ?";

    final String SELECCIONAR = "SELECT * FROM PRODUCTO ORDER BY id_producto";

    final String SELECCIONARUNO = "SELECT * FROM PRODUCTO WHERE id_producto= ?";

    public int agregar(Producto p) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(INSERTAR);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getPrecio());
            ps.setString(3, p.getDescripcion());
            ps.setString(4, p.getUrl_img());
            ps.setInt(5, p.getId_tipo_producto());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(Producto p) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getPrecio());
            ps.setString(3, p.getDescripcion());
            ps.setString(4, p.getUrl_img());
            ps.setInt(5, p.getId_tipo_producto());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(Producto p) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, p.getId_producto());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<Producto> seleccionar() {
        Conexion conexion = null;

        List<Producto> productos = new ArrayList<Producto>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto pro = new Producto();

                pro.setId_producto(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(rs.getInt("precio"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setUrl_img(rs.getString("url_img"));
                pro.setId_tipo_producto(rs.getInt("id_tipo_producto"));

                productos.add(pro);

                pro = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return productos;
    }

    public Producto seleccionaruno(int id) {
        Conexion conexion = null;

        Producto pro = new Producto();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                pro.setId_producto(rs.getInt("id_producto"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio(rs.getInt("precio"));
                pro.setDescripcion(rs.getString("descripcion"));
                pro.setUrl_img(rs.getString("url_img"));
                pro.setId_tipo_producto(rs.getInt("id_tipo_producto"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return pro;
    }

}
