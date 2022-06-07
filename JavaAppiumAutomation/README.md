# Автотесты мобильного приложения (Android/iOS)
---
## Реализовано (Android)
* Установка приложения
* Авторизация новым пользователем (промо экраны, свайп промо)
* Проверка оферты при первом запуске
* Проход кредитного чата новым пользователм
* Проход чата для кредитного рейтинга
* Проверка фильтров на выдаче
---
## ПО для заупска тестов
1. Установить Java SDK (Версия 1.8)
2. Установить JetBrains IDEA
3. Установить Android SDK
4. Установить Appium и Appium Inspector
### Установка переменной JAVA_HOME и ANDROID_HOME
1. Открыть терминал
2. touch .bash_profile
3. open .bash_profile
4. Вписать в файл .bash_profile следующее (<user> - имя вашего пользователя):
* export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-18.0.1.1.jdk/Contents/Home
* export ANDROID_HOME="/Users/<user>/Library/Android/sdk"
* export PATH="${PATH}:/$ANDROID_HOME/platform-tools:/$ANDROID_HOME/tools:/$ANDROID_HOME/tools/bin"