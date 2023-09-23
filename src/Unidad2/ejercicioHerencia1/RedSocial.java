
package Unidad2.ejercicioHerencia1;

/**
 *
 * @author profe Hernan
 * @version 22-09-2023
 */
public class RedSocial {
    
    protected String usuario;
    protected String password;

    public RedSocial() {
    }

    public RedSocial(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "usuario=" + usuario + ", password=" + password + '}';
    }
    
    public void listar()
    {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Password: " + this.getPassword());
    }
    
    public String visualizar()
    {
        return this.getUsuario();
    }
}
