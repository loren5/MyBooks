package com.soc.uoc.pqtm.mybooks.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookItems {
    /* Model static de llibres */
    public static List<BookItem> ITEMS = new ArrayList<BookItem>();
    public static Map<Integer, BookItem> ITEM_MAP = new HashMap<Integer, BookItem>();
    private static SimpleDateFormat dformat = new SimpleDateFormat("dd/MM/yyyy");

    static {
        try {
            addBook(new BookItem(
                    1,
                    "Dune",
                    "Frank Herbert",
                    dformat.parse("01/01/1965"),
                    "Dune pren lloc en un futur llunyà, enmig d'un imperi interestel·lar feudal on els planetes són controlats per cases nobles que deuen obediència a la casa Imperial: la Casa Corrino",
                    "b1"));
            addBook(new BookItem(
                    2,
                    "Encontre amb Rama",
                    "Arthur C. Clarke",
                    dformat.parse("02/02/1972"),
                    "L'argument d'Encontre amb Rama gira al voltant de l'avistament d'un estrany asteroide artificial que entra al sistema solar.",
                    "b2"));
            addBook(new BookItem(
                    3,
                    "Fahrenheit 451",
                    "Ray Bradbury",
                    dformat.parse("03/03/1953"),
                    "El títol ve de la temperatura en la qual crema el paper, ja que una de les característiques dels líders del relat és cremar els llibres per controlar el que aprèn la població",
                    "b3"));
            addBook(new BookItem(
                    4,
                    "Solaris",
                    "Stanislaw Lem",
                    dformat.parse("04/04/1972"),
                    "Des del seu descobriment, el planeta Solaris representa el major misteri al qual la humanitat mai no s’ha enfrontat. L'única forma de vida que s'hi troba és un oceà de matèria protoplàsmica que en recobreix tota la superfície",
                    "b4"));
            addBook(new BookItem(
                    5,
                    "Jo, Robot",
                    "Isaac Asimov",
                    dformat.parse("05/05/1940"),
                    "És una recopilació de nou històries curtes de ciència-ficció escrites per Isaac Asimov i publicades en diverses revistes estatunidenques entre els anys 1940 i 1950.",
                    "b5"));
            addBook(new BookItem(
                    6,
                    "1Q84",
                    "Haruki Murakami",
                    dformat.parse("06/06/2009"),
                    "L'Aomame és una misteriosa jove d’uns trenta anys que assassina maltractadors i que, quan comença la novel·la, està atrapada en un embús, dins d’un taxi, camí de cometre un dels seus homicidis",
                    "b6"));
            addBook(new BookItem(
                    7,
                    "Segui vora el foc",
                    "Jaír Dominguez",
                    dformat.parse("07/07/2014"),
                    "Una novel·la que es llegeix com una road movie mental: Lynch sodomitzant Pla. Un trip tripat que segueix un degenerat mig autista que viu d’enregistrar la mort dels altres i somia conills de peluix rosa assassins",
                    "b7"));
            addBook(new BookItem(
                    8,
                    "Flors per Algernon",
                    "Daniel Keyes",
                    dformat.parse("08/08/1966"),
                    "Aquesta extraordinària novel·la de ciència-ficció explica la història de Charlie Gordon, un home de 32 anys amb discapacitat intel·lectual que accedeix a sotmetre’s a una operació de cervell per tal d’augmentar el seu coeficient mental.",
                    "b8"));
            addBook(new BookItem(
                    9,
                    "La Pell Freda",
                    "Albert Sánchez Piñol",
                    dformat.parse("09/09/2007"),
                    "Quan el van desembarcar a la platja amb una xalupa, el va sorprendre que l'únic habitant de l'illa no sortís a rebre'l. Però aviat descobreix que apareixen cada nit molts visitants misteriosos i amenaçadors",
                    "b9"));
            addBook(new BookItem(
                    10,
                    "Ubik",
                    "Philip K. Dick",
                    dformat.parse("10/10/1969"),
                    "Ubik ens introdueix a un món on hi ha gent amb uns certs poders (precognició, telepatia, etc i el seus oposats), però tots al servei d'empreses privades. Així es pot contractar un telèpata, o un antitelèpata, per entendre'ns. A la vegada, quan algú mor es pot conservar en un estat de semivida, per poder-hi parlar de tant en tant.",
                    "b10"));
            addBook(new BookItem(
                    11,
                    "Hyperion",
                    "Dan Simmons",
                    dformat.parse("11/11/1989"),
                    "En un futur en que la humanitat ha colonitzat desenes de planetes en la galaxia i domina el teletransport i els viatges espacials a velocitat supralumíniques",
                    "b11"));
            addBook(new BookItem(
                    12,
                    "Mecanoscrit del segon origen",
                    "Manuel de Pedrolo",
                    dformat.parse("12/12/1974"),
                    "L'Alba i en Dídac, de 14 i 9 anys, respectivament, que viuen en un poble de Catalunya anomenat Benaura. Ells esdevenen els únics supervivents a la Terra després que uns extraterrestres eliminin pràcticament tota la humanitat. En Dídac és atacat per uns nois del poble perquè és negre. Cau a l'aigua, i l'Alba, que presencia l'escena, s'hi llança per a salvar-lo. És llavors quan apareixen uns plats voladors que ho destrueixen tot, però ells se salven perquè són dins l'aigua.",
                    "b12"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void addBook(BookItems.BookItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class BookItem {
        /* Classe d'un llibre */
        private Integer id;
        private String title;
        private String author;
        private Date dpublish;
        private String desc;
        private String imgurl;

        public BookItem (Integer id, String title, String author, Date dpublish, String desc, String imgurl) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.dpublish = dpublish;
            this.desc = desc;
            this.imgurl = imgurl;
        }

        @Override
        public String toString() {
            return this.getTitle();
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setDpublish(Date dpublish) {
            this.dpublish = dpublish;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setImgurl(String imgurl) {
            this.imgurl = imgurl;
        }

        public Integer getId() {
            return this.id;
        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        public Date getDpublish() {
            return this.dpublish;
        }

        public String getDesc() {
            return this.desc;
        }

        public String getImgurl() {
            return this.imgurl;
        }
    }

}
