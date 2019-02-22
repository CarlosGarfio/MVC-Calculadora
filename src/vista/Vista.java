package vista;

public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        C = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        DIVIDE = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        MULTIPLY = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        SUB = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        BP = new javax.swing.JButton();
        EQUALS = new javax.swing.JButton();
        ADD = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(300, 400));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(5, 4));

        C.setText("C");
        jPanel2.add(C);

        B7.setText("7");
        jPanel2.add(B7);

        B8.setText("8");
        jPanel2.add(B8);

        B9.setText("9");
        jPanel2.add(B9);

        DIVIDE.setText("/");
        jPanel2.add(DIVIDE);

        B4.setText("4");
        jPanel2.add(B4);

        B5.setText("5");
        jPanel2.add(B5);

        B6.setText("6");
        jPanel2.add(B6);

        MULTIPLY.setText("*");
        jPanel2.add(MULTIPLY);

        B1.setText("1");
        jPanel2.add(B1);

        B2.setText("2");
        jPanel2.add(B2);

        B3.setText("3");
        jPanel2.add(B3);

        SUB.setText("-");
        jPanel2.add(SUB);

        B0.setText("0");
        jPanel2.add(B0);

        BP.setText(".");
        jPanel2.add(BP);

        EQUALS.setText("=");
        jPanel2.add(EQUALS);

        ADD.setText("+");
        jPanel2.add(ADD);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ADD;
    public javax.swing.JButton B0;
    public javax.swing.JButton B1;
    public javax.swing.JButton B2;
    public javax.swing.JButton B3;
    public javax.swing.JButton B4;
    public javax.swing.JButton B5;
    public javax.swing.JButton B6;
    public javax.swing.JButton B7;
    public javax.swing.JButton B8;
    public javax.swing.JButton B9;
    public javax.swing.JButton BP;
    public javax.swing.JButton C;
    public javax.swing.JButton DIVIDE;
    public javax.swing.JButton EQUALS;
    public javax.swing.JButton MULTIPLY;
    public javax.swing.JButton SUB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
