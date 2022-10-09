# TV Scheduler
## Software prepared to generate private tv

This is a software prepared to generate private TV schedule based on local videos.
While TV Scheduler is running then software generate full schedule prepared from local video sources.
Then all videos from schedule is playing with using chose local software like Windows Media Player or VLC.

# Configuration
**EPISODES_LIMIT_OF_A_SINGLE_SERIES_PER_DAY** is a variable used to set amount of episode from single series allowed to play
per day. For now default value is 2, and it means that two episodes from single series will be play one by one. 

- `EPISODES_LIMIT_OF_A_SINGLE_SERIES_PER_DAY = 2`

**MAXIMUM_NUMBER_OF_EPISODES_IN_THE_SCHEDULE_PER_DAY** is a variable used to set max amount of all videos allowed to play
per day

- `MAXIMUM_NUMBER_OF_EPISODES_IN_THE_SCHEDULE_PER_DAY = 30`

**PLAYER_SOURCE** is static variable used to tell Scheduler where is an application to play videos

- `PLAYER_SOURCE = "LOCATION_OF_PLAYER_EXE"`
- `PLAYER_SOURCE = "C:\Program Files\VideoLAN\VLC\vlc.exe"`

In version 1.0.0 there are two recommended players on Windows 10/11. 
- VLC Media Player
- Windows Media Player

**FULLSCREEN** is static variable used to tell Scheduler how to run video with fullscreen 

- `FULLSCREEN = "--fullscreen"` for VLC Media Player
- `FULLSCREEN = "/fullscreen"` for Windows Media Player

**VIDEO_MAIN_SOURCE** is static variable used to tell Scheduler where is a main directory with all videos

- `VIDEO_MAIN_SOURCE = "E:\\MAIN_DIRECTORY"`

Software was prepared to use structure:
    
    MAIN_DIRECTORY
          |_ VIDEO_SERIES_1
          |_ VIDEO_SERIES_2
          |_ VIDEO_SERIES_3
          |_ ...

    LET_SAY_JETIX
          |_ POWER RANGERS MIGHTY MORPHIN
                    |_ S01E01-Episode-name
                    |_ S01E02-Episode-name
                    |_ ...
          |_ X-MAN
          |_ SIMPSONS
          |_ ...

Local videos must follow this pattern

       SXXEYY-Episode-name
       SEASON XX EPISODE YY-EPISODE-NAME
       
       For example:
       S01E01-The-Blade-Raider

# How to run version 1.0.0
If you set your local configuration described earlier, then there are two ways to use the program.

1. Open IDE and run play (dummy and simply way)
2. Build project using Maven `mvn clean install`
3. After building project, go to target folder and move **private-tv-scheduler-1.0.0-SNAPSHOT.jar** file e.g. to Desktop
4. Open terminal in folder with .jar file and use cmd `java -jar private-tv-scheduler-1.0.0-SNAPSHOT.jar`

# Plan for next version
- Add UI
- Add local DB to keep information about watched series
- Add functionality to recognize which episode should be run next time
- Add Web Client to remote playing videos

# Version 1.0.0
- Added Schedule based on local video sources
- Added Simple logger
