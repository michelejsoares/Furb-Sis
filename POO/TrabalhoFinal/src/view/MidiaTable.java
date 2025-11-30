package view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Midia;

public class MidiaTable extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private final String[] cols = {"ID","Título","Tipo","Categoria","Duração","Local","Específico"};
    private List<Midia> dados = new ArrayList<>();

    public void setMedias(List<Midia> medias) {
        this.dados = medias == null ? new ArrayList<>() : medias;
        fireTableDataChanged();
    }

    public Midia getMediaAt(int row) {
        if (row<0 || row>=dados.size()) return null;
        return dados.get(row);
    }

    @Override
    public int getRowCount() { return dados.size(); }

    @Override
    public int getColumnCount() { return cols.length; }

    @Override
    public String getColumnName(int col) { return cols[col]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Midia m = dados.get(rowIndex);
        switch(columnIndex) {
            case 0: return m.getId();
            case 1: return m.getTitulo();
            case 2: return m.getTipo();
            case 3: return m.getCategoria();
            case 4: return m.getDuracao();
            case 5: return m.getLocal();
            case 6: return m.exibirAtributosEspecificos();
            default: return "";
        }
    }
}
