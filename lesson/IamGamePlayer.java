package jp.co.tafs.lesson;

public class IamGamePlayer {
	public static void main(String[] args) {

		Game GameInstance = new Game(); //GameInstanceにインスタンス化

		String gameMachine = GameInstance.getMachineName(); //privateの中のものを呼び出す
		System.out.println(gameMachine);

		String gameMaker = GameInstance.getMaker();
		System.out.println(gameMaker);

		boolean gameNet = GameInstance.getNet();
		System.out.println(gameNet);

		String gameRelease = GameInstance.getRelease();
		System.out.println(gameRelease);

		int gamePrice = new Game().getPrice();
		System.out.println(gamePrice);

		System.out.println("\nゲームで遊びましょう！");

		boolean Power;
		Power = new Game().isPower();
		if (Power == false) {
			System.out.println("電源をONにしましょう。");
			new Game().onPower();
		} else {
			System.out.println("既に電源はONです。");
		}

		String gamesoft;

		gamesoft = new Game().activeSoftCheck();//アクティブなゲームソフトを確認し、gamesoftに代入
		if (gamesoft == null) { //ゲームソフトが入ってない場合
			new ExGame().inGame(); //ゲームソフトを入れるメソッドを呼び出す
		} else { //ゲームソフトが入っている場合
			System.out.println("既にゲームソフトが入っています。");
		}

		new Game().playGame(); //Gameクラスをインスタンス化してplayGameを呼び出す
		System.out.println("遊び終えました。");

		new Game().outGame(); //ゲームソフトを取り出す

		new Game().offPower(); //電源を切る
		//感想を出力

	}
}
