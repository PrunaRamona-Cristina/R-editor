package App;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filters {


    protected Filters() {

    }

    protected void setRain1Filter(AnchorPane anchorPane) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(new File("src/main/resources/App/icons/rain1.png")));
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane1);
    }

    protected void setRain2Filter(AnchorPane anchorPane) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(new File("src/main/resources/App/icons/rain2.png")));
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane1);
    }

    protected void setRain3Filter(AnchorPane anchorPane) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(new File("src/main/resources/App/icons/rain3.png")));
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane1);
    }

    protected void setSunshine1Filter(AnchorPane anchorPane) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(new File("src/main/resources/App/icons/sunshine1.png")));
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane1);
    }

    protected void setSunshine2Filter(AnchorPane anchorPane) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(new File("src/main/resources/App/icons/sunshine1.png")));
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane1);
    }

    protected void setSmoothFilter(AnchorPane anchorPane) throws FileNotFoundException {
        Image image = new Image(new FileInputStream(new File("src/main/resources/App/icons/smooth1.jpg")));
        ImageView imageView = new ImageView(image);
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane1);
    }
}