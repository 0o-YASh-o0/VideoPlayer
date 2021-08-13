package sample;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class VideoPlayer extends BorderPane {

//    import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.Pane;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;
//// Key Elements for VideoPlayer are :-
//// 1.Media 2. MediaPlayer 3.MediaView 4.Pane

//    public class VideoPlayer extends BorderPane {
        Media media ;
        MediaView mediaView;
        MediaPlayer mediaPlayer;
        Pane pane;

        VideoBar bar;

        public VideoPlayer(String filepath) {

            media = new Media(filepath);
            mediaPlayer = new MediaPlayer(media);
            mediaView = new MediaView(mediaPlayer);
            pane = new Pane();
            pane.getChildren().add(mediaView);
            setCenter(pane);

            bar = new VideoBar(mediaPlayer);
            setBottom(bar);

            mediaPlayer.play();


        }







    }




