# Atanas Atanasov 216147
2.<br/>
![image](https://res.cloudinary.com/dllimbgax/image/upload/v1684331644/dd_ikyycw.jpg)<br/>
3.Цикломатската комплексност на дадениот код е 11 ( оваа може да се добие ако изброиме колку региони постојат во графот погоре )<br/>
Или број на ребра 39 - број на темиња 30 + 2 = 11<br/>
Или 1 за функцијата, 8 за разгранувањата, 2 за циклусите = 11<br/>
4.Доволни се 5 тестови<br/>
[Lab2.xlsx](https://github.com/malle2002/SI_2023_lab2_216147/files/11498866/-.2.xlsx) -> Excel решение<br/>
5. За if (user==null || user.getPassword()==null || user.getEmail()==null) можни се 4 случаи и тоа:<br/>
T | X | X = T -- Доколку user=null if-от е true и се фрла исклучок останатите услови не се согледуваат<br/>
F | T | X = T -- Доколку user!=null тогаш се проверува user.getPassword() дали е null, бидејќи е не се согледува последнио услов поради тоа што се if-от е true<br/>
F | F | T = T -- Доколку и user!=null и user.getPassword()!=null, тогаш се согледува последниот услов и се враќа неговата вистинитост<br/>
F | F | F = F<br/>
