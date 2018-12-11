# Task 6
Sixth learning task from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Task description (Czech language only)

### Pro vyřešení této úlohy je třeba znát

-   Setříděné kontejnery, komparátory
-   vstup a výstup.

### Popis úlohy

Úloha simuluje nákupní seznam (`ShopingList`) a výrobky, které se na něm
nachází (`Product`).

Pokud není řečeno jinak, žádnou z předdefinovaných tříd/rozhraní
neměňte!

### Zadání pro cvičení (3 body)

Upravte třídu `Product` tak, aby definovala přirozené uspořádání
    výrobků podle jejich názvu (lexikograficky).
-   Vytvořte komparátor `ProductPriceComparator`, který bude definovat
    uspořádání výrobků podle ceny vzestupně. Doplňujícím kritériem pro
    uspořádání v případě shodných cen jsou názvy výrobků
    (lexikograficky).
-   Vytvořte třídu `ShoppingListImpl` implementující rozhraní
    `ShoppingList`. Třída bude mít konstruktor podle následují
    specifikace:

        /*
         * @param products
         * @throws NullPointerException if the parameter products is null
         */
        public ShoppingListImpl(Set<Product> products)

-   Třída `Demo1` by při správném řešení měla vypsat následující text
    (pořadí řádků je důležité!):

        PRODUCTS:
          * Auto: 1000 Kc
          * Houby: 100 Kc
          * Mleko: 20 Kc
          * Plysova zirafa: 100 Kc
          * Zapalky: 2 Kc
        ----------------------------------------
        PRODUCTS BY PRICE:
          * Zapalky: 2 Kc
          * Mleko: 20 Kc
          * Houby: 100 Kc
          * Plysova zirafa: 100 Kc
          * Auto: 1000 Kc

### Zadání na doma (3 body)

-   Nejprve odkomentujte kód ve třídě Demo2.
-   Upravte třídu `ShoppingListImpl` tak aby implementovala rozhraní
    `ShoppingListIO`
-   Všechny třídy, které jste vytvořili, zdokumentujte pomocí JavaDoc.
-   Třída Demo2 by při správném řešení měla vypsat přibližně následující
    text:

        ---- Test ukladani dat
         [OK] podivejte se do souboru 'output-data.txt'

        ---- Test nacteni bezchybnych dat z 'input-data-ok.txt'
         [OK] nasledujici vypis by se mel (az na poradi radku) shodovat se souborem 'input-data-ok.txt':

        1000 Auto
        100 Houby
        20 Mleko
        100 Plysova zirafa
        2 Zapalky

        ---- Test nacteni chybnych dat z 'input-data-error-1.txt'
         [OK]

        ---- Test nacteni chybnych dat z 'input-data-error-2.txt'
         [OK]

### Rady pro domácí část

-   Metody `ShoppingList.load(InputStream)` a
    `ShoppingList.save(OutputStream)` mají při špatném formátu dat nebo
    při chybě vstupu/výstupu vyvolat výjimku `ShoppingListException`.
    Při chybě vstupu/výstupu ale vznikne výjimka typu `IOException`.
    Proto musíme výjimku `IOException` zachytit a zareagovat tak, že
    vygenerujeme požadovanou výjimku `ShoppingListException`. Abychom
    neztratili informaci o původní příčině problému, využijeme řetězení
    výjimek.
-   Třída `PrintWriter` negeneruje `IOException`! Když dojde k chybě,
    potichu si ji označí a pokračuje dál. Pokud chcete reagovat na
    případnou chybu (což se po vás v zadání chce), musíte buď testovat
    úspěšnost operace metodou `checkError()`, nebo raději použít pouze
    třídu `Writer` (která již `IOException` normálně generuje).

## License
MIT