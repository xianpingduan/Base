/**
 * com.xp.test.db<br/>
 * 上午11:17:17
 */
package com.xp.test.db;

import io.realm.annotations.Ignore;
import io.realm.annotations.PrimaryKey;

import com.xp.base.db.entry.BaseEntry;

/**
 * <br/>
 * 2015年6月23日-上午11:17:17
 * @author allenduan
 */
public class TestEntry extends BaseEntry{
    @PrimaryKey
    private int _id;
    private String name;
    
    @Ignore
    private boolean checked;
    /**
     * @return the checked
     */
    public boolean isChecked() {
        return checked;
    }
    /**
     * @param checked the checked to set
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }
    /**
     * @return the _id
     */
    public int get_id() {
        return _id;
    }
    /**
     * @param _id the _id to set
     */
    public void set_id(int _id) {
        this._id = _id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
