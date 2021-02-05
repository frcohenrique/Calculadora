package viewCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcView {
    private JPanel CalcPanel;
    private JTextField fieldFNumber;
    private JLabel labelFNumber;
    private JTextField fieldSNumber;
    private JLabel labelSNumber;
    private JButton btnSomar;
    private JButton botaoDesativado;
    private JButton btnDividir;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;
    private JLabel labelResult;

    /**
     * Variaveis
     */
    public static int fNumber, sNumber, resultado;


    public CalcView() {
        /**
         * Botão somar
         */
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SomaCalc();
            }
        });

        /**
         * Botão subtrair
         */
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubtrairCalc();
            }
        });

        /**
         * Botão dividir
         */
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DividirCalc();
            }
        });

        /**
         * Botão multiplicar
         */
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MultiplicarCalc();
            }
        });

        botaoDesativado.setVisible(false);
    }

    public void CallCalc() {

        JFrame frame = new JFrame();

        frame.setContentPane(new CalcView().CalcPanel);
        frame.setResizable(false);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Calculadora simples.");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    /**
     * Método somar
     */
    public void SomaCalc() {


        String teste = "+";
        fNumber = Integer.parseInt(String.valueOf(fieldFNumber.getText()));
        sNumber = Integer.parseInt(String.valueOf(fieldSNumber.getText()));
        resultado = fNumber + sNumber;
        labelResult.setText(Integer.toString(resultado));

    }

    /**
     * Método subtrair
     */
    public void SubtrairCalc(){

        fNumber = Integer.parseInt(String.valueOf(fieldFNumber.getText()));
        sNumber = Integer.parseInt(String.valueOf(fieldSNumber.getText()));
        resultado = fNumber - sNumber;
        labelResult.setText(Integer.toString(resultado));

    }

    /**
     * Método dividir
     */
    public void DividirCalc(){
            fNumber = Integer.parseInt(String.valueOf(fieldFNumber.getText()));
            sNumber = Integer.parseInt(String.valueOf(fieldSNumber.getText()));
            resultado = fNumber / sNumber;
            labelResult.setText(Integer.toString(resultado));
    }

    /**
     * Método multiplicar
     */
    public void MultiplicarCalc(){
        fNumber = Integer.parseInt(String.valueOf(fieldFNumber.getText()));
        sNumber = Integer.parseInt(String.valueOf(fieldSNumber.getText()));
        resultado = fNumber * sNumber;
        labelResult.setText(Integer.toString(resultado));


    }
}
