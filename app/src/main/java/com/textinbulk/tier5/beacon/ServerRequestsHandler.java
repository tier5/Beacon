package com.textinbulk.tier5.beacon;

/**
 * Created by tier5 on 4/28/2017.
 */import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class ServerRequestsHandler extends IntentService {
    // TODO: Rename actions, choose action names that describe tasks that this
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.ShakedDevGmailCom.Jeroboam6L8.action.FOO";
    private static final String ACTION_SEND_CARTS = "com.ShakedDevGmailCom.Jeroboam6L8.action.SEND_CARTS";

    // TODO: Rename parameters
    private static final String PARAM1 = "com.ShakedDevGmailCom.Jeroboam6L8.extra.PARAM1";
    private static final String PARAM2 = "com.ShakedDevGmailCom.Jeroboam6L8.extra.PARAM2";
    private static final String PARAM3 = "com.ShakedDevGmailCom.Jeroboam6L8.extra.PARAM3";

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, ServerRequestsHandler.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(PARAM1, param1);
        intent.putExtra(PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionSendCart(Context context, String urlStr, String urlMethod, String carts) {
        Intent intent = new Intent(context, ServerRequestsHandler.class);
        intent.setAction(ACTION_SEND_CARTS);
        intent.putExtra(PARAM1, urlStr);
        intent.putExtra(PARAM2, urlMethod);
        intent.putExtra(PARAM3, carts);
        context.startService(intent);
    }

    public ServerRequestsHandler() {
        super("ServerRequestsHandler");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                final String param1 = intent.getStringExtra(PARAM1);
                final String param2 = intent.getStringExtra(PARAM2);
                final String param3 = intent.getStringExtra(PARAM3);
                handleActionFoo(param1, param2);
            } else if (ACTION_SEND_CARTS.equals(action)) {
                final String param1 = intent.getStringExtra(PARAM1);
                final String param2 = intent.getStringExtra(PARAM2);
                final String param3 = intent.getStringExtra(PARAM3);
                handleActionSendCart(param1, param2, param3);
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionSendCart(String urlStr, String urlMethod, String carts) {
//        RequestURL.send(urlStr, urlMethod);
    }
}