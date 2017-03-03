package cz.kpsys.mportaro;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.SearchView;
import android.view.MotionEvent;
import android.view.View;

import cz.kpsys.mportaro.ui.SearchActivity;

/**
 * Created by hajny on 22.02.2017.
 */

public final class MPortaro extends Application implements SearchActivity.OnMyTouchListener {


    private SearchActivity mainActivity;

    /**
     * Called when the application is starting, before any activity, service,
     * or receiver objects (excluding content providers) have been created.
     * Implementations should be as quick as possible (for example using
     * lazy initialization of state) since the time spent in this function
     * directly impacts the performance of starting the first activity,
     * service, or receiver in a process.
     * If you override this method, be sure to call super.onCreate().
     */
    @Override
    public void onCreate() {
        super.onCreate();
//        mainActivity=new SearchActivity();
//        mainActivity=SearchActivity.class;

    }

    /**
     * Set the base context for this ContextWrapper.  All calls will then be
     * delegated to the base context.  Throws
     * IllegalStateException if a base context has already been set.
     *
     * @param base The new base context for this wrapper.
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
//        MultiDex.install(this);
    }

    public void setMainActivity(SearchActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    public SearchActivity getMainActivity()
    {
        return mainActivity;
    }

    /**
     * Called when a touch event is dispatched to a view. This allows listeners to
     * get a chance to respond before the target view.
     *
     * @param v     The view the touch event has been dispatched to.
     * @param event The MotionEvent object containing full information about
     *              the event.
     * @return True if the listener has consumed the event, false otherwise.
     */
    @Override
    public  boolean onMyTouch(View v, MotionEvent event) {
        if (v.getId()==R.id.floating_search_view){
            //ano je to muj floating search

        }
        SearchView sv = ((SearchView) v);
//        (v,event);

        return false;
    }

    /**
     * Called when a touch event is dispatched to a view. This allows listeners to
     * get a chance to respond before the target view.
     *
     * @param v     The view the touch event has been dispatched to.
     * @param event The MotionEvent object containing full information about
     *              the event.
     * @return True if the listener has consumed the event, false otherwise.
     */
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
