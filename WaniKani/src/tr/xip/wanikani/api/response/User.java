package tr.xip.wanikani.api.response;

import java.io.Serializable;

/**
 * Created by xihsa_000 on 3/11/14.
 */

public class User implements Serializable {
    public UserInfo user_information;

    public String getUsername() {
        return user_information.getUsername();
    }

    public String getGravatar() {
        return user_information.getGravatar();
    }

    public int getLevel() {
        return user_information.getLevel();
    }

    public String getTitle() {
        return user_information.getTitle();
    }

    public String getAbout() {
        return user_information.getAbout();
    }

    public String getWebsite() {
        return user_information.getWebsite();
    }

    public String getTwitter() {
        return user_information.getTwitter();
    }

    public int getTopicsCount() {
        return user_information.getTopicsCount();
    }

    public int getPostsCount() {
        return user_information.getPostsCount();
    }

    public long getCreationDate() {
        return user_information.getCreationDate();
    }

    public long getVacationDate() {
        return user_information.getVacationDate();
    }
}
