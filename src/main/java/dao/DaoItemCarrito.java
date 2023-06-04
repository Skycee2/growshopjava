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
import models.ItemCarrito;

/**
 *
 * @author sebas
 */
public class DaoItemCarrito {

    final String INSERTAR = "INSERT INTO ITEM_CARRITO (id_carrito,id_producto,cantidad) VALUES (?, ?,?)";

    final String EDITAR = "UPDATE ITEM_CARRITO SET id_carrito= ?, id_producto= ?,cantidad= ? WHERE id_item_carrito= ?";

    final String ELIMINAR = "DELETE FROM ITEM_CARRITO WHERE id_item_carrito= ?";

    final String SELECCIONAR = "SELECT * FROM ITEM_CARRITO ORDER BY id_item_carrito";

    final String SELECCIONARUNO = "SELECT * FROM ITEM_CARRITO WHERE id_item_carrito= ?";

    public int agregar(ItemCarrito ic) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection con = conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(INSERTAR);
            ps.setInt(1, ic.getId_carrito());
            ps.setInt(2, ic.getId_producto());
            ps.setInt(3, ic.getCantidad());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(ItemCarrito ic) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setInt(1, ic.getId_carrito());
            ps.setInt(2, ic.getId_producto());
            ps.setInt(3, ic.getCantidad());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(ItemCarrito ic) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, ic.getId_item_carrito());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<ItemCarrito> seleccionar() {
        Conexion conexion = null;

        List<ItemCarrito> ItemsCarrito = new ArrayList<ItemCarrito>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItemCarrito icar = new ItemCarrito();

                icar.setId_item_carrito(rs.getInt("id_item_carrito"));
                icar.setId_carrito(rs.getInt("id_carrito"));
                icar.setId_producto(rs.getInt("id_producto"));
                icar.setCantidad(rs.getInt("cantidad"));

                ItemsCarrito.add(icar);

                icar = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ItemsCarrito;
    }

    public ItemCarrito seleccionaruno(int id) {
        Conexion conexion = null;

        ItemCarrito icar = new ItemCarrito();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                icar.setId_item_carrito(rs.getInt("id_item_carrito"));
                icar.setId_carrito(rs.getInt("id_carrito"));
                icar.setId_producto(rs.getInt("id_producto"));
                icar.setCantidad(rs.getInt("cantidad"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoItemCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return icar;
    }

}
