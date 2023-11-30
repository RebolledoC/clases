package com.example.netbooks;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController implements Initializable {

        @FXML
        private TableView list;
        @FXML
        private TableColumn primeraColum;

    private primeraColum
            _rssStreamsView;
    ObservableList< TableColumn< RSSReader, ? >> columns =
            _rssStreamsView.getColumns();
  [...]
    TableColumn< RSSReader, Boolean > loadedColumn = new TableColumn<>( "Loaded" );
  loadedColumn.setCellValueFactory(
          new Callback<TableColumn.CellDataFeatures<RSSReader,Boolean>,ObservableValue<Boolean>>(){
        @Override public
        ObservableValue<Boolean> call( CellDataFeatures<RSSReader,Boolean> p ){
            return p.getValue().getCompleted(); }});
  loadedColumn.setCellFactory(
          new Callback<TableColumn<RSSReader,Boolean>,TableCell<RSSReader,Boolean>>(){
        @Override public
        TableCell<RSSReader,Boolean> call( TableColumn<RSSReader,Boolean> p ){
            return new CheckBoxTableCell<>(); }}

    public HelloController(TableColumn primeraColum) {
        this.primeraColum = primeraColum;
    });
  [...]
          columns.add( loadedColumn );

}

}