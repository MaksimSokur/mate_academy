public class UserService {
  public int getUserScore(String[] records, String email) {
    int userScore;
    for (String record : records) {
      String[] toValid = record.split(":");
      if (toValid[0].equals(email)) {
        userScore = Integer.parseInt(toValid[1]);
        return userScore;
      }
    }
    throw new UserNotFoundException("User with given email doesn't exist");
  }
}