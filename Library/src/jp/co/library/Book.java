package jp.co.library;

import java.util.Scanner;

public class Book {

//	プロパティ
	private int code; // ISBNコード
	private String title; // 本の題名
	private String author; // 作者
	private String publisher; // 出版社
	private int publicationYear; // 出版年
	private Boolean borrowing; // 貸し出し可能か判定

	Scanner scanner = new Scanner(System.in);

//	コンストラクタ
	public Book() {
		System.out.println("本の登録を行います");
		System.out.print("ISBNコードを入力してください⇒　");
		this.code = scanner.nextInt();

		System.out.print("題名を入力してください⇒　");
		this.title = scanner.next();

		System.out.print("作者を入力してください⇒　");
		this.author = scanner.next();

		System.out.print("出版社を入力してください⇒　");
		this.publisher = scanner.next();

		System.out.print("出版年を入力してください⇒　");
		this.publicationYear = scanner.nextInt();

//		本を登録するときの初期値は常に貸し出し可能(true)にする
		this.borrowing = true;

		System.out.println("下記の内容で登録しました！");
//		登録した情報をコンソール上に出力する
		info();
	}

//	コード取得
	public int getCode() {
		return code;
	}

//	題名取得
	public String getTitle() {
		return title;
	}

//	作者取得
	public String getAuthor() {
		return author;
	}

//	出版社取得
	public String getPublisher() {
		return publisher;
	}

//	出版年取得
	public int getPublicationYear() {
		return publicationYear;
	}

//	貸し出し変数取得
	public boolean getborrowing() {
		return borrowing;
	}

//	貸し出し変数の判定を逆転させる
	public void setborrowing() {
		this.borrowing = !borrowing;
	}

//	情報を更新するメソッド
	public void setInfo() {
		System.out.println("ISBNコードを入力してください。現ISBNコード：　" + code);
		this.code = scanner.nextInt();

		System.out.println("題名を入力してください。現題名：　" + title);
		this.title = scanner.next();

		System.out.println("作者を入力してください。現作者名：　" + author);
		this.author = scanner.next();

		System.out.println("出版社を入力してください。現出版社名：　" + publisher);
		this.publisher = scanner.next();

		System.out.println("出版年を入力してください。現出版年　" + publicationYear);
		this.publicationYear = scanner.nextInt();

		System.out.println("下記の内容で更新しました！");
		System.out.println();
//		更新した情報をコンソール上に出力する
		info();
	}

//	一覧表示する
	public void info() {
		System.out.println();
		System.out.println("------------------------------");
		System.out.println("ISBNコード：　" + code);
		System.out.println("題名：　" + title);
		System.out.println("作者：　" + author);
		System.out.println("出版社：　" + publisher);
		System.out.println("出版年：　" + publicationYear);
		if (borrowing) {
			System.out.println("本の状態：　貸出可能");
		} else {
			System.out.println("本の状態：　貸出中");
		}
		System.out.println("------------------------------");
	}

}
