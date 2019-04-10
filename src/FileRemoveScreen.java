
import java.io.File;
import java.io.FileInputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pro
 */
public class FileRemoveScreen extends java.awt.Frame {

    /**
     * Creates new form FileRemoveScreen
     */
    public FileRemoveScreen() {
        initComponents();
        setSize(450,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        t1 = new java.awt.TextField();
        ch = new java.awt.Choice();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        ta = new java.awt.TextArea();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setText("Folder");
        add(label1);
        label1.setBounds(60, 40, 60, 30);
        add(t1);
        t1.setBounds(140, 40, 140, 30);
        add(ch);
        ch.setBounds(140, 90, 140, 30);

        button1.setLabel("Fetch");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(300, 40, 60, 30);

        button2.setLabel("Delete");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(300, 90, 60, 30);

        button3.setLabel("Read");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(370, 90, 60, 30);
        add(ta);
        ta.setBounds(20, 150, 410, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        
        String path=t1.getText();
        
        File f=new File(path);
        String files[]=f.list();
        
        for(String tmp:files){
            ch.add(tmp);
        }
        
        
        
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        String name=ch.getSelectedItem();
        String path=t1.getText()+"/"+name;
        File f=new File(path);
        f.delete();
        ch.remove(name);
                
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        ta.setText("");
        try{
            String path=t1.getText();
            String fname=ch.getSelectedItem();
            String file=path+"/"+fname;
           
            FileInputStream fis=new FileInputStream(file);
            int size=fis.available();
            byte b[]=new byte[size];
            fis.read(b);
            String s=new String(b);
            ta.setText(s);
            
            
            
            
//            while(true){
//            int n=fis.read();
//            if(n==-1)break;
//            ta.append(""+(char)n);
//            }
            fis.close();
            
            
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_button3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileRemoveScreen().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Choice ch;
    private java.awt.Label label1;
    private java.awt.TextField t1;
    private java.awt.TextArea ta;
    // End of variables declaration//GEN-END:variables
}
