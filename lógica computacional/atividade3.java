public static void main(String[] args) {
        volPrisma();
        alturaPrisma();
        areaPrisma();
        areatotalPrisma();
        
    }
    public static void volPrisma(){
        JOptionPane.showMessageDialog(null, "Calculando volume do prisma");
        double ab = Double.parseDouble(JOptionPane.showInputDialog("Área da base"));
        double h = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
        JOptionPane.showMessageDialog(null, ab*h);
        
    }
    public static void alturaPrisma(){
        JOptionPane.showMessageDialog(null, "Calculando altura do prisma");
        double ab = Double.parseDouble(JOptionPane.showInputDialog("Volume"));
        double v = Double.parseDouble(JOptionPane.showInputDialog("Área da base"));
        JOptionPane.showMessageDialog(null, v/ab);
    }
    public static void areaPrisma(){
        JOptionPane.showMessageDialog(null, "Calculando área da base do prisma");
        double h = Double.parseDouble(JOptionPane.showInputDialog("Volume"));
        double v = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
        JOptionPane.showMessageDialog(null, v/h);
    }
    public static void areatotalPrisma(){
        JOptionPane.showMessageDialog(null, "Calculando área total do prisma");
        double ab = Double.parseDouble(JOptionPane.showInputDialog("Área da base"));
        double N = Double.parseDouble(JOptionPane.showInputDialog("Número de faces laterais"));
        double af = Double.parseDouble(JOptionPane.showInputDialog("Área da face lateral"));
        JOptionPane.showMessageDialog(null, 2*ab+N*af);
    }
}


