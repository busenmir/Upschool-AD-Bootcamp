# Araştırma Ödevleri:
- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)
- [Araştırma Projesi 5 - TabLayout](#5)
### <a name="1"></a> Araştırma Projesi 1
- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?
# Lateinit
#### Kotlin programlama dilinde birden çok değişken ve değişken tanımlama türleri vardır. Bunlar dan bazıları var,val,lateinit,lazy , getter&setters .. olarak çoğaltılabilir. Lateinit değişkenini incelemek istersek ; Türkçe anlamından da anlamamız gerekirse geç başlangıç anlamına gelir. Geç başlangıç demek kısaca “ seni şuan tanımlıyorum, fakat ben sana bir şey verene kadar sadece bekle değerini boşta bırakıyorum “ demektir. Eğer bu değişkeni kullanacağınız garanti ise fakat vereceğiniz, atayacağınız değer hakkında emin değilsek bu işi lateinit ile yapabiliyoruz. Programımıza dahil ettiğimiz zaman lateinit başlatılana kadar bellekte ona yer ayrılmaz.Bir lateinit her zaman var ya da NOT val değişkeni kullanmalıdır. Ufak bir örnek yapalım :
### Örnek

![Main](https://user-images.githubusercontent.com/72807779/163562073-1ecfff76-780e-4f4e-b13a-b3ae576afcdc.png)

#### Solda ki resimde lateinit tanımlandığından ve başlatıldığından emin olmamız içinde isInitalized ile if bloğunda kontrol ettiğimizde başlatıldı çıktısını alıyoruz. Fakat sağdaki resimde late init tanımlı olmadığından başlatılmadı çıktısını alıyoruz. Bu kontrolü yapmak aslında önemlidir. Çünkü lateinit başlatılmadığı taktirne bize tatlı bi “UninitializedPropertyAccessException: lateinit property courseName has not been initialized ” hatası verecektir. Bu yüzden çok değişkenli karışabilecek durumlarda bu kontrolün yapılması kurtarıcı olabilecektir.
* Bir argümanın eğer null gelme ihtimali varsa kesinlikle nullable kullanılmalıdır. Late init null 
olamaz ve sen kullanmaya başladığın ana kadar bekler. Bu açıdan database den veri çekerken 
daha güvenli gözükebilir. Ancak null bir değer geldiğinde late init null gelebilecek verileri 
engeller,backend de bekletir. Eğer bir argümanın null gelme ihtimalinin olmadığından kesin 
olarak eminseniz lateinit kullanmalısınız.

### <a name="2"></a> Araştırma Projesi 2
- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?, Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

#  Namespace Nedir ? 
#### Layout dizini içinde xml dosyalarımız için kullandığımız namespace, bir XML belgesindeki öğe veya öznitelik adları olarak kullanabilen namespace topluluğudur. Öğe adlandırma çakışmalarından kaçınmanın bir yolunu sağlar.Örneğin, A marketin de makarna adlı ürün ve B marketindeki makarna adlı başka bir ürün vardır. Aynı ada sahip bu iki ürünü nasıl tanımlayabiliriz? Namespace bu alan için kullanışlı olacaktır ve çakışmayı önleyecektir. A ve B marketleri namespace olarak kabul edilebilir. Başka bir deyişle, namespace belirli özniteliklerin bir koleksiyonunu içerir.Çakışmaları önleyebilmesi en önemli özelliklerindendir. Kullanırken aynı nesneler dikkate alınmalıdır.Layout dizininde xml dosyaları için kullandığımız 3 adet namespace vardır ; app , android , tools

### Örnek
![örnek1](https://user-images.githubusercontent.com/72807779/163562432-6cd32530-4e4b-41fe-9b83-3dff2418ec88.png)

#### Yukarıda belirtmiş olduğum kodlar bir uygulama içerisindeki öğelere benzersiz değerler atamaya , Android stüdyoda derleme zamanının hatalarının işlenmesini kolaylaştırmaya sağlayan namespacebloklarıdır diyebiliriz. 
# Tools namespace'i nedir? 
#### Araçlar Alan Adı olarak tanımlanır. Emülatör deki görünümümüze uygulayabileceğimiz işlevleri bildiren layout componentlerin çalışması için gereken bir XML layout alanıdır. Genelde emülatörü çalıştırmadan nasıl görüneceğini görmek için kullanılır. Kod için bir önemi yoktur.Tasarım zamanında bir layotun bileşenin hangi düzeninde gösterilmesini sağlayan bir çok XML nitekliklerini destekleyen yapıdır.Örneğin ; 
* Tools:ignore özelliğini ele alırsak ;Tools:ignore Bu öznitelik herhangi bir XML öğesinde ayarlanabilir ve bu öğede adından da anlaşılacağı üzere aldırmamak kelimesini sahiplenir. Yani herhangi bir alt öğesinde yinelemeli olarak yok sayılması gerektiği zamanki listelemesidir.En çok başıma gelen ise : tools:ignore="MissingConstraints" attiribues kullanmaktır.Sorunlu XML öğesine veya onu çevreleyen öğelerden birsine bastırma özelliğini sahipler.

![örnek2](https://user-images.githubusercontent.com/72807779/163562738-9d43cb3a-57fe-44ca-84dc-685188f21db4.png)

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

# Font family dosyası nasıl kullanılır ? 
#### Font family dosyası projemizde font özelliklerini çeşitlendirmek için kullanılır. Bunun için dışarıdan bulduğumuz bir fontu indirip projeye ekleme yapmalıyız. Bazı font bulabileceğiniz siteler ise ;
* Dafont
* 1001FreeFonts
* FontTr
* Fonts – Google’ın
* UrbanFonts
#### Buradan font dosyamızı ttf yada otf uzantılı olarak indirip projemize Res > New > Directory > Font isminde bir klasör açarak dahil ediliyoruz. 
![Ekran Alıntısı](https://user-images.githubusercontent.com/72807779/164969835-46fa2a64-29d2-4045-bb1b-91492414d011.PNG)

#### Font family dosyalarının aslında birden çok kullanımı mevcuttur. Bunu dosya uzantısı ekleyerek de yapabilirsiniz ya da bir style oluştururak XML formatınsa gerçekleştirebilirsiniz. Pekala bunun ayrımı nedir ? Eğer tek bir text inizde font değişikliği kullanacaksanız dosya kullanımı gerçekleştirilebilir ancak bu font tipini birden çok text inizde kullanacak iseniz bunun özelliklerini barındıran bir XML dosyasını style içerisinde birleştirirek gerçekleştirmek daha iyi olacaktır.  

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

# Android Animasyon Kullanımı 
#### Animasyon , nesnelerin arayüzde hareket kazanması,şekil değişikliği koordinat değişikliği gibi olayları arayüzümüze kazandırmamızı sağlar . Androidde 3 çeşit animasyon vardır.
* Animator : Belirli bir süre boyunca belirlenen animasyon türüne göre animasyonu gerçekleştirmeyi sağlar. 
* Value Animator : Nesnemize verdiğimiz animasyon değerlerini hesaplayan ve bunları hedes nesnelerimize ayarlayan animasyonları çalıştırmak için kullanılan animasyon türüdür. Çoğu yerde zamanlama motoru olarak da geçmektedir. 
* Object Animator : Value Animator un alt sınıfı olan object animator tek bir nesneye animasyon vermek istediğimiz zaman kullanılır. Belirlenen başlangıç ve bitiş değerleri arasında nesneye animasyon uygulanır.
* AnimatorSet : Animasyonların belirlenen sırada sırasıyla uygulanmasıdır. 
objectAnimator belirli bir süre boyunca bir nesnenin belirli bir özelliğini canlandırır. ObjectAnimator'ı temsil eder.
#### Mini Projeme -Projeler- Kısmından ulaşabilirsiniz.



https://user-images.githubusercontent.com/72807779/164974697-531f289d-9b1f-4bd5-a4dd-03becb9b83e6.mp4

### <a name="5"></a> Araştırma Projesi 5
- App Navigation ile TabLayout kullanılabiliyor mu ? Kullanmazsa navigation graph ile en doğru kullanımı ne olur ?
### Konuyla ilgili gerekli araştırmalarımı yaptığım takdirde şu kanılara ulaşmış bulunmaktayım ;  
* App Navigation ile TabLayout kullanımı aslında gerçekleştirmesi olanaklı bir yapıdır. Fakat bu yapılar oldukça karmaşık bir hale getirmektedir. Bu yüzden bu konuyla ilgili bir çok farklı yaklaşımlar denenmiştir. Ancak sekmeler arasında birden çok kez geçiş yapma olanağı bulunduğu için bu bize bir yığın sorunu oluşturabileceği doğrulmuştur. Bu mevsut sorun ile ilgili olarak Google Andrioid Sorunların da bazı bildirimler farkettim şu linkten ulaşabilirsiniz 👉🏼 https://issuetracker.google.com/issues/122087752
* Android Developers Youtube kanalında ulaşmış olduğum videodan alıntıya istinaden ise Navigation yığında birikimi etkileyen öğelere odaklanan bir yapıdır. Fakat TabLayout sekmelere odaklanan bir yapıdır. Yani buradan Navigation sekmeleri etkileyen ve ilgilendiren bir yapı değildir.Sekmeler arka yığını için Navigation etkilemezdir.Böylelikle viewPager ve Tabloyut birleşimi ile kullanım sağlanmalıdır açıklaması yapılmıştır. Video Linki İçin 👉🏼 https://www.youtube.com/watchv=zQekzaAgIlQ
* NavigationComponent ile TabLayout kullanımı vardır. Ancak bunun için Google Android tarafından sunulan koşullara karşı çıkmış olacağız.  
1️⃣ Çapraz yan geçiş animasyonları BottomNavigationView öğeleri için amaçlanan bir davranıştır.
2️⃣ Navigation , arka yığını etkileyen öğelere odaklanır ve TabLayout içerisinde sekmeler yığını etkilemez.

### 🌸🌸 Mini Projeme Projeler kısmından ulaşabilirsiniz. 
