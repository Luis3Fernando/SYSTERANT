package ok.restaurante;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SpinnerNumberModel;
import static ok.restaurante.Base_Datos.platos;

/**
 *
 * @author GRUPO 
 */

//PELIGRO: NO TOCAR, SOLO DISEÑO
public class I_principal extends javax.swing.JFrame {

    int xMouse, yMouse;
    public I_principal() {        
        initComponents(); 
        SpinnerNumberModel nm = new SpinnerNumberModel ( ) ;
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(1);
        Cantidad.setModel(nm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Imagen = new javax.swing.JPanel();
        buscar = new javax.swing.JLabel();
        barrita2 = new javax.swing.JLabel();
        flechitas = new javax.swing.JTextField();
        Boton_Adelante = new javax.swing.JLabel();
        Boton_Atras = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Imagen_Fondo = new javax.swing.JLabel();
        Panel_Informacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Linea1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Panel_Seleccionar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Cantidad = new javax.swing.JSpinner();
        Panel_Opciones = new javax.swing.JPanel();
        Boton_platos = new javax.swing.JToggleButton();
        Boton_informacion = new javax.swing.JToggleButton();
        Boton_bebidas = new javax.swing.JToggleButton();
        Boton_postres = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante");
        setMinimumSize(new java.awt.Dimension(1000, 580));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Imagen.setBackground(new java.awt.Color(255, 204, 153));
        Panel_Imagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        Panel_Imagen.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 40, 40));

        barrita2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barrita2MouseDragged(evt);
            }
        });
        barrita2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barrita2MousePressed(evt);
            }
        });
        Panel_Imagen.add(barrita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        flechitas.setBackground(new java.awt.Color(255, 250, 243));
        flechitas.setFont(new java.awt.Font("Sriracha", 0, 14)); // NOI18N
        flechitas.setForeground(new java.awt.Color(186, 166, 165));
        flechitas.setBorder(null);
        flechitas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                flechitasCaretUpdate(evt);
            }
        });
        flechitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flechitasActionPerformed(evt);
            }
        });
        Panel_Imagen.add(flechitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 190, 40));

        Boton_Adelante.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Flecha_Derecha.png")); // NOI18N
        Boton_Adelante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Adelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_AdelanteMouseClicked(evt);
            }
        });
        Panel_Imagen.add(Boton_Adelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 75, 75));

        Boton_Atras.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Flecha_Izquierda.png")); // NOI18N
        Boton_Atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_AtrasMouseClicked(evt);
            }
        });
        Panel_Imagen.add(Boton_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 75, 75));

        jLabel14.setFont(new java.awt.Font("Sriracha", 0, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Barra_Busqueda.png")); // NOI18N
        Panel_Imagen.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 260, 40));

        Imagen_Fondo.setFont(new java.awt.Font("Sriracha", 0, 14)); // NOI18N
        Imagen_Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\Platos\\ceviche.jpg")); // NOI18N
        Panel_Imagen.add(Imagen_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));
        EventoTecla();

        getContentPane().add(Panel_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 580));

        Panel_Informacion.setBackground(new java.awt.Color(255, 250, 243));
        Panel_Informacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sriracha", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(183, 84, 53));
        jLabel2.setText("Precio:");
        Panel_Informacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 150, 50));

        jLabel3.setFont(new java.awt.Font("Sriracha", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(183, 84, 53));
        jLabel3.setText("Descripción:");
        Panel_Informacion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 50));

        Precio.setBackground(new java.awt.Color(255, 204, 204));
        Precio.setFont(new java.awt.Font("Sriracha", 0, 30)); // NOI18N
        Precio.setForeground(new java.awt.Color(186, 166, 165));
        Precio.setText("S/. 28");
        Panel_Informacion.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 130, 30));

        Nombre.setFont(new java.awt.Font("Sriracha", 0, 30)); // NOI18N
        Nombre.setForeground(new java.awt.Color(183, 84, 53));
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre.setText("CEVICHE");
        Panel_Informacion.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 340, 50));

        Linea1.setBackground(new java.awt.Color(255, 204, 204));
        Linea1.setFont(new java.awt.Font("Sriracha", 0, 18)); // NOI18N
        Linea1.setForeground(new java.awt.Color(186, 166, 165));
        Linea1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Linea1.setText("Plato típico del Perú");
        Linea1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Panel_Informacion.add(Linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 260, 180));

        jLabel15.setFont(new java.awt.Font("Sriracha", 0, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(183, 84, 53));
        jLabel15.setText("Cantidad:");
        Panel_Informacion.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 50));

        Panel_Seleccionar.setBackground(new java.awt.Color(183, 84, 53));
        Panel_Seleccionar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Concert One", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Panel_Seleccionar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 290, 80));

        Panel_Informacion.add(Panel_Seleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 300, 80));

        minimizar.setFont(new java.awt.Font("Courier New", 1, 60)); // NOI18N
        minimizar.setForeground(new java.awt.Color(183, 84, 53));
        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setText("•");
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        Panel_Informacion.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 40, 30));

        exit.setFont(new java.awt.Font("Courier New", 1, 60)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("•");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        Panel_Informacion.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 40, 30));

        Cantidad.setFont(new java.awt.Font("Sriracha", 0, 30)); // NOI18N
        Cantidad.setBorder(null);
        Panel_Informacion.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, 30));

        getContentPane().add(Panel_Informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 340, 580));

        Panel_Opciones.setBackground(new java.awt.Color(183, 84, 53));
        Panel_Opciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_platos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton4_normal.png")); // NOI18N
        Boton_platos.setSelected(true);
        Boton_platos.setBorder(null);
        Boton_platos.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton4_sombreado.png")); // NOI18N
        Boton_platos.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton4_presionado.png")); // NOI18N
        Boton_platos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_platosActionPerformed(evt);
            }
        });
        Panel_Opciones.add(Boton_platos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 75, 75));

        Boton_informacion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton1_normal.png")); // NOI18N
        Boton_informacion.setBorder(null);
        Boton_informacion.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton1_sombreado.png")); // NOI18N
        Boton_informacion.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton1_presionado.png")); // NOI18N
        Boton_informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_informacionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_informacionMousePressed(evt);
            }
        });
        Boton_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_informacionActionPerformed(evt);
            }
        });
        Panel_Opciones.add(Boton_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 75, 75));

        Boton_bebidas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton2_normal.png")); // NOI18N
        Boton_bebidas.setBorder(null);
        Boton_bebidas.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton2_sombreado.png")); // NOI18N
        Boton_bebidas.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton2_presionado.png")); // NOI18N
        Boton_bebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_bebidasActionPerformed(evt);
            }
        });
        Panel_Opciones.add(Boton_bebidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 75, 75));

        Boton_postres.setIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton3_normal.png")); // NOI18N
        Boton_postres.setBorder(null);
        Boton_postres.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton3_sombreado.png")); // NOI18N
        Boton_postres.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Luis Fernando\\Documents\\Unamba\\Ciclo 4\\Desarrolllo de Software\\SYSTERANT\\RESTAURANTE\\src\\main\\java\\imagenes\\Boton3_presionado.png")); // NOI18N
        Boton_postres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_postresActionPerformed(evt);
            }
        });
        Panel_Opciones.add(Boton_postres, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 75, 75));

        getContentPane().add(Panel_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1300, 110));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //BOTONES DE ABAJO
    private void Boton_platosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_platosActionPerformed
        EventoTecla();
        contador_imagenes=0;
        if(Boton_platos.isSelected()){
              bPlatos=true;
              bPostres=false;
              bBebidas=false;
              Boton_bebidas.setSelected(false);
              Boton_informacion.setSelected(false);
              Boton_postres.setSelected(false);
              
              Imagen_Fondo.setIcon(arreglo.getImagenPlatos(0));
        Nombre.setText(arreglo.getNombrePlatos(0));
        Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(0)));
        Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(0)));
              
          }
        else{
              Boton_postres.setSelected(true);
              
              Imagen_Fondo.setIcon(arreglo.getImagenPostres(0));
              Nombre.setText(arreglo.getNombrePostres(0));
              Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(0)));
              Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(0)));
          }
          
        
    }//GEN-LAST:event_Boton_platosActionPerformed

    private void Boton_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_informacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_informacionActionPerformed

    private void Boton_bebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_bebidasActionPerformed
        EventoTecla();
        contador_imagenes=0;
        if(Boton_bebidas.isSelected()){
              bPlatos=false;
              bPostres=false;
              bBebidas=true;
              Boton_postres.setSelected(false);
              Boton_informacion.setSelected(false);
              Boton_platos.setSelected(false);
              
              Imagen_Fondo.setIcon(arreglo.getImagenBebidas(0));
        Nombre.setText(arreglo.getNombreBebidas(0));
        Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(0)));
        Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(0)));
              
          }
        else{
              Boton_platos.setSelected(true);
              Imagen_Fondo.setIcon(arreglo.getImagenPlatos(0));
              Nombre.setText(arreglo.getNombrePlatos(0));
              Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(0)));
              Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(0)));

          }
        
        
    }//GEN-LAST:event_Boton_bebidasActionPerformed

    private void Boton_postresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_postresActionPerformed
        EventoTecla();
        contador_imagenes=0;
        if(Boton_postres.isSelected()){
              bPlatos=false;
              bPostres=true;
              bBebidas=false;
              Boton_bebidas.setSelected(false);
              Boton_informacion.setSelected(false);
              Boton_platos.setSelected(false);
              
              Imagen_Fondo.setIcon(arreglo.getImagenPostres(0));
        Nombre.setText(arreglo.getNombrePostres(0));
        Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(0)));
        Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(0)));
              
          }
        else{
              Boton_bebidas.setSelected(true);
              Imagen_Fondo.setIcon(arreglo.getImagenBebidas(0));
                Nombre.setText(arreglo.getNombreBebidas(0));
                Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(0)));
                Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(0)));
          }
        
        
    }//GEN-LAST:event_Boton_postresActionPerformed
    
    
    //FLECHAS ATRAS Y ADELANTE
    private void Boton_AdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_AdelanteMouseClicked
        if(bPlatos){
            Ventana_Platos_Ad();
        }
        else{
            if(bPostres){
                Ventana_Postres_Ad();
            }
            else{
                if(bBebidas){
                    Ventana_Bebidas_Ad();
                }
            }
        }
                
    }//GEN-LAST:event_Boton_AdelanteMouseClicked
    
    private void Boton_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_AtrasMouseClicked
        if(bPlatos){
            Ventana_Platos_At();
        }
        else{
            if(bPostres){
                Ventana_Postres_At();
            }
            else{
                if(bBebidas){
                    Ventana_Bebidas_At();
                }
            }
        }
        
    }//GEN-LAST:event_Boton_AtrasMouseClicked

    private void flechitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flechitasActionPerformed
       EventoTecla();
    }//GEN-LAST:event_flechitasActionPerformed
    //PARA MOVER LA PARTE DE ARRIBA
    private void barrita2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrita2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barrita2MousePressed

    private void barrita2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barrita2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barrita2MouseDragged
    
    //MINIMIZAR
    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void Boton_informacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_informacionMousePressed
        Boleta Ventana2 = new Boleta();
        Ventana2.setVisible(true);
        Ventana2.setLocationRelativeTo(null);
	Ventana2.setResizable(false);
        
        
    }//GEN-LAST:event_Boton_informacionMousePressed
    
    //SELECCIONAR PLATOS
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        int cantidad = Integer.parseInt(Cantidad.getValue().toString());
        Cantidad.setValue(0);
        
        if(cantidad ==0 || cont>=30){
            
            if(cantidad==0){
                Advertencia1 m = new Advertencia1(this, true);
                m.setVisible(true);
                m.setLocationRelativeTo(null);
                m.setResizable(false);
            }
            else
            {
               Advertencia n = new Advertencia(this, true);
                n.setVisible(true);
                n.setLocationRelativeTo(null);
                n.setResizable(false); 
            }
            
        }
        
        else{
           if(bPlatos){
            for(int i=0;i<cantidad;i++){
               array.Añadir(arreglo.getObjetoPlatos(contador_imagenes)); 
               cont++;
            }
            
        }
        else{
            if(bPostres){
                for(int i=0; i<cantidad;i++){
                    array.Añadir(arreglo.getObjetoPostre(contador_imagenes));
                    cont++;
                }
                
            }
            else{
                if(bBebidas){
                    for(int i=0; i<cantidad;i++){
                        array.Añadir(arreglo.getObjetoBebida(contador_imagenes));
                        cont++;
                    }
                    
                }
            }
        } 
        }
            
        
              
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void flechitasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_flechitasCaretUpdate
        //String busqueda = flechitas.getText();
    }//GEN-LAST:event_flechitasCaretUpdate

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        Busqueda();
    }//GEN-LAST:event_buscarMouseClicked

    private void Boton_informacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_informacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_informacionMouseClicked
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(I_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_principal().setVisible(true);
            }
        });
    }
    
    //EVENTOS DE TECLADO
    private void EventoTecla(){
        KeyListener tecla = new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case 39:
                        if(bPlatos){
                            Ventana_Platos_Ad();
                        }
                        else{
                            if(bPostres){
                                Ventana_Postres_Ad();
                            }
                        else{
                        if(bBebidas){
                            Ventana_Bebidas_Ad();
                        }
            }
        }
                        break;
                        
                    case 37:
                        if(bPlatos){
                            Ventana_Platos_At();
                        }
                        else{
                            if(bPostres){
                                Ventana_Postres_At();
                            }
                            else{
                                if(bBebidas){
                                     Ventana_Bebidas_At();
                }
            }
        }
                    
                                            
                    default:
                        break;  
                }
                     
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
    };
        
        flechitas.addKeyListener(tecla);

    }
    //PARA BUSCAR
    public void Busqueda(){
        String comida = flechitas.getText();
        flechitas.setText("");
        int ub=-1;
        boolean bandera = false;
        
        for(int i=0; i<54;i++){
           if(comida.equalsIgnoreCase(arreglo.getNombrePlatos(i))){
                bandera=true;
                ub=i;
                Imagen_Fondo.setIcon(arreglo.getImagenPlatos(ub));
                Nombre.setText(arreglo.getNombrePlatos(ub));
                Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(ub)));
                Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(ub)));
                
                bPlatos=true;
                bPostres=false;
                bBebidas=false;
                Boton_bebidas.setSelected(false);
                Boton_platos.setSelected(true);
                Boton_postres.setSelected(false);
                break;
           }   
        }
        
        if(bandera==false){
            for(int i=0; i<21;i++){
                if(comida.equalsIgnoreCase(arreglo.getNombrePostres(i))){
                    bandera=true;
                    ub=i;
                    Imagen_Fondo.setIcon(arreglo.getImagenPostres(ub));
                    Nombre.setText(arreglo.getNombrePostres(ub));
                    Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(ub)));
                    Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(ub)));
                    bPlatos=false;
              bPostres=true;
              bBebidas=false;
              Boton_bebidas.setSelected(false);
              Boton_postres.setSelected(true);
              Boton_platos.setSelected(false);
                    break;
                    }         
            }
        }
        
         if(bandera==false){
            for(int i=0; i<19;i++){
                if(comida.equalsIgnoreCase(arreglo.getNombreBebidas(i))){
                    bandera=true;
                    ub=i;
                    Imagen_Fondo.setIcon(arreglo.getImagenBebidas(ub));
                    Nombre.setText(arreglo.getNombreBebidas(ub));
                    Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(ub)));
                    Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(ub)));
                    bPlatos=false;
                    bPostres=false;
                    bBebidas=true;
                    Boton_postres.setSelected(false);
                    Boton_bebidas.setSelected(true);
                    Boton_platos.setSelected(false);
                    break;
           }              
        }  
         
        }
        if(bandera){
            contador_imagenes=ub;   
        }
        else{
            BusquedaNo ven = new BusquedaNo(this, true);
            ven.setVisible(true);
            ven.setLocationRelativeTo(null);
            ven.setResizable(false);
        }
        
    }
    
    //PARA MOSTRAR VENTANAS
    private void Ventana_Platos_Ad(){
        contador_imagenes++;
        if(contador_imagenes>53){
            contador_imagenes=0;
            Imagen_Fondo.setIcon(arreglo.getImagenPlatos(contador_imagenes));
            Nombre.setText(arreglo.getNombrePlatos(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(contador_imagenes)));

        }
        else{
            Imagen_Fondo.setIcon(arreglo.getImagenPlatos(contador_imagenes));
            Nombre.setText(arreglo.getNombrePlatos(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(contador_imagenes)));
        }
    }

    private void Ventana_Platos_At(){
        contador_imagenes--;
        if(contador_imagenes<0){
            contador_imagenes=53;
            Imagen_Fondo.setIcon(arreglo.getImagenPlatos(contador_imagenes));
            Nombre.setText(arreglo.getNombrePlatos(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(contador_imagenes)));

        }
        else{
            Imagen_Fondo.setIcon(arreglo.getImagenPlatos(contador_imagenes));
            Nombre.setText(arreglo.getNombrePlatos(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPlatos(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPlatos(contador_imagenes)));
        }
    }
    
    private void Ventana_Postres_Ad(){
        contador_imagenes++;
        if(contador_imagenes>20){
            contador_imagenes=0;
            Imagen_Fondo.setIcon(arreglo.getImagenPostres(contador_imagenes));
            Nombre.setText(arreglo.getNombrePostres(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(contador_imagenes)));

        }
        else{
            Imagen_Fondo.setIcon(arreglo.getImagenPostres(contador_imagenes));
            Nombre.setText(arreglo.getNombrePostres(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(contador_imagenes)));
        }
    }
    
    private void Ventana_Postres_At(){
        contador_imagenes--;
        if(contador_imagenes<0){
            contador_imagenes=20;
            Imagen_Fondo.setIcon(arreglo.getImagenPostres(contador_imagenes));
            Nombre.setText(arreglo.getNombrePostres(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(contador_imagenes)));

        }
        else{
            Imagen_Fondo.setIcon(arreglo.getImagenPostres(contador_imagenes));
            Nombre.setText(arreglo.getNombrePostres(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioPostres(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionPostres(contador_imagenes)));
        }
    }
    
    private void Ventana_Bebidas_Ad(){
        contador_imagenes++;
        if(contador_imagenes>18){
            contador_imagenes=0;
            Imagen_Fondo.setIcon(arreglo.getImagenBebidas(contador_imagenes));
            Nombre.setText(arreglo.getNombreBebidas(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(contador_imagenes)));

        }
        else{
            Imagen_Fondo.setIcon(arreglo.getImagenBebidas(contador_imagenes));
            Nombre.setText(arreglo.getNombreBebidas(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(contador_imagenes)));
        }
    }
    
    private void Ventana_Bebidas_At(){
        contador_imagenes--;
        if(contador_imagenes<0){
            contador_imagenes=18;
            Imagen_Fondo.setIcon(arreglo.getImagenBebidas(contador_imagenes));
            Nombre.setText(arreglo.getNombreBebidas(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(contador_imagenes)));

        }
        else{
            Imagen_Fondo.setIcon(arreglo.getImagenBebidas(contador_imagenes));
            Nombre.setText(arreglo.getNombreBebidas(contador_imagenes));
            Precio.setText("S/. "+String.valueOf(arreglo.getPrecioBebidas(contador_imagenes)));
            Linea1.setText(StrToHtml(arreglo.getDescripcionBebidas(contador_imagenes)));
        }
    }
    
    
    //para descripcion
    public String StrToHtml(String Descripcion){
        return "<html><p>"+ Descripcion +"</p></html>";
    }
    
    //PARA QUE INTERACTUE CON OTRA VENTANA
    public static void Bandera_Desactivar(){
        bandera_externa = false;
    }
    public void Desactivar_informacion(){
        
        Boton_informacion.setSelected(false);
    }
    
    //LOGICA MEGA PRO DEL PROGRAMA
    private static Pedidos array = new Pedidos();
    private static int cont =0; //para los pedidos
    //
    private static boolean bandera_externa = true;
    private static int contador_imagenes = 0;
    private Base_Datos arreglo = new Base_Datos();
    private boolean bPlatos =true, bPostres=false, bBebidas=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Boton_Adelante;
    private javax.swing.JLabel Boton_Atras;
    private javax.swing.JToggleButton Boton_bebidas;
    private javax.swing.JToggleButton Boton_informacion;
    private javax.swing.JToggleButton Boton_platos;
    private javax.swing.JToggleButton Boton_postres;
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JLabel Imagen_Fondo;
    private javax.swing.JLabel Linea1;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel Panel_Imagen;
    private javax.swing.JPanel Panel_Informacion;
    private javax.swing.JPanel Panel_Opciones;
    private javax.swing.JPanel Panel_Seleccionar;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel barrita2;
    private javax.swing.JLabel buscar;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField flechitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel minimizar;
    // End of variables declaration//GEN-END:variables

    
}
