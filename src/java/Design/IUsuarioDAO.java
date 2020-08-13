/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import Modelo.Resultado;
import Modelo.Usuario;
import java.util.List;

/**
 *
 * @author Angelo
 */
public interface IUsuarioDAO {
    
    Usuario crearUsuario(Usuario usuario);
    
    Usuario obtenerUsuarioxId(int id);
    
    List<Usuario> obtenerUsuarios();
    
    Resultado eliminarUsuario(int id);
}
