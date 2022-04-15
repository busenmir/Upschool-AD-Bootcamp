# Lateinit
#### Kotlin programlama dilinde birden çok değişken ve değişken tanımlama türleri vardır. Bunlar dan bazıları var,val,lateinit,lazy , getter&setters .. olarak çoğaltılabilir. Lateinit değişkenini incelemek istersek ; Türkçe anlamından da anlamamız gerekirse geç başlangıç anlamına gelir. Geç başlangıç demek kısaca “ seni şuan tanımlıyorum, fakat ben sana bir şey verene 
kadar sadece bekle değerini boşta bırakıyorum “ demektir. Eğer bu değişkeni kullanacağınız 
garanti ise fakat vereceğiniz, atayacağınız değer hakkında emin değilsek bu işi lateinit ile 
yapabiliyoruz. Programımıza dahil ettiğimiz zaman lateinit başlatılana kadar bellekte ona yer ayrılmaz.
Bir lateinit her zaman var ya da NOT val değişkeni kullanmalıdır. Ufak bir örnek yapalım :
