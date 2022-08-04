package jp.co.library;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
//		本棚クラスを生成
		BookShelf serakuBookShelf = new BookShelf();

//		入力した文字列を格納する変数
		String option = "";

		try (Scanner scanner = new Scanner(System.in)) {
			// 0が入力されるまで繰り返し
			while (!option.equals("0")) {
				System.out.println();
				System.out.println("セラク図書館へようこそ。あなたのやりたいことを下記の番号に従って入力してください");
//			待機時間を入れる
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}

				System.out.println();
				System.out.println("～～～～～～～～～～～～～～～");
				System.out.println("1: 本の登録");
				System.out.println("2: 本の詳細");
				System.out.println("3: 本の編集");
				System.out.println("4: 本の削除");
				System.out.println("5: 本の貸し出しor返却");
				System.out.println("0: システムの終了");
				System.out.println("～～～～～～～～～～～～～～～");
				System.out.println();

				System.out.print("半角数字で入力してください　⇒　");
				option = scanner.next();
				System.out.println();

				switch (option) {
				case "0": // システムの終了
					break;
				case "1": // 本の登録
					serakuBookShelf.add(new Book());
					break;
				case "2": // 本の詳細確認
					serakuBookShelf.bookInfo();
					break;
				case "3": // 本の編集
					serakuBookShelf.bookEdit();
					break;
				case "4": // 本の削除
					serakuBookShelf.bookDelete();
					break;
				case "5": // 本の貸し出しor返却
					serakuBookShelf.bookBorrowing();
					break;
				default:
					System.out.println("入力された値が正しくありません、もう一度入力してください");
				}
			}
		}

		System.out.println("システムを終了します。セラク図書館へお越しいただき、誠にありがとうございました。");
	}

}
