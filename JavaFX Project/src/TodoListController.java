import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class TodoListController {

    @FXML
    private TextField taskField;

    @FXML
    private Button addButton;

    @FXML
    private ListView<String> taskListView;

    private ObservableList<String> tasks = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        taskListView.setItems(tasks);

        // Add a delete button to each cell
        taskListView.setCellFactory(param -> new ListCell<String>() {
            private final Button deleteButton = new Button("Delete");
            private final HBox hbox = new HBox(10, new Text(), deleteButton);

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setGraphic(null);
                } else {
                    ((Text) hbox.getChildren().get(0)).setText(item);
                    setGraphic(hbox);
                    deleteButton.setOnAction(event -> getListView().getItems().remove(item));
                }
            }
        });
    }

    @FXML
    private void addTask() {
        String task = taskField.getText().trim();
        if (!task.isEmpty()) {
            tasks.add(task);
            taskField.clear();
        }
    }
}