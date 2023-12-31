package view;

import controller.StudentManagerController;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Province;
import model.Student;
import model.StudentManagerModel;

public class StudentManagerView extends javax.swing.JFrame {

    public StudentManagerModel model;
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_filter;
    private javax.swing.JButton jButton_cancelFilter;
    private javax.swing.JButton jButton_insert;
    private javax.swing.JButton jButton_save;
    public javax.swing.JComboBox<String> jComboBox_birth;
    private javax.swing.JComboBox<String> jComboBox_birthPlace;
    private javax.swing.JLabel jLabel_birth;
    private javax.swing.JLabel jLabel_birthPlace;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_listStudent;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_score1;
    private javax.swing.JLabel jLabel_score2;
    private javax.swing.JLabel jLabel_score3;
    private javax.swing.JLabel jLabel_studentID;
    private javax.swing.JLabel jLabel_studentInfo;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_open;
    private javax.swing.JMenuItem jMenuItem_save;
    private javax.swing.JMenuItem jMenuItem_exit;
    private javax.swing.JMenuItem jMenuItem_about;
    private javax.swing.JPanel jPanel_body;
    private javax.swing.JPanel jPanel_content;
    private javax.swing.JPanel jPanel_foot;
    private javax.swing.JPanel jPanel_header;
    public javax.swing.JRadioButton jRadioButton_female;
    public javax.swing.JRadioButton jRadioButton_male;
    public ButtonGroup btn_gender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField_date;
    public javax.swing.JTextField jTextField_id;
    public javax.swing.JTextField jTextField_name;
    public javax.swing.JTextField jTextField_score1;
    public javax.swing.JTextField jTextField_score2;
    public javax.swing.JTextField jTextField_score3;
    public javax.swing.JTextField jTextField_studentID;
    public javax.swing.JTextField jTextField_total;

    private int currentRow = 0;

    public StudentManagerView() {
        this.model = new StudentManagerModel();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Student Management App");
        URL url = getClass().getResource("icon.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);
        this.setIconImage(img);
        this.setVisible(true);
    }

    private void initComponents() {
        jPanel_content = new javax.swing.JPanel();
        jPanel_header = new javax.swing.JPanel();
        jLabel_birthPlace = new javax.swing.JLabel();
        jLabel_studentID = new javax.swing.JLabel();
        jTextField_studentID = new javax.swing.JTextField();
        jButton_filter = new javax.swing.JButton();
        jButton_cancelFilter = new javax.swing.JButton();
        jComboBox_birthPlace = new javax.swing.JComboBox<>();
        jPanel_body = new javax.swing.JPanel();
        jLabel_listStudent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel_foot = new javax.swing.JPanel();
        jLabel_studentInfo = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();
        jTextField_id = new javax.swing.JTextField();
        jLabel_name = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jLabel_birth = new javax.swing.JLabel();
        jComboBox_birth = new javax.swing.JComboBox<>();
        jLabel_date = new javax.swing.JLabel();
        jTextField_date = new javax.swing.JTextField();
        jLabel_gender = new javax.swing.JLabel();
        jRadioButton_male = new javax.swing.JRadioButton();
        jRadioButton_female = new javax.swing.JRadioButton();
        jTextField_score1 = new javax.swing.JTextField();
        jLabel_score2 = new javax.swing.JLabel();
        jTextField_score2 = new javax.swing.JTextField();
        jLabel_score3 = new javax.swing.JLabel();
        jTextField_score3 = new javax.swing.JTextField();
        jLabel_score1 = new javax.swing.JLabel();
        jLabel_total = new javax.swing.JLabel();
        jTextField_total = new javax.swing.JTextField();
        jButton_insert = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_save = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_open = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_save = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_about = new javax.swing.JMenuItem();

        ActionListener ac = new StudentManagerController(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_content.setBackground(new java.awt.Color(239, 255, 253));

        jPanel_header.setBackground(new java.awt.Color(205, 252, 246));
        jPanel_header.setForeground(new java.awt.Color(0, 0, 0));

        jLabel_birthPlace.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_birthPlace.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_birthPlace.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_birthPlace.setText("BirthPlace");

        jLabel_studentID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_studentID.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_studentID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_studentID.setText("StudentID");

        jTextField_studentID.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_studentID.setForeground(new java.awt.Color(51, 51, 51));

        jButton_filter.setBackground(new java.awt.Color(20, 30, 97));
        jButton_filter.addActionListener(ac);
        jButton_filter.setForeground(new java.awt.Color(255, 255, 255));
        jButton_filter.setText("Filter");

        ArrayList<Province> listProvince = Province.getListProvinceList();
        jComboBox_birthPlace.addItem("");
        for (Province p : listProvince) {
            jComboBox_birthPlace.addItem(p.getNameProvince());
        }
        jComboBox_birthPlace.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_birthPlace.setForeground(new java.awt.Color(0, 0, 0));

        jButton_cancelFilter.setBackground(new java.awt.Color(20, 30, 97));
        jButton_cancelFilter.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancelFilter.addActionListener(ac);
        jButton_cancelFilter.setText("Cancel Filter");

        javax.swing.GroupLayout jPanel_headerLayout = new javax.swing.GroupLayout(jPanel_header);
        jPanel_header.setLayout(jPanel_headerLayout);
        jPanel_headerLayout.setHorizontalGroup(
                jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_headerLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel_birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 187,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 181,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jButton_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 83,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_cancelFilter)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_headerLayout.setVerticalGroup(
                jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel_headerLayout.createSequentialGroup()
                                .addContainerGap(28, Short.MAX_VALUE)
                                .addGroup(jPanel_headerLayout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox_birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton_cancelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
        );

        jPanel_body.setBackground(new java.awt.Color(188, 206, 248));

        jLabel_listStudent.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabel_listStudent.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_listStudent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_listStudent.setText("List Student");

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"No", "ID", "Name", "Place", "Date", "Sex", "Score1", "Score2", "Score3"}));
        this.setSizeColumn();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        this.setSizeRow();
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel_bodyLayout = new javax.swing.GroupLayout(jPanel_body);
        jPanel_body.setLayout(jPanel_bodyLayout);
        jPanel_bodyLayout.setHorizontalGroup(
                jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        jPanel_bodyLayout.createSequentialGroup().addGap(20, 20, 20).addGroup(
                                        jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel_listStudent)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel_bodyLayout.setVerticalGroup(
                jPanel_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        jPanel_bodyLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_listStudent).addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240,
                                        javax.swing.GroupLayout.PREFERRED_SIZE).addGap(81, 81, 81)));

        jPanel_foot.setBackground(new java.awt.Color(125, 229, 237));

        jLabel_studentInfo.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabel_studentInfo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_studentInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_studentInfo.setText("Student Info");

        jLabel_id.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_id.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_id.setText("ID");

        jTextField_id.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_id.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_id.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_id.setOpaque(true);

        jLabel_name.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_name.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_name.setText("Name");

        jTextField_name.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_name.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_name.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_name.setOpaque(true);

        jLabel_birth.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_birth.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_birth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_birth.setText("BirthPlace");

        jComboBox_birth.addItem("");
        for (Province p : listProvince) {
            jComboBox_birth.addItem(p.getNameProvince());
        }
        ;
        jComboBox_birth.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox_birth.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jComboBox_birth.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox_birth.setOpaque(true);

        jLabel_date.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_date.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_date.setText("Date");

        jTextField_date.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_date.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_date.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_date.setOpaque(true);

        jLabel_gender.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_gender.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_gender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_gender.setText("ID");

        jRadioButton_male.setBackground(new java.awt.Color(125, 229, 237));
        jRadioButton_male.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton_male.setText("Male");

        jRadioButton_female.setBackground(new java.awt.Color(125, 229, 237));
        jRadioButton_female.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton_female.setText("Female");

        btn_gender = new ButtonGroup();
        btn_gender = new ButtonGroup();
        btn_gender.add(jRadioButton_male);
        btn_gender.add(jRadioButton_female);

        jTextField_score1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_score1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_score1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_score1.setOpaque(true);

        jLabel_score2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_score2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_score2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_score2.setText("Score2");

        jTextField_score2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_score2.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_score2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_score2.setOpaque(true);

        jLabel_score3.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_score3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_score3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_score3.setText("Score3");

        jTextField_score3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_score3.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_score3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_score3.setOpaque(true);

        jLabel_score1.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_score1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_score1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_score1.setText("Score1");

        jLabel_total.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel_total.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_total.setText("Total");

        jTextField_total.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_total.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jTextField_total.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_total.setOpaque(true);
        jTextField_total.setEditable(false);
        jTextField_total.setFocusable(false);

        jButton_insert.setBackground(new java.awt.Color(20, 30, 97));
        jButton_insert.addActionListener(ac);
        jButton_insert.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButton_insert.setForeground(new java.awt.Color(255, 255, 255));
        jButton_insert.setText("Insert");
        jButton_insert.setPreferredSize(new java.awt.Dimension(100, 26));

        jButton_delete.setBackground(new java.awt.Color(20, 30, 97));
        jButton_delete.addActionListener(ac);
        jButton_delete.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButton_delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_delete.setText("Delete");
        jButton_delete.setPreferredSize(new java.awt.Dimension(100, 26));

        jButton_edit.setBackground(new java.awt.Color(20, 30, 97));
        jButton_edit.addActionListener(ac);
        jButton_edit.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButton_edit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_edit.setText("Edit");

        jButton_save.setBackground(new java.awt.Color(20, 30, 97));
        jButton_save.addActionListener(ac);
        jButton_save.setActionCommand("Save data");
        jButton_save.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setText("Save");
        jButton_save.setPreferredSize(new java.awt.Dimension(100, 26));

        jButton_cancel.setBackground(new java.awt.Color(20, 30, 97));
        jButton_cancel.addActionListener(ac);
        jButton_cancel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jButton_cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancel.setText("Cancel");
        jButton_cancel.setPreferredSize(new java.awt.Dimension(100, 26));

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel_footLayout = new javax.swing.GroupLayout(jPanel_foot);
        jPanel_foot.setLayout(jPanel_footLayout);
        jPanel_footLayout.setHorizontalGroup(
                jPanel_footLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        jPanel_footLayout.createSequentialGroup().addGap(22, 22, 22).addGroup(
                                jPanel_footLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel_footLayout.createSequentialGroup()
                                                .addComponent(jButton_insert, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        105, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(63, 63, 63)
                                                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        105, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(59, 59, 59)
                                                .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE).addGap(72, 72, 72)
                                                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE).addGap(56, 56, 56)
                                                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel_footLayout.createSequentialGroup().addGroup(
                                                        jPanel_footLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jSeparator3,
                                                                        javax.swing.GroupLayout.Alignment.TRAILING).addGroup(
                                                                        jPanel_footLayout.createSequentialGroup().addGroup(
                                                                                        jPanel_footLayout.createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(
                                                                                                        jPanel_footLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel_name,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        85, Short.MAX_VALUE)
                                                                                                                .addGap(49, 49, 49)
                                                                                                                .addComponent(jTextField_name,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        199,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(
                                                                                                        jPanel_footLayout.createSequentialGroup()
                                                                                                                .addGroup(
                                                                                                                        jPanel_footLayout.createParallelGroup(
                                                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(
                                                                                                                                        jLabel_date,
                                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                        85,
                                                                                                                                        Short.MAX_VALUE)
                                                                                                                                .addComponent(
                                                                                                                                        jLabel_birth,
                                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                        85,
                                                                                                                                        Short.MAX_VALUE))
                                                                                                                .addGap(49, 49, 49).addGroup(
                                                                                                                        jPanel_footLayout.createParallelGroup(
                                                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(
                                                                                                                                        jTextField_date,
                                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                        198,
                                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(
                                                                                                                                        jComboBox_birth,
                                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                        198,
                                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addComponent(jLabel_studentInfo).addGroup(
                                                                                                        jPanel_footLayout.createSequentialGroup()
                                                                                                                .addComponent(jLabel_id,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        85, Short.MAX_VALUE)
                                                                                                                .addGap(49, 49, 49)
                                                                                                                .addComponent(jTextField_id,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        199,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(125, 125, 125).addGroup(
                                                                                        jPanel_footLayout.createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel_gender,
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        88, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel_score1,
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        88, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel_score2,
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        88, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel_score3,
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        88, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel_total,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        88, Short.MAX_VALUE)).addGap(48, 48, 48)
                                                                                .addGroup(jPanel_footLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(
                                                                                                jPanel_footLayout.createSequentialGroup()
                                                                                                        .addComponent(jRadioButton_male,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(
                                                                                                                jRadioButton_female,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                        .addGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel_footLayout.createSequentialGroup()
                                                                                                        .addGroup(
                                                                                                                jPanel_footLayout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.CENTER)
                                                                                                                        .addComponent(
                                                                                                                                jTextField_score1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                99,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(
                                                                                                                                jTextField_score2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                99,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(
                                                                                                                                jTextField_score3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                99,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                        .addComponent(
                                                                                                                                jTextField_total,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                99,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGap(87, 87, 87)))))
                                                .addGap(23, 23, 23)))));

        jPanel_footLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[]{jComboBox_birth, jTextField_date, jTextField_id, jTextField_name});

        jPanel_footLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[]{jTextField_score1, jTextField_score2, jTextField_score3, jTextField_total});

        jPanel_footLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
                new java.awt.Component[]{jButton_cancel, jButton_delete, jButton_edit, jButton_insert, jButton_save});

        jPanel_footLayout.setVerticalGroup(
                jPanel_footLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        jPanel_footLayout.createSequentialGroup().addComponent(jLabel_studentInfo).addGap(17, 17, 17)
                                .addGroup(jPanel_footLayout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE).addGroup(
                                                jPanel_footLayout.createSequentialGroup().addGap(1, 1, 1)
                                                        .addComponent(jLabel_id, javax.swing.GroupLayout.DEFAULT_SIZE, 35,
                                                                Short.MAX_VALUE)).addGroup(
                                                jPanel_footLayout.createSequentialGroup().addGap(1, 1, 1)
                                                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(
                                                jPanel_footLayout.createSequentialGroup().addGap(6, 6, 6).addGroup(
                                                        jPanel_footLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jRadioButton_male,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jRadioButton_female,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel_footLayout.createSequentialGroup().addGap(1, 1, 1)
                                                .addComponent(jLabel_gender, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(
                                        jPanel_footLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel_footLayout.createSequentialGroup().addGap(18, 18, 18)
                                                        .addGroup(jPanel_footLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE).addGroup(
                                                                jPanel_footLayout.createSequentialGroup()
                                                                        .addGap(1, 1, 1).addComponent(jLabel_name,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 35,
                                                                                Short.MAX_VALUE)).addGroup(
                                                                jPanel_footLayout.createSequentialGroup()
                                                                        .addGap(1, 1, 1).addComponent(jTextField_name,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(jPanel_footLayout.createSequentialGroup().addGap(8, 8, 8)
                                                        .addGroup(jPanel_footLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE).addGroup(
                                                                        jPanel_footLayout.createSequentialGroup()
                                                                                .addGap(1, 1, 1).addComponent(jLabel_score1,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        Short.MAX_VALUE))
                                                                .addComponent(jTextField_score1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(10, 10, 10))).addGroup(
                                        jPanel_footLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel_footLayout.createSequentialGroup().addGap(2, 2, 2).addGroup(
                                                                jPanel_footLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField_score2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel_score2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 28,
                                                                                Short.MAX_VALUE)).addGroup(
                                                                jPanel_footLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                                                jPanel_footLayout.createSequentialGroup().addGap(16, 16, 16)
                                                                                        .addComponent(jTextField_score3,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel_footLayout.createSequentialGroup()
                                                                                .addGap(18, 18, 18).addComponent(jLabel_score3,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 29,
                                                                                        Short.MAX_VALUE))).addGap(18, 18, 18).addGroup(
                                                                jPanel_footLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE).addGroup(
                                                                        jPanel_footLayout.createSequentialGroup().addGap(1, 1, 1)
                                                                                .addComponent(jLabel_total,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 28,
                                                                                        Short.MAX_VALUE)).addGroup(
                                                                        jPanel_footLayout.createSequentialGroup().addGap(1, 1, 1)
                                                                                .addComponent(jTextField_total,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(15, 15, 15)).addGroup(jPanel_footLayout.createSequentialGroup()
                                                        .addGroup(jPanel_footLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                                                jPanel_footLayout.createSequentialGroup().addGap(18, 18, 18)
                                                                        .addComponent(jLabel_birth,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGap(51, 51, 51)).addGroup(
                                                                jPanel_footLayout.createSequentialGroup().addGap(24, 24, 24)
                                                                        .addComponent(jComboBox_birth,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 0, Short.MAX_VALUE)).addGroup(
                                                                jPanel_footLayout.createSequentialGroup().addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(
                                                                        jPanel_footLayout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel_date,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextField_date,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGap(39, 39, 39)))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(
                                        jPanel_footLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                                .addComponent(jButton_cancel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton_insert, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jButton_edit)
                                                .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(9, 9, 9)));

        jPanel_footLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                new java.awt.Component[]{jComboBox_birth, jTextField_date, jTextField_id, jTextField_name});

        jPanel_footLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                new java.awt.Component[]{jTextField_score1, jTextField_score2, jTextField_score3, jTextField_total});

        jPanel_footLayout.linkSize(javax.swing.SwingConstants.VERTICAL,
                new java.awt.Component[]{jButton_cancel, jButton_delete, jButton_edit, jButton_insert, jButton_save});

        javax.swing.GroupLayout jPanel_contentLayout = new javax.swing.GroupLayout(jPanel_content);
        jPanel_content.setLayout(jPanel_contentLayout);
        jPanel_contentLayout.setHorizontalGroup(
                jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel_header, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_body, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_foot, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        jPanel_contentLayout.setVerticalGroup(
                jPanel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        jPanel_contentLayout.createSequentialGroup()
                                .addComponent(jPanel_header, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel_body, javax.swing.GroupLayout.PREFERRED_SIZE, 316,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel_foot, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        getContentPane().add(jPanel_content, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(250, 247, 240));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 20));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 15));

        jMenuItem_open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_open.addActionListener(ac);
        jMenuItem_open.setBackground(new java.awt.Color(250, 247, 240));
        jMenuItem_open.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenuItem_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("open.png")));
        jMenuItem_open.setText("Open");

        jMenu1.add(jMenuItem_open);

        jSeparator1.setBackground(new java.awt.Color(250, 247, 240));
        jMenu1.add(jSeparator1);

        jMenuItem_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem_save.addActionListener(ac);
        jMenuItem_save.setActionCommand("Save file");
        jMenuItem_save.setBackground(new java.awt.Color(250, 247, 240));
        jMenuItem_save.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenuItem_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("close.png")));
        jMenuItem_save.setText("Save");
        jMenu1.add(jMenuItem_save);
        jMenu1.add(jSeparator2);

        jMenuItem_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4,
                java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem_exit.addActionListener(ac);
        jMenuItem_exit.setBackground(new java.awt.Color(250, 247, 240));
        jMenuItem_exit.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenuItem_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("exit.png")));
        jMenuItem_exit.setText("Exit");
        jMenu1.add(jMenuItem_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14));

        jMenuItem_about.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jMenuItem_about.addActionListener(ac);
        jMenuItem_about.setText("About me");
        jMenu2.add(jMenuItem_about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }

    public void deleteInfo() {
        jTextField_date.setText("");
        jTextField_id.setText("");
        jTextField_name.setText("");
        jTextField_score1.setText("");
        jTextField_score2.setText("");
        jTextField_score3.setText("");
        jTextField_total.setText("");
        jComboBox_birth.setSelectedIndex(-1);
        btn_gender.clearSelection();

    }

    public void insertIntoTable(Student student) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        if (!this.model.checkExists(student)) {
            this.model.insertStudent(student);
            this.addTable(student);
        } else {
            Student oldStudent = getStudentIsSelected();
            if (oldStudent != null) {
                // Tìm và cập nhật student trong list
                int idOld = -1;
                for (int i = 0; i < this.model.listStudent.size(); i++) {
                    if (this.model.listStudent.get(i).getId() == oldStudent.getId()) {
                        idOld = i;
                        this.model.listStudent.set(i, student); // Cập nhật student trong list
                        break;
                    }
                }

                if (idOld >= 0) {
                    // Cập nhật dữ liệu trong bảng
                    tableModel.setValueAt(student.getId(), idOld, 1);
                    tableModel.setValueAt(student.getName(), idOld, 2);
                    tableModel.setValueAt(student.getBirthPlace().getNameProvince(), idOld, 3);
                    tableModel.setValueAt(student.formatDate(), idOld, 4);
                    tableModel.setValueAt((student.isGender() ? "Male" : "Female"), idOld, 5);
                    tableModel.setValueAt(student.getScore1(), idOld, 6);
                    tableModel.setValueAt(student.getScore2(), idOld, 7);
                    tableModel.setValueAt(student.getScore3(), idOld, 8);
                }
            }
        }
    }

    public void addTable(Student student) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            currentRow++;
            tableModel.addRow(new Object[]{
                    currentRow + "",
                    student.getId() + "",
                    student.getName(),
                    student.getBirthPlace().getNameProvince(),
                    student.formatDate(),
                    (student.isGender() ? "Male" : "Female"),
                    student.getScore1() + "",
                    student.getScore2() + "",
                    student.getScore3() + ""
            });
        }

    public String setTotal(Student student) {
        String s = student.total() + "";
        return s;
    }

    public void displayStudentSelected() {
        Student st = getStudentIsSelected();
        this.jTextField_id.setText(st.getId() + "");
        this.jTextField_name.setText(st.getName());
        this.jComboBox_birth.setSelectedItem(st.getBirthPlace().getNameProvince());
        if (st.isGender()) {
            jRadioButton_male.setSelected(true);
        } else {
            jRadioButton_female.setSelected(true);
        }
        this.jTextField_date.setText(st.formatDate());
        this.jTextField_score1.setText(st.getScore1() + "");
        this.jTextField_score2.setText(st.getScore2() + "");
        this.jTextField_score3.setText(st.getScore3() + "");
    }

    public void setSizeColumn() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int numColumns = tableModel.getColumnCount();
        int[] columnWidths = {50, 100, 200, 200, 200, 100, 90, 90, 90}; // Đặt kích thước theo ý muốn
        for (int i = 0; i < numColumns; i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(columnWidths[i]);
        }
    }

    public void setSizeRow() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                final java.awt.Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected,
                        hasFocus, row, column);

                table.setRowHeight(row, 30);
                return cellComponent;
            }
        };

        jTable1.getColumnModel().getColumn(0).setCellRenderer(renderer);
    }

    public Student getStudentIsSelected() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int row_selected = jTable1.getSelectedRow();
        if (row_selected == -1) {
            // Nếu chưa chọn hàng, hiển thị thông báo lỗi
            JOptionPane.showMessageDialog(this, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        int id = Integer.valueOf(tableModel.getValueAt(row_selected, 1).toString());
        String name = tableModel.getValueAt(row_selected, 2) + "";
        Province province = Province.getProvinceByName(tableModel.getValueAt(row_selected, 3) + "");
        String dateText = tableModel.getValueAt(row_selected, 4).toString();
        LocalDate dob = LocalDate.parse(dateText, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String text_gender = tableModel.getValueAt(row_selected, 5).toString();
        boolean gender = text_gender.equals("Male");
        Float score1 = Float.valueOf(tableModel.getValueAt(row_selected, 6) + "");
        Float score2 = Float.valueOf(tableModel.getValueAt(row_selected, 7) + "");
        Float score3 = Float.valueOf(tableModel.getValueAt(row_selected, 8) + "");
        Student st = new Student(id, name, province, dob, gender, score1, score2, score3);
        return st;

    }

    public void deleteStudent() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int row_selected = jTable1.getSelectedRow();
        int choose = JOptionPane.showConfirmDialog(this, "Are you sure to delete row selected");
        if (choose == JOptionPane.YES_OPTION) {
            Student st = getStudentIsSelected();
            this.model.deleteStudent(st);
            tableModel.removeRow(row_selected);
            currentRow--;
        }
    }

    public void getDataFromInput() {
        int id = Integer.valueOf(this.jTextField_id.getText());
        String name = this.jTextField_name.getText();
        int birthPlace = this.jComboBox_birth.getSelectedIndex();
        Province province = Province.getProvinceById(birthPlace - 1);//do có phần rỗng ko hiện
        String dateText = this.jTextField_date.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(dateText, formatter);
        boolean gender = true;
        if (this.jRadioButton_male.isSelected()) {
            gender = true;
        } else if (this.jRadioButton_female.isSelected()) {
            gender = false;
        }
        Float score1 = Float.valueOf(this.jTextField_score1.getText());
        Float score2 = Float.valueOf(this.jTextField_score2.getText());
        Float score3 = Float.valueOf(this.jTextField_score3.getText());

        Student student = new Student(id, name, province, dob, gender, score1, score2, score3);
        this.insertIntoTable(student);
        this.jTextField_total.setText(this.setTotal(student));
    }

    public void filterStudent() {
        //goi hàm hủy tìm kiém
        this.cancelFilter();
        //tìm kiếm
        int birthPlace = this.jComboBox_birthPlace.getSelectedIndex() - 1;
        String mssv = this.jTextField_studentID.getText();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int row = tableModel.getRowCount();
        Set<Integer>idNeedDelete=new TreeSet<Integer>();
        if (birthPlace >= 0) {
        Province p = Province.getProvinceById(birthPlace);
            for (int i = 0; i < row; i++) {
                String namePlace = tableModel.getValueAt(i, 3) + "";
                String id=tableModel.getValueAt(i,1)+"";
                if (!namePlace.equals(p.getNameProvince())) {
                    idNeedDelete.add(Integer.valueOf(id));

                }

            }
        }
        if(mssv.length() > 0){
            for (int i = 0; i < row; i++) {
                String id=tableModel.getValueAt(i,1)+"";
                if (!id.contains(mssv)) {
                    idNeedDelete.add(Integer.valueOf(id));
                }
            }

        }
        for (Integer id: idNeedDelete) {
            row=tableModel.getRowCount();
            for (int i = 0; i < row; i++) {
                String idInTable=tableModel.getValueAt(i,1)+"";
                if (idInTable.equals(id.toString())) {
                    try {
                        tableModel.removeRow(i);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
            }

        }
    }
    public void cancelFilter() {
        while(true){
            DefaultTableModel tableModel=(DefaultTableModel) jTable1.getModel();
            int rowCount=tableModel.getRowCount();
            if(rowCount==0){
                currentRow=0;
                break;
            }else {
                tableModel.removeRow(0);
                currentRow--;
            }
        }
        for (Student st :this.model.getListStudent()) {
            this.addTable(st);
        }
    }

    public void displayAbout() {
        JOptionPane.showMessageDialog(this, "Student Management App about Nguyen Cong Sang", "Copyrights",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void exitProgram() {
        int choose=JOptionPane.showConfirmDialog(this,"Are you sure to exit program ?","Exit",
                JOptionPane.YES_NO_OPTION);
        if(choose==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }
    public void save(String path) {
        try {
            this.model.setNameFile(path);
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            for(Student st:this.model.getListStudent()){
                oos.writeObject(st);
            }
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveFile()  {
            if(this.model.getNameFile().length()>0){
                save(this.model.getNameFile());
            }else {
                JFileChooser fc=new JFileChooser();
                int returnVal=fc.showSaveDialog(this);
                if(returnVal==JFileChooser.APPROVE_OPTION){
                    File file=fc.getSelectedFile();
                    save(file.getAbsolutePath());
                }
            }
    }
    public void openF(File file) {
        ArrayList<Student> list = new ArrayList<Student>();

        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof Student) {
                    Student student = (Student) obj;
                    list.add(student);
                }
            }
        } catch (EOFException e) {
            // Đọc hết tệp, không cần xử lý gì.
        } catch (Exception e) {
            throw new RuntimeException("Error while reading file: " + e.getMessage());
        }

        this.model.setListStudent(list);
    }



    public void openFile() {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                    openF(file);
                this.cancelFilter();
            }
    }
}

