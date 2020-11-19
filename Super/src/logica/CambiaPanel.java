
package logica;

import javax.swing.JPanel;
import principal.Form_Venta;

public class CambiaPanel {
    //
    private JPanel container;
    private JPanel content;


    public CambiaPanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

    public CambiaPanel(Form_Venta form_Venta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
