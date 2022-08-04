package jp.co.library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookShelf {

//	本棚リスト
	ArrayList<Book> bookShelf = new ArrayList<Book>();

	Scanner scanner = new Scanner(System.in);

//	 入力した数値を格納する変数
	int option = -1;
//	入力した文字列を格納する変数
	String strOption;

//	本棚に本を追加する
	public void add(Book book) {
		bookShelf.add(book);
	}

//	本の詳細情報確認
	public void bookInfo() {
		if (bookShelf.size() == 0) {
			System.out.println("本は1冊も登録されておりません");
		} else {
			System.out.print("確認したい本のISBNコードを入力してください　⇒　");
			option = scanner.nextInt();
//			本棚に追加されている本の数だけ繰り返し
			for (int i = 0; i < bookShelf.size(); i++) {
				if (option == bookShelf.get(i).getCode()) {
					System.out.println("ISBNコード：" + bookShelf.get(i).getCode() + "の検索結果を表示します");
//					Bookクラスのinfoメソッド呼び出し
					bookShelf.get(i).info();
					break;
				} else if (i == bookShelf.size() - 1) {
					System.out.println("お探しのISBNコードは登録されておりませんでした");
				}
			}
		}

	}

//	本の編集
	public void bookEdit() {
		if (bookShelf.size() == 0) {
			System.out.println("本は1冊も登録されておりません");
		} else {
			System.out.print("編集したい本のISBNコードを入力して下さい　⇒　");
			option = scanner.nextInt();
//			本棚に追加されている本の数だけ繰り返し
			for (int i = 0; i < bookShelf.size(); i++) {
				if (option == bookShelf.get(i).getCode()) {
//					BookクラスのsetInfoメソッド呼び出し
					bookShelf.get(i).setInfo();
					break;
				} else if (i == bookShelf.size() - 1) {
					System.out.println("お探しのISBNコードは登録されておりませんでした");
				}
			}
		}

	}

//	本の削除
	public void bookDelete() {
		if (bookShelf.size() == 0) {
			System.out.println("本は1冊も登録されておりません");
		} else {
			System.out.print("データを削除したい本のISBNコードを入力して下さい　⇒　");
			option = scanner.nextInt();
//			本棚に追加されている本の数だけ繰り返し
			for (int i = 0; i < bookShelf.size(); i++) {
				if (option == bookShelf.get(i).getCode()) {
//					本棚からISBNコードが一致した本を削除
					bookShelf.remove(bookShelf.get(i));
					System.out.println("ISBNコード:　" + option + "の本を削除しました");
					break;
				} else if (i == bookShelf.size() - 1) {
					System.out.println("お探しのISBNコードは登録されておりませんでした");
				}
			}
		}
	}

//	本の貸し出しor返却
	public void bookBorrowing() {
		if (bookShelf.size() == 0) {
			System.out.println("本は1冊も登録されておりません");
		} else {
			System.out.print("貸し出しor返却する本のISBNコードを入力してください　⇒　");
			option = scanner.nextInt();
//			本棚に追加されている本の数だけ繰り返し
			for (int i = 0; i < bookShelf.size(); i++) {
				if (option == bookShelf.get(i).getCode()) {
//					入力したISBNコードの本が貸出中かどうか判定
					if (bookShelf.get(i).getborrowing()) {
						System.out.println(bookShelf.get(i).getTitle() + "　は貸し出し可能です。本を借りますか？");
						System.out.print("はいかいいえでお答えください　⇒　");
						strOption = scanner.next();
						if (strOption.equals("はい")) {
							System.out.println(bookShelf.get(i).getTitle() + "　を借りました！");
//							Bookクラスのsetborrowingメソッドを呼び出す
							bookShelf.get(i).setborrowing();
						} else if (strOption.equals("いいえ")) {
							System.out.println("本を借りませんでした");
						} else {
							System.out.println("入力した値は正しくありません");
						}
					} else {
						System.out.println(bookShelf.get(i).getTitle() + "　は貸し出し中です。本を返却しますか？");
						System.out.print("はいかいいえでお答えください　⇒　");
						strOption = scanner.next();
						if (strOption.equals("はい")) {
							System.out.println(bookShelf.get(i).getTitle() + "　を返却しました！");
//							Bookクラスのsetborrowingメソッドを呼び出す
							bookShelf.get(i).setborrowing();
						} else if (strOption.equals("いいえ")) {
							System.out.println("本を返却しませんでした");
						} else {
							System.out.println("入力した値は正しくありません");
						}
					}
					break;
				} else if (i == bookShelf.size() - 1) {
					System.out.println("お探しのISBNコードは登録されておりませんでした");
				}
			}
		}

	}

}
