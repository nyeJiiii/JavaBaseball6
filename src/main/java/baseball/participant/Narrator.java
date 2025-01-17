package baseball.participant;

public class Narrator {

    private static Narrator narrator;
    private final String START_GAME = "숫자 야구 게임을 시작합니다.";
    private final String ENTER_NUMBER = "\n숫자를 입력해주세요 : ";
    private final String SELECT_REPLAY_OR_NOT = """
            \n3개의 숫자를 모두 맞히셨습니다! 게임 종료
            게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.""";

    private Narrator() {}

    public static Narrator getInstance() {
        if (narrator == null) {
            narrator = new Narrator();
        }
        return narrator;
    }

    public void startGame() {
        System.out.print(START_GAME);
    }

    public void enterNumber() {
        System.out.print(ENTER_NUMBER);
    }

    public void selectReplayOrNot() {
        System.out.println(SELECT_REPLAY_OR_NOT);
    }

}
