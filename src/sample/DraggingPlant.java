package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;

class DraggingPlant implements EventHandler<MouseEvent> {
    ImageView iv;
    ImageView background;
    Scene sc;
    Image i;

    public DraggingPlant(Image image,ImageView a,ImageView bg,Scene sc)
    {
        this.iv = a;
        this.background=bg;
        this.sc=sc;
        this.i = image;
    }

    @Override
    public void handle(MouseEvent mouseEvent)
    {
        Dragboard drag = this.iv.startDragAndDrop(TransferMode.COPY_OR_MOVE);
        ClipboardContent content = new ClipboardContent();
        String id = this.iv.getId();
        content.putImage(i);
        content.putString(iv.getId());
        drag.setContent(content);
    }
}