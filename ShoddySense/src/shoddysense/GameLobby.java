/**
 * This file is part of Shoddy Sense.
 * Copyright (C) 2007 Cathy Fitzpatrick <cathy@cathyjf.com>
 * Created in March 2007.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 **/

package shoddysense;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import shoddysenseserver.NetMessage;

/**
 *
 * @author  Cathy
 */
public class GameLobby extends javax.swing.JFrame {
    
    private ServerLink m_link;
    //private GamePanel m_game;
    private HashMap m_games = new HashMap();
    
    /** Creates new form GameLobby */
    public GameLobby(ServerLink link) {
        initComponents();
        m_link = link;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextPane();
        txtMessage = new javax.swing.JTextField();
        cmdChat = new javax.swing.JButton();
        gamesPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPlayers = new javax.swing.JList();
        cmdStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        txtChat.setBackground(new java.awt.Color(255, 255, 255));
        txtChat.setEditable(false);
        jScrollPane2.setViewportView(txtChat);

        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMessageKeyTyped(evt);
            }
        });

        cmdChat.setText("Chat");
        cmdChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdChatActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);

        jScrollPane1.setViewportView(lstPlayers);

        cmdStart.setText("Start");
        cmdStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdStartActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, cmdStart, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(cmdStart)
                .addContainerGap())
        );

        gamesPane.addTab("Users", jPanel2);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(gamesPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(txtMessage, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cmdChat)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(gamesPane)
                    .add(jScrollPane2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(cmdChat)
                    .add(txtMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
        if (evt.getKeyChar() == '\n') {
            cmdChatActionPerformed(null);
        }
    }//GEN-LAST:event_txtMessageKeyTyped

    private void cmdChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdChatActionPerformed
        String text = txtMessage.getText().trim();
        if (text.length() != 0) {
            m_link.sendMessage(new NetMessage(NetMessage.CHAT, -1, new Object[] { text }));
            txtMessage.setText(null);
        }
    }//GEN-LAST:event_cmdChatActionPerformed

    private void cmdStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdStartActionPerformed
        Object[] o = lstPlayers.getSelectedValues();
        if (o.length < 2) {
            JOptionPane.showMessageDialog(this, "You must select at least "
                    + "two people (including yourself) to start a game.\nHold "
                    + "down SHIFT or CTRL in order to select multiple users "
                    + "(including\nyourself) from the list before clicking "
                    + "Start.");
            return;
        }
        m_link.sendMessage(new NetMessage(NetMessage.BEGIN, -1, o));
    }//GEN-LAST:event_cmdStartActionPerformed
    
    public void addMessage(String text) {
        txtChat.setText(txtChat.getText() + text + "\n");
        txtChat.setCaretPosition(txtChat.getText().length());
    }
    
    public GamePanel getGame(int game) {
        return (GamePanel)m_games.get(new Integer(game));
    }
    
    public void startGame(int idx, int hash, String[] players) {
        JFrame frame = new JFrame("Shoddy Sense :: " + players[idx]);
        GamePanel game = new GamePanel(this, hash, idx, players);
        Dimension d = game.getPreferredSize();
        game.setSize(d);
        game.setLocation(0, 0);
        game.setVisible(true);
        m_games.put(new Integer(hash), game);
        JScrollPane scroll = new JScrollPane(game);
        scroll.setVisible(true);
        //scroll.setSize(500, d.getWidth());
        frame.setContentPane(scroll);
        frame.setSize(500, (int)d.getWidth());
        frame.validate();
        frame.setVisible(true);
    }
    
    public ServerLink getServer() {
        return m_link;
    }
    
    public void setPlayers(String[] players) {
        lstPlayers.setListData(players);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdChat;
    private javax.swing.JButton cmdStart;
    private javax.swing.JTabbedPane gamesPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstPlayers;
    private javax.swing.JTextPane txtChat;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
    
}