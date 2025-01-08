# 🚀 Appium Cucumber Yeni Sunucu Entegrasyonu

![Java](https://img.shields.io/badge/Java-11-blue)
![Maven](https://img.shields.io/badge/Maven-3.6.3-blue)
![Appium](https://img.shields.io/badge/Appium-1.20.2-blue)
![Cucumber](https://img.shields.io/badge/Cucumber-6.10.4-blue)

Bu proje, **Appium** ve **Cucumber** kullanarak çeşitli Android uygulamalarının otomatik testlerini gerçekleştirmek amacıyla oluşturulmuştur. `/Apps` dizininde bulunan `.apk` dosyaları üzerinden farklı uygulamaların testleri yapılmaktadır.

## 📁 Proje Yapısı

- **Apps**: Test edilecek uygulamaların APK dosyalarını içerir.
- **src/test/java**:
  - **pages**: Farklı uygulamaların arayüz yapısını ve etkileşimlerini temsil eden sayfa nesneleri içerir:
    - `Arabam`
    - `AllCurrency`
    - `HesapMakinesi`
    - `KiwiApp`
  - **runners**: Cucumber için test çalıştırıcılarını içerir.

## 🛠️ Gereksinimler

- **Java 11**
- **Maven 3.6.3**
- **Appium Sunucusu** (yapılandırılmış ve çalışır durumda)
- **Android SDK** ve **Android Sanal Cihaz (AVD)** veya test için fiziksel cihaz
- **Android Inspector**

## 📦 Bağımlılıklar

Proje aşağıdaki temel bağımlılıkları kullanmaktadır:

- **Cucumber**: Özellik dosyalarını ve senaryoları yazmak ve düzenlemek için.
- **Selenium Remote Driver**: Appium’da WebDriver işlevselliği için.
- **Appium Java Client**: Mobil uygulamalarla etkileşim kurmak için.
- **ExtentReports**: HTML raporları oluşturmak için.

Tüm bağımlılıklar `pom.xml` dosyasında yönetilmektedir.

## 🚀 Kurulum ve Çalıştırma

1. **Depoyu Klonlayın**:
   ```bash
   git clone https://github.com/seflekL/Appium_Cucumber_NewServer.git
   cd Appium_Cucumber_NewServer
Maven Bağımlılıklarını Yükleyin:

bash
Kodu kopyala
mvn clean install
Appium Sunucusunu Başlatın:

bash
Kodu kopyala
appium
Testleri Çalıştırın:

bash
Kodu kopyala
mvn test

🧪 Test Senaryoları
Test senaryolarınızı Cucumber formatında src/test/java dizini altında oluşturabilirsiniz. Örnek bir senaryo:

gherkin
Kodu kopyala
Feature: Hesap Makinesi İşlemleri
  Scenario: Toplama işlemi
    Given Kullanıcı hesap makinesi uygulamasını açar
    When Kullanıcı 5 ve 3 değerlerini toplar
    Then Sonuç 8 olmalıdır

    
📊 Test Raporları
Test sonuçlarına ve raporlarına target/reports klasöründen ulaşabilirsiniz.

🤝 Katkıda Bulunma
Projeye katkıda bulunmak isterseniz:

Depoyu fork'layın.
Yeni bir dal oluşturun: git checkout -b ozellik-adi.
Değişikliklerinizi commit edin: git commit -m 'Yeni özellik eklendi'.
Dalınızı push edin: git push origin ozellik-adi.
Bir Pull Request oluşturun.
📄 Lisans
Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasına bakabilirsiniz.

📞 İletişim
Herhangi bir sorunuz veya geri bildiriminiz varsa, lütfen seflekL ile iletişime geçmekten çekinmeyin.
