importar javax.swing.*;
importar java.awt.*;

classe pública BotoesCadastro {
    diálogo JDialog final privado;

    public BotoesCadastro(diálogo JDialog) {
        this.dialog = diálogo;
    }

    público JPanel criar() {
        JPanel painelBotoes = new JPanel(new FlowLayout());
        String[] rótulos = {"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"};
        para (string rótulo: rótulos) {
            Botão JButton = novo JButton(rótulo);
            se ("Sair".equals(rótulo)) {
                botão.addActionListener(e -> dialog.setVisible(false));
            } outro {
                button.addActionListener(e -> JOptionPane.showMessageDialog(dialog, "Botão " + label + " clicado!"));
            }
            painelBotoes.add(botão);
        }
        retornar painelBotoes;
    }
}