package cz.kpsys.mportaro.data;

import java.io.Serializable;

/**
 * Created by hajny on 03.03.2017.
 */

public abstract class MPBase implements Serializable {
    Integer id;
    String type;
    String name;

    public abstract String toJSON();

    public abstract MPBase fromJSON(String jsonRAW);
}
