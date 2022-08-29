package ok.restaurante;

import javax.swing.ImageIcon;

public class Base_Datos {
    
    public static Platos platos[] = new Platos[55];
    
    
    protected void Generando_Campos(){
        for(int i=0; i<55; i++){
            platos[i] = new Platos();
        }
    }
    
    public void Almacenando_Datos(){
        Generando_Campos();
        platos[0].setNombre("CEVICHE");
        platos[0].setPrecio(28);
        platos[0].setDescripcion("Plato típico del Perú, Si estas de visita debes probarlo");
        platos[0].setImagen(new ImageIcon("src\\main\\java\\Platos\\ceviche.jpg"));
        
        platos[1].setNombre("LOMO SALTADO");
        platos[1].setPrecio(39);
        platos[1].setDescripcion("El lomo saltado forma parte de la gastronomía peruana y es uno de los platos bandera a nivel nacional");
        platos[1].setImagen(new ImageIcon("src\\main\\java\\Platos\\lomo_saltado.png"));
        //file:/C:/Users/Luis%20Fernando/Documents/Unamba/Ciclo%204/Desarrolllo%20de%20Software/SYSTERANT/RESTAURANTE/src/main/java/Platos/ceviche.jpg

        platos[2].setNombre("PAPA A LA HUANCAINA");
        platos[2].setPrecio(13);
        platos[2].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[2].setImagen(new ImageIcon("src\\main\\java\\Platos\\papa_a_la_huancaina.jpg"));

        platos[3].setNombre("AJI DE GALLINA");
        platos[3].setPrecio(19);
        platos[3].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[3].setImagen(new ImageIcon("src\\main\\java\\Platos\\aji_gallina.jpg"));

        platos[4].setNombre("ARROZ CON POLLO");
        platos[4].setPrecio(19);
        platos[4].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[4].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_con_pollo.jpg"));

        platos[5].setNombre("CAUSA LIMEÑA");
        platos[5].setPrecio(25);
        platos[5].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[5].setImagen(new ImageIcon("src\\main\\java\\Platos\\causa_limeña.jpg"));

        platos[6].setNombre("ROCOTO RELLENO");
        platos[6].setPrecio(20);
        platos[6].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[6].setImagen(new ImageIcon("src\\main\\java\\Platos\\rocoto_relleno.jpg"));

        platos[7].setNombre("SECO A LA NORTEÑA");
        platos[7].setPrecio(15);
        platos[7].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[7].setImagen(new ImageIcon("src\\main\\java\\Platos\\seco_a_la_norteña.jpg"));

        platos[8].setNombre("ESTOFADO DE POLLO");
        platos[8].setPrecio(16);
        platos[8].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[8].setImagen(new ImageIcon("src\\main\\java\\Platos\\estofado_de_pollo.jpg"));

        platos[9].setNombre("ARROZ CHAUFA");
        platos[9].setPrecio(17);
        platos[9].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[9].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_chaufa.jpg"));

        platos[10].setNombre("PARIHUELA DE MARISCOS");
        platos[10].setPrecio(30);
        platos[10].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[10].setImagen(new ImageIcon("src\\main\\java\\Platos\\parihuela_de_mariscos.jpg"));

        platos[11].setNombre("RACHI");
        platos[11].setPrecio(20);
        platos[11].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[11].setImagen(new ImageIcon("src\\main\\java\\Platos\\rachi.jpg"));

        platos[12].setNombre("POLLO AL LIMON");
        platos[12].setPrecio(19);
        platos[12].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[12].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_al_limon.jpg"));

        platos[13].setNombre("TALLARIN SALTADO");
        platos[13].setPrecio(30);
        platos[13].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[13].setImagen(new ImageIcon("src\\main\\java\\Platos\\tallarin_saltado_de_pollo.jpg"));

        platos[14].setNombre("ARROZ A LA JARDINERA");
        platos[14].setPrecio(45);
        platos[14].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[14].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_a_la_jardinera.jpg"));

        platos[15].setNombre("CHICHAROON DE PESCADO");
        platos[15].setPrecio(36);
        platos[15].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[15].setImagen(new ImageIcon("src\\main\\java\\Platos\\chicharron_de_pescado.jpg"));

        platos[16].setNombre("MONDONGUITO ITALIANO");
        platos[16].setPrecio(21);
        platos[16].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[16].setImagen(new ImageIcon("src\\main\\java\\Platos\\mondonguito_a_la_italiana.jpg"));

        platos[17].setNombre("BISTECK A LO POBRE");
        platos[17].setPrecio(25);
        platos[17].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[17].setImagen(new ImageIcon("src\\main\\java\\Platos\\bistec_a_lo_pobre.jpg"));

        platos[18].setNombre("HIGADO EMPANIZADO");
        platos[18].setPrecio(15);
        platos[18].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[18].setImagen(new ImageIcon("src\\main\\java\\Platos\\higado_empanizado.jpg"));

        platos[19].setNombre("POLLO AL MANI");
        platos[19].setPrecio(36);
        platos[19].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[19].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_al_mani.jpg"));

        platos[20].setNombre("ESCABECHE DE POLLO");
        platos[20].setPrecio(15);
        platos[20].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[20].setImagen(new ImageIcon("src\\main\\java\\Platos\\escabeche_de_pollo.jpg"));

        platos[21].setNombre("ASADO DE PAVITA");
        platos[21].setPrecio(18);
        platos[21].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[21].setImagen(new ImageIcon("src\\main\\java\\Platos\\asado_de_pavita.png"));

        platos[22].setNombre("PICANTE DE POLLO");
        platos[22].setPrecio(24);
        platos[22].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[22].setImagen(new ImageIcon("src\\main\\java\\Platos\\picante_de_pollo.jpg"));

        platos[23].setNombre("CHUPE DE OLLUCO");
        platos[23].setPrecio(28);
        platos[23].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[23].setImagen(new ImageIcon("src\\main\\java\\Platos\\chupe_de_olluco.jpg"));

        platos[24].setNombre("TACACHO CON CESINA");
        platos[24].setPrecio(32);
        platos[24].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[24].setImagen(new ImageIcon("src\\main\\java\\Platos\\tacacho_con_cecina.jpg"));

        platos[25].setNombre("CHICHARRON DE POTA");
        platos[25].setPrecio(35);
        platos[25].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[25].setImagen(new ImageIcon("src\\main\\java\\Platos\\chicharron_de_pota.jpg"));

        platos[26].setNombre("JAUNE DE GALLINA");
        platos[26].setPrecio(26);
        platos[26].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[26].setImagen(new ImageIcon("src\\main\\java\\Platos\\juane_de_gallina.jpg"));

        platos[27].setNombre("CHANCHO CON PIÑA");
        platos[27].setPrecio(25);
        platos[27].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[27].setImagen(new ImageIcon("src\\main\\java\\Platos\\chancho_con_piña.png"));

        platos[28].setNombre("ARROZ CON PATO");
        platos[28].setPrecio(15);
        platos[28].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[28].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_con_pato.jpg"));

        platos[29].setNombre("GUIZO DE GARBANZOS");
        platos[29].setPrecio(13);
        platos[29].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[29].setImagen(new ImageIcon("src\\main\\java\\Platos\\guizo_de_garbanzos.jpg"));

        platos[30].setNombre("PATITA CON MANI");
        platos[30].setPrecio(16);
        platos[30].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[30].setImagen(new ImageIcon("src\\main\\java\\Platos\\patita_con_mani.jpg"));

        platos[31].setNombre("LENTEJAS");
        platos[31].setPrecio(17);
        platos[31].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[31].setImagen(new ImageIcon("src\\main\\java\\Platos\\lentejas_con_pollo.jpg"));

        platos[32].setNombre("INCHICAPI");
        platos[32].setPrecio(22);
        platos[32].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[32].setImagen(new ImageIcon("src\\main\\java\\Platos\\inchicapi_de_gallina.jpg"));

        platos[33].setNombre("PALLARES CON SECO");
        platos[33].setPrecio(25);
        platos[33].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[33].setImagen(new ImageIcon("src\\main\\java\\Platos\\pallares_con_seco_de_carne.jpg"));

        platos[34].setNombre("CUY CHACTADO");
        platos[34].setPrecio(45);
        platos[34].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[34].setImagen(new ImageIcon("src\\main\\java\\Platos\\cuy_chactado.jpg"));

        platos[35].setNombre("POLLO CHIJAUKAY");
        platos[35].setPrecio(21);
        platos[35].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[35].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_chijaukay.jpg"));

        platos[36].setNombre("AJI DE COCONA");
        platos[36].setPrecio(26);
        platos[36].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[36].setImagen(new ImageIcon("src\\main\\java\\Platos\\aji_de_cocona.jpg"));

        platos[37].setNombre("MAJADO DE YUCA");
        platos[37].setPrecio(27);
        platos[37].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[37].setImagen(new ImageIcon("src\\main\\java\\Platos\\majado_de_yuca.jpg"));

        platos[38].setNombre("CAU CAU");
        platos[38].setPrecio(16);
        platos[38].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[38].setImagen(new ImageIcon("src\\main\\java\\Platos\\cau_cau_de_mondongo.jpg"));

        platos[39].setNombre("AGÜADITO DE POLLO");
        platos[39].setPrecio(19);
        platos[39].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[39].setImagen(new ImageIcon("src\\main\\java\\Platos\\aguadito_de_pollo.jpg"));

        platos[40].setNombre("POLLO AL SILLAO");
        platos[40].setPrecio(24);
        platos[40].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[40].setImagen(new ImageIcon("src\\main\\java\\Platos\\pollo_al_sillao.jpg"));

        platos[41].setNombre("SALTADO DE POLLO");
        platos[41].setPrecio(25);
        platos[41].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[41].setImagen(new ImageIcon("src\\main\\java\\Platos\\saltado_de_pollo_con_holantao.jpg"));

        platos[42].setNombre("MARISCO NORTEÑO");
        platos[42].setPrecio(30);
        platos[42].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[42].setImagen(new ImageIcon("src\\main\\java\\Platos\\mariscos_norteño.jpg"));

        platos[43].setNombre("OLLUQUITO CON POLLO");
        platos[43].setPrecio(15);
        platos[43].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[43].setImagen(new ImageIcon("src\\main\\java\\Platos\\olluquito_de_pollo.jpg"));

        platos[44].setNombre("ARROZ TAPADO");
        platos[44].setPrecio(35);
        platos[44].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[44].setImagen(new ImageIcon("src\\main\\java\\Platos\\arroz_tapado.jpg"));

        platos[45].setNombre("CHUPE DE MARISCOS");
        platos[45].setPrecio(20);
        platos[45].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[45].setImagen(new ImageIcon("src\\main\\java\\Platos\\chupe_de_camarones.jpg"));

        platos[46].setNombre("CAUSA NORTEÑA");
        platos[46].setPrecio(15);
        platos[46].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[46].setImagen(new ImageIcon("src\\main\\java\\Platos\\causa_limeña.jpg"));

        platos[47].setNombre("CARAPULCRA LIMEÑA");
        platos[47].setPrecio(23);
        platos[47].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[47].setImagen(new ImageIcon("src\\main\\java\\Platos\\carapulcra_limeña.jpg"));

        platos[48].setNombre("LOMO NEGRO");
        platos[48].setPrecio(25);
        platos[48].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[48].setImagen(new ImageIcon("src\\main\\java\\Platos\\lomo_negro.jpg"));

        platos[49].setNombre("SOLTERO DE QUESO");
        platos[49].setPrecio(25);
        platos[49].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[49].setImagen(new ImageIcon("src\\main\\java\\Platos\\soltero_de_queso.jpg"));

        platos[50].setNombre("ALBONDIGAS DE CARNE");
        platos[50].setPrecio(23);
        platos[50].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[50].setImagen(new ImageIcon("src\\main\\java\\Platos\\albondigas_de_carne.jpg"));

        platos[51].setNombre("TALLARINES ROJOS");
        platos[51].setPrecio(24);
        platos[51].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[51].setImagen(new ImageIcon("src\\main\\java\\Platos\\tallarines_rojos.jpg"));

        platos[51].setNombre("MALARRABIA NORTEÑA");
        platos[51].setPrecio(17);
        platos[51].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[51].setImagen(new ImageIcon("src\\main\\java\\Platos\\malarrabia_norteña.jpg"));

        platos[52].setNombre("TALLARINES VERDES");
        platos[52].setPrecio(30);
        platos[52].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[52].setImagen(new ImageIcon("src\\main\\java\\Platos\\tallarines_verdes.jpg"));

        platos[53].setNombre("FREJOL CON SECO");
        platos[53].setPrecio(14);
        platos[53].setDescripcion("Es un plato muy reconocido tanto nacional como internacional");
        platos[53].setImagen(new ImageIcon("src\\main\\java\\Platos\\frejol_con_seco.jpg"));

  
    }
    
    public String getNombre(int n){
        Almacenando_Datos();
        return platos[n].getNombre();
    }
    
    public String getDescripcion(int n){
        Almacenando_Datos();
        return platos[n].getDescripcion();
    }
    public double getPrecio(int n){
        Almacenando_Datos();
        return platos[n].getPrecio();
    }
    public ImageIcon getImagen(int n){
        Almacenando_Datos();
        return platos[n].getImagen();
    }
    
    
}
