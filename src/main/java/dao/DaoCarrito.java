/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Carrito;
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

/**
 *
 * @author sebas
 */
public class DaoCarrito implements IDao<Carrito> {

    final String INSERTAR = "INSERT INTO CARRITO (id_usuario,total) VALUES (?, ?)";

    final String EDITAR = "UPDATE CARRITO SET id_usuario= ?, total= ? WHERE id_carrito= ?";

    final String ELIMINAR = "DELETE FROM CARRITO WHERE id_carrito= ?";

    final String SELECCIONAR = "SELECT * FROM CARRITO ORDER BY id_carrito";

    final String SELECCIONARUNO = "SELECT * FROM CARRITO WHERE id_carrito= ?";

    public int agregar(Carrito c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection con = conexion.getConexion();

            PreparedStatement ps = con.prepareStatement(INSERTAR);
            ps.setInt(1, c.getId_usuario());
            ps.setInt(2, c.getTotal());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int editar(Carrito c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(EDITAR);
            ps.setInt(1, c.getId_usuario());
            ps.setInt(2, c.getTotal());
            ps.setInt(3, c.getId_usuario());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int eliminar(Carrito c) {
        Conexion conexion = null;
        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(ELIMINAR);
            ps.setInt(1, c.getId_carrito());

            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<Carrito> seleccionar() {
        Conexion conexion = null;

        List<Carrito> lisCarrito = new ArrayList<Carrito>();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONAR);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Carrito car = new Carrito();

                car.setId_carrito(rs.getInt("id_carrito"));
                car.setId_usuario(rs.getInt("id_usuario"));
                car.setTotal(rs.getInt("total"));

                lisCarrito.add(car);

                car = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lisCarrito;
    }

    public Carrito seleccionaruno(int id) {
        Conexion conexion = null;

        Carrito car = new Carrito();

        try {
            conexion = new Conexion();
            Connection conn = conexion.getConexion();

            PreparedStatement ps = conn.prepareStatement(SELECCIONARUNO);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                car.setId_carrito(rs.getInt("id_carrito"));
                car.setId_usuario(rs.getInt("id_usuario"));
                car.setTotal(rs.getInt("total"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conexion.Cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(DaoCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return car;
    }

}
