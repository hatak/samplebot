Twitter4J を使った Twitter bot の最小サンプルです。

### Environment

* JDK
* IntelliJ IDEA

### Setup

1. Twitter API のトークンを作成しておく

1. プロジェクトを clone
    >    git clone https://github.com/hatak/samplebot.git

1. /lib に [[Twitter 4J|http://twitter4j.org/ja/index.html]] の jar ファイルを配置
    * [[ダウンロード|http://twitter4j.org/ja/index.html#download]] より zip ファイルをダウンロードし解凍
    * /lib/ 以下の *.jar ファイルをコピーして "lib" にペースト
        * twitter4j-core.jar
        * twitter4j-async.jar
        * twitter4j-media-support.jar
        * twitter4j-stream.jar

1. /src/twitter4j.properties を作成
    * "src" 右クリック - "New" - "Resource Bundle" を選び，"Resource bundle base name" に `twitter4j` と入力
    * または /src/twitter4j.properties.template をコピー
    * oauth.* の4項目に自身の Key / Token をセットする
        * oauth.consumerKey
        * oauth.consumerSecret
        * oauth.accessToken
        * oauth.accessTokenSecret

