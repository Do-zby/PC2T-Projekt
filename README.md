Stačí už len urobil case 12, čize ukladanie do SQL a v case 13, nech sa uklada pri ukončení do nej. Ďalej treba dorobil errorExceptions, to ti odporučam zobrať z predošlých kódov z hodín. Môžeš prípadne doladiť nejaké chybyčky ,napr. tú diakritiku ako si hovoril atď...jeto na teba :)

Case 12 jsem vynechal protože to není zatím úplně tak, že se to uloží do databáze.
Postup, jak to funguje teď.
Po zapnutí, aby se nahráli knihy z databáze musíš vybrat možnost 14. Poté už je všechno nahrané a můžeš s tím pracovat. Tady ale nastává mnoho problémů... Musím to předělat tak, aby se jakoby vždy celá databáze vymazala a nahrála od znova.
Když totiž třeba smažeš knihu, tak v databázi stále zůstane. Dále, když načítáš knihy, tak při načítání učebnic je tam žánr místo ročníku atd. 
Problém byl i v tom, když chceš zapsat více autorů, to by už mělo fungovat v pořádku. Jen se akorát musím podívat, zda se nedají nějak odstranit při vypisování závorky kolem nich. (Nějak to snad musí jít)

Aby ti to fungovalo. Musíš si přidat do Referenced Libraries slf4j api a sqlite jdbc Jinak databáze je udělána tak, že se sama vytvoří, pokud tam není. V ní se vytvoří dvě tabulky. Jedna na romány a druhá na učebnice. Když se podíváš, tak to není úplně dobře popsáno zatím. Takže názvy se ještě budou upravovat. 
