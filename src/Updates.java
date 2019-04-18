public class Updates {

    // w sumie możemy zostać przy tym projekcie tylko pousuwać co nie potrzebne i zacząć robić te warcaby
    //
    // dopsiałem kod na dołączanie pionków do arraylisty, jeszcze nie ma ładnego wypisywania, ale na 100% działa
    // w tej wersji nie sa one podpiete pod squaresy, ale można robić operacje na arraylistach a potem tylko wyswietlac szachownice
    // arraylista sklada sie z [0-63] elementów no i sprytnym sposobem pionki w poczatkowej fazie odpowiadaja swoim miejscom,
    // jesli by numerować tak jak na www w kółko i krzyżyk czyli
    // 0,1, 2, 3, 4, 5, 6, 7
    // 8,9,10,11,12,13,14,15
    // itd.

    // kodowanie z mdavidem z githuba
    // ogarnąłem że u niego klasa Position to praktycznie to samo co klas square u nas
    // plus zamieniłem odwołania do int column, int row wszędzie na odwołania do Square, które ma natywnie te zmienne
    // Zacząłem się bawić po trochu mechaniką ruchu znów w oparciu  o mdavid, ale jeszcze nie ogarniam do końca
    // Mamy też jedną klasę typu abstract tj. Piece, fajnie będzie chyba o niej pogadać na prezentacji
    // Na razie lecę w kime także do usłyszenia :)

    // Some updates
    // Na razie musze iść sprzątać na święta więc odpuszczam programowanie

 //// to ja rozkminilem ta ich klase possition i calkiem fajnie dziala
    /// ten kod na sprawdzanie czy mozna ruch polega na tym ze sprawdzaja sb czy jest roznica rzedu o 1, czy jest inny kolor itd..
    /// musimy sie zastanowic czy dmyslimy nad listami czy przechodzimy na hash code.
    /// przepraszam ze tak malo ale staram sie ale pisalem straszne farmazony ktore nie dzialaly :(

    // luzik arbuzik
    // ciśniemy ten projekt
    // zrobiłem zmianę na to_string w square, który w zasadzie powinien ściągać to_string z pionka po prostu :)

}