package hust.soict.dsai.aims.screen;

import javafx.animation.PauseTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Duration;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store;

public class CartScreenController {
	
	private Cart cart;
	
	@FXML
    private TableView<Media> tblMedia;
	
    @FXML
    private TableColumn<Media, String> colMediaCategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Label totalCost;
    
    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRemove;
    
    @FXML
    private Label playingMedia;
    
    @FXML
    private Button btnStop;
    
    @FXML
    private Button btnOrder;
    
    public CartScreenController(Cart cart) {
		super();
		this.cart = cart;
	}
    

    void updateButtonBar(Media media) {
    	btnRemove.setVisible(true);
    	if (media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}else {
    		btnPlay.setVisible(false);
    	}
    }
    
    @FXML
    private void initialize() {
    	colMediaTitle.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("title"));
    
    	colMediaCategory.setCellValueFactory(
    			new PropertyValueFactory<Media, String>("category"));
    	colMediaCost.setCellValueFactory(
    			new PropertyValueFactory<Media, Float>("cost"));
    	tblMedia.setItems(this.cart.getItemsOrdered());
    	totalCost.setText(this.cart.totalCost()+"$");
    	btnPlay.setVisible(false);
    	btnRemove.setVisible(false);
    	playingMedia.setVisible(false);
    	btnStop.setVisible(false);
    	tblMedia.getSelectionModel().selectedItemProperty().addListener(
    			new ChangeListener<Media>() {
    				
    				@Override
    				public void changed(ObservableValue<? extends Media> observable, Media oldValue,
    									Media newValue) {
    					if(newValue != null) {
    						updateButtonBar(newValue);
    					}
    					totalCost.setText(cart.totalCost()+"$");
    				}
    			});
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	cart.removeMedia(media);
    }
    
    @FXML
    void btnPlayPressed(ActionEvent event) {
    	Media media = tblMedia.getSelectionModel().getSelectedItem();
    	playingMedia.setText("Playing "+media.getTitle()+"....");
    	playingMedia.setVisible(true);
    	btnStop.setVisible(true);
    }
    
    @FXML
    void btnStopPressed(ActionEvent event) {
    	playingMedia.setVisible(false);
    	btnStop.setVisible(false);
    }
    
    @FXML
    void btnOrderPressed(ActionEvent event) {
		System.out.println("Order");
    	btnOrder.setText("Success!!!");
    	btnOrder.setDisable(true);
    	cart.getItemsOrdered().removeAll(cart.getItemsOrdered());
    	totalCost.setText("0.0$");	
    	PauseTransition pt = new PauseTransition(Duration.seconds(1));
        pt.setOnFinished(e ->{
        	btnOrder.setDisable(false);
        	btnOrder.setText("Order");
        } );
        pt.playFromStart();
    }
}