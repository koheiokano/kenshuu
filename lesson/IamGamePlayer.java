package jp.co.tafs.lesson;

public class IamGamePlayer {
	public static void main(String[] args) {
		ExGame ExGameInstance = new ExGame();				//ExGameインスタンス化
		Game GameInstance = new Game(); 					//GameInstanceにインスタンス化

		String gameMachine = GameInstance.getMachineName(); //privateの中のものを呼び出す
		System.out.println("ハード名:" + gameMachine);

		String gameMaker = GameInstance.getMaker();
		System.out.println("メーカー:" + gameMaker);

		boolean gameNet = GameInstance.getNet();
		System.out.println("ネット環境:" + gameNet);

		String gameRelease = GameInstance.getRelease();
		System.out.println("発売予定日:" + gameRelease);

		int gamePrice = GameInstance.getPrice();
		System.out.println("価格:" + gamePrice);

		System.out.println("\nゲームで遊びましょう！");

		boolean Power;
		Power = GameInstance.isPower();
		if (Power == false) {
			System.out.println("電源をONにしましょう。");
			GameInstance.onPower();
		} else {
			System.out.println("既に電源はONです。");
		}

		String gamesoft;

		gamesoft = ExGameInstance.activeSoftCheck();	//アクティブなゲームソフトを確認
		
		if (gamesoft == null) { 					//ゲームソフトが入ってない場合
			ExGameInstance.inGame(); 				//ゲームソフトを入れる
		} 
		else { 										//ゲームソフトが入っている場合
			System.out.println("容量がいっぱいです。");
		}

		ExGameInstance.ViewGame(); 					//インストールしたゲームの一覧表示

		ExGameInstance.ChoiceGame(); 				//ゲームを選ぶ

		GameInstance.playGame(); 					//ゲームで遊ぶ
		System.out.println("遊び終えました。");

		ExGameInstance.outGame(); 					//ゲームソフトを取り出す

		GameInstance.offPower(); 					//電源を切る

	}
}
