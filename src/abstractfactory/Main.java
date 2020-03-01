package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;

public class Main {
    public static void main(String[] args) {
        String mainPackageName = Main.class.getPackageName();
        String subPackageName = "markdownfactory.MarkdownFactory";
        Factory factory = Factory.getFactory(mainPackageName + "." + subPackageName);

        factory.createPage("お気に入り")
                .add(factory.createTray("プログラミング")
                        .add(factory.createLink("Qiita", "https://qiita.com/"))
                        .add(factory.createLink("ドットインストール", "https://dotinstall.com/")))
                .add(factory.createTray("検索サイト")
                        .add(factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/"))
                        .add(factory.createLink("Excite", "http://www.excite.com/"))
                        .add(factory.createLink("Google", "http://www.google.com/")))
                .output();
    }
}
