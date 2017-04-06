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

