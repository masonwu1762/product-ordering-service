
## 這是一個Java使用mockito的範例程式

## 參考資料
souce code是參考這篇blog修改而來:

https://springframework.guru/mocking-unit-tests-mockito/


## 簡易使用方式
以下以在Mac的操作說明如何將這個專案放入Eclipse中執行

* Clone 程式碼至本機

我的Eclipse的workspace在 /Users/wumason/eclipse-workspace

$cd /Users/wumason/eclipse-workspace

$git clone https://github.com/masonwu1762/product-ordering-service.git


* 在Eclipse開啟專案

在Eclipse的File 功能列中選擇[Import],

在Select畫面中選[Exsiting Maven Projects],

在root directory目錄中選擇剛剛clone下來的專案目錄，應該是 Users/wumason/eclipse-workspace/product-ordering-service

按[打開]，再按[Finish]鍵

這時應該就可以在Eclipse看到專案


* 安裝Eclemma plugin

因為我們執行單元測試之後要看到測試涵蓋率的數字，所以需要安裝Eclemma這個plugin,

在Eclipse的功能列中點選[Help]->[Eclipse Marketplaces...],

在蒐尋的欄位輸入Eclemma，會顯示這個plugin, 然後把這個plugin裝起來

* 執行單元測試

點選[ProductServiceTest.java]這支程式，點後按右鍵，選擇[Coverage As] -> [JUnit Test]

這時你就可以看到執行單元測試的結果



