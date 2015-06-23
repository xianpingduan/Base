/**
 * com.xp.base<br/>
 * 下午2:39:52
 */
package com.xp.base.bus;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EBean.Scope;

import com.squareup.otto.Bus;

/**
 * <br/>
 * 2015年6月19日-下午2:39:52
 * @author allenduan
 */
@EBean(scope = Scope.Singleton)
public class BusProvider {

    private Bus mBus;
    private Object lock = new Object();
    private BusProvider() {
    }
    public Bus getInstance() {
        if (mBus == null) {
            synchronized (lock) {
                if (mBus == null) {
                    mBus = new Bus();
                }
            }
        }
        return mBus;
    }
}
