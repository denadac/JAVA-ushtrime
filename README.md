# JAVA-ushtrime
Object Oriented
1. Simulo nje aplikacion qe simulon nje kopesht zoologjik.
 Krijo klasen Animal qe do permbaje variablat e instances name, color, isVegetarian. Krijo
metodat eat(), sleep(), play() si dhe metodat get/set.
 Krijo klasen Cat qe trashegon nga klasa Animal si dhe permban metoden meow().
 Krijo klasen Dog qe trashegon nga klasa Animal si dhe permban metoden bark().
 Therrit metodat ne klasen main.
 Mbishkruaj metoden eat() ne klasen Cat, per te percaktuar specifikisht ushqimet me te
cilat ushqehet nje mace.
 Krijo klasen Zoo, qe permban nje liste me dogs dhe nje liste me cats. Krijo metodat
perkatese per te shfaqur ne ekran karakteristikat e seiciles kafshe.
 Permiresoje menyren e mesiperme duke perdorur poliformizmin.
 Si behet thirrja e konstruktoreve te seicilit nga klasat?
 Krijo nje klase ZooKepeer qe permbaje variablat e instances si name, surname, age. Krijo
metodat get/set. Cila eshte superclass e klases ZooKepeer? Bej override metodat
toString() dhe equals() te klases Object.

2. Simulo nje aplikacion qe llogarit pagat e punonjesve per nje jave. Kerkesat jane si me poshte:
a. Hourly Employees jane punonjes qe paguhen me ore pune, nese punonjesi ka punuar me
shume sesa 40 ore, oret e mbetura do t’i paguhen 2-fish i pageses normale.
b. Salaried Employees jane punonjes qe paguhen me rroge te plote pavaresisht numrit total te
oreve ne nje jave.
c. Managers jane Salaried Employees qe paguhen me rroge te plote dhe marrin bonus.
 Zbulo klasat qe duhen per simulimin e aplikacionit dhe organizoji ato ne rend hierarkik (duke
perdorur trashegimine)
 Zbulo variablat e instances dhe metodat e njejta per seicilen nga klasat e mesiperme dhe krijoji
ato ne super class.
 Zbulo variablat e instances dhe metodat e ndryshme qe seicila klase ka.
 Testo klasat dhe metodat e krijuara ne main.

3. Krijo nje klase Car e cila do te permbaje disa variabla instance si type, color,
year,numberOfSeats, si dhe metodat move(int speed) e cila do te printoje ne ekran ”Moving
”+speed+”kilometers/hour” dhe refuel() e cila do te printoje ne ekran “No more fuel. Time to
refuel.”
 Krijo nje klase Bicycle e cila do te permbaje disa variabla si type, color, year,
height,isRaceBike si dhe metodat move(int speed) e cila do te printoje ne ekran ”Moving
”+speed+”kilometers/hour” dhe metoden putToTheService() e cila do te printoje ne
ekran “Time to upgrade.”
 Krijo nje klase Vehicle e cila do te jete super class e klasave me siper. Zbulo variablat e
instances dhe metodat e ngjashme per seicilen klase.
 Bej override metodes toString() ne seicilen prej klasave te krijuara.

 Krijo nje klase Sportist qe do te permbaje nje liste me Vehicles te ndryshme. Krijo qe
metode testMyVehicle e cila do te bredhe listen e mesiperme dhe do te therrase
metoden move(int speed) per cdo vehicle. Per cdo Car te therritet metoda refuel() dhe
per cdo Bike te therritet metoda putToTheService().
 Testo ne main metoden e krijuar ne klasen Sportist. Gjithashtu, krijo dy objekte Car ne
main. Shfaq ne ekran “same car properties” nese te dy makinat jane tip, ngjyre, vit dhe
numer vendesh te njejte.

4. Simulo nje aplikacion qe llogarit mesataren e disa vlerave te ndryshme ne varesi te llogjikes se
seicilen klase.
 Krijo klasen BankAccount qe do te permbaje disa property si accountNo dhe amount.
Krijo konstruktorin qe inicializon te gjitha variablat e instances dhe metodat get/set
 Krijo klasen Country qe do te permbaje property si countryName dhe surface. Krijo
konstruktorin per inicializimin e variablave te instances dhe metodat get/set
 Krijo nje klase AverageComputation qe do te permbaje dy metoda. Metoda e pare do te
gjeje mesataren e gjendjes se disa llogarive bankare. Metoda e dyte do te permbaje nje
metode qe gjen mesataren e siperfaqes se disa vendeve. Cfare vini re? Cfare kane te
perbashket dy metodat? Ku ndryshojne? Si mund ta permiresojme zgjidhjen tone ne
menyre qe te krijojme vetem nje metode qe do te llogarise mesataren e vlerave te
ndryshme?
 Per kete gje na ndihmojne Interfaces. Krijo nje interface te quajtur Measurable, qe do te
permbaje nje metode abstrakte getMeasure(). Klasat BankAccount dhe Country duhet
te implementojne interfacen e krijuar dhe gjithashtu metoden getMeasure(). Ne rastin e
BankAccount metoda getMeasure() duhet te ktheje gjendjen e llogarise (amount),
ndersa ne rastin e Country metoda getMeasure() te ktheje siperfaqen (surface).
 Zevendesoji dy metodat e mesiperme me nje metode dinamike. Cilat jane ndryshimet
qe duhet te beni nga implementimi fillestar?
 Cfare ndodh ne rastin e shtimit te nje klase tjeter Student? Klasa Student permban disa
property si name, surname, age. Cili eshte ndryshimi i vetem qe duhet te bejme nese
duhet te gjejme mesataren e moshes se disa studenteve?
 Cfare ndryshimi vini re ndermjet Inheritance dhe Interfaces? Pergjithesisht, interfaces
perdoren kur keni kod qe proceson objekte te klasave te ndryshme ne te njejten menyre,
por serish klasat nuk kane asnje te perbashket sic mund te kene ne rastin e trashegimise.

5. Krijo nje klase abstrakte Shape ne te cilen te deklarosh 2 metoda abstrakte,
getParameter(double length) dhe getSurface(double length).
 Krijo klasen Circle qe trashegon nga klasa Shape. Implemento metodat getParameter
dhe getSurface
 Krijo klasen Square qe trashegon nga klasa Shape. Implemento metodat getParameter
dhe getSurface.

6. Simulo nje aplikcion qe llogarit gjendjen e llogarise per banka te ndryshme ne varesi te interesit
qe seicila prej tyre ofron.

 Krijo nje klase Client qe do te permbaje disa variabla instance si name, surname, account
number dhe amount. Krijo konstruktorin qe inicializon te gjitha variablat e instances dhe
metodat get/set.
 Krijo klasen PrivateBank qe do te permbaje disa variabla instance si rateOfInterest qe do
te percaktoje vleren e interesit qe PrivateBank ofron, bankName dhe te dhena rreth
adreses si city, street number dhe street name. Krijo konstruktorin dhe metodat get/set
per inicializimin e variablave. Krijo nje metode takeYourTurn() (ze rradhen) qe printon
ne ekran “Next turn”.
 Krijo klasen OnlineBank qe do te permbaje disa variabla instance si rateOfInterest qe do
te percaktoje vleren e interesit qe OnlineBank ofron, bankName, te dhena rreth
adreses si city, street number, street name, si dhe nje variable onlineCoin qe percakton
llojin e monedhes online qe banka ofron. Krijo kontruktorin dhe metodat get/set. Krijo
nje metode exchangeCoinsToMoney() e cila llogarit shkembimin e coin-euro.
 Krijo klasen CentralBank qe do te permbaje variabla instance si rateOfInterest qe do te
percaktoje vleren e interest qe CentealBank ofron, bankName, si dhe te dhena rreth
adreses si city, street number, street name. Krijo konstruktorin dhe metodat get/set.
Krijo nje metode superviseFinancialSystem() qe printon ne ekran “Time to supervise”.
 Krijo nje klase BankHepler, e cila do te permbaje tre metoda per seicilen nga klasat e
krijuara me siper. Metoda e pare do te marre si parameter nje object te tipit
PrivateBank dhe te llogarise gjendjen e llogarise se seicilit nga klientet e saj ne varesi te
interesit qe ofron. Metoda e pare do te marre si parameter nje object te tipit
OnlineBank dhe te llogarise gjendjen e llogarise se seicilit nga klientet e saj ne varesi te
interesit qe ofron. Metoda e pare do te marre si parameter nje object te tipit
CentralBank dhe te llogarise gjendjen e llogarise se seicilit nga klientet e saj ne varesi te
interesit qe ofron. Cfare vini re? Permiresojeni zgjidhjen juaj duke perdorur Interfaces.
 Zbuloni cfare te perbashketa kane klasat qe keni krijuar me siper? Cila mund te jete
super klasa e klasave qe keni krijuar me siper? Permiresojeni zgjidhjen tuaj duke
perdorur trashegimine.
 Zbuloni ne cfare rasti mund ta perdorni kompozicionin.

Generics

1. Krijo interface Comparable qe do te permbaje metoden compareTo e cila do te krahasoje
lartesine e objekteve te ndryshme.
 Krijo klasen Person qe do te implementoje nga interface Comparable.
 Si mund te perdorim generics ne kete rast?

Collections
1. Kerkoji perdoruesit te jape nje tekst. Gjej numrin e perseritjes se secilit karakter duke
perdorur hashMap.
