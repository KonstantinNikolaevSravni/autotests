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
## ПО для запуска тестов
1. Установить Java SDK (Версия 1.8)
2. Установить JetBrains IDEA
3. Установить Android SDK
4. Установить Appium и Appium Inspector
### Установка переменной JAVA_HOME и ANDROID_HOME
1. Открыть терминал
2. В зависимости от оболочки вашего терминала необходимо открыть файл (".zshrc" / ".bashrc" / ".bash_profile")
3. touch .zshrc 
4. open .zshrc
5. Вписать в файл .zshrc следующее (< user > - имя вашего пользователя):
* export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_321.jdk/Contents/Home
* export ANDROID_HOME="/Users/< user >/Library/Android/sdk"
* export PATH="${PATH}:/$ANDROID_HOME/emulator:/$ANDROID_HOME/platform-tools:/$ANDROID_HOME/tools:/$ANDROID_HOME/tools/bin"
### Запуск тестов
1. В Android Studio создать и запустить виртульный девайс (Желательно использовать устройство на версии андроид 9-12)
2. В JetBrains IDEA скопировать проект JavaAppiumAutomation
3. Запустить Appium (Host: 127.0.0.1 Port: 4723)
4. Запустить тест
### Тесты
Расположены в src -> tests
1. AndroidNUCreditAuth
* Авторизация с проходом через промо экраны
* Проверка открытия и отображения оферты
* Проверка функции свайпа промо экранов с авторизацией
2. AndroidNUCreditChat
* Проход кредитного чата новым пользователем
3. AndroidNUCreditFilters
* Проврека работы фильтров на выдаче
4. AndroidNUScoringChat
* Проход чата кредитного рейтнга

