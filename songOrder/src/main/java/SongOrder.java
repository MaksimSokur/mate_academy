/**
 * Make possible initialization using static factory methods.
 * See requirements in task description.
 */
public class SongOrder {
  private String singer;
  private String songName;

  //implement this class

  private SongOrder(String singer) {
    this.singer = singer;
  }

  private SongOrder(String singer, String songName) {
    this.singer = singer;
    this.songName = songName;
  }

  public static SongOrder of(String singer) {
    return new SongOrder(singer);
  }

  public static SongOrder of(String singer, String songName) {
    return new SongOrder(singer, songName);
  }

  public String getSinger() {
    return singer;
  }

  public void setSinger(String singer) {
    this.singer = singer;
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }

  @Override
  public String toString() {
    if(singer != null && songName != null){
      return "Play " + singer + " song called " + '"' + songName + '"';
    } else if (singer != null && songName == null) {
        return "Play any " + singer + " song";
    } else
      return "You haven't chosen a singer. Please make your choice)";
  }
}
