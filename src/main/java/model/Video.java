package model;

import java.io.File;
import java.util.Objects;

public class Video {

    private final String videoName;
    private final String episodeName;
    private final String episodeNumber;
    private final String seasonNumber;
    private final String videoExtension;
    private final String videoPath;
    private boolean isWatched;

    public Video(File directory, String currentVideo) {
        this.videoName = directory.getName();
        this.episodeName = currentVideo.substring(7, currentVideo.length() - 4).replace("-", " ");
        this.episodeNumber = currentVideo.substring(3, 6);
        this.seasonNumber = currentVideo.substring(0, 3);
        this.videoExtension = currentVideo.substring(currentVideo.length() - 3);;
        this.videoPath = directory.getAbsolutePath() + "\\" + currentVideo;
        this.isWatched = false;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public String getVideoName() {
        return videoName;
    }

    public String getVideoPath() {
        return videoPath;
    }

    @Override
    public String toString() {
        return "\nVideo { " +
                "videoName: '" + videoName + '\'' +
                ", episodeName: '" + episodeName + '\'' +
                ", episodeNumber: '" + episodeNumber + '\'' +
                ", seasonNumber: '" + seasonNumber + '\'' +
                ", videoExtension: '" + videoExtension + '\'' +
                ", videoPath: '" + videoPath + '\'' +
                ", isWatched: " + isWatched +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video)) return false;
        Video video = (Video) o;
        return isWatched() == video.isWatched()
                && getVideoName().equals(video.getVideoName())
                && getEpisodeName().equals(video.getEpisodeName())
                && getEpisodeNumber().equals(video.getEpisodeNumber())
                && getSeasonNumber().equals(video.getSeasonNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), getEpisodeName(), getEpisodeNumber(), getSeasonNumber(), isWatched());
    }
}
