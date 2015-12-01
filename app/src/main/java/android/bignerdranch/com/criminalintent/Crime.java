package android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * Created by leolee on 12/1/15.
 */
public class Crime {
    private UUID uuid;
    private String title;

    public Crime() {
        uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
