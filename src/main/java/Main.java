import service.VideoScheduler;

import java.io.IOException;

import static utils.SimpleLogger.logger;

public class Main {

    public static void main(String[] args) throws IOException {
        VideoScheduler scheduler = new VideoScheduler();

        logger("All videos: " + scheduler.generateTvSchedule().size());
        logger(scheduler.generateTvSchedule());

        scheduler.runVideos();
    }

}
