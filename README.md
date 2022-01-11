# Grunderna Inom Testautomation

# Table of contents
1. [Inför Kursstart](#intro)
    1. [Installera java](#java)
    2. [Installera Git](#git)
    3. [Ladda ner Katalon Studio](#katalon)
    4. [Hämta källkoden](#srccode)
    5. [Skapa egen gren](#newbranch)

# Inför kursstart <a name="intro"></a>
- Installera Java 8
- Installera Git
- Ladda ner Katalon Studio
- Hämta källkoden
- Skapa egen gren från detta repo

## Installera Java 8 <a name="java"></a>
Ladda ner härifrån: https://java.com/sv/download/ie_manual.jsp 

Klicka ladda ner enligt bilden: 
    ![Java, firstpic](/GuidePics/java8.png)

Klicka "install" enligt bilden:
    ![Java, pic2](/GuidePics/java8_p2.png)

Följ instruktionerna i programmet. 
För att verifiera att du har rätt version kan du öppna upp CMD/Powershell via "Windows knappen" -> "CMD" -> enter. Därefter skriver du i java -version.
    ![Java, pic3](/GuidePics/java8_p3.png)
    ![Java, pic4](/GuidePics/java8_p4.png)
    ![Java, pic5](/GuidePics/java8_p5.png)


## Installera Git <a name="git"></a>
Följ denna länk: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
Sök efter "Windows".
Du bör ha hittat nedladdningslänken. 

## Ladda ner Katalon Studio <a name="katalon"></a>

Följ denna länk: https://www.katalon.com/
- Skapa konto i Katalon.
- Ladda ner Katalon Studio.
- Öppna Katalon studio och logga in.
    ![Java, pic5](/GuidePics/katalon_p1.png)
    ![Java, pic5](/GuidePics/katalon_p2.png)
    ![Java, pic5](/GuidePics/katalon_p3.png)
    ![Java, pic5](/GuidePics/katalon_p4.png)

## Hämta källkoden <a name="srccode"></a>
- Skapa en filyta där du vill lagra källkoden som du arbetar med
- Öppna powershell via Höger Shift + höger klick och sedan välj öppna powershell. 
- Skriv in git clone https://github.com/omaritgis/GITA

Nu bör du ha källkoden. 

## Skapa gren ifrån källkoden <a name="newbranch"></a>

När du arbetar med koden för att göra dina ändringar så ska du göra det i en egen gren så att alla inte får dina uppdateringar. Det gör du genom att skriva in:
```
git checkout -b "ditt-namn"
```
Nu kan du börja göra dina ändringar. Om du redan har gjort ändringar men har glömt att skapa en gren kan du köra istället detta kommando (git status avslöjar vilka ändringar som finns): 
```
git status
git add .
git stash
git checkout -b "ditt-namn"
git stash pop
```
När du ska publicera dina ändringar för första gången kommer du att behöva köra dessa kommandon:
```
git add .
git commit -m "meddelande om vad som har uppdaterats"
git push --set-upstream origin ditt-namn
```
Alla andra gånger bör det se ut så här istället:
```
git add .
git commit -m "meddelandet du vill lägga"
git push
```
