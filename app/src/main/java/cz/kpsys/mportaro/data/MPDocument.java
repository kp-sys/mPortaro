package cz.kpsys.mportaro.data;

import java.util.Locale;

/**
 * Created by hajny on 03.03.2017.
 */

public final class MPDocument extends MPBase {

    String title;
    String subtitle;
    String coverurl;
    String main_author;
    String publisher;
    String year;
    String avail1;
    String avail2;


//    @Override
//    public String toString() {
//        return "MPDocument{" +
//                "title='" + title + '\'' +
//                ", subtitle='" + subtitle + '\'' +
//                ", coverurl='" + coverurl + '\'' +
//                ", main_author='" + main_author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", year='" + year + '\'' +
//                ", avail1='" + avail1 + '\'' +
//                ", avail2='" + avail2 + '\'' +
//                '}';
//    }

    @Override
    public String toJSON() {
        String res="";
        String.format(Locale.getDefault(),"TADY DOPLNIT FORMAT A {0} a {1} atd stringy", title,subtitle);
        return res;
    }

    @Override
    public MPDocument fromJSON(String jsonRAW) {
        MPDocument book = new MPDocument();
//        Gson gson;
        //// TODO: 03.03.2017
        return book;
    }
}
