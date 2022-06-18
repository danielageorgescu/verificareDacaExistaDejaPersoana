# verificareDacaExistaDejaPersoana
verificare daca exista deja persoana
Sa se creeze un program prin in care se creeaza o clasa Servicii ce va desemna anumite functii pentru gestiunea unor Persoane inr-un sistem.
Se vor trata cazurile de nefunctionare corespunzatoare prin exceptii. Pentru aceasta se va crea o clasa ServiceException (trebuie sa fie o exceptie. Urmati exemplul de la curs).
Cerinte clasa Person
1. Pentru aceasta se va creea clasa Persoana cu fieldurile: numeComplet, CNP (pentru usurinta luati-l de tip long)
2. Se vor genera metodele equals si hashcode.
3. Se va genera metoda toString(). (Pentru a afisa detaliile persoanei. nu trebuie apelat super.toString() cum am mai vazut prin teme).
Cerinte clasa Servicii.
1. Clasa servicii va avea o lista de Persoane.
2. Se va implementa o metoda care va primi ca parametrul un numar de tip long ce va reprezenta CNP-ul unei persoane.
2.1 Metoda va verifica daca daca exista o persoana cu acest CNP in lista. 
2.1.1. Daca CNP-ul exista in lista se va afisa numele persoanei
2.1.2. Daca CNP-ul nu exista in lista se va arunca o exceptie.
2.2 Metoda care introduce o persoana in lista. Metoda primeste ca parametru un obiect de tipul Person
2.2.1 Daca persoana exista deja in lista se va arunca o exceptie.
2.2.2. (SUPLIMENTAR) Daca exista o alta persoana cu acelasi CNP dar nume diferit se va arunca o exceptie. (Nu exista 2 persoane cu acelasi CNP in realitate).
