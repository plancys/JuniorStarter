# Lesson 1 - Installing essential software / setting up programming environment

## 1. Install required software

Before you start check whether these software is already installed on your computer or not. If not then install it and when you finnish check whether is installed properly.

You need to install following software:
  * Git [download & install](https://git-scm.com/download/mac)
  * brew [instruction](https://brew.sh/index_pl.html)
  * Java 8 JDK [download & install](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
  * maven - type following instruction in your console: ``` brew install maven ```
  * Intellij IDEA Community Edition [download & install](https://www.jetbrains.com/idea/download/download-thanks.html?code=IIC)
  * (optional) zsh - type in your console```brew install zsh zsh-completions```
  
### Check whether software is installed

#### Git 
Console: ```git ```
You should get something like this:

<img src="http://i.imgur.com/H9DY15Z.png" width="640px">

#### brew 
Console: ```brew ```
You should get something like this:
```
Example usage:
  brew search [TEXT|/REGEX/]
  brew (info|home|options) [FORMULA...]
  brew install FORMULA...
  brew update
  brew upgrade [FORMULA...]
  brew uninstall FORMULA...
  brew list [FORMULA...]

Troubleshooting:
  brew config
  brew doctor
  brew install -vd FORMULA

Developers:
  brew create [URL [--no-fetch]]
  brew edit [FORMULA...]
  https://github.com/Homebrew/brew/blob/master/docs/Formula-Cookbook.md

Further help:
  man brew
  brew help [COMMAND]
  brew home
```

### Java 8 JDK
Console: ```java -version```
You should get following response:
```
java version "1.8.0_102"
Java(TM) SE Runtime Environment (build 1.8.0_102-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.102-b14, mixed mode)
```

### Maven
Console: ```mvn -version```
You should get following response (only version can be little bit different):
```
Apache Maven 3.3.3 (7994120775791599e205a5524ec3e0dfe41d4a06; 2015-04-22T13:57:37+02:00)
Maven home: /Users/kamilkalandyk1/Tools/apache-maven-3.3.3
Java version: 1.8.0_102, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_102.jdk/Contents/Home/jre
Default locale: pl_PL, platform encoding: UTF-8
OS name: "mac os x", version: "10.12.3", arch: "x86_64", family: "mac"
```

### Intellij IDEA
This is program with graphic interface, just run it.

## 2. Create github account
1. [Just create it](https://github.com/join?source=header-home).
2. [Generate a new SSH key](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/#platform-mac).
3. Copy your public SSH key
console: ```cat ~/.ssh/id_rsa.pub```
you should see something like that (with different key and email):
```
ssh-rsa DFS4fdsfs3csdcs3/3ss3S3datH7JPPGqQux006+TjrBVtnL7wTGIUujBwkrvPnP1SY5Y3/R6rrSvVoioyicq8d9SLpUk
Cu4Jdj9ADSFaIvDCEwFREFKedeVqu92GrQ0CmzoAY5FJ2EbTn08Fq7IQSGMkZlwJCVIsN1hsvXLimqAqGpEi4BGcz5sV6
IHbAPldRdwTNzgQjGTn2P3sOx+FyLnPMJW38MeW7u5wMD4nOeheNFb4kunDW66IJuknZVGD93oVTakt8RYp3LJTfoP5pN
SybX9x2urxuRd4u998L/jOS2ddasEWwsa1rrZeCw7Kgqo9soMGShHeL8lKq0Rdc+plyXLIbdZ/Q9rWc52x+z3ybbN9vr2
jgKdZldC1gljgCNte8FN3NKn46I/LgsOOWNEZcSGYi+6m/2GTqTCl4pufBFFoUA044sda534dsf9LFybMtK9Vw49LHhdK
bF78ghMA4tIzUhSALvc4pv1PhkLoQsOjGURT+WYjKJS2rEBFgRyqGLPJbOTVn4Skp9nvQIlJI7KqpPoweLb29TYXupoQ4
eBPlwGpls9DPd+mazGZm4S18etw== your_email@something.com
```
Copy it and paste in point 4.

4. Upload it to github account - [instruction here - starting from point 2](https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/)

5. Check whether it works (TODO: finnish instruction)
