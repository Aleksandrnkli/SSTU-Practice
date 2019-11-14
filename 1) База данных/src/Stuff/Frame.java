package Stuff;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Frame extends javax.swing.JFrame {

    public Frame() {
        initComponents();
        this.setLocation(10, 10);
        this.setResizable(false);
    }

    //
    //
    private static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
    //
    //
    final String[] str1 = {"Код сотрудника", "ФИО", "Возраст", "Пол", "Адрес",
        "Телефон", "Паспортные данные", "Код должности"};
    Vector<String> s1 = new Vector<>(Arrays.asList(str1));
    //
    //
    final String[] str2 = {"Код должности", "Наименование должности", "Оклад", "Обязанности", "Требования"};
    Vector<String> s2 = new Vector<>(Arrays.asList(str2));
    //
    //
    final String[] str3 = {"Код жанра", "Наименование жанра", "Описание"};
    Vector<String> s3 = new Vector<>(Arrays.asList(str3));
    //
    //
    final String[] str4 = {"Код кассеты", "Наименование фильма", "Год создания",
        "Производитель", "Страна", "Главный актер", "Дата записи", "Код жанра", "Цена"};
    Vector<String> s4 = new Vector<>(Arrays.asList(str4));
    //
    //
    final String[] str5 = {"ФИО", "Адрес", "Телефон", "Паспортные данные", "Дата взятия",
        "Дата возврата", "Отметка об оплате", "Отметка о возврате", "Код кассеты 1",
        "Код кассеты 2", "Код кассеты 3", "Код сотрудника"};
    Vector<String> s5 = new Vector<>(Arrays.asList(str5));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        f1 = new javax.swing.JFrame();
        jc = new javax.swing.JComboBox<>();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jt4 = new javax.swing.JTextField();
        jt5 = new javax.swing.JTextField();
        jt6 = new javax.swing.JTextField();
        jt7 = new javax.swing.JTextField();
        jt8 = new javax.swing.JTextField();
        jt9 = new javax.swing.JTextField();
        jt10 = new javax.swing.JTextField();
        jt11 = new javax.swing.JTextField();
        jt12 = new javax.swing.JTextField();
        jt13 = new javax.swing.JTextField();
        jt14 = new javax.swing.JTextField();
        jt15 = new javax.swing.JTextField();
        jt16 = new javax.swing.JTextField();
        jt17 = new javax.swing.JTextField();
        jt18 = new javax.swing.JTextField();
        jt19 = new javax.swing.JTextField();
        jt20 = new javax.swing.JTextField();
        jt21 = new javax.swing.JTextField();
        jt22 = new javax.swing.JTextField();
        jt23 = new javax.swing.JTextField();
        jt24 = new javax.swing.JTextField();
        jt25 = new javax.swing.JTextField();
        jb = new javax.swing.JButton();
        jd = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jc1 = new javax.swing.JComboBox<>();
        jc2 = new javax.swing.JComboBox<>();
        jc3 = new javax.swing.JComboBox<>();
        jc4 = new javax.swing.JComboBox<>();
        jc5 = new javax.swing.JComboBox<>();
        jc6 = new javax.swing.JComboBox<>();
        jc7 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm1 = new javax.swing.JMenu();
        jmi1 = new javax.swing.JMenuItem();
        jmi2 = new javax.swing.JMenuItem();
        jm2 = new javax.swing.JMenu();
        jmi3 = new javax.swing.JMenuItem();
        jmi4 = new javax.swing.JMenuItem();
        jmi5 = new javax.swing.JMenuItem();
        jm3 = new javax.swing.JMenu();
        jmi6 = new javax.swing.JMenuItem();
        jm4 = new javax.swing.JMenu();
        jmi7 = new javax.swing.JMenuItem();
        jm5 = new javax.swing.JMenu();
        jmi8 = new javax.swing.JMenuItem();
        jm6 = new javax.swing.JMenu();
        jmi9 = new javax.swing.JMenuItem();
        jm7 = new javax.swing.JMenu();
        jmi10 = new javax.swing.JMenuItem();

        f1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        f1.setMinimumSize(new java.awt.Dimension(900, 550));

        jc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Выберите категорию", "Сотрудники", "Должности", "Жанры", "Кассеты", "Клиенты" }));
        jc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActionPerformed(evt);
            }
        });

        jt1.setEditable(false);

        jt2.setEditable(false);

        jt3.setEditable(false);

        jt4.setEditable(false);

        jt5.setEditable(false);

        jt6.setEditable(false);

        jt7.setEditable(false);

        jt8.setEditable(false);

        jt9.setEditable(false);

        jt10.setEditable(false);

        jt11.setEditable(false);

        jt12.setEditable(false);

        jt13.setEditable(false);
        jt13.setText("Введите информацию");

        jb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout f1Layout = new javax.swing.GroupLayout(f1.getContentPane());
        f1.getContentPane().setLayout(f1Layout);
        f1Layout.setHorizontalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f1Layout.createSequentialGroup()
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(f1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jc, 0, 263, Short.MAX_VALUE)
                            .addComponent(jt2)
                            .addComponent(jt3)
                            .addComponent(jt4)
                            .addComponent(jt5)
                            .addComponent(jt6)
                            .addComponent(jt7)
                            .addComponent(jt8)
                            .addComponent(jt9)
                            .addComponent(jt10)
                            .addComponent(jt11)
                            .addComponent(jt12)
                            .addComponent(jt1))
                        .addGap(18, 18, 18)
                        .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt13, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jt14)
                            .addComponent(jt15)
                            .addComponent(jt16)
                            .addComponent(jt17)
                            .addComponent(jt18)
                            .addComponent(jt19)
                            .addComponent(jt20)
                            .addComponent(jt21)
                            .addComponent(jt22)
                            .addComponent(jt23)
                            .addComponent(jt24)
                            .addComponent(jt25)))
                    .addGroup(f1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jb)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        f1Layout.setVerticalGroup(
            f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(f1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(f1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jb)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jd.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jd.setAlwaysOnTop(true);
        jd.setMinimumSize(new java.awt.Dimension(400, 300));

        jTextField1.setEditable(false);

        javax.swing.GroupLayout jdLayout = new javax.swing.GroupLayout(jd.getContentPane());
        jd.getContentPane().setLayout(jdLayout);
        jdLayout.setHorizontalGroup(
            jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jdLayout.setVerticalGroup(
            jdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jFrame1.setMinimumSize(new java.awt.Dimension(1290, 500));
        jFrame1.setName(""); // NOI18N

        jTable1.setEnabled(false);
        jTable1.setMinimumSize(new java.awt.Dimension(1290, 500));
        jScrollPane2.setViewportView(jTable1);

        jc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc1ActionPerformed(evt);
            }
        });

        jc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc2ActionPerformed(evt);
            }
        });

        jc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc3ActionPerformed(evt);
            }
        });

        jc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc4ActionPerformed(evt);
            }
        });

        jc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc5ActionPerformed(evt);
            }
        });

        jc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc6ActionPerformed(evt);
            }
        });

        jc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jc5, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jc3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(363, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc6)
                    .addComponent(jc7))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("База данных (Видео прокат)");
        setMinimumSize(new java.awt.Dimension(1300, 700));

        jTable.setEnabled(false);
        jScrollPane1.setViewportView(jTable);

        jm1.setText("Редактировать БД");

        jmi1.setText("Добавить запись");
        jmi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi1ActionPerformed(evt);
            }
        });
        jm1.add(jmi1);

        jmi2.setText("Удалить запись");
        jmi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi2ActionPerformed(evt);
            }
        });
        jm1.add(jmi2);

        jMenuBar1.add(jm1);

        jm2.setText("Запросы");

        jmi3.setText("Отдел кадров");
        jmi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi3ActionPerformed(evt);
            }
        });
        jm2.add(jmi3);

        jmi4.setText("Кассеты");
        jmi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi4ActionPerformed(evt);
            }
        });
        jm2.add(jmi4);

        jmi5.setText("Кассеты на руках");
        jmi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi5ActionPerformed(evt);
            }
        });
        jm2.add(jmi5);

        jMenuBar1.add(jm2);

        jm3.setText("Сотрудники");

        jmi6.setText("Показать");
        jmi6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi6ActionPerformed(evt);
            }
        });
        jm3.add(jmi6);

        jMenuBar1.add(jm3);

        jm4.setText("Должности");

        jmi7.setText("Показать");
        jmi7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi7ActionPerformed(evt);
            }
        });
        jm4.add(jmi7);

        jMenuBar1.add(jm4);

        jm5.setText("Жанры");

        jmi8.setText("Показать");
        jmi8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi8ActionPerformed(evt);
            }
        });
        jm5.add(jmi8);

        jMenuBar1.add(jm5);

        jm6.setText("Кассеты");

        jmi9.setText("Показать");
        jmi9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi9ActionPerformed(evt);
            }
        });
        jm6.add(jmi9);

        jMenuBar1.add(jm6);

        jm7.setText("Клиенты");

        jmi10.setText("Показать");
        jmi10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi10ActionPerformed(evt);
            }
        });
        jm7.add(jmi10);

        jMenuBar1.add(jm7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi1ActionPerformed
        f1.setLocation(30, 20);
        jt1.setText("");
        jt2.setText("");
        jt3.setText("");
        jt4.setText("");
        jt5.setText("");
        jt6.setText("");
        jt7.setText("");
        jt8.setText("");
        jt9.setText("");
        jt10.setText("");
        jt11.setText("");
        jt12.setText("");
        jt14.setText("");
        jt15.setText("");
        jt16.setText("");
        jt17.setText("");
        jt18.setText("");
        jt19.setText("");
        jt20.setText("");
        jt21.setText("");
        jt22.setText("");
        jt23.setText("");
        jt24.setText("");
        jt25.setText("");
        jt1.setVisible(false);
        jt2.setVisible(false);
        jt3.setVisible(false);
        jt4.setVisible(false);
        jt5.setVisible(false);
        jt6.setVisible(false);
        jt7.setVisible(false);
        jt8.setVisible(false);
        jt9.setVisible(false);
        jt10.setVisible(false);
        jt11.setVisible(false);
        jt12.setVisible(false);
        jt13.setVisible(false);
        jt14.setVisible(false);
        jt15.setVisible(false);
        jt16.setVisible(false);
        jt17.setVisible(false);
        jt18.setVisible(false);
        jt19.setVisible(false);
        jt20.setVisible(false);
        jt21.setVisible(false);
        jt22.setVisible(false);
        jt23.setVisible(false);
        jt24.setVisible(false);
        jt25.setVisible(false);
        f1.setVisible(false);
        f1.setResizable(false);
        f1.setTitle("Внесение записи");
        f1.setName("Внесение");
        jb.setName("Внести");
        jb.setText("Внести");
        jc.setSelectedItem("Выберите категорию");
        f1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmi1ActionPerformed

    private void jmi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi2ActionPerformed
        f1.setLocation(30, 20);
        jt1.setText("");
        jt2.setText("");
        jt3.setText("");
        jt4.setText("");
        jt5.setText("");
        jt6.setText("");
        jt7.setText("");
        jt8.setText("");
        jt9.setText("");
        jt10.setText("");
        jt11.setText("");
        jt12.setText("");
        jt14.setText("");
        jt15.setText("");
        jt16.setText("");
        jt17.setText("");
        jt18.setText("");
        jt19.setText("");
        jt20.setText("");
        jt21.setText("");
        jt22.setText("");
        jt23.setText("");
        jt24.setText("");
        jt25.setText("");
        jt1.setVisible(false);
        jt2.setVisible(false);
        jt3.setVisible(false);
        jt4.setVisible(false);
        jt5.setVisible(false);
        jt6.setVisible(false);
        jt7.setVisible(false);
        jt8.setVisible(false);
        jt9.setVisible(false);
        jt10.setVisible(false);
        jt11.setVisible(false);
        jt12.setVisible(false);
        jt13.setVisible(false);
        jt14.setVisible(false);
        jt15.setVisible(false);
        jt16.setVisible(false);
        jt17.setVisible(false);
        jt18.setVisible(false);
        jt19.setVisible(false);
        jt20.setVisible(false);
        jt21.setVisible(false);
        jt22.setVisible(false);
        jt23.setVisible(false);
        jt24.setVisible(false);
        jt25.setVisible(false);
        f1.setVisible(false);
        f1.setResizable(false);
        f1.setTitle("Удаление записи");
        f1.setName("Удаление");
        jb.setText("Удалить");
        jb.setName("Удалить");
        jc.setSelectedItem("Выберите категорию");
        f1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmi2ActionPerformed

    private void jcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActionPerformed
        if (f1.getName().equals("Удаление")) {

            if (jc.getSelectedItem().equals("Выберите категорию")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Сотрудники")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код сотрудника");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Должности")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код должности");
                jb.setText("Удалить");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Жанры")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код жанра");
                jb.setText("Удалить");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Кассеты")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код кассеты");
                jb.setText("Удалить");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Клиенты")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Паспортные данные");
                jb.setText("Удалить");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
        } else {
            if (jc.getSelectedItem().equals("Выберите категорию")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Сотрудники")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код сотрудника");
                jt2.setText("ФИО");
                jt3.setText("Возраст");
                jt4.setText("Пол");
                jt5.setText("Адрес");
                jt6.setText("Телефон");
                jt7.setText("Паспортные данные");
                jt8.setText("Код должности");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt2.setVisible(true);
                jt3.setVisible(true);
                jt4.setVisible(true);
                jt5.setVisible(true);
                jt6.setVisible(true);
                jt7.setVisible(true);
                jt8.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                jt15.setVisible(true);
                jt16.setVisible(true);
                jt17.setVisible(true);
                jt18.setVisible(true);
                jt19.setVisible(true);
                jt20.setVisible(true);
                jt21.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Должности")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код должности");
                jt2.setText("Наименование должности");
                jt3.setText("Оклад");
                jt4.setText("Обязанности");
                jt5.setText("Требования");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt2.setVisible(true);
                jt3.setVisible(true);
                jt4.setVisible(true);
                jt5.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                jt15.setVisible(true);
                jt16.setVisible(true);
                jt17.setVisible(true);
                jt18.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Жанры")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код жанра");
                jt2.setText("Наименование жанра");
                jt3.setText("Описание");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt2.setVisible(true);
                jt3.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                jt15.setVisible(true);
                jt16.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Кассеты")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("Код кассеты");
                jt2.setText("Наименование фильма");
                jt3.setText("Год создания");
                jt4.setText("Производитель");
                jt5.setText("Страна");
                jt6.setText("Главный актер");
                jt7.setText("Дата записи");
                jt8.setText("Код жанра");
                jt9.setText("Цена");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt2.setVisible(true);
                jt3.setVisible(true);
                jt4.setVisible(true);
                jt5.setVisible(true);
                jt6.setVisible(true);
                jt7.setVisible(true);
                jt8.setVisible(true);
                jt9.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                jt15.setVisible(true);
                jt16.setVisible(true);
                jt17.setVisible(true);
                jt18.setVisible(true);
                jt19.setVisible(true);
                jt20.setVisible(true);
                jt21.setVisible(true);
                jt22.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
            if (jc.getSelectedItem().equals("Клиенты")) {
                jt1.setText("");
                jt2.setText("");
                jt3.setText("");
                jt4.setText("");
                jt5.setText("");
                jt6.setText("");
                jt7.setText("");
                jt8.setText("");
                jt9.setText("");
                jt10.setText("");
                jt11.setText("");
                jt12.setText("");
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                jb.setVisible(false);
                jt1.setVisible(false);
                jt2.setVisible(false);
                jt3.setVisible(false);
                jt4.setVisible(false);
                jt5.setVisible(false);
                jt6.setVisible(false);
                jt7.setVisible(false);
                jt8.setVisible(false);
                jt9.setVisible(false);
                jt10.setVisible(false);
                jt11.setVisible(false);
                jt12.setVisible(false);
                jt13.setVisible(false);
                jt14.setVisible(false);
                jt15.setVisible(false);
                jt16.setVisible(false);
                jt17.setVisible(false);
                jt18.setVisible(false);
                jt19.setVisible(false);
                jt20.setVisible(false);
                jt21.setVisible(false);
                jt22.setVisible(false);
                jt23.setVisible(false);
                jt24.setVisible(false);
                jt25.setVisible(false);
                jt1.setText("ФИО");
                jt2.setText("Адрес");
                jt3.setText("Телефон");
                jt4.setText("Паспортные данные");
                jt5.setText("Дата взятия");
                jt6.setText("Дата возврата");
                jt7.setText("Отметка об оплате");
                jt8.setText("Отметка о возврате");
                jt9.setText("Код кассеты 1");
                jt10.setText("Код кассеты 2");
                jt11.setText("Код кассеты 3");
                jt12.setText("Код сотрудника");
                jb.setVisible(true);
                jt1.setVisible(true);
                jt2.setVisible(true);
                jt3.setVisible(true);
                jt4.setVisible(true);
                jt5.setVisible(true);
                jt6.setVisible(true);
                jt7.setVisible(true);
                jt8.setVisible(true);
                jt9.setVisible(true);
                jt10.setVisible(true);
                jt11.setVisible(true);
                jt12.setVisible(true);
                jt13.setVisible(true);
                jt14.setVisible(true);
                jt15.setVisible(true);
                jt16.setVisible(true);
                jt17.setVisible(true);
                jt18.setVisible(true);
                jt19.setVisible(true);
                jt20.setVisible(true);
                jt21.setVisible(true);
                jt22.setVisible(true);
                jt23.setVisible(true);
                jt24.setVisible(true);
                jt25.setVisible(true);
                f1.dispose();
                f1.setVisible(rootPaneCheckingEnabled);
            }
        }
    }//GEN-LAST:event_jcActionPerformed

    private void jbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActionPerformed
        if (jb.getName().equals("Удалить")) {
            if (jc.getSelectedItem() == "Сотрудники") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                    if (newFile1.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    String find = jt14.getText();
                    if (find.equals("")) {
                        find = "   ";
                    }
                    String[] bufs;
                    String s;
                    byte k = 0;
                    byte count = 0;
                    byte count1 = 0;
                    s = br.readLine();
                    while (s != null) {
                        ++count;
                        bufs = s.split(";");
                        if (bufs[0].equals(find)) {
                            ++k;
                            jTextField1.setText("Запись успешно удалена!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            break;
                        }
                        s = br.readLine();
                    }
                    br.close();
                    if (count == 1) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (k == 0) {
                        count = -100;
                        jTextField1.setText("Такой записи не найдено");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                    }
                    BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile2));
                    s = br1.readLine();
                    while (s != null) {
                        ++count1;
                        bufs = s.split(";");
                        if (count1 == count) {
                            s = br1.readLine();
                            if (s == null) {
                                break;
                            }
                            bufs = s.split(";");
                        }
                        for (int i = 0; i < bufs.length; ++i) {
                            bw1.write(bufs[i] + ";");
                        }
                        bw1.newLine();
                        s = br1.readLine();
                        if (s == null) {
                            break;
                        }
                    }
                    br1.close();
                    bw1.close();
                    BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile1));
                    while ((s = br2.readLine()) != null) {
                        bufs = s.split(";");
                        for (int i = 0; i < bufs.length; ++i) {
                            bw2.write(bufs[i] + ";");
                        }
                        bw2.newLine();
                    }
                    br2.close();
                    bw2.close();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                File file = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                file.delete();
            }
            if (jc.getSelectedItem() == "Должности") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Должности.txt");
                    if (newFile1.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    String find = jt14.getText();
                    if (find.equals("")) {
                        find = "   ";
                    }
                    String[] bufs;
                    String s;
                    byte k = 0;
                    byte count = 0;
                    byte count1 = 0;
                    s = br.readLine();
                    while (s != null) {
                        ++count;
                        bufs = s.split(";");
                        if (bufs[0].equals(find)) {
                            ++k;
                            jTextField1.setText("Запись успешно удалена!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            break;
                        }
                        s = br.readLine();
                    }
                    br.close();
                    if (count == 1) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (k == 0) {
                        count = -100;
                        jTextField1.setText("Такой записи не найдено");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                    }
                    BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile2));
                    s = br1.readLine();
                    while (s != null) {
                        ++count1;
                        bufs = s.split(";");
                        if (count1 == count) {
                            s = br1.readLine();
                            if (s == null) {
                                break;
                            }
                            bufs = s.split(";");
                        }
                        for (int i = 0; i < bufs.length; ++i) {
                            bw1.write(bufs[i] + ";");
                        }
                        bw1.newLine();
                        s = br1.readLine();
                        if (s == null) {
                            break;
                        }
                    }
                    br1.close();
                    bw1.close();
                    BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile1));
                    while ((s = br2.readLine()) != null) {
                        bufs = s.split(";");
                        for (int i = 0; i < bufs.length; ++i) {
                            bw2.write(bufs[i] + ";");
                        }
                        bw2.newLine();
                    }
                    br2.close();
                    bw2.close();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                File file = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                file.delete();
            }
            if (jc.getSelectedItem() == "Жанры") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                    if (newFile1.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    String find = jt14.getText();
                    if (find.equals("")) {
                        find = "   ";
                    }
                    String[] bufs;
                    String s;
                    byte k = 0;
                    byte count = 0;
                    byte count1 = 0;
                    s = br.readLine();
                    while (s != null) {
                        ++count;
                        bufs = s.split(";");
                        if (bufs[0].equals(find)) {
                            ++k;
                            jTextField1.setText("Запись успешно удалена!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            break;
                        }
                        s = br.readLine();
                    }
                    br.close();
                    if (count == 1) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (k == 0) {
                        count = -100;
                        jTextField1.setText("Такой записи не найдено");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                    }
                    BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile2));
                    s = br1.readLine();
                    while (s != null) {
                        ++count1;
                        bufs = s.split(";");
                        if (count1 == count) {
                            s = br1.readLine();
                            if (s == null) {
                                break;
                            }
                            bufs = s.split(";");
                        }
                        for (int i = 0; i < bufs.length; ++i) {
                            bw1.write(bufs[i] + ";");
                        }
                        bw1.newLine();
                        s = br1.readLine();
                        if (s == null) {
                            break;
                        }
                    }
                    br1.close();
                    bw1.close();
                    BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile1));
                    while ((s = br2.readLine()) != null) {
                        bufs = s.split(";");
                        for (int i = 0; i < bufs.length; ++i) {
                            bw2.write(bufs[i] + ";");
                        }
                        bw2.newLine();
                    }
                    br2.close();
                    bw2.close();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                File file = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                file.delete();
            }
            if (jc.getSelectedItem() == "Кассеты") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                    if (newFile1.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    String find = jt14.getText();
                    if (find.equals("")) {
                        find = "   ";
                    }
                    String[] bufs;
                    String s;
                    byte k = 0;
                    byte count = 0;
                    byte count1 = 0;
                    s = br.readLine();
                    while (s != null) {
                        ++count;
                        bufs = s.split(";");
                        if (bufs[0].equals(find)) {
                            ++k;
                            jTextField1.setText("Запись успешно удалена!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            break;
                        }
                        s = br.readLine();
                    }
                    br.close();
                    if (count == 1) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (k == 0) {
                        count = -100;
                        jTextField1.setText("Такой записи не найдено");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                    }
                    BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile2));
                    s = br1.readLine();
                    while (s != null) {
                        ++count1;
                        bufs = s.split(";");
                        if (count1 == count) {
                            s = br1.readLine();
                            if (s == null) {
                                break;
                            }
                            bufs = s.split(";");
                        }
                        for (int i = 0; i < bufs.length; ++i) {
                            bw1.write(bufs[i] + ";");
                        }
                        bw1.newLine();
                        s = br1.readLine();
                        if (s == null) {
                            break;
                        }
                    }
                    br1.close();
                    bw1.close();
                    BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile1));
                    while ((s = br2.readLine()) != null) {
                        bufs = s.split(";");
                        for (int i = 0; i < bufs.length; ++i) {
                            bw2.write(bufs[i] + ";");
                        }
                        bw2.newLine();
                    }
                    br2.close();
                    bw2.close();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                File file = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                file.delete();
            }
            if (jc.getSelectedItem() == "Клиенты") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                    if (newFile1.exists() == false) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    String find = jt14.getText();
                    if (find.equals("")) {
                        find = "   ";
                    }
                    String[] bufs;
                    String s;
                    byte k = 0;
                    byte count = 0;
                    byte count1 = 0;
                    s = br.readLine();
                    while (s != null) {
                        ++count;
                        bufs = s.split(";");
                        if (bufs[3].equals(find)) {
                            ++k;
                            jTextField1.setText("Запись успешно удалена!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            break;
                        }
                        s = br.readLine();
                    }
                    br.close();
                    if (count == 1) {
                        jt14.setText("");
                        jTextField1.setText("В данной категории записей нет");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (k == 0) {
                        count = -100;
                        jTextField1.setText("Такой записи не найдено");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                    }
                    BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile2));
                    s = br1.readLine();
                    while (s != null) {
                        ++count1;
                        bufs = s.split(";");
                        if (count1 == count) {
                            s = br1.readLine();
                            if (s == null) {
                                break;
                            }
                            bufs = s.split(";");
                        }
                        for (int i = 0; i < bufs.length; ++i) {
                            bw1.write(bufs[i] + ";");
                        }
                        bw1.newLine();
                        s = br1.readLine();
                        if (s == null) {
                            break;
                        }
                    }
                    br1.close();
                    bw1.close();
                    BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile1));
                    while ((s = br2.readLine()) != null) {
                        bufs = s.split(";");
                        for (int i = 0; i < bufs.length; ++i) {
                            bw2.write(bufs[i] + ";");
                        }
                        bw2.newLine();
                    }
                    br2.close();
                    bw2.close();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
                jt14.setText("");
                jt15.setText("");
                jt16.setText("");
                jt17.setText("");
                jt18.setText("");
                jt19.setText("");
                jt20.setText("");
                jt21.setText("");
                jt22.setText("");
                jt23.setText("");
                jt24.setText("");
                jt25.setText("");
                File file = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                file.delete();
            }
        } else {
            if (jc.getSelectedItem() == "Сотрудники") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        folder.mkdir();
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                    if (newFile1.exists() == false) {
                        newFile1.createNewFile();
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile2));
                    String[] str1_t = {jt14.getText(), jt15.getText(), jt16.getText(), jt17.getText(),
                        jt18.getText(), jt19.getText(), jt20.getText(), jt21.getText()};
                    String find = jt14.getText();
                    if (isNumber(jt14.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код сотрудника");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt16.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный возраст");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt19.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный телефон");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt20.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректные паспортные данные");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt21.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код должности");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    BufferedReader brs = new BufferedReader(new FileReader(newFile1));
                    String[] bufs1;
                    String s1;
                    s1 = brs.readLine();
                    while (s1 != null) {
                        bufs1 = s1.split(";");
                        if (bufs1[0].equals(find)) {
                            jt14.setText("");
                            jt15.setText("");
                            jt16.setText("");
                            jt17.setText("");
                            jt18.setText("");
                            jt19.setText("");
                            jt20.setText("");
                            jt21.setText("");
                            newFile2.delete();
                            jTextField1.setText("Такая запись уже существует!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            return;
                        }
                        s1 = brs.readLine();
                    }
                    brs.close();
                    String buf1;
                    String[] bufs;
                    String s;
                    s = br.readLine();
                    if (s == null) {
                        s = "San Francisco";
                    }
                    if (s.equals("San Francisco")) {
                        br.close();
                        for (int i = 0; i < str1.length; ++i) {
                            buf1 = str1[i];
                            bw.write(buf1 + ";");
                        }
                        bw.newLine();
                        for (int i = 0; i < str1_t.length; ++i) {
                            if (str1_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str1_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    } else {
                        while (s != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw.write(bufs[i] + ";");
                            }
                            bw.newLine();
                            s = br.readLine();
                        }
                        for (int i = 0; i < str1_t.length; ++i) {
                            if (str1_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str1_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        br.close();
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    }
                    jTextField1.setText("Запись успешно добавлена!");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    jt14.setText("");
                    jt15.setText("");
                    jt16.setText("");
                    jt17.setText("");
                    jt18.setText("");
                    jt19.setText("");
                    jt20.setText("");
                    jt21.setText("");
                    newFile2.delete();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (jc.getSelectedItem() == "Должности") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        folder.mkdir();
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Должности.txt");
                    if (newFile1.exists() == false) {
                        newFile1.createNewFile();
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile2));
                    String[] str2_t = {jt14.getText(), jt15.getText(), jt16.getText(), jt17.getText(),
                        jt18.getText()};
                    String find = jt14.getText();
                    if (isNumber(jt14.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код должности");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt16.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный оклад");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    BufferedReader brs = new BufferedReader(new FileReader(newFile1));
                    String[] bufs1;
                    String s1;
                    s1 = brs.readLine();
                    while (s1 != null) {
                        bufs1 = s1.split(";");
                        if (bufs1[0].equals(find)) {
                            jt14.setText("");
                            jt15.setText("");
                            jt16.setText("");
                            jt17.setText("");
                            jt18.setText("");
                            jt19.setText("");
                            jt20.setText("");
                            jt21.setText("");
                            newFile2.delete();
                            jTextField1.setText("Такая запись уже существует!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            return;
                        }
                        s1 = brs.readLine();
                    }
                    brs.close();
                    String buf1;
                    String[] bufs;
                    String s;
                    s = br.readLine();
                    if (s == null) {
                        s = "San Francisco";
                    }
                    if (s.equals("San Francisco")) {
                        br.close();
                        for (int i = 0; i < str2.length; ++i) {
                            buf1 = str2[i];
                            bw.write(buf1 + ";");
                        }
                        bw.newLine();
                        for (int i = 0; i < str2_t.length; ++i) {
                            if (str2_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str2_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    } else {
                        while (s != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw.write(bufs[i] + ";");
                            }
                            bw.newLine();
                            s = br.readLine();
                        }
                        for (int i = 0; i < str2_t.length; ++i) {
                            if (str2_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str2_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        br.close();
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    }
                    jTextField1.setText("Запись успешно добавлена!");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    jt14.setText("");
                    jt15.setText("");
                    jt16.setText("");
                    jt17.setText("");
                    jt18.setText("");
                    newFile2.delete();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (jc.getSelectedItem() == "Жанры") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        folder.mkdir();
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                    if (newFile1.exists() == false) {
                        newFile1.createNewFile();
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile2));
                    String[] str3_t = {jt14.getText(), jt15.getText(), jt16.getText()};
                    String find = jt14.getText();
                    if (isNumber(jt14.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код жанра");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    BufferedReader brs = new BufferedReader(new FileReader(newFile1));
                    String[] bufs1;
                    String s1;
                    s1 = brs.readLine();
                    while (s1 != null) {
                        bufs1 = s1.split(";");
                        if (bufs1[0].equals(find)) {
                            jt14.setText("");
                            jt15.setText("");
                            jt16.setText("");
                            jt17.setText("");
                            jt18.setText("");
                            jt19.setText("");
                            jt20.setText("");
                            jt21.setText("");
                            newFile2.delete();
                            jTextField1.setText("Такая запись уже существует!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            return;
                        }
                        s1 = brs.readLine();
                    }
                    brs.close();
                    String buf1;
                    String[] bufs;
                    String s;
                    s = br.readLine();
                    if (s == null) {
                        s = "San Francisco";
                    }
                    if (s.equals("San Francisco")) {
                        br.close();
                        for (int i = 0; i < str3.length; ++i) {
                            buf1 = str3[i];
                            bw.write(buf1 + ";");
                        }
                        bw.newLine();
                        for (int i = 0; i < str3_t.length; ++i) {
                            if (str3_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str3_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    } else {
                        while (s != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw.write(bufs[i] + ";");
                            }
                            bw.newLine();
                            s = br.readLine();
                        }
                        for (int i = 0; i < str3_t.length; ++i) {
                            if (str3_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str3_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        br.close();
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    }
                    jTextField1.setText("Запись успешно добавлена!");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    jt14.setText("");
                    jt15.setText("");
                    jt16.setText("");
                    newFile2.delete();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (jc.getSelectedItem() == "Кассеты") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        folder.mkdir();
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                    if (newFile1.exists() == false) {
                        newFile1.createNewFile();
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile2));
                    String[] str4_t = {jt14.getText(), jt15.getText(), jt16.getText(), jt17.getText(),
                        jt18.getText(), jt19.getText(), jt20.getText(), jt21.getText(), jt22.getText()};
                    String find = jt14.getText();
                    if (isNumber(jt14.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код кассеты");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt16.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный год создания");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt21.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код жанра");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt22.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректную цену");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    BufferedReader brs = new BufferedReader(new FileReader(newFile1));
                    String[] bufs1;
                    String s1;
                    s1 = brs.readLine();
                    while (s1 != null) {
                        bufs1 = s1.split(";");
                        if (bufs1[0].equals(find)) {
                            jt14.setText("");
                            jt15.setText("");
                            jt16.setText("");
                            jt17.setText("");
                            jt18.setText("");
                            jt19.setText("");
                            jt20.setText("");
                            jt21.setText("");
                            newFile2.delete();
                            jTextField1.setText("Такая запись уже существует!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            return;
                        }
                        s1 = brs.readLine();
                    }
                    brs.close();
                    String buf1;
                    String[] bufs;
                    String s;
                    s = br.readLine();
                    if (s == null) {
                        s = "San Francisco";
                    }
                    if (s.equals("San Francisco")) {
                        br.close();
                        for (int i = 0; i < str4.length; ++i) {
                            buf1 = str4[i];
                            bw.write(buf1 + ";");
                        }
                        bw.newLine();
                        for (int i = 0; i < str4_t.length; ++i) {
                            if (str4_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str4_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    } else {
                        while (s != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw.write(bufs[i] + ";");
                            }
                            bw.newLine();
                            s = br.readLine();
                        }
                        for (int i = 0; i < str4_t.length; ++i) {
                            if (str4_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str4_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        br.close();
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    }
                    jTextField1.setText("Запись успешно добавлена!");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    jt14.setText("");
                    jt15.setText("");
                    jt16.setText("");
                    jt17.setText("");
                    jt18.setText("");
                    jt19.setText("");
                    jt20.setText("");
                    jt21.setText("");
                    jt22.setText("");
                    newFile2.delete();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (jc.getSelectedItem() == "Клиенты") {
                try {
                    File folder = new File("", "Файлы для работы с БД Видео проката");
                    if (folder.exists() == false) {
                        folder.mkdir();
                    }
                    File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                    if (newFile1.exists() == false) {
                        newFile1.createNewFile();
                    }
                    File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Buf.txt");
                    BufferedReader br = new BufferedReader(new FileReader(newFile1));
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile2));
                    String[] str5_t = {jt14.getText(), jt15.getText(), jt16.getText(), jt17.getText(),
                        jt18.getText(), jt19.getText(), jt20.getText(), jt21.getText(), jt22.getText(), jt23.getText(),
                        jt24.getText(), jt25.getText()};
                    String find = jt14.getText();
                    if (isNumber(jt16.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный телефон");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt17.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректные паспортные данные");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt22.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код кассеты 1");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt23.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код кассеты 2");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt24.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код кассеты 3");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    if (isNumber(jt25.getText()) == false) {
                        jt14.setText("");
                        jt15.setText("");
                        jt16.setText("");
                        jt17.setText("");
                        jt18.setText("");
                        jt19.setText("");
                        jt20.setText("");
                        jt21.setText("");
                        jt22.setText("");
                        jt23.setText("");
                        jt24.setText("");
                        jt25.setText("");
                        jTextField1.setText("Ошибка!Введите корректный код сотрудника");
                        jd.setResizable(false);
                        jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                        jd.setLocation(120, 120);
                        jd.setVisible(rootPaneCheckingEnabled);
                        return;
                    }
                    BufferedReader brs = new BufferedReader(new FileReader(newFile1));
                    String[] bufs1;
                    String s1;
                    s1 = brs.readLine();
                    while (s1 != null) {
                        bufs1 = s1.split(";");
                        if (bufs1[3].equals(find)) {
                            jt14.setText("");
                            jt15.setText("");
                            jt16.setText("");
                            jt17.setText("");
                            jt18.setText("");
                            jt19.setText("");
                            jt20.setText("");
                            jt21.setText("");
                            newFile2.delete();
                            jTextField1.setText("Такая запись уже существует!");
                            jd.setResizable(false);
                            jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                            jd.setLocation(120, 120);
                            jd.setVisible(rootPaneCheckingEnabled);
                            return;
                        }
                        s1 = brs.readLine();
                    }
                    brs.close();
                    String buf1;
                    String[] bufs;
                    String s;
                    s = br.readLine();
                    if (s == null) {
                        s = "San Francisco";
                    }
                    if (s.equals("San Francisco")) {
                        br.close();
                        for (int i = 0; i < str5.length; ++i) {
                            buf1 = str5[i];
                            bw.write(buf1 + ";");
                        }
                        bw.newLine();
                        for (int i = 0; i < str5_t.length; ++i) {
                            if (str5_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str5_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    } else {
                        while (s != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw.write(bufs[i] + ";");
                            }
                            bw.newLine();
                            s = br.readLine();
                        }
                        for (int i = 0; i < str5_t.length; ++i) {
                            if (str5_t[i].equals("")) {
                                buf1 = "   ";
                                bw.write(buf1 + ";");
                            } else {
                                buf1 = str5_t[i];
                                bw.write(buf1 + ";");
                            }
                        }
                        br.close();
                        bw.close();
                        BufferedReader br1 = new BufferedReader(new FileReader(newFile2));
                        BufferedWriter bw1 = new BufferedWriter(new FileWriter(newFile1));
                        while ((s = br1.readLine()) != null) {
                            bufs = s.split(";");
                            for (int i = 0; i < bufs.length; ++i) {
                                bw1.write(bufs[i] + ";");
                            }
                            bw1.newLine();
                        }
                        br1.close();
                        bw1.close();
                    }
                    jTextField1.setText("Запись успешно добавлена!");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    jt14.setText("");
                    jt15.setText("");
                    jt16.setText("");
                    jt17.setText("");
                    jt18.setText("");
                    jt19.setText("");
                    jt20.setText("");
                    jt21.setText("");
                    jt22.setText("");
                    jt23.setText("");
                    jt24.setText("");
                    jt25.setText("");
                    newFile2.delete();
                } catch (IOException ex) {
                    Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jbActionPerformed

    private void jmi6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi6ActionPerformed
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
            if (newFile1.exists() == false) {
                DefaultTableModel m = new DefaultTableModel(0, 0);
                jTable.setModel(m);
                jTable.setVisible(false);
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            jTable.setVisible(rootPaneCheckingEnabled);
            DefaultTableModel m1 = new DefaultTableModel(s1, 0);
            BufferedReader br = new BufferedReader(new FileReader(newFile1));
            String s;
            String[] bufs;
            String[] a = {"", "", "", "", "", "", "", ""};
            int r = 0;
            while ((s = br.readLine()) != null) {
                ++r;
                bufs = s.split(";");
                for (int i = 0; i < bufs.length; ++i) {
                    a[i] = bufs[i];
                }
                if (r == 1) {
                    DefaultTableModel n = new DefaultTableModel(0, 0);
                    jTable.setModel(n);
                } else {
                    Vector<String> s_1 = new Vector<String>(Arrays.asList(a));
                    m1.addRow(s_1);
                    jTable.setModel(m1);
                }
            }
            if (r == 1) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi6ActionPerformed

    private void jmi7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi7ActionPerformed
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Должности.txt");
            if (newFile1.exists() == false) {
                DefaultTableModel m = new DefaultTableModel(0, 0);
                jTable.setModel(m);
                jTable.setVisible(false);
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            jTable.setVisible(rootPaneCheckingEnabled);
            DefaultTableModel m2 = new DefaultTableModel(s2, 0);
            BufferedReader br = new BufferedReader(new FileReader(newFile1));
            String s;
            String[] bufs;
            String[] a = {"", "", "", "", ""};
            int r = 0;
            while ((s = br.readLine()) != null) {
                ++r;
                bufs = s.split(";");
                for (int i = 0; i < bufs.length; ++i) {
                    a[i] = bufs[i];
                }
                if (r == 1) {
                    DefaultTableModel n = new DefaultTableModel(0, 0);
                    jTable.setModel(n);
                } else {
                    Vector<String> s_1 = new Vector<String>(Arrays.asList(a));
                    m2.addRow(s_1);
                    jTable.setModel(m2);
                }
            }
            if (r == 1) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi7ActionPerformed

    private void jmi8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi8ActionPerformed
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
            if (newFile1.exists() == false) {
                DefaultTableModel m = new DefaultTableModel(0, 0);
                jTable.setModel(m);
                jTable.setVisible(false);
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            jTable.setVisible(rootPaneCheckingEnabled);
            DefaultTableModel m3 = new DefaultTableModel(s3, 0);
            BufferedReader br = new BufferedReader(new FileReader(newFile1));
            String s;
            String[] bufs;
            String[] a = {"", "", ""};
            int r = 0;
            while ((s = br.readLine()) != null) {
                ++r;
                bufs = s.split(";");
                for (int i = 0; i < bufs.length; ++i) {
                    a[i] = bufs[i];
                }
                if (r == 1) {
                    DefaultTableModel n = new DefaultTableModel(0, 0);
                    jTable.setModel(n);
                } else {
                    Vector<String> s_1 = new Vector<String>(Arrays.asList(a));
                    m3.addRow(s_1);
                    jTable.setModel(m3);
                }
            }
            if (r == 1) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi8ActionPerformed

    private void jmi9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi9ActionPerformed
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
            if (newFile1.exists() == false) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            DefaultTableModel m4 = new DefaultTableModel(s4, 0);
            BufferedReader br = new BufferedReader(new FileReader(newFile1));
            String s;
            String[] bufs;
            String[] a = {"", "", "", "", "", "", "", "", ""};
            int r = 0;
            while ((s = br.readLine()) != null) {
                ++r;
                bufs = s.split(";");
                for (int i = 0; i < bufs.length; ++i) {
                    a[i] = bufs[i];
                }
                if (r == 1) {
                    DefaultTableModel n = new DefaultTableModel(0, 0);
                    jTable.setModel(n);
                } else {
                    Vector<String> s_1 = new Vector<String>(Arrays.asList(a));
                    m4.addRow(s_1);
                    jTable.setModel(m4);
                }
            }
            if (r == 1) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi9ActionPerformed

    private void jmi10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi10ActionPerformed
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
            if (newFile1.exists() == false) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            DefaultTableModel m5 = new DefaultTableModel(s5, 0);
            BufferedReader br = new BufferedReader(new FileReader(newFile1));
            String s;
            String[] bufs;
            String[] a = {"", "", "", "", "", "", "", "", "", "", "", ""};
            int r = 0;
            while ((s = br.readLine()) != null) {
                ++r;
                bufs = s.split(";");
                for (int i = 0; i < bufs.length; ++i) {
                    a[i] = bufs[i];
                }
                if (r == 1) {
                    DefaultTableModel n = new DefaultTableModel(0, 0);
                    jTable.setModel(n);
                } else {
                    Vector<String> s_1 = new Vector<String>(Arrays.asList(a));
                    m5.addRow(s_1);
                    jTable.setModel(m5);
                }
            }
            if (r == 1) {
                jTextField1.setText("В данной категории записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi10ActionPerformed

    private void jmi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi3ActionPerformed
        jFrame1.setVisible(false);
        jFrame1.setLocation(30, 20);
        jFrame1.setTitle("Запрос 'Отдел кадров'");
        jFrame1.setName("Отдел кадров");
        DefaultTableModel empty = new DefaultTableModel(0, 0);
        jTable1.setModel(empty);
        jTable1.setVisible(true);
        jc1.setVisible(true);
        jc1.setSelectedItem("Выберите должность");
        jc2.setVisible(false);
        jc3.setVisible(false);
        jc4.setVisible(false);
        jc5.setVisible(false);
        jc6.setVisible(false);
        jc7.setVisible(false);
        jTable1.setVisible(false);
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
            File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Должности.txt");
            if ((newFile1.exists() == false)) {
                jTextField1.setText("В данных категориях записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            if ((newFile2.exists() == false)) {
                jTextField1.setText("В данных категориях записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
            BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
            if (jc1.getItemCount() < 2) {
                BufferedReader brjc = new BufferedReader(new FileReader(newFile2));
                String sjc = brjc.readLine();
                sjc = brjc.readLine();
                String[] bufjc;
                jc1.addItem("Выберите должность");
                while (sjc != null) {
                    bufjc = sjc.split(";");
                    jc1.addItem(bufjc[1]);
                    sjc = brjc.readLine();
                    System.out.println(" " + bufjc[1]);
                }
                brjc.close();
            }
            String s;
            String[] bufs;
            String[] header = {"", "", "", "", "", "", "", "", "", "", "", ""};
            String[] h1 = {"", "", "", "", "", "", ""};
            String[] h2 = {"", "", "", "", ""};
            int n = 0;
            int k = 0;
            while (n != 1) {
                s = br1.readLine();
                bufs = s.split(";");
                ++n;
                for (int i = 0; i < bufs.length - 1; ++i) {
                    h1[i] = bufs[i];
                }
            }
            while (k != 1) {
                s = br2.readLine();
                bufs = s.split(";");
                ++k;
                for (int i = 0; i < bufs.length; ++i) {
                    h2[i] = bufs[i];
                }
            }
            for (int i = 0; i < h1.length; ++i) {
                header[i] = h1[i];
            }
            for (int i = 0; i < h2.length; ++i) {
                header[i + 7] = h2[i];
            }
            Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
            br1.close();
            br2.close();
            // The beginning of the method
            BufferedReader brc = new BufferedReader(new FileReader(newFile1));
            DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
            String s1 = brc.readLine();
            int q = 0;
            while (s1 != null) {
                bufs = s1.split(";");
                ++q;
                String[] find1 = {"", "", "", "", "", "", "", ""};
                String[] find2 = {"", "", "", "", ""};
                String[] res = {"", "", "", "", "", "", "", "", "", "", "", ""};
                BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                if (q != 1) {
                    for (int w = 0; w < bufs.length; ++w) {
                        find1[w] = bufs[w];
                    }
                }
                s = br4.readLine();
                while (s != null) {
                    bufs = s.split(";");
                    if (bufs[0].equals(find1[7])) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find2[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                }
                br4.close();
                if (q != 1) {
                    for (int l = 0; l < find1.length - 1; ++l) {
                        res[l] = find1[l];
                    }
                    for (int m = 0; m < find2.length; ++m) {
                        res[m + 7] = find2[m];
                    }
                    Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                    tm1.addRow(tm_2);
                }
                s1 = brc.readLine();
            }
            if (q == 0) {
                jTable1.setVisible(false);
                jTextField1.setText("Ничего не найдено");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            jTable1.setModel(tm1);
            jTable1.setVisible(rootPaneCheckingEnabled);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFrame1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmi3ActionPerformed

    private void jmi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi4ActionPerformed
        jFrame1.setVisible(false);
        jFrame1.setResizable(false);
        jFrame1.setLocation(30, 20);
        jFrame1.setTitle("Запрос 'Кассеты'");
        jFrame1.setName("Кассеты");
        DefaultTableModel empty = new DefaultTableModel(0, 0);
        jTable1.setModel(empty);
        jTable1.setVisible(true);
        jc1.setVisible(false);
        jc2.setVisible(true);
        jc2.setSelectedItem("Выберите жанр");
        jc3.setSelectedItem("Выберите год");
        jc4.setSelectedItem("Выберите актера");
        jc3.setVisible(true);
        jc4.setVisible(true);
        jc5.setVisible(false);
        jc6.setVisible(false);
        jc7.setVisible(false);
        jTable1.setVisible(false);
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
            File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
            if ((newFile1.exists() == false)) {
                jTextField1.setText("В данных категориях записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            if ((newFile2.exists() == false)) {
                jTextField1.setText("В данных категориях записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
            BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
            if (jc2.getItemCount() < 2) {
                BufferedReader brjc = new BufferedReader(new FileReader(newFile2));
                String sjc = brjc.readLine();
                sjc = brjc.readLine();
                String[] bufjc;
                jc2.addItem("Выберите жанр");
                while (sjc != null) {
                    bufjc = sjc.split(";");
                    jc2.addItem(bufjc[1]);
                    sjc = brjc.readLine();
                }
                brjc.close();
            }
            if (jc3.getItemCount() < 2) {
                BufferedReader brjc2 = new BufferedReader(new FileReader(newFile1));
                String sjc2 = brjc2.readLine();
                sjc2 = brjc2.readLine();
                String[] bufjc2;
                jc3.addItem("Выберите год");
                int u = 0;
                String mem = "";
                while (sjc2 != null) {
                    if (u == 0) {
                        bufjc2 = sjc2.split(";");
                        mem = bufjc2[2];
                        jc3.addItem(bufjc2[2]);
                        sjc2 = brjc2.readLine();
                        ++u;
                        continue;
                    }
                    bufjc2 = sjc2.split(";");
                    if (bufjc2[2].equals(mem)) {
                        sjc2 = brjc2.readLine();
                        continue;
                    }
                    mem = bufjc2[2];
                    jc3.addItem(bufjc2[2]);
                    sjc2 = brjc2.readLine();
                }
                brjc2.close();
            }
            if (jc4.getItemCount() < 2) {
                BufferedReader brjc3 = new BufferedReader(new FileReader(newFile1));
                String sjc3 = brjc3.readLine();
                sjc3 = brjc3.readLine();
                String[] bufjc3;
                jc4.addItem("Выберите актера");
                int u3 = 0;
                String mem3 = "";
                while (sjc3 != null) {
                    if (u3 == 0) {
                        bufjc3 = sjc3.split(";");
                        mem3 = bufjc3[5];
                        jc4.addItem(bufjc3[5]);
                        sjc3 = brjc3.readLine();
                        ++u3;
                        continue;
                    }
                    bufjc3 = sjc3.split(";");
                    if (bufjc3[5].equals(mem3)) {
                        sjc3 = brjc3.readLine();
                        continue;
                    }
                    mem3 = bufjc3[5];
                    jc4.addItem(bufjc3[5]);
                    sjc3 = brjc3.readLine();
                }
                brjc3.close();
            }
            String s;
            String[] bufs;
            String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
            String[] h1 = {"", "", "", "", "", "", "", "", ""};
            String[] h2 = {"", ""};
            int n = 0;
            int k = 0;
            while (n != 1) {
                s = br1.readLine();
                bufs = s.split(";");
                ++n;
                for (int i = 0; i < bufs.length; ++i) {
                    h1[i] = bufs[i];
                }
            }
            while (k != 1) {
                s = br2.readLine();
                bufs = s.split(";");
                ++k;
                for (int i = 1; i < bufs.length; ++i) {
                    h2[i - 1] = bufs[i];
                }
            }
            for (int i = 0; i < h1.length; ++i) {
                header[i] = h1[i];
            }
            for (int i = 0; i < h2.length; ++i) {
                header[i + 9] = h2[i];
            }
            Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
            br1.close();
            br2.close();
            // The beginning of the method
            BufferedReader brc = new BufferedReader(new FileReader(newFile1));
            DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
            String s1 = brc.readLine();
            int q = 0;
            while (s1 != null) {
                bufs = s1.split(";");
                ++q;
                String[] find1 = {"", "", "", "", "", "", "", "", ""};
                String[] find2 = {"", "", ""};
                String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                if (q != 1) {
                    for (int w = 0; w < bufs.length; ++w) {
                        find1[w] = bufs[w];
                    }
                }
                s = br4.readLine();
                while (s != null) {
                    bufs = s.split(";");
                    if (bufs[0].equals(find1[7])) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find2[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                }
                br4.close();
                if (q != 1) {
                    for (int l = 0; l < find1.length; ++l) {
                        res[l] = find1[l];
                    }
                    for (int m = 0; m < find2.length - 1; ++m) {
                        res[m + 9] = find2[m + 1];
                    }
                    Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                    tm1.addRow(tm_2);
                }
                s1 = brc.readLine();
            }
            if (q == 0) {
                jTable1.setVisible(false);
                jTextField1.setText("Ничего не найдено");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            jTable1.setModel(tm1);
            jTable1.setVisible(rootPaneCheckingEnabled);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFrame1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmi4ActionPerformed

    private void jmi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi5ActionPerformed
        jFrame1.setVisible(false);
        jFrame1.setResizable(false);
        jFrame1.setLocation(30, 20);
        jFrame1.setTitle("Запрос 'Кассеты на руках'");
        jFrame1.setName("Кассеты на руках");
        DefaultTableModel empty = new DefaultTableModel(0, 0);
        jTable1.setModel(empty);
        jTable1.setVisible(true);
        jc1.setVisible(false);
        jc2.setVisible(false);
        jc3.setVisible(false);
        jc4.setVisible(false);
        jc5.setVisible(true);
        jc5.setSelectedItem("Выберите клиента");
        jc6.setSelectedItem("Выберите");
        jc7.setSelectedItem("Выберите");
        jc6.setVisible(true);
        jc7.setVisible(true);
        jTable1.setVisible(false);
        try {
            File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
            File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
            if ((newFile1.exists() == false)) {
                jTextField1.setText("В данных категориях записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            if ((newFile2.exists() == false)) {
                jTextField1.setText("В данных категориях записей нет");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
            BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
            if (jc5.getItemCount() < 2) {
                BufferedReader brjc = new BufferedReader(new FileReader(newFile1));
                String sjc = brjc.readLine();
                sjc = brjc.readLine();
                String[] bufjc;
                jc5.addItem("Выберите клиента");
                while (sjc != null) {
                    bufjc = sjc.split(";");
                    jc5.addItem(bufjc[0]);
                    sjc = brjc.readLine();
                }
                brjc.close();
            }
            if (jc6.getItemCount() < 2) {
                jc6.addItem("Выберите");
                jc6.addItem("Показать оплаченные кассеты");
                jc6.addItem("Показать неоплаченные кассеты");
            }
            if (jc7.getItemCount() < 2) {
                jc7.addItem("Выберите");
                jc7.addItem("Показать сданные кассеты");
                jc7.addItem("Показать несданные кассеты");
            }
            String s;
            String[] bufs;
            String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
            String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
            String[] h2 = {"", "", "", "", "", "", "", ""};
            int n = 0;
            int k = 0;
            while (n != 1) {
                s = br1.readLine();
                bufs = s.split(";");
                ++n;
                for (int i = 0; i < bufs.length - 1; ++i) {
                    h1[i] = bufs[i];
                }
            }
            while (k != 1) {
                s = br2.readLine();
                bufs = s.split(";");
                ++k;
                for (int i = 0; i < bufs.length; ++i) {
                    h2[i] = bufs[i];
                }
            }
            for (int i = 0; i < h1.length; ++i) {
                header[i] = h1[i];
            }
            for (int i = 0; i < h2.length; ++i) {
                header[i + 11] = h2[i];
            }
            Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
            br1.close();
            br2.close();
            // The beginning of the method
            BufferedReader brc = new BufferedReader(new FileReader(newFile1));
            DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
            String s1 = brc.readLine();
            int q = 0;
            while (s1 != null) {
                bufs = s1.split(";");
                ++q;
                String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                String[] find2 = {"", "", "", "", "", "", "", ""};
                String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                if (q != 1) {
                    for (int w = 0; w < bufs.length; ++w) {
                        find1[w] = bufs[w];
                    }
                }
                s = br4.readLine();
                while (s != null) {
                    bufs = s.split(";");
                    if (bufs[0].equals(find1[11])) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find2[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                }
                br4.close();
                if (q != 1) {
                    for (int l = 0; l < find1.length - 1; ++l) {
                        res[l] = find1[l];
                    }
                    for (int m1 = 0; m1 < find2.length; ++m1) {
                        res[m1 + 11] = find2[m1];
                    }
                    Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                    tm1.addRow(tm_2);
                }
                s1 = brc.readLine();
            }
            if (q == 0) {
                jTable1.setVisible(false);
                jTextField1.setText("Ничего не найдено");
                jd.setResizable(false);
                jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                jd.setSize(100, 100);
                jd.setLocation(120, 120);
                jd.setVisible(rootPaneCheckingEnabled);
                return;
            }
            jTable1.setModel(tm1);
            jTable1.setVisible(rootPaneCheckingEnabled);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jFrame1.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jmi5ActionPerformed

    private void jc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc1ActionPerformed
        if (jc1.getSelectedItem().equals("Выберите должность")) {
            jFrame1.setVisible(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(true);
            jc1.setSelectedItem("Выберите должность");
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Должности.txt");
                if ((newFile1.exists() == false)) {
                    jTextField1.setText("В данных категориях записей нет");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    return;
                }
                if ((newFile2.exists() == false)) {
                    jTextField1.setText("В данных категориях записей нет");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    return;
                }
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 7] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length; ++m) {
                            res[m + 7] = find2[m];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        } else {
            jFrame1.setVisible(false);
            jFrame1.setLocation(30, 20);
            String find = jc1.getSelectedItem().toString();
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(true);
            jc1.setSelectedItem("Выберите должность");
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Должности.txt");
                if ((newFile1.exists() == false)) {
                    jTextField1.setText("В данных категориях записей нет");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    return;
                }
                if ((newFile2.exists() == false)) {
                    jTextField1.setText("В данных категориях записей нет");
                    jd.setResizable(false);
                    jTextField1.setHorizontalAlignment(jTextField1.CENTER);
                    jd.setSize(100, 100);
                    jd.setLocation(120, 120);
                    jd.setVisible(rootPaneCheckingEnabled);
                    return;
                }
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 7] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length; ++m) {
                            res[m + 7] = find2[m];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[8].equals(find)) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc1ActionPerformed

    private void jc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc2ActionPerformed
        if (jc2.getSelectedItem().equals("Выберите жанр")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(true);
            jc3.setVisible(true);
            jc4.setVisible(true);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 1; i < bufs.length; ++i) {
                        h2[i - 1] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 9] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length - 1; ++m) {
                            res[m + 9] = find2[m + 1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        } else {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(true);
            jc3.setVisible(true);
            jc4.setVisible(true);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            String find = jc2.getSelectedItem().toString();
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 1; i < bufs.length; ++i) {
                        h2[i - 1] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 9] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length - 1; ++m) {
                            res[m + 9] = find2[m + 1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[9].equals(find)) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc2ActionPerformed

    private void jc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc3ActionPerformed
        if (jc3.getSelectedItem().equals("Выберите год")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(true);
            jc3.setVisible(true);
            jc4.setVisible(true);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 1; i < bufs.length; ++i) {
                        h2[i - 1] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 9] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length - 1; ++m) {
                            res[m + 9] = find2[m + 1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        } else {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setSelectedItem("Выберите жанр");
            jc4.setSelectedItem("Выберите актера");
            jc2.setVisible(true);
            jc3.setVisible(true);
            jc4.setVisible(true);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            String find = jc3.getSelectedItem().toString();
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 1; i < bufs.length; ++i) {
                        h2[i - 1] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 9] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length - 1; ++m) {
                            res[m + 9] = find2[m + 1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[2].equals(find)) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc3ActionPerformed

    private void jc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc4ActionPerformed
        if (jc4.getSelectedItem().equals("Выберите актера")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(true);
            jc3.setVisible(true);
            jc4.setVisible(true);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 1; i < bufs.length; ++i) {
                        h2[i - 1] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 9] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length - 1; ++m) {
                            res[m + 9] = find2[m + 1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        } else {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setSelectedItem("Выберите жанр");
            jc3.setSelectedItem("Выберите год");
            jc2.setVisible(true);
            jc3.setVisible(true);
            jc4.setVisible(true);
            jc5.setVisible(false);
            jc6.setVisible(false);
            jc7.setVisible(false);
            jTable1.setVisible(false);
            String find = jc4.getSelectedItem().toString();
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Кассеты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Жанры.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 1; i < bufs.length; ++i) {
                        h2[i - 1] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 9] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[7])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m = 0; m < find2.length - 1; ++m) {
                            res[m + 9] = find2[m + 1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[5].equals(find)) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc4ActionPerformed

    private void jc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc5ActionPerformed
        if (jc5.getSelectedItem().equals("Выберите клиента")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc5.setSelectedItem("Выберите клиента");
            jc6.setSelectedItem("Выберите");
            jc7.setSelectedItem("Выберите");
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        } else {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc6.setSelectedItem("Выберите");
            jc7.setSelectedItem("Выберите");
            jc6.setVisible(true);
            jc7.setVisible(true);
            String find = jc5.getSelectedItem().toString();
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[0].equals(find)) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc5ActionPerformed

    private void jc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc6ActionPerformed
        if (jc6.getSelectedItem().equals("Выберите")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
        if (jc6.getSelectedItem().equals("Показать оплаченные кассеты")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc5.setSelectedItem("Выберите клиента");
            jc7.setSelectedItem("Выберите");
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[6].equals("Да")) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
        if (jc6.getSelectedItem().equals("Показать неоплаченные кассеты")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc5.setSelectedItem("Выберите клиента");
            jc7.setSelectedItem("Выберите");
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[6].equals("Нет")) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc6ActionPerformed

    private void jc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc7ActionPerformed
        if (jc7.getSelectedItem().equals("Выберите")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        tm1.addRow(tm_2);
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
        if (jc7.getSelectedItem().equals("Показать сданные кассеты")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc5.setSelectedItem("Выберите клиента");
            jc6.setSelectedItem("Выберите");
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[7].equals("Да")) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
        if (jc7.getSelectedItem().equals("Показать несданные кассеты")) {
            jFrame1.setVisible(false);
            jFrame1.setResizable(false);
            jFrame1.setLocation(30, 20);
            DefaultTableModel empty = new DefaultTableModel(0, 0);
            jTable1.setModel(empty);
            jTable1.setVisible(true);
            jc1.setVisible(false);
            jc2.setVisible(false);
            jc3.setVisible(false);
            jc4.setVisible(false);
            jc5.setVisible(true);
            jc5.setSelectedItem("Выберите клиента");
            jc6.setSelectedItem("Выберите");
            jc6.setVisible(true);
            jc7.setVisible(true);
            jTable1.setVisible(false);
            try {
                File newFile1 = new File("\\Файлы для работы с БД Видео проката", "Клиенты.txt");
                File newFile2 = new File("\\Файлы для работы с БД Видео проката", "Сотрудники.txt");
                BufferedReader br1 = new BufferedReader(new FileReader(newFile1));
                BufferedReader br2 = new BufferedReader(new FileReader(newFile2));
                String s;
                String[] bufs;
                String[] header = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                String[] h1 = {"", "", "", "", "", "", "", "", "", "", ""};
                String[] h2 = {"", "", "", "", "", "", "", ""};
                int n = 0;
                int k = 0;
                while (n != 1) {
                    s = br1.readLine();
                    bufs = s.split(";");
                    ++n;
                    for (int i = 0; i < bufs.length - 1; ++i) {
                        h1[i] = bufs[i];
                    }
                }
                while (k != 1) {
                    s = br2.readLine();
                    bufs = s.split(";");
                    ++k;
                    for (int i = 0; i < bufs.length; ++i) {
                        h2[i] = bufs[i];
                    }
                }
                for (int i = 0; i < h1.length; ++i) {
                    header[i] = h1[i];
                }
                for (int i = 0; i < h2.length; ++i) {
                    header[i + 11] = h2[i];
                }
                Vector<String> tm_1 = new Vector<String>(Arrays.asList(header));
                br1.close();
                br2.close();
                // The beginning of the method
                BufferedReader brc = new BufferedReader(new FileReader(newFile1));
                DefaultTableModel tm1 = new DefaultTableModel(tm_1, 0);
                String s1 = brc.readLine();
                int q = 0;
                while (s1 != null) {
                    bufs = s1.split(";");
                    ++q;
                    String[] find1 = {"", "", "", "", "", "", "", "", "", "", "", ""};
                    String[] find2 = {"", "", "", "", "", "", "", ""};
                    String[] res = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
                    BufferedReader br4 = new BufferedReader(new FileReader(newFile2));
                    if (q != 1) {
                        for (int w = 0; w < bufs.length; ++w) {
                            find1[w] = bufs[w];
                        }
                    }
                    s = br4.readLine();
                    while (s != null) {
                        bufs = s.split(";");
                        if (bufs[0].equals(find1[11])) {
                            for (int w = 0; w < bufs.length; ++w) {
                                find2[w] = bufs[w];
                            }
                        }
                        s = br4.readLine();
                    }
                    br4.close();
                    if (q != 1) {
                        for (int l = 0; l < find1.length - 1; ++l) {
                            res[l] = find1[l];
                        }
                        for (int m1 = 0; m1 < find2.length; ++m1) {
                            res[m1 + 11] = find2[m1];
                        }
                        Vector<String> tm_2 = new Vector<String>(Arrays.asList(res));
                        if (res[7].equals("Нет")) {
                            tm1.addRow(tm_2);
                        }
                    }
                    s1 = brc.readLine();
                }
                jTable1.setModel(tm1);
                jTable1.setVisible(rootPaneCheckingEnabled);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
            jFrame1.setVisible(rootPaneCheckingEnabled);
        }
    }//GEN-LAST:event_jc7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        com.jtattoo.plaf.hifi.HiFiLookAndFeel
//        com.jtattoo.plaf.noire.NoireLookAndFeel
        try {
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
////            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////
////                }
////            }
//            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");
//        } catch (Cl//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
////                if ("Nimbus".equals(info.getName())) {
////                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
////                    break;
////
////                }
////            }
//            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }assNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Frame.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Frame().setVisible(true);
            }
        }
        );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame f1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jb;
    private javax.swing.JComboBox<String> jc;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JComboBox<String> jc2;
    private javax.swing.JComboBox<String> jc3;
    private javax.swing.JComboBox<String> jc4;
    private javax.swing.JComboBox<String> jc5;
    private javax.swing.JComboBox<String> jc6;
    private javax.swing.JComboBox<String> jc7;
    private javax.swing.JDialog jd;
    private javax.swing.JMenu jm1;
    private javax.swing.JMenu jm2;
    private javax.swing.JMenu jm3;
    private javax.swing.JMenu jm4;
    private javax.swing.JMenu jm5;
    private javax.swing.JMenu jm6;
    private javax.swing.JMenu jm7;
    private javax.swing.JMenuItem jmi1;
    private javax.swing.JMenuItem jmi10;
    private javax.swing.JMenuItem jmi2;
    private javax.swing.JMenuItem jmi3;
    private javax.swing.JMenuItem jmi4;
    private javax.swing.JMenuItem jmi5;
    private javax.swing.JMenuItem jmi6;
    private javax.swing.JMenuItem jmi7;
    private javax.swing.JMenuItem jmi8;
    private javax.swing.JMenuItem jmi9;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt10;
    private javax.swing.JTextField jt11;
    private javax.swing.JTextField jt12;
    private javax.swing.JTextField jt13;
    private javax.swing.JTextField jt14;
    private javax.swing.JTextField jt15;
    private javax.swing.JTextField jt16;
    private javax.swing.JTextField jt17;
    private javax.swing.JTextField jt18;
    private javax.swing.JTextField jt19;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt20;
    private javax.swing.JTextField jt21;
    private javax.swing.JTextField jt22;
    private javax.swing.JTextField jt23;
    private javax.swing.JTextField jt24;
    private javax.swing.JTextField jt25;
    private javax.swing.JTextField jt3;
    private javax.swing.JTextField jt4;
    private javax.swing.JTextField jt5;
    private javax.swing.JTextField jt6;
    private javax.swing.JTextField jt7;
    private javax.swing.JTextField jt8;
    private javax.swing.JTextField jt9;
    // End of variables declaration//GEN-END:variables
}
