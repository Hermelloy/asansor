# Rapor

**Ad Soyad:**Bilgekağan Okuducu
**Numara:**698

## 1. Problemin Açıklaması
Kullanıcı programı kullanarak asansörle kaç kat ve ne yöne hareket edeceğini hesaplamak istemektedir.


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
- bulunan kat, hedef kat

**İşlemler:**
- hesap=hedef-bulunan or bulunan-hedef, yon=asagi or yukari or hareket yok
**Çıktılar:**
-yon, hesap(kac kat hareket edecegi)

## 3. Sözde Kod (Pseudocode)

```
1.BAŞLA
2. MEVCUT KAT NUMARASINI İSTE
3. MEVCUT KAT NUMARASINI OKU
4. HEDEF KAT NUMARASINI İSTE
5. 
 ```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | | |
| 9 | 2 | 7 kat aşağı | | |
| 5 | 5 | Hareket yok | | |
| 1 | 10 | 9 kat yukarı | | |
| 10 | 1 | 9 kat aşağı | | |
| 0 | 5 | Geçersiz mevcut kat | | |
| 5 | 11 | Geçersiz hedef kat | | |
| -2 | 4 | Geçersiz mevcut kat | | |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->

